package com.talent.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.api.NentsukiShuKanrRefApi;
import com.model.NentsukiShuKanri;
import com.talent.service.NentsukiShuKanrRefService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class NentsukiShuKanrRefController implements NentsukiShuKanrRefApi{
	
	// NentsukiShuKanrRefServiceを宣言
	private final NentsukiShuKanrRefService service;

	/**
	* 年月週管理参照検索Controller
	* 
	* @param　nentsuki 年月
	* @param　shu 週
	* @return NentsukiShuKanri
	*/
	@Override
	public ResponseEntity<NentsukiShuKanri> getNentsukiShuKanrRef(Integer nentsuki, Integer shu) {
		NentsukiShuKanri response = service.getNentsukiShuKanrRef(nentsuki, shu);
		return ResponseEntity.ok(response);
	}

}