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
import com.talent.infrastructure.repository.mapper.generated.TOnairKanriMapper;

import lombok.RequiredArgsConstructor;

/**
 * タレント週間出演情報検索 Service
 */
@Service
@RequiredArgsConstructor
public class TalentShukanShutsuenJohoService {
	
    private final TOnairKanriMapper tOnairKanriMapper;
    private final MTalentMapper mTalentMapper;
    private final MProgramMapper mProgramMapper;
    private final MChanelKyokuMapper mChanelKyokuMapper;
    private final MKbnGenreMapper mKbnGenreMapper;

    private final TalentShukanShutsuenJohoHelper helper;

    /**
     * タレント週間出演情報検索
     * @param nentsuki 対象年月
     * @param shu 対象週
     * @param talentId タレントID
     * @return 検索結果
     */
    public TalentShukanShutsuenJoho select(Integer nentsuki, Integer shu, String talentId) {

    	// TalentShukanShutsuenJohoをResponseに設定
    	TalentShukanShutsuenJoho response = new TalentShukanShutsuenJoho();
        
        // タレントIDのリストを設定
        List<String> talentIdList = new ArrayList<String>();
        //　名称検索の結果のIDをリスト化する
        talentIdList.add(talentId);

        // オンエア管理テーブル検索
        List<OnAirKanriTableDto> onAirKanriTableDto = tOnairKanriMapper.select(nentsuki, shu, talentIdList);
        
        // タレントマスタ検索
    	List<TalentMasterDto> talentMasterDto = mTalentMapper.selectEx(talentId);

        // 番組マスタ検索
        // 番組IDのリストを設定
        List<String> programIdList = new ArrayList<String>();
        if (onAirKanriTableDto.size() != 0) {
            programIdList = new ArrayList<String>();
            //　名称検索の結果のIDをリスト化する
            for(OnAirKanriTableDto dto: onAirKanriTableDto) programIdList.add(dto.getProgramId());
        }
        List<ProgramMasterDto> programMasterDto = mProgramMapper.select(programIdList);
        
        // チャンネル局マスタ検索
        // チャンネルIDのリストを設定
        List<String> chanelIdList = new ArrayList<String>();
        if (programMasterDto.size() != 0) {
            chanelIdList = new ArrayList<String>();
            //　名称検索の結果のIDをリスト化する
            for(ProgramMasterDto dto: programMasterDto) chanelIdList.add(dto.getChanelId().toString());
        }
        List<ChanelKyokuMasterDto> chanelKyokuMasterDto = mChanelKyokuMapper.select(chanelIdList);
         
        // 区分ジャンルマスタ検索
        List<Integer> genreIdList = new ArrayList<Integer>();
        genreIdList.add(1);
        genreIdList.add(2);
        genreIdList.add(3);
        List<KbnGenreMasterDto>  kbnGenreMasterDto = mKbnGenreMapper.select(genreIdList);
        
        // Responseへ設定
        response.setmProgram(helper.toProgramModel(programMasterDto));
        response.settOnAirKanri(helper.toOnAirKanriTableModel(onAirKanriTableDto));
        response.setmTalent(helper.toTalentModel(talentMasterDto));
        response.setmChanelKyoku(helper.toChanelKyokuModel(chanelKyokuMasterDto));
        response.setmKbnGenre(helper.toKbnGenreModel(kbnGenreMasterDto));
		return response;
    }
}