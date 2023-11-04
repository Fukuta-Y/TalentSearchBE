package com.talent.service.helper;

import org.mapstruct.Mapper;

import com.model.MTalent;
import com.talent.infrastructure.dto.TalentMasterDto;
import com.talent.setting.ConfigMapper;

@Mapper(config = ConfigMapper.class)
public interface MTalentHelper {
	MTalent toModel(TalentMasterDto model);
 }