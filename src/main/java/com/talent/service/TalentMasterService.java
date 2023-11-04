package com.talent.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.model.MTalent;
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
	public MTalent select(String talentId) {
		// responseを宣言
		MTalent respose = new MTalent();
		// タレントマスタ検索する
		List<TalentMasterDto> list = mTalentMapper.selectEx(talentId);
		// 戻りを変換する
		respose = helper.toModel(list.get(0));
		// responseの返却
	 	return respose;
	}
}