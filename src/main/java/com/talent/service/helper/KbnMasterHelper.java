package com.talent.service.helper;

import java.util.List;

import org.mapstruct.Mapper;

import com.model.KbnMaster;
import com.talent.infrastructure.dto.KbnGenreMasterDto;
import com.talent.setting.ConfigMapper;

@Mapper(config = ConfigMapper.class)
public interface KbnMasterHelper {
	List<KbnMaster> toModel(List<KbnGenreMasterDto> model);
 }