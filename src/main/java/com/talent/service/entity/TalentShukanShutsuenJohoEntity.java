package com.talent.service.entity;

import com.talent.infrastructure.dto.*;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * タレント週間出演情報エンティティ
 */
@Data
public class TalentShukanShutsuenJohoEntity implements Serializable {
    private List<OnAirKanriTableDto> onAirKanriTableDto;
    private List<ProgramMasterDto> programMasterDto;
    private List<TalentMasterDto> talentMasterDto;
    private List<ChanelKyokuMasterDto> chanelKyokuMasterDto;
    private List<KbnGenreMasterDto> kbnGenreMasterDto;
}