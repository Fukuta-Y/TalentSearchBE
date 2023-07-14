package com.talent.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.model.TalentShukanShutsuenJoho;
import com.talent.infrastructure.dto.ChanelKyokuMasterDto;
import com.talent.infrastructure.dto.KbnGenreMasterDto;
import com.talent.infrastructure.dto.OnAirKanriTableDto;
import com.talent.infrastructure.dto.ProgramMasterDto;
import com.talent.infrastructure.dto.TalentMasterDto;
import com.talent.infrastructure.repository.mapper.generated.MChanelKyokuMapper;
import com.talent.infrastructure.repository.mapper.generated.MKbnGenreMapper;
import com.talent.infrastructure.repository.mapper.generated.MProgramMapper;
import com.talent.infrastructure.repository.mapper.generated.MTalentMapper;
import com.talent.infrastructure.repository.mapper.generated.TOnairKanriMapper;

import lombok.RequiredArgsConstructor;

/**
 * タレント週間出演情報検索 Service
 */
@Service
@RequiredArgsConstructor
public class TalentShukanShutsuenJohoService {
	
    private final TOnairKanriMapper tOnairKanriMapper;
    private final MTalentMapper mTalentMapper;
    private final MProgramMapper mProgramMapper;
    private final MChanelKyokuMapper mChanelKyokuMapper;
    private final MKbnGenreMapper mKbnGenreMapper;

    /**
     * タレント週間出演情報検索
     * @param targetNentsuki 対象年月
     * @param targetShu 対象週
     * @param talentId タレントID
     * @return 検索結果
     */
    public TalentShukanShutsuenJoho select(Integer nentsuki, Integer shu, String talentId) {
    	
    	TalentShukanShutsuenJoho response = new TalentShukanShutsuenJoho();

    	List<OnAirKanriTableDto> list1 = tOnairKanriMapper.select(nentsuki, shu, null);
    	List<TalentMasterDto>  list2 = mTalentMapper.select(talentId);
    	List<ProgramMasterDto> list3 = mProgramMapper.select(null);
    	List<ChanelKyokuMasterDto> list4 = mChanelKyokuMapper.select(null);
    	List<KbnGenreMasterDto> list5 = mKbnGenreMapper.select(talentId);

		return response;
    }
}