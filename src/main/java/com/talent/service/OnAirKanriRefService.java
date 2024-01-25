package com.talent.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.model.OnAirKanriList;
import com.model.TOnAirKanri;
import com.talent.infrastructure.dto.OnAirKanriRefDto;
import com.talent.infrastructure.repository.mapper.generated.TOnAirKanriMapper;
import com.talent.service.helper.TOnAirKanriHelper;

import lombok.RequiredArgsConstructor;

/**
 * オンエア管理参照検索Service
 */
@Service
@RequiredArgsConstructor
public class OnAirKanriRefService {
	// mapperの宣言
	private final TOnAirKanriMapper tOnAirKanriMapper;

	// helperの宣言
	private final TOnAirKanriHelper helper;

	  /**
	  * オンエア管理参照検索Service
	  * @param　id ID
	  * @param　onAirDay オンエア日
	  * @return OnAirKanriList
	  */
	public OnAirKanriList getOnAirKanriRef(String id, String onAirDay) {
	
	 	// ProgramInfoListをresponseに設定
		OnAirKanriList response = new OnAirKanriList();

	 	// オンエア管理参照検索
		List<OnAirKanriRefDto> dtoList = tOnAirKanriMapper.selectEx(id, onAirDay);
	
	     // Model変換
		List<TOnAirKanri> modelList = helper.toModel(dtoList);

	     // responseへ設定
	 	response.settOnAirKanri(modelList);
	
		// responseの返却
	 	return response;
	}
}