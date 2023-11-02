package com.talent.service.helper;

import java.util.List;

import org.mapstruct.Mapper;

import com.talent.infrastructure.dto.ChanelKyokuMasterDto;
import com.talent.infrastructure.model.generated.MChanelKyoku;
import com.talent.setting.ConfigMapper;

@Mapper(config = ConfigMapper.class)
public interface MChanelKyokuHelper {
    List<MChanelKyoku> toModel(List<ChanelKyokuMasterDto>model);
 }