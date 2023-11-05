package com.talent.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.api.KbnMasterApi;
import com.model.KbnMasterList;
import com.talent.service.KbnMasterService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class KbnMasterController implements KbnMasterApi{
	
	// KbnMasterServiceを宣言
	private final KbnMasterService service;

	/**
	* 区分マスタ検索Controller
	*
	* @param genreIds ジャンルID
	* @return KbnMasterList
	*/
	@Override
	public ResponseEntity<KbnMasterList> getKbnMaster(String genreIds) {
		// KbnMasterServiceより取得
		KbnMasterList response = service.getKbnMasterList(genreIds);
		return ResponseEntity.ok(response);
	}
}