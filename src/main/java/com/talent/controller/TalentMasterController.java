package com.talent.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.api.TalentMasterApi;
import com.model.MTalent;
import com.talent.service.TalentMasterService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class TalentMasterController implements TalentMasterApi{
	
	// TalentMasterServiceを宣言
	private final TalentMasterService service;
	
    /**
     * タレントマスタ検索Controller
     *
     * @param talentId   タレントID
     * @return MTalent
     */
	@Override
	public ResponseEntity<MTalent> getTalentMaster(String talentId) {
		MTalent response = service.select(talentId);
		return ResponseEntity.ok(response);
	}
}