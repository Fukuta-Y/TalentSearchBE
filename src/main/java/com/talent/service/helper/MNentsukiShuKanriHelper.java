package com.talent.service.helper;

import java.util.List;

import org.mapstruct.Mapper;

import com.model.MNentsukiShuKanri;
import com.talent.service.dto.NentsukiShuKanriMasterDto;
import com.talent.setting.ConfigMapper;

@Mapper(config = ConfigMapper.class)
public interface MNentsukiShuKanriHelper {
	MNentsukiShuKanri toModel(NentsukiShuKanriMasterDto model);
	
	List<MNentsukiShuKanri> toListModel(List<NentsukiShuKanriMasterDto> model);
 }