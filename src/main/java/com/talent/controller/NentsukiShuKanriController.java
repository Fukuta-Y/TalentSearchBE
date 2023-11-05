package com.talent.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.api.NentsukiShuKanriApi;
import com.model.MNentsukiShuKanri;
import com.model.NentsukiShuKanri;
import com.talent.service.NentsukiShuKanriService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class NentsukiShuKanriController implements NentsukiShuKanriApi{
	
	// NentsukiShuKanriServiceを宣言
	private final NentsukiShuKanriService service;
	
	/**
	* 年月週管理マスタ検索Controller
	* 
	* @param　無
	* @return NentsukiShuKanri
	*/
	@Override
	public ResponseEntity<NentsukiShuKanri> getNentsukiShuKanri() {
		// NentsukiShuKanriServiceより取得
		NentsukiShuKanri response = service.getNentsukiShuKanri();
		return ResponseEntity.ok(response);
	}

	/**
	* 年月週管理登録・更新Controller
	* 
	* @param nentsukiShuKanri 年月週管理マスタDTO
	* @return NentsukiShuKanri
	*/
	@Override
	public ResponseEntity<NentsukiShuKanri> postProgramTorokuKoshin(MNentsukiShuKanri mNentsukiShuKanri) {
		// NentsukiShuKanriServiceより取得
		NentsukiShuKanri response = service.postNentsukiShuKanri(mNentsukiShuKanri);
		return ResponseEntity.ok(response);
	}
}