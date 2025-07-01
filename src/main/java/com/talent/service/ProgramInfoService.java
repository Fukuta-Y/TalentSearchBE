package com.talent.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.model.MProgram;
import com.model.ProgramInfoList;
import com.talent.infrastructure.dto.ProgramMasterDto;
import com.talent.infrastructure.repository.mapper.generated.MProgramMapper;
import com.talent.service.helper.MProgramHelper;

import lombok.RequiredArgsConstructor;

/**
 * 番組マスタ検索Service
 */
@Service
@RequiredArgsConstructor
public class ProgramInfoService {
	// mapperの宣言
	private final MProgramMapper mProgramMapper;
	// helperの宣言
	private final MProgramHelper helper;

	  /**
	  * 番組マスタ検索Service
	  * @param programId 番組ID
	  * @return ProgramInfo
	  */
	public ProgramInfoList getProgramInfoList(String  programId) {

	 	// ProgramInfoListをResponseに設定
		ProgramInfoList response = new ProgramInfoList();

        // 番組IDのリストを設定
        List<String> programIdList = new ArrayList<String>();
        // 引数の内容を設定
        programIdList.add(programId);

	 	// 番組マスタ検索
		List<ProgramMasterDto> programList = mProgramMapper.select(programIdList);

	     // Model変換（キー検索で1行目のみ使用する）
		MProgram program = helper.toModel(programList.get(0));

	     // Responseへ設定
		List<MProgram> pgrmList = new ArrayList<MProgram>();
		pgrmList.add(program);
	 	response.setmProgram(pgrmList);

		// responseの返却
	 	return response;
	}
}