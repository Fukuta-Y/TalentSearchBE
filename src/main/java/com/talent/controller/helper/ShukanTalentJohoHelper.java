package com.talent.controller.helper;

import java.util.List;

import org.mapstruct.Mapper;

import com.model.MProgram;
import com.model.MTalent;
import com.model.TOnAirKanri;
import com.talent.infrastructure.dto.OnAirKanriTableDto;
import com.talent.infrastructure.dto.ProgramMasterDto;
import com.talent.infrastructure.dto.TalentMasterDto;
import com.talent.setting.ConfigMapper;

@Mapper(config = ConfigMapper.class)
public interface ShukanTalentJohoHelper {

	List<TOnAirKanri> toOnAirKanriTableModel(List<OnAirKanriTableDto> model);

	List<MProgram> toProgramModel(List<ProgramMasterDto> model);

	List<MTalent> toTalentModel(List<TalentMasterDto> model);
 }