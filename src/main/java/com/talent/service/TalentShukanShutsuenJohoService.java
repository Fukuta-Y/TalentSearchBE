package com.talent.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects; // Objectsをインポート
import java.util.stream.Collectors; // Collectorsをインポート

import org.springframework.stereotype.Service;

import com.model.TalentShukanShutsuenJoho;
import com.talent.controller.helper.TalentShukanShutsuenJohoHelper;
import com.talent.infrastructure.dto.ChannelKyokuMasterDto;
import com.talent.infrastructure.dto.KbnGenreMasterDto;
import com.talent.infrastructure.dto.OnAirKanriTableDto;
import com.talent.infrastructure.dto.ProgramMasterDto;
import com.talent.infrastructure.dto.TalentMasterDto;
import com.talent.infrastructure.repository.mapper.generated.MChannelKyokuMapper;
import com.talent.infrastructure.repository.mapper.generated.MKbnGenreMapper;
import com.talent.infrastructure.repository.mapper.generated.MProgramMapper;
import com.talent.infrastructure.repository.mapper.generated.MTalentMapper;
import com.talent.infrastructure.repository.mapper.generated.TOnAirKanriMapper;

import lombok.RequiredArgsConstructor;

/**
 * タレント週間出演情報検索Service
 */
@Service
@RequiredArgsConstructor
public class TalentShukanShutsuenJohoService {
    // mapperの宣言
    private final TOnAirKanriMapper tOnAirKanriMapper;
    private final MTalentMapper mTalentMapper;
    private final MProgramMapper mProgramMapper;
    private final MChannelKyokuMapper mChannelKyokuMapper;
    private final MKbnGenreMapper mKbnGenreMapper;
    // helperの宣言
    private final TalentShukanShutsuenJohoHelper helper;

    /**
     * タレント週間出演情報検索Service
     * @param nentsuki 年月
     * @param shu 週
     * @param talentId タレントID (String型として受け取るが、内部でIntegerに変換)
     * @return TalentShukanShutsuenJoho
     */
    public TalentShukanShutsuenJoho getTalentShukanShutsuenJoho(Integer nentsuki, Integer shu, String talentId) {

        // TalentShukanShutsuenJohoをResponseに設定
        TalentShukanShutsuenJoho response = new TalentShukanShutsuenJoho();

        // talentIdをIntegerに変換し、リストに設定
        List<Integer> talentIdList = new ArrayList<>();
        try {
            // talentIdがnullや空文字列でないことを確認し、変換
            if (talentId != null && !talentId.trim().isEmpty()) {
                talentIdList.add(Integer.parseInt(talentId.trim()));
            }
        } catch (NumberFormatException e) {
            System.err.println("Warning: Invalid talent ID format: '" + talentId + "' - Skipping talent search.");
            // 不正なIDの場合は、空のリストを渡すか、適切にハンドリング
            return response; // あるいはここで例外をスローして処理を中断
        }

        // オンエア管理テーブル検索
        // ここでtalentIdListはList<Integer>として渡されます
        List<OnAirKanriTableDto> onAirKanriTableDto = tOnAirKanriMapper.select(nentsuki, shu, talentIdList);

        // 検索結果がない場合はもう検索結果は0件となる
        if(onAirKanriTableDto.isEmpty()) { // .size() == 0 よりも .isEmpty() が推奨
            // responseの返却
            return response;
        }

        // タレントマスタ検索
        // mTalentMapper.selectが単一のtalentId (String) を受け取る場合はそのまま
        // もし List<Integer> を受け取るなら mTalentMapper.select(talentIdList, ""); に変更
        List<TalentMasterDto> talentMasterDto = mTalentMapper.select(talentId, "");


        // 番組IDのリストを設定
        List<Integer> programIdList = new ArrayList<>(); // List<String> ではなく List<Integer> に変更
        List<ProgramMasterDto> programMasterDto = new ArrayList<>();

        // オンエア管理テーブルが設定されている場合
        if (!onAirKanriTableDto.isEmpty()) { // .size() != 0 よりも .isEmpty() が推奨
            // Stream APIを使ってプログラムIDを抽出し、List<Integer>に変換
            programIdList = onAirKanriTableDto.stream()
                                              .map(OnAirKanriTableDto::getProgramId) // ここでStringが返る場合
                                              .filter(Objects::nonNull) // nullを除外
                                              .map(Integer::parseInt)   // StringをIntegerに変換する行を追加
                                              .collect(Collectors.toList());
            // 番組マスタ検索
            // ここでprogramIdListはList<Integer>として渡されます
            programMasterDto = mProgramMapper.select(programIdList);
        }

        // チャンネルIDのリストを設定
        List<Integer> channelIdList = new ArrayList<>(); // List<String> ではなく List<Integer> に変更
        List<ChannelKyokuMasterDto> channelKyokuMasterDto = new ArrayList<>();

        // programMasterDtoが設定されている場合
        if (!programMasterDto.isEmpty()) { // .size() != 0 よりも .isEmpty() が推奨
            // Stream APIを使ってチャンネルIDを抽出し、List<Integer>に変換
            channelIdList = programMasterDto.stream()
                                            .map(ProgramMasterDto::getChannelId) // ChannelIdがInteger型と仮定
                                            .filter(Objects::nonNull) // nullのChannelIdを除外
                                            .collect(Collectors.toList());
            // チャンネル局マスタ検索
            // ここでchannelIdListはList<Integer>として渡されます
            channelKyokuMasterDto = mChannelKyokuMapper.select(channelIdList);
        }

        // 区分ジャンルのリストを設定 (この部分は元々Integerなので変更なし)
        List<Integer> genreIdList = new ArrayList<>();
        genreIdList.add(1);
        genreIdList.add(2);
        genreIdList.add(3);
        // 区分ジャンルマスタ検索
        List<KbnGenreMasterDto> kbnGenreMasterDto = mKbnGenreMapper.select(genreIdList);

        // Responseへ設定
        response.setmProgram(helper.toProgramModel(programMasterDto));
        response.settOnAirKanri(helper.toOnAirKanriTableModel(onAirKanriTableDto));
        response.setmTalent(helper.toTalentModel(talentMasterDto));
        response.setmChannelKyoku(helper.toChannelKyokuModel(channelKyokuMasterDto));
        response.setmKbnGenre(helper.toKbnGenreModel(kbnGenreMasterDto));

        // responseの返却
        return response;
    }
}