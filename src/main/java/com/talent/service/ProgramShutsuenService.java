package com.talent.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.model.ProgramShutsuen;
import com.model.ProgramShutsuenList;
import com.talent.infrastructure.repository.mapper.ProgramShutsuenMapper;

import lombok.RequiredArgsConstructor;

/**
 * 番組出演者検索 Service
 */
@Service
@RequiredArgsConstructor
public class ProgramShutsuenService {
	// mapperの宣言
    private final ProgramShutsuenMapper programShutsuenMapper;

    /**
     * 番組出演者検索 Service
     * @param programId 番組ID
     * @param onairDay  オンエア日
     * @return ProgramShutsuenList
     */
    public ProgramShutsuenList select(String  programId, String onairDay) {

    	// ProgramShutsuenListをResponseに設定
    	ProgramShutsuenList response = new ProgramShutsuenList();
    	
    	// 番組出演者検索
    	List<ProgramShutsuen> infoList = programShutsuenMapper.select(programId, onairDay);

        // Responseへ設定
    	response.setProgramShutsuen(infoList);

		// responseの返却
        return response;
    }
}