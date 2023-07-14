package com.talent.infrastructure.repository.mapper.generated;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.talent.infrastructure.dto.KbnGenreMasterDto;

@Mapper
public interface MKbnGenreMapper {
	List<KbnGenreMasterDto> select(String genreIdList);
}