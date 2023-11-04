package com.talent.service.helper;

import java.util.List;

import org.mapstruct.Mapper;

import com.model.MTalent;
import com.talent.infrastructure.dto.TalentMasterDto;
import com.talent.setting.ConfigMapper;

@Mapper(config = ConfigMapper.class)
public interface MTalentHelper {
	List<MTalent> toModel(List<TalentMasterDto> model);
 }