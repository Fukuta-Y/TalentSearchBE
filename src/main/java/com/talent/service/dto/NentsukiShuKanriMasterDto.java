package com.talent.service.dto;
import java.io.Serializable;
import java.time.LocalDate;

import lombok.Data;
/**
 * 年月週管理マスタDTO
 */
@Data
public class NentsukiShuKanriMasterDto implements Serializable {
   private Integer nentsuki;
   private Integer shu;
   private String shuFrom;
   private String shuTo;
   private LocalDate torokuDay;
   private LocalDate koushinDay;
}
