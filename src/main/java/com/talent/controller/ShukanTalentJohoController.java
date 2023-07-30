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
	
	// ShukanTalentJohoServiceを宣言
    private final ShukanTalentJohoService service;

    /**
     * 週間タレント別情報検索Controller
     *
     * @param nentsuki   年月
     * @param shu        週
     * @param talentName タレント名
     * @return ResponseEntity<List<ShukanTalentJohoBFF>>
     */
	@Override
	public ResponseEntity<ShukanTalentJoho> getShukanTalentJoho(Integer nentsuki, Integer shu, String talentName) {
		// ShukanTalentJohoServiceより取得
		ShukanTalentJoho response = service.select(nentsuki, shu, talentName);
		return ResponseEntity.ok(response);
	}
}