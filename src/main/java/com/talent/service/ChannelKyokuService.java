package com.talent.service;

import java.util.ArrayList;
import java.util.Arrays; // Arraysをインポート
import java.util.List;
import java.util.stream.Collectors; // Collectorsをインポート

import org.springframework.stereotype.Service;

import com.model.ChannelKyoku;
import com.talent.infrastructure.dto.ChannelKyokuMasterDto;
import com.talent.infrastructure.model.generated.MChannelKyoku;
import com.talent.infrastructure.repository.mapper.generated.MChannelKyokuMapper;
import com.talent.service.helper.MChannelKyokuHelper;

import lombok.RequiredArgsConstructor;

/**
 * チャンネル局マスタ検索Service
 */
@Service
@RequiredArgsConstructor
public class ChannelKyokuService {

	// mapperの宣言
	private final MChannelKyokuMapper mChanelKyokuMapper;

	// helperの宣言
	private final MChannelKyokuHelper helper;

	/**
	 * チャンネル局マスタ検索Service
	 * 
	 * @param channelIds チャンネルID 【複数】 (カンマ区切りの文字列)
	 * @return ChannelKyoku
	 */
	public ChannelKyoku getChannelKyoku(String channelIds) {

		// ChanelKyokuをResponseに設定
		ChannelKyoku response = new ChannelKyoku();

		// channelIdsをカンマ区切りでString配列へ設定し、Integerのリストに変換
		List<Integer> channelIdList = new ArrayList<>(); // List<String> ではなく List<Integer> を作成

		// 入力値がnullまたは空文字列でないことを確認
		if (channelIds != null && !channelIds.trim().isEmpty()) {
			// Java 8 の Stream API を使うと簡潔に書けます
			channelIdList = Arrays.stream(channelIds.split(",")) // カンマで分割してStreamを生成
					.map(String::trim) // 各要素の前後空白を削除
					.filter(s -> !s.isEmpty()) // 空文字列を除外 (例: ",101,,102"のような場合に備える)
					.map(s -> {
						try {
							return Integer.parseInt(s); // 文字列をIntegerに変換
						} catch (NumberFormatException e) {
							// 数値に変換できない文字列が含まれていた場合のエラーハンドリング
							// 例: ログ出力を行う、特定の値を返す、例外をスローするなど
							System.err.println(
									"Warning: Invalid channel ID format found: '" + s + "' - This ID will be skipped.");
							return null; // 不正な値はnullとして一時的に扱う
						}
					})
					.filter(java.util.Objects::nonNull) // nullを除外（数値変換に失敗したもの）
					.collect(Collectors.toList()); // 結果をList<Integer>として収集
		}

		// 区分マスタ検索
		// ここで List<Integer> が渡されるため、MyBatisは正しく処理します
		List<ChannelKyokuMasterDto> chanelKyokuList = mChanelKyokuMapper.select(channelIdList);

		List<MChannelKyoku> genreList = helper.toModel(chanelKyokuList);

		response.setmChannelKyoku(genreList);

		// responseの返却
		return response;
	}
}