package com.talent.service.helper;

import java.util.List;

import org.mapstruct.Mapper;

import org.mapstruct.Mapping; // ★追加
import com.model.MNentsukiShuKanri;
import com.talent.service.dto.NentsukiShuKanriMasterDto;
import com.talent.setting.ConfigMapper;

@Mapper(config = ConfigMapper.class)
public interface MNentsukiShuKanriHelper {
	// NentsukiShuKanriMasterDtoのLocalDateフィールドを
	// MNentsukiShuKanriのStringフィールドに変換する際に、
	// 指定したdateFormat（例: "yyyy-MM-dd"）で文字列化される
	@Mapping(target = "torokuDay", source = "torokuDay", dateFormat = "yyyy-MM-dd")
	@Mapping(target = "koushinDay", source = "koushinDay", dateFormat = "yyyy-MM-dd")
	MNentsukiShuKanri toModel(NentsukiShuKanriMasterDto dto);
	
	List<MNentsukiShuKanri> toListModel(List<NentsukiShuKanriMasterDto> model);
 }