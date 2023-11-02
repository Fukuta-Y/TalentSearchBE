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
	
	// ProgramShutsuenServiceを宣言
    private final ProgramShutsuenService service;

    /**
     * 番組出演者検索Controller
     *
     * @param programId 番組ID
     * @param onairDay  オンエア日
     * @return ResponseEntity<ProgramShutsuenList>
     */
	@Override
	public ResponseEntity<ProgramShutsuenList> getprogramShutsuen(String programId, String onairDay) {
		// ProgramShutsuenServiceより取得
		ProgramShutsuenList response = service.select(programId, onairDay);
		return ResponseEntity.ok(response);
	}
}