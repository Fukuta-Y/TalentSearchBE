package com.talent.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.api.ChanelKyokuApi;
import com.model.ChanelKyoku;
import com.talent.service.ChanelKyokuService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class ChanelKyokuController implements ChanelKyokuApi{

	// ChanelKyokuServiceを宣言
	private final ChanelKyokuService service;

	/**
	* チャンネル局マスタ検索Controller
	*
	* @param chanelIds チャンネルID【複数】
	* @return ChanelKyoku
	*/
	@Override
	public ResponseEntity<ChanelKyoku> getChannelKyoku(String chanelIds) {
		// ChanelKyokuServiceより取得
		ChanelKyoku response = service.getChanelKyoku(chanelIds);
		return ResponseEntity.ok(response);
	}
}