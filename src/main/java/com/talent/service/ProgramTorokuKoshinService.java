package com.talent.service;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.model.MProgram;
import com.model.ProgramTorokuKoshin;
import com.talent.infrastructure.dto.ProgramMasterDto;
import com.talent.infrastructure.repository.mapper.generated.MProgramMapper;

import lombok.RequiredArgsConstructor;

/**
 * 番組登録・更新Service
 */
@Service
@RequiredArgsConstructor
public class ProgramTorokuKoshinService {

	// mapperの宣言
	private final MProgramMapper mProgramMapper;
//	// helperの宣言
//	private final KbnMasterHelper helper;

	  /**
	  * 番組登録・更新Service
	  * @param mProgram　更新用のテーブル構造（番組マスタDTO)
	  * @return ProgramTorokuKoshin
	  */
	public ProgramTorokuKoshin post(MProgram  mProgram) {
	
//	 	// List<KbnMaster>をResponseに設定
//		KbnMasterList response = new KbnMasterList();
//	 	
//		// genreIdsをカンマ区切りで配列へ設定
//		List<Integer> genreIdList = new ArrayList<Integer>();
//		String idList[] = genreIds.split(",");
//        // ジャンルIDの一覧のリスト
//        for (String list : idList) {
//        	genreIdList.add(Integer.parseInt(list));
//        }
//
		ProgramMasterDto dto;
		if (StringUtils.equals(mProgram.getProgramId(), "00000000")) {
		 	// 区分マスタ検索
	        dto = mProgramMapper.insert(mProgram);
		} else {
	        dto = mProgramMapper.update(mProgram);
		}
		
        
		ProgramTorokuKoshin response = new ProgramTorokuKoshin();
		
		// responseの返却
	 	return response;
	}
}