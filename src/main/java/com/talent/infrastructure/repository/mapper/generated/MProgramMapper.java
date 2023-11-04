package com.talent.infrastructure.repository.mapper.generated;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.model.MProgram;
import com.talent.infrastructure.dto.ProgramMasterDto;

@Mapper
public interface MProgramMapper {
	List<ProgramMasterDto> select(List<String> programIdList);
	
	ProgramMasterDto insert(MProgram  mProgram);
	
	ProgramMasterDto update(MProgram  mProgram);
}