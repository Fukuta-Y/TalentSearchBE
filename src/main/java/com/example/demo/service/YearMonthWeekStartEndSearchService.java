package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.dto.NentsukiShuKanriMasterDto;
import com.example.demo.repository.mapper.generated.MNentsukiShuKanriMapper;
import com.example.demo.service.helper.MNentsukiShuKanriHelper;
import com.model.MNentsukiShuKanri;

import lombok.RequiredArgsConstructor;

/**
 * 年月週の開始終了日付検索 Service
 */
@Service
@RequiredArgsConstructor
public class YearMonthWeekStartEndSearchService {

    private final MNentsukiShuKanriMapper mapper;
    private final MNentsukiShuKanriHelper helper;

    /**
     * 年月週の開始終了日付検索
　　　* @param targetNentsuki 対象年月
　　　* @param targetShu 対象週
     * @return 検索結果
     */
    public MNentsukiShuKanri select(Integer targetNentsuki, Integer targetShu) {
 
    	// 年月週の開始終了日付検索
    	NentsukiShuKanriMasterDto nentsukiShuKanriMasterDto = mapper.select(targetNentsuki, targetShu);

    	System.out.println("nentsukiShuKanriMasterDto:" + nentsukiShuKanriMasterDto);
    	
    	// 戻りの内容を設定
    	MNentsukiShuKanri model = helper.toModel(nentsukiShuKanriMasterDto);	
    	
    	System.out.println("MNentsukiShuKanri:" + model);
    	
    	// 戻りの内容を設定【TODO:helperでマッピングさせる必要あり】
//    	response.setNentsuki(nentsukiShuKanriMasterDto.getNentsuki());
//    	response.setShu(nentsukiShuKanriMasterDto.getShu());
//    	response.setShuFrom(nentsukiShuKanriMasterDto.getShuFrom().toString());
//    	response.setShuTo(nentsukiShuKanriMasterDto.getShuTo().toString());
//    	response.setKoushinDay(nentsukiShuKanriMasterDto.getKoushinDay().toString());
//    	response.setTorokuDay(nentsukiShuKanriMasterDto.getTorokuDay().toString());
    	
		// responseの返却
        return model;
    }
}