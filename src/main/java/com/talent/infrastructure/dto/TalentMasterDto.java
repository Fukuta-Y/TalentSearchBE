package com.talent.infrastructure.dto;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

import lombok.Data;
/**
 * タレントマスタDTO
 */
@Data
public class TalentMasterDto implements Serializable {
   private String talentId;
   private String talentName;
   private Integer genreId;
   private Integer deleteFlg;
   private LocalDate torokuDay;
   private LocalDate koushinDay;
}
