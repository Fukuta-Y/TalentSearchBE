package com.talent.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.model.KbnMaster;
import com.talent.infrastructure.dto.KbnGenreMasterDto;
import com.talent.infrastructure.repository.mapper.generated.MKbnGenreMapper;
import com.talent.service.helper.KbnMasterHelper;

import lombok.RequiredArgsConstructor;

/**
 * 区分マスタ検索Service
 */
@Service
@RequiredArgsConstructor
public class KbnMasterService {

	// mapperの宣言
	private final MKbnGenreMapper mKbnGenreMapper;
	
	private final KbnMasterHelper helper;

	  /**
	  * 区分マスタ検索Service
	  * @param genreIds ジャンルID 【複数】
	  * @return List<KbnMaster>
	  */
	public List<KbnMaster> select(String  genreIds) {
	
	 	// List<KbnMaster>をResponseに設定
		List<KbnMaster>  response = new ArrayList<KbnMaster>();
	 	
		// genreIdsをカンマ区切りで配列へ設定
		List<Integer> genreIdList = new ArrayList<Integer>();
		String idList[] = genreIds.split(",");
        // ジャンルIDの一覧のリスト
        for (String list : idList) {
        	genreIdList.add(Integer.parseInt(list));
        }
	 	// 区分マスタ検索
        List<KbnGenreMasterDto> kbnList = mKbnGenreMapper.select(genreIdList);
	
	     // Responseへ設定
        response = helper.toModel(kbnList);
	
		// responseの返却
	 	return response;
	}
}