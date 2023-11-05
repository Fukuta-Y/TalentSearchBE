package com.talent.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.api.ProgramInfoApi;
import com.model.ProgramInfoList;
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
	* @param programId 番組ID
	* @return ProgramInfoList
	*/
	@Override
	public ResponseEntity<ProgramInfoList> getProgramInfo(String programId) {
		// ProgramInfoServiceより取得
		ProgramInfoList response = service.getProgramInfoList(programId);
		return ResponseEntity.ok(response);
	}
	
}