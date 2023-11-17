package com.talent.controller.helper;

import java.util.List;

import org.mapstruct.Mapper;

import com.model.MChannelKyoku;
import com.model.MKbnGenre;
import com.model.MProgram;
import com.model.MTalent;
import com.model.TOnAirKanri;
import com.talent.infrastructure.dto.ChannelKyokuMasterDto;
import com.talent.infrastructure.dto.KbnGenreMasterDto;
import com.talent.infrastructure.dto.OnAirKanriTableDto;
import com.talent.infrastructure.dto.ProgramMasterDto;
import com.talent.infrastructure.dto.TalentMasterDto;
import com.talent.setting.ConfigMapper;

@Mapper(config = ConfigMapper.class)
public interface TalentShukanShutsuenJohoHelper {
	
	List<TOnAirKanri> toOnAirKanriTableModel(List<OnAirKanriTableDto> model);

	List<MProgram> toProgramModel(List<ProgramMasterDto> model);

	List<MTalent> toTalentModel(List<TalentMasterDto> model);

	List<MChannelKyoku> toChannelKyokuModel(List<ChannelKyokuMasterDto> model);

	List<MKbnGenre> toKbnGenreModel(List<KbnGenreMasterDto> model);
 }