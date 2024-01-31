package com.talent.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.api.NentsukiShuKanriRefApi;
import com.model.NentsukiShuKanri;
import com.talent.service.NentsukiShuKanriRefService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class NentsukiShuKanriRefController implements NentsukiShuKanriRefApi{
	
	// NentsukiShuKanriRefServiceを宣言
	private final NentsukiShuKanriRefService service;

	/**
	* 年月週管理参照検索Controller
	* 
	* @param　nentsuki 年月
	* @param　shu 週
	* @return NentsukiShuKanri
	*/
	@Override
	public ResponseEntity<NentsukiShuKanri> getNentsukiShuKanriRef(Integer nentsuki, Integer shu) {
		NentsukiShuKanri response = service.getNentsukiShuKanriRef(nentsuki, shu);
		return ResponseEntity.ok(response);
	}

}