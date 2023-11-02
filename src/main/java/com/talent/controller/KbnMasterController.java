package com.talent.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.api.KbnMasterApi;
import com.model.KbnMasterInfos;
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
	 * @return ResponseEntity<List<KbnMaster>>
	 */
	@Override
	public ResponseEntity<KbnMasterInfos> getKbnMaster(String genreIds) {
		// KbnMasterServiceより取得
		KbnMasterInfos response = service.select(genreIds);
		return ResponseEntity.ok(response);
	}
}