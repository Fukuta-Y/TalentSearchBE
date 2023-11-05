package com.talent.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.api.OnAirKanriApi;
import com.model.OnAirKanriList;
import com.model.TOnAirKanri;
import com.talent.service.OnAirKanriService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class OnAirKanriController implements OnAirKanriApi{
	
	// OnAirKanriServiceを宣言
	private final OnAirKanriService service;
	
	/**
	* オンエア管理テーブル検索Controller
	* 
	* @param　id ID
	* @return OnAirKanriList
	*/
	@Override
	public ResponseEntity<OnAirKanriList> getOnAirKanri(String id) {
		// OnAirKanriServiceより取得
		OnAirKanriList response = service.getOnAirKanriList(id);
		return ResponseEntity.ok(response);
	}

	/**
	* オンエア管理登録・更新Controller
	* 
	* @param　tOnAirKanri オンエア管理テーブルDTO
	* @return OnAirKanriList
	*/
	@Override
	public ResponseEntity<OnAirKanriList> postOnAirKanri(TOnAirKanri tOnAirKanri) {
		// OnAirKanriServiceより取得
		OnAirKanriList response = service.postOnAirKanriList(tOnAirKanri);
		return ResponseEntity.ok(response);
	}
}