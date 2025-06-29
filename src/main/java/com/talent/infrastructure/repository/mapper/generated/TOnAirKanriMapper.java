package com.talent.infrastructure.repository.mapper.generated;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.model.TOnAirKanri;
import com.talent.infrastructure.dto.MaxNoDto;
import com.talent.infrastructure.dto.OnAirKanriRefDto;
import com.talent.infrastructure.dto.OnAirKanriTableDto;

@Mapper
public interface TOnAirKanriMapper {

	List<OnAirKanriTableDto> select(Integer nentsuki, Integer shu, List<Integer> talentIdList);

	List<OnAirKanriRefDto> selectEx(String id, String onAirDay);

	MaxNoDto selectMaxNo();

	int insert(TOnAirKanri tOnAirKanri);

	int update(TOnAirKanri tOnAirKanri);

}