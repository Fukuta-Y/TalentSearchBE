package com.talent.infrastructure.repository.mapper.generated;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.model.MNentsukiShuKanri;
import com.talent.service.dto.NentsukiShuKanriMasterDto;

@Mapper
public interface MNentsukiShuKanriMapper {

	NentsukiShuKanriMasterDto select(Integer nentsuki, Integer shu);
	
	List<NentsukiShuKanriMasterDto> selectAll();

	int insert(MNentsukiShuKanri mNentsukiShuKanri);

	int update(MNentsukiShuKanri mNentsukiShuKanri);
}