package com.talent.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.api.KbnMasterApi;
import com.model.KbnMasterInfo;
import com.talent.service.KbnMasterService;

import jakarta.validation.constraints.Size;
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
	public ResponseEntity<KbnMasterInfo> getKbnMaster(@Size(max = 8) String genreIds) {
		// KbnMasterServiceより取得
		KbnMasterInfo response = service.select(genreIds);
		System.err.print("KbnMasterInfo_response:" + response);
		return ResponseEntity.ok(response);
	}
}