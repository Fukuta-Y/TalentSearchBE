package com.talent.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.model.ProgramShutsuen;
import com.model.ProgramShutsuenList;

import lombok.RequiredArgsConstructor;

/**
 * 番組出演者検索 Service
 */
@Service
@RequiredArgsConstructor
public class ProgramShutsuenService {

    /**
     * 番組出演者検索
     * @param programId 番組ID
     * @param onairDay  オンエア日
     * @return 検索結果
     */
    public ProgramShutsuenList select(String  programId, String onairDay) {

    	// ProgramShutsuenをResponseに設定
    	ProgramShutsuenList response = new ProgramShutsuenList();

    	ProgramShutsuen model = new ProgramShutsuen();
    	model.setTalentId(programId);
    	model.setTalentName("test");

    	List<ProgramShutsuen> list = new ArrayList<ProgramShutsuen>();
    	list.add(model);

    	response.setProgramShutsuen(list);

		// responseの返却
        return response;
    }
}