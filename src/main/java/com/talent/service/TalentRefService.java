package com.talent.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.model.MTalent;
import com.model.TalentList;
import com.talent.infrastructure.dto.TalentMasterDto;
import com.talent.infrastructure.repository.mapper.generated.MTalentMapper;
import com.talent.service.helper.MTalentHelper;

import lombok.RequiredArgsConstructor;

/**
 * タレント参照検索Service
 */
@Service
@RequiredArgsConstructor
public class TalentRefService {
	// mapperの宣言
	private final MTalentMapper mapper;

	// helperの宣言
	private final MTalentHelper helper;

	/**
	* タレント参照検索Service
	* 
	* @param　talentId タレントID
	* @param　talentName タレント名
	* @return TalentList
	*/
	public TalentList getTalentRef(String talentId, String talentName) {
	
	 	// TalentListをresponseに設定
		TalentList response = new TalentList();

	 	// タレント参照検索
		List<TalentMasterDto> dtoList = mapper.select(talentId, talentName);
	
	     // Model変換
		List<MTalent> modelList = helper.toModel(dtoList);

	     // responseへ設定
	 	response.setmTalent(modelList);
	
		// responseの返却
	 	return response;
	}
}