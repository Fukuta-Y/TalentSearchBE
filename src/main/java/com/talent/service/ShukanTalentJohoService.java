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
import com.talent.infrastructure.repository.mapper.generated.TOnAirKanriMapper;

import lombok.RequiredArgsConstructor;

/**
 * 週間タレント別情報検索Service
 */
@Service
@RequiredArgsConstructor
public class ShukanTalentJohoService {
	// mapperの宣言
    private final MTalentMapper mTalentMapper;
    private final TOnAirKanriMapper tOnAirKanriMapper;
    private final MProgramMapper mProgramMapper;
    // helperの宣言
    private final ShukanTalentJohoHelper helper;

    /**
     * 週間タレント別情報検索Service
	 * @param nentsuki 年月
	 * @param shu 週
	 * @param talentName タレント名
     * @return ShukanTalentJoho
     */
    public ShukanTalentJoho getShukanTalentJoho(Integer nentsuki, Integer shu, String talentName) {

    	// ShukanTalentJohoをResponseに設定
    	ShukanTalentJoho response = new ShukanTalentJoho();

    	// タレントマスタ検索の結果を格納用
		List<TalentMasterDto> talentMasterDto = mTalentMapper.select("" , talentName);
		List<Integer> talentIdList = null;

		// タレント名前が設定されている場合
		if(!talentName.isEmpty()) {
			//　名称検索の結果のIDをリスト化する
			talentIdList = new ArrayList<Integer>();
			for(TalentMasterDto dto:talentMasterDto) talentIdList.add(Integer.parseInt(dto.getTalentId()));
		}

		// タレント名が設定されているのに検索結果がない場合はもう検索結果は0件となる
		if(!talentName.isEmpty() && talentIdList.size() == 0) {
			// responseの返却
	        return response;
		}

    	// オンエア管理テーブル検索
		List<OnAirKanriTableDto> onAirKanriTableDto = tOnAirKanriMapper.select(nentsuki, shu, talentIdList);

    	// 番組マスタ検索（オンエア管理テーブル検索が存在する場合のみ実施）
		List<ProgramMasterDto> programMasterDto = new ArrayList<ProgramMasterDto>();

		// オンエア管理テーブルとタレントマスタの内容が設定されている場合
		if (onAirKanriTableDto.size() != 0 && talentMasterDto.size() != 0) {
			List<String> idList = new ArrayList<String>();
			onAirKanriTableDto.forEach(s -> idList.add(s.getProgramId()));
			programMasterDto = mProgramMapper.select(idList);
		}

        // Responseへ設定
		response.setmTalent(helper.toTalentModel(talentMasterDto));
		response.settOnAirKanri(helper.toOnAirKanriTableModel(onAirKanriTableDto));
		response.setmProgram(helper.toProgramModel(programMasterDto));

		// responseの返却
        return response;
    }
}