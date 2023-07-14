package com.talent.service;

import org.springframework.stereotype.Service;

import com.model.TalentShukanShutsuenJoho;

import lombok.RequiredArgsConstructor;

/**
 * タレント週間出演情報検索 Service
 */
@Service
@RequiredArgsConstructor
public class TalentShukanShutsuenJohoService {

    /**
     * タレント週間出演情報検索
     * @param targetNentsuki 対象年月
     * @param targetShu 対象週
     * @param talentId タレントID
     * @return 検索結果
     */
    public TalentShukanShutsuenJoho select(Integer nentsuki, Integer shu, String talentId) {
    	
    	TalentShukanShutsuenJoho model = new TalentShukanShutsuenJoho();
    	model.setmChanelKyoku(null);
    	
		return model;
    }
}