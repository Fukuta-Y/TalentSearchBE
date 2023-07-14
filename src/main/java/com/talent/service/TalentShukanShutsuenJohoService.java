package com.talent.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.model.TalentShukanShutsuenJoho;
import com.talent.infrastructure.dto.OnAirKanriTableDto;
import com.talent.infrastructure.dto.TalentMasterDto;
import com.talent.infrastructure.repository.mapper.generated.MChanelKyokuMapper;
import com.talent.infrastructure.repository.mapper.generated.MKbnGenreMapper;
import com.talent.infrastructure.repository.mapper.generated.MProgramMapper;
import com.talent.infrastructure.repository.mapper.generated.MTalentMapper;
import com.talent.infrastructure.repository.mapper.generated.TOnairKanriMapper;
import com.talent.service.entity.TalentShukanShutsuenJohoEntity;

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

    /**
     * タレント週間出演情報検索
     * @param targetNentsuki 対象年月
     * @param targetShu 対象週
     * @param talentId タレントID
     * @return 検索結果
     */
    public TalentShukanShutsuenJoho select(Integer nentsuki, Integer shu, String talentId) {
    	
    	// TalentShukanShutsuenJohoEntityを設定
        TalentShukanShutsuenJohoEntity entity = new TalentShukanShutsuenJohoEntity();

    	// TalentShukanShutsuenJohoをResponseに設定
    	TalentShukanShutsuenJoho response = new TalentShukanShutsuenJoho();
        
        // タレントIDのリストを設定
        List<String> talentIdList = new ArrayList<String>();
        //　名称検索の結果のIDをリスト化する
        talentIdList.add(talentId);
        // オンエア管理テーブル検索
        List<OnAirKanriTableDto> onAirKanriTableDto = tOnairKanriMapper.select(nentsuki, shu, talentIdList);
        entity.setOnAirKanriTableDto(onAirKanriTableDto);

        // タレントマスタ検索
    	List<TalentMasterDto>  talentMasterDto = mTalentMapper.selectEx(talentId);
        entity.setTalentMasterDto(talentMasterDto);

//
//
//    	List<ProgramMasterDto> list3 = mProgramMapper.select(null);
//    	List<ChanelKyokuMasterDto> list4 = mChanelKyokuMapper.select(null);
//    	List<KbnGenreMasterDto> list5 = mKbnGenreMapper.select(talentId);
//
//		List<OnAirKanriTableDto>  onAirKanriDto = entity.getOnAirKanriTableDto();
//		response.settOnAirKanri(helper.toOnAirKanriTableModel(onAirKanriDto));
//		
//		List<TalentMasterDto>  talentDto = entity.getTalentMasterDto();
//		response.setmTalent(helper.toTalentModel(talentDto));
//    	
    	
		return response;
    }
}