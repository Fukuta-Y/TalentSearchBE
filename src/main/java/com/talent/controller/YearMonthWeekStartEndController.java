package com.talent.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.api.YearMonthWeekStartEndApi;
import com.model.YearMonthWeekStartEndJoho;
import com.talent.service.YearMonthWeekStartEndService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class YearMonthWeekStartEndController implements YearMonthWeekStartEndApi{

	// YearMonthWeekStartEndServiceを宣言
    private final YearMonthWeekStartEndService service;
	
    /**
    * 年月週の開始終了日付検索Controller
    *
    * @param nentsuki  年月
    * @param shu       週
    * @return YearMonthWeekStartEndJoho
    */
	@Override
	public ResponseEntity<YearMonthWeekStartEndJoho> getYearMonthWeekStartEnd(Integer nentsuki, Integer shu) {
		// YearMonthWeekStartEndSearchServiceの取得
		YearMonthWeekStartEndJoho response = service.select(nentsuki, shu);
		return ResponseEntity.ok(response);
	}
}