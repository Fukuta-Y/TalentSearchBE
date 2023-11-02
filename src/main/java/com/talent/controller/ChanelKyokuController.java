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

	@Override
	public ResponseEntity<ChanelKyoku> getChanelKyoku(String chanelIds) {
		// KbnMasterServiceより取得
		ChanelKyoku response = service.select(chanelIds);
		return ResponseEntity.ok(response);
	}
}