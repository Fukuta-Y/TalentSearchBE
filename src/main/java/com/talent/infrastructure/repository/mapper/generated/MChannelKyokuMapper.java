package com.talent.infrastructure.repository.mapper.generated;

import java.util.List; // java.util.List はそのまま

import org.apache.ibatis.annotations.Mapper;

import com.talent.infrastructure.dto.ChannelKyokuMasterDto;

@Mapper
public interface MChannelKyokuMapper {
	// 引数の型を List<String> から List<Integer> に変更します
	List<ChannelKyokuMasterDto> select(List<Integer> channelIdList);
}