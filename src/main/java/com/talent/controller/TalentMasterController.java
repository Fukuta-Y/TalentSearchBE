package com.talent.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.api.TalentMasterApi;
import com.model.TalentList;
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
    * @return TalentList
    */
	@Override
	public ResponseEntity<TalentList> getTalentMaster(String talentId) {
		// TalentMasterServiceより取得
		TalentList response = service.getTalentList(talentId);
		return ResponseEntity.ok(response);
	}
}