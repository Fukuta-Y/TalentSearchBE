package com.talent.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.model.ChanelKyoku;
import com.talent.infrastructure.dto.ChanelKyokuMasterDto;
import com.talent.infrastructure.model.generated.MChanelKyoku;
import com.talent.infrastructure.repository.mapper.generated.MChanelKyokuMapper;
import com.talent.service.helper.MChanelKyokuHelper;

import lombok.RequiredArgsConstructor;

/**
 * チャンネル局マスタ検索Service
 */
@Service
@RequiredArgsConstructor
public class ChanelKyokuService {

	// mapperの宣言
	private final MChanelKyokuMapper mChanelKyokuMapper;

	// helperの宣言
	private final MChanelKyokuHelper helper;

	  /**
	  * チャンネル局マスタ検索Service
	  * @param chanelIds チャンネルID 【複数】
	  * @return ChanelKyoku
	  */
	public ChanelKyoku getChanelKyoku(String chanelIds) {
	
	 	// ChanelKyokuをResponseに設定
		ChanelKyoku response = new ChanelKyoku();
	 	
		// genreIdsをカンマ区切りで配列へ設定
		List<String> genreIdList = new ArrayList<String>();
		String idList[] = chanelIds.split(",");
        // ジャンルIDの一覧のリスト
        for (String list : idList) {
        	genreIdList.add(list);
        }

	 	// 区分マスタ検索
        List<ChanelKyokuMasterDto> chanelKyokuList = mChanelKyokuMapper.select(genreIdList);

        List<MChanelKyoku> genreList= helper.toModel(chanelKyokuList);
        
        response.setmChanelKyoku(genreList);
        
		// responseの返却
	 	return response;
	}
}