package com.talent.service.helper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.model.MNentsukiShuKanri;
import com.talent.service.dto.NentsukiShuKanriMasterDto;
import com.talent.setting.ConfigMapper;

@Mapper(config = ConfigMapper.class)
public interface MNentsukiShuKanriHelper {
    @Mapping(source = "model.nentsuki", target = "items.nentsuki")
    @Mapping(source = "model.shu", target = "items.shu")
    @Mapping(source = "model.shuFrom", target = "items.shuFrom")
    @Mapping(source = "model.shuTo", target = "items.shuTo")
    @Mapping(source = "model.torokuDay", target = "items.torokuDay")
    @Mapping(source = "model.koushinDay", target = "items.koushinDay")
	MNentsukiShuKanri toModel(NentsukiShuKanriMasterDto model);
 }