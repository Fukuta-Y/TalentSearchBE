package com.talent.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.api.TalentShukanShutsuenJohoApi;
import com.model.TalentShukanShutsuenJoho;
import com.talent.service.TalentShukanShutsuenJohoService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class TalentShukanShutsuenJohoController implements TalentShukanShutsuenJohoApi{

	// TalentShukanShutsuenJohoServiceを宣言
    private final TalentShukanShutsuenJohoService service;
	
    /**
    * タレント週間出演情報検索Controller
    *
    * @param nentsuki  年月
    * @param shu       週
    * @param talentId タレントID
    * @return TalentShukanShutsuenJoho
    */
	@Override
	public ResponseEntity<TalentShukanShutsuenJoho> getTalentShukanShutsuenJoho(Integer nentsuki, Integer shu, String talentId) {
		// TalentShukanShutsuenJohoServiceより取得
		TalentShukanShutsuenJoho response = service.select(nentsuki, shu, talentId);
		return ResponseEntity.ok(response);
	}
}