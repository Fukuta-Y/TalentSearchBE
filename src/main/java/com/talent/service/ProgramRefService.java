package com.talent.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.model.MProgram;
import com.model.ProgramInfoList;
import com.talent.infrastructure.dto.ProgramMasterDto;
import com.talent.infrastructure.repository.mapper.generated.MProgramMapper;
import com.talent.service.helper.MProgramHelper;

import lombok.RequiredArgsConstructor;

/**
 * 番組参照検索Service
 */
@Service
@RequiredArgsConstructor
public class ProgramRefService {
	// mapperの宣言
	private final MProgramMapper mProgramMapper;

	// helperの宣言
	private final MProgramHelper helper;

	/**
	* 番組参照検索Service
	* 
	* @param　programId 番組ID
	* @param　programName 番組名
	* @return ProgramInfoList
	*/
	public ProgramInfoList getProgramRef(String programId, String programName) {
	
	 	// ProgramInfoListをresponseに設定
		ProgramInfoList response = new ProgramInfoList();

	 	// 番組参照検索
		List<ProgramMasterDto> dtoList = mProgramMapper.selectEx(programId, programName);
	
	     // Model変換
		List<MProgram> modelList = helper.toModel(dtoList);

	     // responseへ設定
	 	response.setmProgram(modelList);
	
		// responseの返却
	 	return response;
	}
}