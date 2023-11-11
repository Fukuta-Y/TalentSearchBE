package com.talent.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.api.TalentRefApi;
import com.model.TalentList;
import com.talent.service.TalentRefService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class TalentRefController implements TalentRefApi{

	// TalentRefServiceを宣言
	private final TalentRefService service;

	/**
	* タレント参照検索Controller
	* 
	* @param　talentId タレントID
	* @param　talentName タレント名
	* @return TalentList
	*/
	@Override
	public ResponseEntity<TalentList> getTalentRef(String talentId, String talentName) {
		TalentList response = service.getTalentRef(talentId, talentName);
		return ResponseEntity.ok(response);
	}
}