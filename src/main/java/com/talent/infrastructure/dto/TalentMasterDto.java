package com.talent.infrastructure.dto;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

import lombok.Data;
/**
 * タレントマスタDTO
 */
// REVIEW: 個人的指摘としてDATE型よりもLocalDate型を利用した方が利用できるメソッドが増えて利用しやすい
@Data
public class TalentMasterDto implements Serializable {
   private String talentId;
   private String talentName;
   private Integer genreId;
   private Integer deleteFlg;
   private LocalDate torokuDay;
   private LocalDate koushinDay;
}
