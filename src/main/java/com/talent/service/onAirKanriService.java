package com.talent.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.model.OnAirKanriList;
import com.model.TOnAirKanri;
import com.talent.infrastructure.dto.OnAirKanriTableDto;
import com.talent.infrastructure.repository.mapper.generated.TOnAirKanriMapper;
import com.talent.service.helper.TOnAirKanriHelper;

import lombok.RequiredArgsConstructor;

/**
 * オンエア管理情報 Service
 */
@Service
@RequiredArgsConstructor
public class onAirKanriService {

	// mapperの宣言
	private final TOnAirKanriMapper tOnAirKanriMapper;

	// helperの宣言
	private final TOnAirKanriHelper helper;
	
	/**
	  * オンエア管理情報 Service
	  * @param id　ID
	  * @return OnAirKanriList
	 */
	public OnAirKanriList select(String id) {
		
	 	// OnAirKanriListをResponseに設定
		OnAirKanriList response = new OnAirKanriList();

		List<OnAirKanriTableDto> dto = tOnAirKanriMapper.selectId(id);
		
		// (1) パラメータのIDをキーとして、BE「オンエア管理テーブル検索」へ検索して、
		// 取得したオンエア管理テーブルDTOをレスポンスへ設定する。
		List<TOnAirKanri> list = helper.toModel(dto);
		response.settOnAirKanri(list);

		// responseの返却
	 	return response;
	}
}