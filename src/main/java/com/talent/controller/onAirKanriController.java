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
public class onAirKanriController implements OnAirKanriApi{
	
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

	@Override
	public ResponseEntity<OnAirKanriList> postOnAirKanri(TOnAirKanri tonAirKanri) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}
}