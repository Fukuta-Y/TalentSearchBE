package com.talent.infrastructure.repository.mapper.generated;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.model.MTalent;
import com.talent.infrastructure.dto.MaxNoDto;
import com.talent.infrastructure.dto.TalentMasterDto;

@Mapper
public interface MTalentMapper {

    List<TalentMasterDto> select(String talentName);

    List<TalentMasterDto> selectEx(String talentId);

	MaxNoDto selectMaxNo();

	int insert(MTalent mProgram);

	int update(MTalent mProgram);
}