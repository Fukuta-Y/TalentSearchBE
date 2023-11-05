package com.talent.infrastructure.repository.mapper.generated;
import org.apache.ibatis.annotations.Mapper;

import com.model.MNentsukiShuKanri;
import com.talent.service.dto.NentsukiShuKanriMasterDto;

@Mapper
public interface MNentsukiShuKanriMapper {

	NentsukiShuKanriMasterDto select(Integer nentsuki, Integer shu);

	int insert(MNentsukiShuKanri mNentsukiShuKanri);

	int update(MNentsukiShuKanri mNentsukiShuKanri);
}