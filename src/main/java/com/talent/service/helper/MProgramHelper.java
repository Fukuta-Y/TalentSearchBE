package com.talent.service.helper;

import org.mapstruct.Mapper;

import com.model.MProgram;
import com.talent.infrastructure.dto.ProgramMasterDto;
import com.talent.setting.ConfigMapper;

@Mapper(config = ConfigMapper.class)
public interface MProgramHelper {
	MProgram toModel(ProgramMasterDto model);
 }