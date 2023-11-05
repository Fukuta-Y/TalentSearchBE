package com.talent.infrastructure.dto;
import java.io.Serializable;

import lombok.Data;
/**
 * オンエア管理テーブルDTO
 */
@Data
public class OnAirKanriTableDto implements Serializable {
   private String id;
   private String onAirDay;
   private String programId;
   private String talentId;
   private Integer nentsuki;
   private Integer shu;
   private Integer deleteFlg;
   private String torokuDay;
   private String koushinDay;
}
