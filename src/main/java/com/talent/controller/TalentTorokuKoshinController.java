package com.talent.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.api.TalentTorokuKoshinApi;
import com.model.MTalent;
import com.model.TalentTorokuKoshin;
import com.talent.service.TalentTorokuKoshinService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class TalentTorokuKoshinController implements TalentTorokuKoshinApi{

	// TalentTorokuKoshinServiceを宣言
	private final TalentTorokuKoshinService service;

    /**
    * タレント登録・更新Controller
    *
    * @param talentTorokuKoshin   タレントID
    * @return TalentTorokuKoshin
    */
	@Override
	public ResponseEntity<TalentTorokuKoshin> postTalentTorokuKoshin(MTalent mTalent) {
		// TalentTorokuKoshinServiceより取得
		TalentTorokuKoshin response = service.postTalentTorokuKoshin(mTalent);
		return ResponseEntity.ok(response);
	}
}