package com.talent.infrastructure.repository.mapper.generated;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.talent.infrastructure.dto.ChannelKyokuMasterDto;

@Mapper
public interface MChannelKyokuMapper {
	List<ChannelKyokuMasterDto> select(List<String> genreIdList);
}