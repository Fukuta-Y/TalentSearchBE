package com.talent.service.helper;

import java.util.List;

import org.mapstruct.Mapper;

import com.model.MProgram;
import com.talent.infrastructure.dto.ProgramMasterDto;
import com.talent.setting.ConfigMapper;

@Mapper(config = ConfigMapper.class)
public interface MprogramHelper {
	List<MProgram> toModel(List<ProgramMasterDto> model);
 }