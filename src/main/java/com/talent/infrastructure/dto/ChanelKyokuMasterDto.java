package com.talent.infrastructure.dto;
import java.io.Serializable;
import java.time.LocalDate;

import lombok.Data;
/**
 * チャンネル局マスタDTO
 */
@Data
public class ChanelKyokuMasterDto implements Serializable {
   private Integer channelId;
   private Integer channelKyokuId;
   private Integer areaId;
   private Integer deleteFlg;
   private LocalDate torokuDay;
   private LocalDate koushinDay;
}
