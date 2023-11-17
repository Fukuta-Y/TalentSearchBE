package com.talent.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.api.ChannelKyokuApi;
import com.model.ChannelKyoku;
import com.talent.service.ChannelKyokuService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class ChannelKyokuController implements ChannelKyokuApi{

	// ChannelKyokuServiceを宣言
	private final ChannelKyokuService service;

	/**
	* チャンネル局マスタ検索Controller
	*
	* @param channelIds チャンネルID【複数】
	* @return ChannelKyoku
	*/
	@Override
	public ResponseEntity<ChannelKyoku> getChannelKyoku(String channelIds) {
		// ChannelKyokuServiceより取得
		ChannelKyoku response = service.getChannelKyoku(channelIds);
		return ResponseEntity.ok(response);
	}
}