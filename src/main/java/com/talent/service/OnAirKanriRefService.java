package com.talent.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.model.OnAirKanriRefList;
import com.model.TOnAirKanriRef;
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
	  * @return OnAirKanriRefList
	  */
	public OnAirKanriRefList getOnAirKanriRef(String id, String onAirDay) {
	
	 	// ProgramInfoListをresponseに設定
		OnAirKanriRefList response = new OnAirKanriRefList();

	 	// オンエア管理参照検索
		List<OnAirKanriRefDto> dtoList = tOnAirKanriMapper.selectEx(id, onAirDay);
	
	     // Model変換
		List<TOnAirKanriRef> modelList = helper.toRefModel(dtoList);

	     // responseへ設定
	 	response.settOnAirKanriRef(modelList);
	
		// responseの返却
	 	return response;
	}
}