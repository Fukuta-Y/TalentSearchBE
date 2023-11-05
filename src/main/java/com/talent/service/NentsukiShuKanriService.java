package com.talent.service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.stereotype.Service;

import com.model.MNentsukiShuKanri;
import com.model.NentsukiShuKanri;
import com.talent.infrastructure.repository.mapper.generated.MNentsukiShuKanriMapper;
import com.talent.service.dto.NentsukiShuKanriMasterDto;
import com.talent.service.helper.MNentsukiShuKanriHelper;

import lombok.RequiredArgsConstructor;

/**
 * 年月週管理登録・更新Service
 */
@Service
@RequiredArgsConstructor
public class NentsukiShuKanriService {

	// mapperの宣言
	private final MNentsukiShuKanriMapper mNentsukiShuKanriMapper;
	
	// helperの宣言
	private final MNentsukiShuKanriHelper mNentsukiShuKanriHelper;
	
	  /**
	  * 年月週管理登録・更新
	  * @param NentsukiShuKanri　更新用のテーブル構造（年月週管理マスタDTO)
	  * @return NentsukiShuKanri
	  */
	public NentsukiShuKanri post(MNentsukiShuKanri mNentsukiShuKanri) {

		// responseを宣言
		NentsukiShuKanri response = new NentsukiShuKanri();

		// 年月週管理検索を実施
		NentsukiShuKanriMasterDto dto = mNentsukiShuKanriMapper.select(mNentsukiShuKanri.getNentsuki(), mNentsukiShuKanri.getShu());
		//　パラメータを取得する
		MNentsukiShuKanri paramValue = mNentsukiShuKanri; // パラメータ設定
		
		int count = 0; // 登録・更新件数
		// 年月週管理検索が存在する場合
		if (Objects.isNull(dto)) {
			// 現在時刻を取得
			Timestamp timestamp = new Timestamp(System.currentTimeMillis());
			paramValue.setTorokuDay(timestamp.toString()); // 登録日
			paramValue.setKoushinDay(timestamp.toString());// 更新日
			// テーブル「年月週管理マスタ」に対して、年月週管理マスタDTOを用いて、登録処理を行う。
	        count = mNentsukiShuKanriMapper.insert(paramValue);
		} else {
			// 現在時刻を取得
			Timestamp timestamp = new Timestamp(System.currentTimeMillis());
			paramValue.setKoushinDay(timestamp.toString());// 更新日
			// テーブル「年月週管理マスタ」に対して、年月週管理マスタDTOを用いて、更新処理を行う。
	        count = mNentsukiShuKanriMapper.update(paramValue);
		}
		
        // 登録/更新が成功した場合
        if (count > 0) {
        	List<MNentsukiShuKanri> MNentsukiShuKanriList = new ArrayList<MNentsukiShuKanri>();
        	MNentsukiShuKanriList.add(paramValue);
    		response.setmNentsukiShuKanri(MNentsukiShuKanriList);
          	System.err.println("登録/更新成功");
        } else {
          	System.err.println("登録/更新失敗");
          	System.err.println("パラメータ:" + paramValue);
        }
		// responseの返却
	 	return response;
	}
	
	  /**
	  * 年月週管理マスタ検索
	  * @param　無
	  * @return NentsukiShuKanri
	  */
	public NentsukiShuKanri get() {
		// responseを宣言
		NentsukiShuKanri response = new NentsukiShuKanri();
		// 年月週管理マスタを全件取得
		List<NentsukiShuKanriMasterDto> dto = mNentsukiShuKanriMapper.selectAll();
		List<MNentsukiShuKanri> list = mNentsukiShuKanriHelper.toListModel(dto);
		response.setmNentsukiShuKanri(list);
		// responseの返却
	 	return response;
	}	
}