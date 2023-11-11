package com.talent.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.api.ProgramRefApi;
import com.model.ProgramInfoList;
import com.talent.service.ProgramRefService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class ProgramRefController implements ProgramRefApi{

	// ProgramRefServiceを宣言
	private final ProgramRefService service;

	/**
	* 番組参照検索Controller
	* 
	* @param　programId 番組ID
	* @param　programName 番組名
	* @return ProgramInfoList
	*/
	@Override
	public ResponseEntity<ProgramInfoList> getProgramRef(String programId, String programName) {
		ProgramInfoList response = service.getProgramRef(programId, programName);
		return ResponseEntity.ok(response);
	}
}