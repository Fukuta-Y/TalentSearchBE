package com.talent.infrastructure.repository.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.model.ProgramShutsuen;

@Mapper
public interface ProgramShutsuenMapper {
	List<ProgramShutsuen> select(String  programId, String onAirDay);
}