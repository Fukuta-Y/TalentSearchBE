package com.talent.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.api.KbnMasterApi;
import com.model.KbnMaster;
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
	public ResponseEntity<List<KbnMaster>> getKbnMaster(String genreIds) {
	
		// KbnMasterServiceより取得
		List<KbnMaster> response = service.select(genreIds);
		return ResponseEntity.ok(response);
	}
	
}