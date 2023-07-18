package com.talent.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.api.ProgramShutsuenApi;
import com.model.ProgramShutsuenList;
import com.talent.service.ProgramShutsuenService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class ProgramShutsuenController implements ProgramShutsuenApi{
	
    private final ProgramShutsuenService service;
	
	@Override
	public ResponseEntity<ProgramShutsuenList> getprogramShutsuen(String programId, String onairDay) {
		// ProgramShutsuenServiceより取得
		ProgramShutsuenList response = service.select(programId, onairDay);
		return ResponseEntity.ok(response);
	}
}