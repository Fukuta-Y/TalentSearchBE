package com.talent.repository.mapper.generated;

import org.apache.ibatis.annotations.Mapper;

import com.talent.service.dto.NentsukiShuKanriMasterDto;

@Mapper
public interface MNentsukiShuKanriMapper {
	NentsukiShuKanriMasterDto select(Integer targetNentsuki, Integer targetShu);
}