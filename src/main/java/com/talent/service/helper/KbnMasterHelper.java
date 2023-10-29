package com.talent.service.helper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.model.KbnMaster;
import com.talent.infrastructure.dto.KbnGenreMasterDto;
import com.talent.setting.ConfigMapper;

@Mapper(config = ConfigMapper.class)
public interface KbnMasterHelper {
    @Mapping(source = "genreId", target = "mKbnGenre.genreId")
    @Mapping(source = "jyunjyo", target = "mKbnGenre.jyunjyo")
    @Mapping(source = "genre", target = "mKbnGenre.genre")
    @Mapping(source = "deleteFlg", target = "mKbnGenre.deleteFlg")
    @Mapping(source = "torokuDay", target = "mKbnGenre.torokuDay")
    @Mapping(source = "koushinDay", target = "mKbnGenre.koushinDay")
	List<KbnMaster> toModel(List<KbnGenreMasterDto> model);
 }