package com.talent.infrastructure.repository.mapper.generated;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.model.MProgram;
import com.talent.infrastructure.dto.MaxNoDto;
import com.talent.infrastructure.dto.ProgramMasterDto;

@Mapper
public interface MProgramMapper {
	List<ProgramMasterDto> select(List<String> programIdList);
	
	MaxNoDto selectMaxNo();
	
	List<ProgramMasterDto> selectEx(String programId, String programName);
	
	int insert(MProgram mProgram);
	
	int update(MProgram mProgram);
}