package com.talent.infrastructure.dto;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

import lombok.Data;
/**
 * オンエア管理テーブルDTO
 */
@Data
public class OnAirKanriTableDto implements Serializable {
   private String id;
   private String onairDay;
   private String programId;
   private String talentId;
   private Integer nentsuki;
   private Integer shu;
   private Integer deleteFlg;
   private LocalDate torokuDay;
   private LocalDate koushinDay;
}
