package com.talent.infrastructure.dto;
import java.io.Serializable;

import lombok.Data;
/**
 * オンエア管理参照用DTO
 */
@Data
public class OnAirKanriRefDto implements Serializable {
   private String id;
   private String onAirDay;
   private String programId;
   private String programName;
   private String talentId;
   private String talentName;
   private Integer nentsuki;
   private Integer shu;
   private Integer deleteFlg;
   private String torokuDay;
   private String koushinDay;
}
