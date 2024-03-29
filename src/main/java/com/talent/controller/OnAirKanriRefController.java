package com.talent.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.api.OnAirKanriRefApi;
import com.model.OnAirKanriRefList;
import com.talent.service.OnAirKanriRefService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class OnAirKanriRefController implements OnAirKanriRefApi{

	// OnAirKanriRefServiceを宣言
	private final OnAirKanriRefService service;

	/**
	* オンエア管理参照検索Controller
	* 
	* @param　id ID
	* @param　onAirDay オンエア日
	* @return OnAirKanriList
	*/
	@Override
	public ResponseEntity<OnAirKanriRefList> getOnAirKanriRef(String id, String onAirDay) {
		OnAirKanriRefList response = service.getOnAirKanriRef(id, onAirDay);
		return ResponseEntity.ok(response);
	}
}