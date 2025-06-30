package com.talent.service;

import java.util.List;

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
     * 
     * @param nentsuki 年月
     * @param shu      週
     * @return YearMonthWeekStartEndJoho
     */
    public YearMonthWeekStartEndJoho getYearMonthWeekStartEndJoho(Integer nentsuki, Integer shu) {

        // 年月週の開始終了日付検索
        List<NentsukiShuKanriMasterDto> dto = mapper.select(nentsuki, shu);

        // ★ ここから修正点 ★
        // リストが空の場合は、YearMonthWeekStartEndJohoオブジェクトを生成せずにnullを返します。
        // これにより、IndexOutOfBoundsExceptionの発生を防ぎます。
        if (dto.isEmpty()) {
            return null;
        }
        // ★ ここまで修正点 ★

        // YearMonthWeekStartEndJohoをResponseに設定
        YearMonthWeekStartEndJoho response = new YearMonthWeekStartEndJoho();

        // Responseへ設定
        response.setmNentsukiShuKanri(helper.toModel(dto.get(0)));

        // responseの返却
        return response;
    }
}