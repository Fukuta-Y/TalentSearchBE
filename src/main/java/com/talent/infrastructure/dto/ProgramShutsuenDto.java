package com.talent.infrastructure.dto;
import java.io.Serializable;

import lombok.Data;
/**
 * 番組出演者検索DTO
 */
@Data
public class ProgramShutsuenDto implements Serializable {
   private String talentId;
   private String talentName;
}
