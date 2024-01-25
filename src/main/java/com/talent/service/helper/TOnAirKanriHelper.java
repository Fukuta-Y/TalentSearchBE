package com.talent.service.helper;

import java.util.List;

import org.mapstruct.Mapper;

import com.model.TOnAirKanri;
import com.model.TOnAirKanriRef;
import com.talent.infrastructure.dto.OnAirKanriRefDto;
import com.talent.infrastructure.dto.OnAirKanriTableDto;
import com.talent.setting.ConfigMapper;

@Mapper(config = ConfigMapper.class)
public interface TOnAirKanriHelper {
	List<TOnAirKanri> toModel(List<OnAirKanriTableDto> dtoList);
	List<TOnAirKanriRef> toRefModel(List<OnAirKanriRefDto> dtoList);
 }