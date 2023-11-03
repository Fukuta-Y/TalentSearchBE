package com.talent.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.api.ProgramTorokuKoshinApi;
import com.model.MProgram;
import com.model.ProgramTorokuKoshin;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class ProgramTorokuKoshinController implements ProgramTorokuKoshinApi{@Override

	public ResponseEntity<ProgramTorokuKoshin> postProgramTorokuKoshin(MProgram mprogram) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

//	// ChanelKyokuServiceを宣言
//	private final ChanelKyokuService service;
//
//	@Override
//	public ResponseEntity<ChanelKyoku> getChanelKyoku(String chanelIds) {
//		// KbnMasterServiceより取得
//		ChanelKyoku response = service.select(chanelIds);
//		return ResponseEntity.ok(response);
//	}
	
	
	
}