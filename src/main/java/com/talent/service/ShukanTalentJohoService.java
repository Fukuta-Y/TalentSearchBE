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
import com.talent.service.entity.ShukanTalentJohoEntity;

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
	 * @param nentsuki 対象年月
	 * @param shu 対象週
	 * @param talentName タレント名
     * @return 検索結果
     */
    public ShukanTalentJoho select(Integer nentsuki, Integer shu, String talentName) {
    	
    	// ShukanTalentJohoEntityを設定
    	ShukanTalentJohoEntity entity = new ShukanTalentJohoEntity();
    	
    	// ShukanTalentJohoをResponseに設定
    	ShukanTalentJoho response = new ShukanTalentJoho();
    	// タレントマスタ検索
		List<TalentMasterDto> talentMasterDto = mTalentMapper.select(talentName);
		List<String> talentIdList = null;
		if (talentMasterDto.size() == 0) {
			entity.setTalentMasterDto(null);
		}
		else {
			talentIdList = new ArrayList<String>();
			//　名称検索の結果のIDをリスト化する
			for(TalentMasterDto dto:talentMasterDto) talentIdList.add(dto.getTalentId());
			entity.setTalentMasterDto(talentMasterDto);
		}

    	// オンエア管理テーブル検索
		List<OnAirKanriTableDto> onAirKanriTableDto = tOnairKanriMapper.select(nentsuki, shu, talentIdList);
		// オンエア情報がない　または　オンエア情報はあるが、紐づくタレントがない場合
		if (onAirKanriTableDto.size() == 0 || (onAirKanriTableDto.size() != 0 && talentMasterDto.size() == 0)) {
			entity.setOnAirKanriTableDto(null);
			entity.setTalentMasterDto(null); //　オンエア日がそもそも無かった場合はタレントも空で返す
		} else {
			entity.setOnAirKanriTableDto(onAirKanriTableDto);
		}

    	// 番組マスタ検索（オンエア管理テーブル検索が存在する場合のみ実施）
		if (onAirKanriTableDto.size() != 0 && talentMasterDto.size() != 0) {
			List<String> idList = new ArrayList<String>();
			onAirKanriTableDto.forEach(s -> idList.add(s.getProgramId())); 
			List<ProgramMasterDto> programMasterDto = mProgramMapper.select(idList);
			entity.setProgramMasterDto(programMasterDto);
		} else {
			entity.setProgramMasterDto(null);
		}
		
		List<ProgramMasterDto>  programDto = entity.getProgramMasterDto();
		response.setmProgram(helper.toProgramModel(programDto));
		
		List<OnAirKanriTableDto>  onairKanriDto = entity.getOnAirKanriTableDto();
		response.settOnAirKanri(helper.toOnAirKanriTableModel(onairKanriDto));

		List<TalentMasterDto>  talentDto = entity.getTalentMasterDto();
		response.setmTalent(helper.toTalentModel(talentDto));

		// responseの返却
        return response;
    }
}