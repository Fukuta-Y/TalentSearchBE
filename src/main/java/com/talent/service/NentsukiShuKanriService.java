package com.talent.service;

import org.springframework.stereotype.Service;

import com.model.MNentsukiShuKanri;
import com.model.NentsukiShuKanri;
import com.talent.infrastructure.repository.mapper.generated.MNentsukiShuKanriMapper;
import com.talent.service.dto.NentsukiShuKanriMasterDto;

import lombok.RequiredArgsConstructor;

/**
 * 年月週管理登録・更新Service
 */
@Service
@RequiredArgsConstructor
public class NentsukiShuKanriService {

	// mapperの宣言
	private final MNentsukiShuKanriMapper mNentsukiShuKanriMapper;

	  /**
	  * 年月週管理登録・更新
	  * @param NentsukiShuKanri　更新用のテーブル構造（年月週管理マスタDTO)
	  * @return NentsukiShuKanri
	  */
	public NentsukiShuKanri post(MNentsukiShuKanri mNentsukiShuKanri) {

		// responseを宣言
		NentsukiShuKanri response = new NentsukiShuKanri();
		
		NentsukiShuKanriMasterDto dto = mNentsukiShuKanriMapper.select(mNentsukiShuKanri.getNentsuki(), mNentsukiShuKanri.getShu());
		
		System.err.print("dto:" + dto);
		
//		// IDを差し替える
//		MProgram paramValue = mProgram; // パラメータ設定
//
//		// 現在時刻を取得
//		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
//		paramValue.setTorokuDay(timestamp.toString()); // 登録日
//		paramValue.setKoushinDay(timestamp.toString());// 更新日
//		
//		int count = 0; // 登録・更新件数
//		
//		// 番組IDが「00000000」の場合は、Repository「番組登録」を呼び出す。
//		// 番組IDが「00000000」以外の場合は、Repository「番組更新」を呼び出す。
//		if (StringUtils.equals(mProgram.getProgramId(), "00000000")) {
//			// ※事前に最大番組ID（「SELECT MAX(番組ID) FROM 番組マスタ」）を取得して、
//			// 数値に変換して、「+1」を行い、0字埋めの8桁にして、番組IDとして設定する。
//			MaxNoDto programId = mProgramMapper.selectMaxNo();
//			Integer intMaxNo = Integer.parseInt(programId.getMaxId()) + 1;
//			String maxNo = String.format("%08d", intMaxNo);
//			// IDを差し替える
//			paramValue.setProgramId(maxNo); // プログラムIDを設定
//			// テーブル「番組マスタ」に対して、番組マスタDTOを用いて、新規登録処理を行う。
//	        count = mProgramMapper.insert(paramValue);
//		} else {
//			paramValue.setTorokuDay(mProgram.getTorokuDay()); // 登録日
//			paramValue.setKoushinDay(timestamp.toString());// 更新日
//			// テーブル「番組マスタ」に対して、番組マスタDTOを用いて、更新処理を行う。
//			count = mProgramMapper.update(paramValue);
//		}
//        // responseを設定
//		ProgramTorokuKoshin response = new ProgramTorokuKoshin();
//
//        // 登録/更新が成功した場合
//        if (count> 0) {
//    		List<MProgram> MProgramList = new ArrayList<MProgram>();
//    		MProgramList.add(paramValue);
//    		response.setmProgram(MProgramList);
//          	System.err.println("登録/更新成功");
//        } else {
//          	System.err.println("登録/更新失敗");
//        }
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
		
		// responseの返却
	 	return response;
	}	
}