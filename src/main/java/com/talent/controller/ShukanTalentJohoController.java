package com.talent.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.api.ShukanTalentJohoApi;
import com.model.ShukanTalentJoho;
import com.talent.service.ShukanTalentJohoService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class ShukanTalentJohoController implements ShukanTalentJohoApi{
	
    private final ShukanTalentJohoService service;

	@Override
	public ResponseEntity<ShukanTalentJoho> getShukanTalentJoho(Integer nentsuki, Integer shu, String talentName) {

		// ShukanTalentJohoServiceより取得
		ShukanTalentJoho response = service.select(nentsuki, shu, talentName);
		return ResponseEntity.ok(response);
	}
}