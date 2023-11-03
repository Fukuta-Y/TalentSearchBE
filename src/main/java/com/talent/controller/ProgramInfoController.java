package com.talent.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.api.ProgramInfoApi;
import com.model.ProgramInfo;
import com.talent.service.ProgramInfoService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class ProgramInfoController implements ProgramInfoApi{
	
	// ProgramInfoServiceを宣言
	private final ProgramInfoService service;
	
	/**
	 * 番組マスタ検索Controller
	 * 
	 * @param programId 番組IDx
	 */
	@Override
	public ResponseEntity<ProgramInfo> getProgramInfo(String programId) {
		// ProgramInfoServiceより取得
		ProgramInfo response = service.select(programId);
		return ResponseEntity.ok(response);
	}
	
}