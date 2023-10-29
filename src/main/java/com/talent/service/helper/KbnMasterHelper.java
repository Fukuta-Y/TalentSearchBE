package com.talent.service.helper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.model.KbnMaster;
import com.talent.infrastructure.dto.KbnGenreMasterDto;
import com.talent.setting.ConfigMapper;

@Mapper(config = ConfigMapper.class)
public interface KbnMasterHelper {
    @Mapping(source = "genreId", target = "items.genreId")
    @Mapping(source = "jyunjyo", target = "items.jyunjyo")
    @Mapping(source = "genre", target = "items.genre")
    @Mapping(source = "deleteFlg", target = "items.deleteFlg")
    @Mapping(source = "torokuDay", target = "items.torokuDay")
    @Mapping(source = "koushinDay", target = "items.koushinDay")
    KbnMaster toModel(KbnGenreMasterDto model);
 }