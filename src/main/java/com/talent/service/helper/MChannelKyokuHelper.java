package com.talent.service.helper;

import java.util.List;

import org.mapstruct.Mapper;

import com.talent.infrastructure.dto.ChannelKyokuMasterDto;
import com.talent.infrastructure.model.generated.MChannelKyoku;
import com.talent.setting.ConfigMapper;

@Mapper(config = ConfigMapper.class)
public interface MChannelKyokuHelper {
    List<MChannelKyoku> toModel(List<ChannelKyokuMasterDto>model);
 }