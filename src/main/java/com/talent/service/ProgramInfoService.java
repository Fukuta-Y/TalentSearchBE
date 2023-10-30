package com.talent.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.model.MProgram;
import com.model.ProgramInfos;
import com.talent.infrastructure.dto.ProgramMasterDto;
import com.talent.infrastructure.repository.mapper.generated.MProgramMapper;
import com.talent.service.helper.MprogramHelper;

import lombok.RequiredArgsConstructor;

/**
 * 番組マスタ検索Service
 */
@Service
@RequiredArgsConstructor
public class ProgramInfoService {
	// mapperの宣言
	private final MProgramMapper mProgramMapper;
	
	private final MprogramHelper helper;

	  /**
	  * 番組マスタ検索Service
	  * @param programId 番組ID
	  * @return ProgramInfo
	  */
	public ProgramInfos select(String  programId) {
	
	 	// ProgramInfoをResponseに設定
		ProgramInfos response = new ProgramInfos();
	 	
        // 番組IDのリストを設定
        List<String> programIdList = new ArrayList<String>();
        // 引数の内容を設定
        programIdList.add(programId);

	 	// 番組マスタ検索
		List<ProgramMasterDto> programList = mProgramMapper.select(programIdList);
	
	     // Responseへ設定
		List<MProgram> program = helper.toModel(programList);
		
	 	response.setmProgram(program);
	
		// responseの返却
	 	return response;
	}
}