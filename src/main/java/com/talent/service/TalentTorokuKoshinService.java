package com.talent.service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.model.MTalent;
import com.model.TalentTorokuKoshin;
import com.talent.infrastructure.dto.MaxNoDto;
import com.talent.infrastructure.repository.mapper.generated.MTalentMapper;

import lombok.RequiredArgsConstructor;

/**
 * タレント登録・更新Service
 */
@Service
@RequiredArgsConstructor
public class TalentTorokuKoshinService {

	// mapperの宣言
	private final MTalentMapper mTalentMapper;

	  /**
	  * タレント登録・更新Service
	  * @param MTalent　更新用のテーブル構造（タレントマスタDTO)
	  * @return ProgramTorokuKoshin
	  */
	public TalentTorokuKoshin postTalentTorokuKoshin(MTalent mTalent) {

		// パラメータを取得する
		MTalent paramValue = mTalent; // パラメータ設定
		int count = 0; // 登録・更新件数
		
		// タレントIDが「00000000」の場合は、Repository「タレント登録」を呼び出す。
		// タレントIDが「00000000」以外の場合は、Repository「タレント更新」を呼び出す。
		if (StringUtils.equals(mTalent.getTalentId(), "00000000")) {
			// ※事前に最大タレントID（「SELECT MAX(タレントID) FROM タレントマスタ」）を取得して、
			// 数値に変換して、「+1」を行い、0字埋めの8桁にして、タレントIDとして設定する。
			MaxNoDto programId = mTalentMapper.selectMaxNo();
			Integer intMaxNo = Integer.parseInt(programId.getMaxId()) + 1;
			String maxNo = String.format("%08d", intMaxNo);
			// IDを差し替える
			paramValue.setTalentId(maxNo); // プログラムIDを設定
			// 現在時刻を取得
			Timestamp timestamp = new Timestamp(System.currentTimeMillis());
			paramValue.setTorokuDay(timestamp.toString()); // 登録日
			paramValue.setKoushinDay(timestamp.toString());// 更新日
			// テーブル「タレントマスタ」に対して、タレントマスタDTOを用いて、新規登録処理を行う。
	        count = mTalentMapper.insert(paramValue);
		} else {
			// 現在時刻を取得
			Timestamp timestamp = new Timestamp(System.currentTimeMillis());
			paramValue.setTorokuDay(mTalent.getTorokuDay()); // 登録日
			paramValue.setKoushinDay(timestamp.toString());// 更新日
			// テーブル「タレントマスタ」に対して、タレントマスタDTOを用いて、更新処理を行う。
			count = mTalentMapper.update(paramValue);
		}
        // responseを設定
		TalentTorokuKoshin response = new TalentTorokuKoshin();

        // 登録/更新が成功した場合
        if (count > 0) {
    		List<MTalent> MTalentList = new ArrayList<MTalent>();
    		MTalentList.add(paramValue);
    		response.setmTalent(MTalentList);
          	System.err.println("登録/更新成功");
        } else {
          	System.err.println("登録/更新失敗");
          	System.err.println("パラメータ:" + paramValue);
        }
		// responseの返却
	 	return response;
	}
}