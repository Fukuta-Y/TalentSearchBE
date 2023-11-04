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
 * タレントマスタ検索Service
 */
@Service
@RequiredArgsConstructor
public class TalentMasterService {

	// mapperの宣言
	private final MTalentMapper mTalentMapper;
	// helperの宣言
	private final MTalentHelper helper;

	  /**
	  * タレントマスタ検索Service
	  * @param talentId タレントID
	  * @return MTalent
	  */
	public TalentList select(String talentId) {
		// responseを宣言
		TalentList respose = new TalentList();
		// タレントマスタ検索する
		List<TalentMasterDto> talentListDto = mTalentMapper.selectEx(talentId);
		// 戻りを変換する
		List<MTalent>  talentList= helper.toModel(talentListDto);
		respose.setmTalent(talentList);
		// responseの返却
	 	return respose;
	}
}