package com.talent.service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.model.MProgram;
import com.model.ProgramTorokuKoshin;
import com.talent.infrastructure.dto.MaxNoDto;
import com.talent.infrastructure.dto.ProgramMasterDto;
import com.talent.infrastructure.repository.mapper.generated.MProgramMapper;
import com.talent.service.helper.MprogramHelper;

import lombok.RequiredArgsConstructor;

/**
 * 番組登録・更新Service
 */
@Service
@RequiredArgsConstructor
public class ProgramTorokuKoshinService {

	// mapperの宣言
	private final MProgramMapper mProgramMapper;
	// helperの宣言
	private final MprogramHelper helper;

	  /**
	  * 番組登録・更新Service
	  * @param mProgram　更新用のテーブル構造（番組マスタDTO)
	  * @return ProgramTorokuKoshin
	  */
	public ProgramTorokuKoshin post(MProgram  mProgram) {
		ProgramMasterDto dto;
        // responseを設定
		ProgramTorokuKoshin response = new ProgramTorokuKoshin();
		if (StringUtils.equals(mProgram.getProgramId(), "00000000")) {
			// ※事前に最大番組ID（「SELECT MAX(番組ID) FROM 番組マスタ」）を取得して、
			// 数値に変換して、「+1」を行い、0字埋めの8桁にして、番組IDとして設定する。
		 	// 番組マスタ検索
			MaxNoDto programId = mProgramMapper.selectMaxNo();
			Integer intMaxNo = Integer.parseInt(programId.getProgramId()) + 1;
			String maxNo = String.format("%08d", intMaxNo);
			
			// IDを差し替える
			MProgram paramValue = new MProgram();
			paramValue = mProgram; // パラメータ設定
			paramValue.setProgramId(maxNo);

			Timestamp timestamp = new Timestamp(System.currentTimeMillis());
			paramValue.setTorokuDay(timestamp.toString()); // 登録日
			paramValue.setKoushinDay(timestamp.toString());// 更新日

			// 上記後に、番組IDと番組マスタDTOを用いて、テーブル「番組マスタ」に新規登録を行う。
	        int count = mProgramMapper.insert(paramValue);
	        // 登録が成功した場合
	        if (count> 0) {
	    		List<MProgram> MProgramList = new ArrayList<MProgram>();
	    		MProgramList.add(paramValue);
	    		response.setmProgram(MProgramList);
	        } else {
	          	System.err.print("失敗:");
	        }
		} else {
			
	        dto = mProgramMapper.update(mProgram);
		}
		// responseの返却
	 	return response;
	}
}