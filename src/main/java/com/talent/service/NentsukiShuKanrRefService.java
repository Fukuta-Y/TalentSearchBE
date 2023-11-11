package com.talent.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.model.MNentsukiShuKanri;
import com.model.NentsukiShuKanri;
import com.talent.infrastructure.repository.mapper.generated.MNentsukiShuKanriMapper;
import com.talent.service.dto.NentsukiShuKanriMasterDto;
import com.talent.service.helper.MNentsukiShuKanriHelper;

import lombok.RequiredArgsConstructor;

/**
 * 年月週管理参照検索Service
 */
@Service
@RequiredArgsConstructor
public class NentsukiShuKanrRefService {
	// mapperの宣言
	private final MNentsukiShuKanriMapper mapper;

	// helperの宣言
	private final MNentsukiShuKanriHelper helper;

	/**
	* 年月週管理参照検索Service
	* 
	* @param　nentsuki 年月
	* @param　shu 週
	* @return NentsukiShuKanri
	*/
	public NentsukiShuKanri getNentsukiShuKanrRef(Integer nentsuki, Integer shu) {
	
	 	// NentsukiShuKanriをresponseに設定
		NentsukiShuKanri response = new NentsukiShuKanri();

	 	// 年月週管理参照検索
		List<NentsukiShuKanriMasterDto> dtoList = mapper.select(nentsuki, shu);
	
	     // Model変換
		List<MNentsukiShuKanri> modelList = helper.toListModel(dtoList);

	     // responseへ設定
	 	response.setmNentsukiShuKanri(modelList);
	
		// responseの返却
	 	return response;
	}
}