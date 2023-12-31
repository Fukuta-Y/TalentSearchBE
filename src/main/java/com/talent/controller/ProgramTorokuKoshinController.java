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

    /**
    * 番組登録・更新Controller
    *
    * @param mProgram　番組マスタDTO
    * @return ProgramTorokuKoshin
    */
	@Override
	public ResponseEntity<ProgramTorokuKoshin> postProgramTorokuKoshin(MProgram mProgram) {
		// ProgramTorokuKoshinServiceより取得
		ProgramTorokuKoshin response = service.postProgramTorokuKoshin(mProgram);
		return ResponseEntity.ok(response);
	}
}