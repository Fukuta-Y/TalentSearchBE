package com.talent.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.api.ShukanTalentJohoApi;
import com.model.ShukanTalentJoho;
import com.talent.service.ShukanTalentJohoService;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class ShukanTalentJohoController implements ShukanTalentJohoApi{
	
    private final ShukanTalentJohoService service;

	@Override
	public ResponseEntity<ShukanTalentJoho> getShukanTalentJoho(
			@NotNull @Min(199001) @Max(210012) @Valid Integer targetNentsuki,
			@NotNull @Min(1) @Max(5) @Valid Integer targetShu, @Size(max = 30) @Valid String talentName) {

		// ShukanTalentJohoServiceより取得
		ShukanTalentJoho response = service.select(targetNentsuki, targetShu, talentName);
		return ResponseEntity.ok(response);
	}
}