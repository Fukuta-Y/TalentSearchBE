package com.talent.service;

import org.springframework.stereotype.Service;

import com.model.YearMonthWeekStartEndJoho;
import com.talent.infrastructure.repository.mapper.generated.MNentsukiShuKanriMapper;
import com.talent.service.dto.NentsukiShuKanriMasterDto;
import com.talent.service.helper.MNentsukiShuKanriHelper;

import lombok.RequiredArgsConstructor;

/**
 * 年月週の開始終了日付検索Service
 */
@Service
@RequiredArgsConstructor
public class YearMonthWeekStartEndService {
	// mapperの宣言
    private final MNentsukiShuKanriMapper mapper;
    // helperの宣言
    private final MNentsukiShuKanriHelper helper;

    /**
     * 年月週の開始終了日付検索Service
     * @param nentsuki 年月
     * @param shu 週
     * @return YearMonthWeekStartEndJoho
     */
    public YearMonthWeekStartEndJoho getYearMonthWeekStartEndJoho(Integer nentsuki, Integer shu) {
 
    	// YearMonthWeekStartEndJohoをResponseに設定
    	YearMonthWeekStartEndJoho response = new YearMonthWeekStartEndJoho();

    	// 年月週の開始終了日付検索
    	NentsukiShuKanriMasterDto dto = mapper.select(nentsuki, shu);

        // Responseへ設定
    	response.setmNentsukiShuKanri(helper.toModel(dto));
    	
		// responseの返却
        return response;
    }
}