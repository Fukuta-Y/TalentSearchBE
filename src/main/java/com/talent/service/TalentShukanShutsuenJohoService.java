package com.talent.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.model.TalentShukanShutsuenJoho;
import com.talent.controller.helper.TalentShukanShutsuenJohoHelper;
import com.talent.infrastructure.dto.ChanelKyokuMasterDto;
import com.talent.infrastructure.dto.KbnGenreMasterDto;
import com.talent.infrastructure.dto.OnAirKanriTableDto;
import com.talent.infrastructure.dto.ProgramMasterDto;
import com.talent.infrastructure.dto.TalentMasterDto;
import com.talent.infrastructure.repository.mapper.generated.MChanelKyokuMapper;
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
    private final MChanelKyokuMapper mChanelKyokuMapper;
    private final MKbnGenreMapper mKbnGenreMapper;
    // helperの宣言
    private final TalentShukanShutsuenJohoHelper helper;

    /**
     * タレント週間出演情報検索Service
     * @param nentsuki 年月
     * @param shu 週
     * @param talentId タレントID
     * @return TalentShukanShutsuenJoho
     */
    public TalentShukanShutsuenJoho getTalentShukanShutsuenJoho(Integer nentsuki, Integer shu, String talentId) {

    	// TalentShukanShutsuenJohoをResponseに設定
    	TalentShukanShutsuenJoho response = new TalentShukanShutsuenJoho();
        
        // タレントIDのリストを設定
        List<String> talentIdList = new ArrayList<String>();

        //　名称検索の結果のIDをリスト化する
        talentIdList.add(talentId);

        // オンエア管理テーブル検索
        List<OnAirKanriTableDto> onAirKanriTableDto = tOnAirKanriMapper.select(nentsuki, shu, talentIdList);
        
        // タレントマスタ検索
    	List<TalentMasterDto> talentMasterDto = mTalentMapper.selectEx(talentId);

        // 番組IDのリストを設定
        List<String> programIdList = new ArrayList<String>();
        List<ProgramMasterDto> programMasterDto = new ArrayList<ProgramMasterDto>();
        
        // オンエア管理テーブルが設定されている場合
        if (onAirKanriTableDto.size() != 0) {
            programIdList = new ArrayList<String>();
            //　名称検索の結果のIDをリスト化する
            for(OnAirKanriTableDto dto: onAirKanriTableDto) programIdList.add(dto.getProgramId());
            // 番組マスタ検索
            programMasterDto = mProgramMapper.select(programIdList);
        }
        
        // チャンネルIDのリストを設定
        List<String> chanelIdList = new ArrayList<String>();
        List<ChanelKyokuMasterDto> chanelKyokuMasterDto = new ArrayList<ChanelKyokuMasterDto>();
        
        // オンエア管理テーブルが設定されている場合
        if (programMasterDto.size() != 0) {
            chanelIdList = new ArrayList<String>();
            //　名称検索の結果のIDをリスト化する
            for(ProgramMasterDto dto: programMasterDto) chanelIdList.add(dto.getChanelId().toString());
            // チャンネル局マスタ検索
            chanelKyokuMasterDto = mChanelKyokuMapper.select(chanelIdList);
        }

        // 区分ジャンルのリストを設定
        List<Integer> genreIdList = new ArrayList<Integer>();
        genreIdList.add(1);
        genreIdList.add(2);
        genreIdList.add(3);
        // 区分ジャンルマスタ検索
        List<KbnGenreMasterDto>  kbnGenreMasterDto = mKbnGenreMapper.select(genreIdList);
        
        // Responseへ設定
        response.setmProgram(helper.toProgramModel(programMasterDto));
        response.settOnAirKanri(helper.toOnAirKanriTableModel(onAirKanriTableDto));
        response.setmTalent(helper.toTalentModel(talentMasterDto));
        response.setmChanelKyoku(helper.toChanelKyokuModel(chanelKyokuMasterDto));
        response.setmKbnGenre(helper.toKbnGenreModel(kbnGenreMasterDto));

		// responseの返却
        return response;
    }
}