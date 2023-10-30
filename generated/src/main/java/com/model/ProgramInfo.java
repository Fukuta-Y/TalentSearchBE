package com.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

/**
 * 番組マスタ情報DTO
 */

@Schema(name = "programInfo", description = "番組マスタ情報DTO")
@JsonTypeName("programInfo")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-10-30T09:56:15.797989+09:00[Asia/Tokyo]")
public class ProgramInfo {

  @JsonProperty("mProgram")
  @Valid
  private MProgram mProgram = null;

  public ProgramInfo mProgram(MProgram mProgram) {
    this.mProgram = mProgram;
    return this;
  }

  public ProgramInfo addMProgramItem(MProgram mProgramItem) {
    this.mProgram = mProgramItem;
    return this;
  }

  /**
   * 番組マスタDTO
   * @return mProgram
  */
  @Valid 
  @Schema(name = "mProgram", description = "番組マスタDTO", required = false)
  public MProgram getmProgram() {
    return mProgram;
  }

  public void setmProgram(MProgram mProgram) {
    this.mProgram = mProgram;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProgramInfo programInfo = (ProgramInfo) o;
    return Objects.equals(this.mProgram, programInfo.mProgram);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mProgram);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProgramInfo {\n");
    sb.append("    mProgram: ").append(toIndentedString(mProgram)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

