package com.talent.infrastructure.repository.mapper.generated;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.talent.infrastructure.dto.ChanelKyokuMasterDto;

@Mapper
public interface MChanelKyokuMapper {
	List<ChanelKyokuMasterDto> select(List<String> chanelIdList);
}