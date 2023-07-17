package com.talent.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.api.ProgramShutsuenApi;
import com.model.ProgramShutsuen;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class ProgramShutsuenController implements ProgramShutsuenApi{@Override
	public ResponseEntity<List<ProgramShutsuen>> getprogramShutsuen(String programId, String onairDay) {
		ProgramShutsuen model = new ProgramShutsuen();
		List<ProgramShutsuen> response =  new ArrayList<ProgramShutsuen>();
		response.add(model);
		return ResponseEntity.ok(response);
	}
}