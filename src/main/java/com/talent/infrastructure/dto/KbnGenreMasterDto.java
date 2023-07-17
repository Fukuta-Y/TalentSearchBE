package com.talent.infrastructure.dto;
import java.io.Serializable;
import java.time.LocalDate;

import lombok.Data;
/**
 * 区分ジャンルマスタDTO
 */
@Data
public class KbnGenreMasterDto implements Serializable {
   private Integer genreId;
   private Integer jyunjyo;
   private String genre;
   private Integer deleteFlg;
   private LocalDate torokuDay;
   private LocalDate koushinDay;
}