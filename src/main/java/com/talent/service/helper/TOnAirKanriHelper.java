package com.talent.service.helper;

import java.util.List;

import org.mapstruct.Mapper;

import com.model.TOnAirKanri;
import com.talent.infrastructure.dto.OnAirKanriTableDto;
import com.talent.setting.ConfigMapper;

@Mapper(config = ConfigMapper.class)
public interface TOnAirKanriHelper {
	List<TOnAirKanri> toModel(List<OnAirKanriTableDto> model);
 }