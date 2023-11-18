package com.talent.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.model.ProgramShutsuen;
import com.model.ProgramShutsuenList;
import com.talent.infrastructure.repository.mapper.ProgramShutsuenMapper;

import lombok.RequiredArgsConstructor;

/**
 * 番組出演者検索Service
 */
@Service
@RequiredArgsConstructor
public class ProgramShutsuenService {
	// mapperの宣言
    private final ProgramShutsuenMapper programShutsuenMapper;

    /**
     * 番組出演者検索Service
     * @param programId 番組ID
     * @param onAirDay  オンエア日
     * @return ProgramShutsuenList
     */
    public ProgramShutsuenList getProgramShutsuenList(String  programId, String onAirDay) {

    	// ProgramShutsuenListをResponseに設定
    	ProgramShutsuenList response = new ProgramShutsuenList();
    	
    	// 番組出演者検索
    	List<ProgramShutsuen> infoList = programShutsuenMapper.select(programId, onAirDay);

        // Responseへ設定
    	response.setProgramShutsuen(infoList);

		// responseの返却
        return response;
    }
}