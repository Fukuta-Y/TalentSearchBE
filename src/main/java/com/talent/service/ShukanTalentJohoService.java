package com.talent.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.model.ShukanTalentJoho;
import com.talent.controller.helper.ShukanTalentJohoHelper;
import com.talent.infrastructure.dto.OnAirKanriTableDto;
import com.talent.infrastructure.dto.ProgramMasterDto;
import com.talent.infrastructure.dto.TalentMasterDto;
import com.talent.infrastructure.repository.mapper.generated.MProgramMapper;
import com.talent.infrastructure.repository.mapper.generated.MTalentMapper;
import com.talent.infrastructure.repository.mapper.generated.TOnairKanriMapper;

import lombok.RequiredArgsConstructor;

/**
 * 週間タレント別情報検索 Service
 */
@Service
@RequiredArgsConstructor
public class ShukanTalentJohoService {

    private final MTalentMapper mTalentMapper;
    private final TOnairKanriMapper tOnairKanriMapper;
    private final MProgramMapper mProgramMapper;
    private final ShukanTalentJohoHelper helper;

    /**
     * 週間タレント別情報検索
	 * @param nentsuki 年月
	 * @param shu 週
	 * @param talentName タレント名
     * @return ShukanTalentJoho
     */
    public ShukanTalentJoho select(Integer nentsuki, Integer shu, String talentName) {
    	
    	// ShukanTalentJohoをResponseに設定
    	ShukanTalentJoho response = new ShukanTalentJoho();
    	// タレントマスタ検索
		List<TalentMasterDto> talentMasterDto = mTalentMapper.select(talentName);
		List<String> talentIdList = new ArrayList<String>();
		//　名称検索の結果のIDをリスト化する
		for(TalentMasterDto dto:talentMasterDto) talentIdList.add(dto.getTalentId());

    	// オンエア管理テーブル検索
		List<OnAirKanriTableDto> onAirKanriTableDto = tOnairKanriMapper.select(nentsuki, shu, talentIdList);

    	// 番組マスタ検索（オンエア管理テーブル検索が存在する場合のみ実施）
		List<ProgramMasterDto> programMasterDto = new ArrayList<ProgramMasterDto>();
		if (onAirKanriTableDto.size() != 0 && talentMasterDto.size() != 0) {
			List<String> idList = new ArrayList<String>();
			onAirKanriTableDto.forEach(s -> idList.add(s.getProgramId())); 
			programMasterDto = mProgramMapper.select(idList);
		}
		
		response.setmTalent(helper.toTalentModel(talentMasterDto));
		response.settOnAirKanri(helper.toOnAirKanriTableModel(onAirKanriTableDto));
		response.setmProgram(helper.toProgramModel(programMasterDto));

		// responseの返却
        return response;
    }
}