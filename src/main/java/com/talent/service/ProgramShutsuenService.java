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
	
    private final ProgramShutsuenMapper programShutsuenMapper;

    /**
     * 番組出演者検索
     * @param programId 番組ID
     * @param onairDay  オンエア日
     * @return ProgramShutsuenList
     */
    public ProgramShutsuenList select(String  programId, String onairDay) {
    	// ProgramShutsuenListをResponseに設定
    	List<ProgramShutsuen> infoList = programShutsuenMapper.select(programId, onairDay);
    	ProgramShutsuenList response = new ProgramShutsuenList();
    	response.setProgramShutsuen(infoList);
		// responseの返却
        return response;
    }
}