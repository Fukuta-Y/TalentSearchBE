package com.talent.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.model.ChannelKyoku;
import com.talent.infrastructure.dto.ChannelKyokuMasterDto;
import com.talent.infrastructure.model.generated.MChannelKyoku;
import com.talent.infrastructure.repository.mapper.generated.MChannelKyokuMapper;
import com.talent.service.helper.MChannelKyokuHelper;

import lombok.RequiredArgsConstructor;

/**
 * チャンネル局マスタ検索Service
 */
@Service
@RequiredArgsConstructor
public class ChannelKyokuService {

	// mapperの宣言
	private final MChannelKyokuMapper mChanelKyokuMapper;

	// helperの宣言
	private final MChannelKyokuHelper helper;

	  /**
	  * チャンネル局マスタ検索Service
	  * @param channelIds チャンネルID 【複数】
	  * @return ChannelKyoku
	  */
	public ChannelKyoku getChannelKyoku(String channelIds) {
	
	 	// ChanelKyokuをResponseに設定
		ChannelKyoku response = new ChannelKyoku();
	 	
		// genreIdsをカンマ区切りで配列へ設定
		List<String> genreIdList = new ArrayList<String>();
		String idList[] = channelIds.split(",");
        // ジャンルIDの一覧のリスト
        for (String list : idList) {
        	genreIdList.add(list);
        }

	 	// 区分マスタ検索
        List<ChannelKyokuMasterDto> chanelKyokuList = mChanelKyokuMapper.select(genreIdList);

        List<MChannelKyoku> genreList= helper.toModel(chanelKyokuList);
        
        response.setmChannelKyoku(genreList);
        
		// responseの返却
	 	return response;
	}
}