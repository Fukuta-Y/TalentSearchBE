package com.talent.infrastructure.repository.mapper.generated;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.talent.infrastructure.dto.OnAirKanriTableDto;

@Mapper
public interface TOnAirKanriMapper {
	List<OnAirKanriTableDto> select(Integer nentsuki, Integer shu, List<String> talentIdList);
}