package com.talent.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.api.ProgramTorokuKoshinApi;
import com.model.MProgram;
import com.model.ProgramTorokuKoshin;
import com.talent.service.ProgramTorokuKoshinService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class ProgramTorokuKoshinController implements ProgramTorokuKoshinApi{

	// ProgramTorokuKoshinServiceを宣言
	private final ProgramTorokuKoshinService service;

	@Override
	public ResponseEntity<ProgramTorokuKoshin> postProgramTorokuKoshin(MProgram mProgram) {
		// TODO 自動生成されたメソッド・スタブ
		ProgramTorokuKoshin response = new ProgramTorokuKoshin();
		response = service.post(mProgram);
		return ResponseEntity.ok(response);
	}
}