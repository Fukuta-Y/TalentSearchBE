package com.talent.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.api.OnAirKanriApi;
import com.model.OnAirKanriList;
import com.model.TOnAirKanri;
import com.talent.service.onAirKanriService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class OnAirKanriController implements OnAirKanriApi{
	
	// onAirKanriServiceを宣言
	private final onAirKanriService service;
	
	/**
	* オンエア管理テーブル検索Controller
	* 
	* @param　id ID
	* @return OnAirKanriList
	*/
	@Override
	public ResponseEntity<OnAirKanriList> getOnAirKanri(String id) {
		// onAirKanriServiceより取得
		OnAirKanriList response = service.select(id);
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
		OnAirKanriList response = service.post(tOnAirKanri);
		return ResponseEntity.ok(response);
	}
}