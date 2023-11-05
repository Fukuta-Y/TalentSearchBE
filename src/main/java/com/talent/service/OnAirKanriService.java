package com.talent.service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.model.OnAirKanriList;
import com.model.TOnAirKanri;
import com.talent.infrastructure.dto.MaxNoDto;
import com.talent.infrastructure.dto.OnAirKanriTableDto;
import com.talent.infrastructure.repository.mapper.generated.TOnAirKanriMapper;
import com.talent.service.helper.TOnAirKanriHelper;

import lombok.RequiredArgsConstructor;

/**
 * オンエア管理情報Service
 */
@Service
@RequiredArgsConstructor
public class OnAirKanriService {

	// mapperの宣言
	private final TOnAirKanriMapper tOnAirKanriMapper;

	// helperの宣言
	private final TOnAirKanriHelper helper;
	
	/**
	  * オンエア管理情報Service
	  * @param id　ID
	  * @return OnAirKanriList
	 */
	public OnAirKanriList getOnAirKanriList(String id) {
		
	 	// OnAirKanriListをResponseに設定
		OnAirKanriList response = new OnAirKanriList();

		List<OnAirKanriTableDto> dto = tOnAirKanriMapper.selectId(id);
		
		// (1) パラメータのIDをキーとして、BE「オンエア管理テーブル検索」へ検索して、
		// 取得したオンエア管理テーブルDTOをレスポンスへ設定する。
		List<TOnAirKanri> list = helper.toModel(dto);
		response.settOnAirKanri(list);

		// responseの返却
	 	return response;
	}
	
	/**
	  * オンエア管理登録・更新Service
	  * @param tOnAirKanri オンエア管理テーブルDTO
	  * @return OnAirKanriList
	 */
	public OnAirKanriList postOnAirKanriList(TOnAirKanri tOnAirKanri) {

		// パラメータを取得する
		TOnAirKanri paramValue = tOnAirKanri; // パラメータ設定
		int count = 0; // 登録・更新件数

		// IDが「00000000」の場合は、Repository「オンエア管理登録」を呼び出す。
		// IDが「00000000」以外の場合は、Repository「オンエア管理更新」を呼び出す。
		if (StringUtils.equals(tOnAirKanri.getId(), "00000000")) {
			// ※事前に最大ID（「SELECT MAX(ID) FROM オンエア管理マスタ」）を取得して、
			// 数値に変換して、「+1」を行い、0字埋めの8桁にして、IDとして設定する。
			MaxNoDto id = tOnAirKanriMapper.selectMaxNo();
			Integer intMaxNo = Integer.parseInt(id.getMaxId()) + 1;
			String maxNo = String.format("%08d", intMaxNo);
			// IDを差し替える
			paramValue.setId(maxNo); // IDを設定
			// 現在時刻を取得
			Timestamp timestamp = new Timestamp(System.currentTimeMillis());
			paramValue.setTorokuDay(timestamp.toString()); // 登録日
			paramValue.setKoushinDay(timestamp.toString());// 更新日
			// テーブル「オンエア管理マスタ」に対して、オンエア管理マスタDTOを用いて、新規登録処理を行う。
	        count = tOnAirKanriMapper.insert(paramValue);
		} else {
			// 現在時刻を取得
			Timestamp timestamp = new Timestamp(System.currentTimeMillis());
			paramValue.setKoushinDay(timestamp.toString());// 更新日
			// テーブル「オンエア管理マスタ」に対して、オンエア管理マスタDTOを用いて、更新処理を行う。
			count = tOnAirKanriMapper.update(paramValue);
		}
        // responseを設定
		OnAirKanriList response = new OnAirKanriList();

        // 登録/更新が成功した場合
        if (count > 0) {
    		List<TOnAirKanri> TOnAirKanriList = new ArrayList<TOnAirKanri>();
    		TOnAirKanriList.add(paramValue);
    		response.settOnAirKanri(TOnAirKanriList);
          	System.err.println("登録/更新成功");
        } else {
          	System.err.println("登録/更新失敗");
          	System.err.println("パラメータ:" + paramValue);
        }
		// responseの返却
	 	return response;
	}
}