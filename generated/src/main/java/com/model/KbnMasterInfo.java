package com.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

/**
 * 区分マスタDTO
 */

@Schema(name = "kbnMasterInfo", description = "区分マスタDTO")
@JsonTypeName("kbnMasterInfo")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-10-30T21:54:16.344521+09:00[Asia/Tokyo]")
public class KbnMasterInfo {

  @JsonProperty("kbnMaster")
  @Valid
  private List<MKbnGenre> kbnMaster = null;

  public KbnMasterInfo kbnMaster(List<MKbnGenre> kbnMaster) {
    this.kbnMaster = kbnMaster;
    return this;
  }

  public KbnMasterInfo addKbnMasterItem(MKbnGenre kbnMasterItem) {
    if (this.kbnMaster == null) {
      this.kbnMaster = new ArrayList<>();
    }
    this.kbnMaster.add(kbnMasterItem);
    return this;
  }

  /**
   * 区分マスタDTO
   * @return kbnMaster
  */
  @Valid 
  @Schema(name = "kbnMaster", description = "区分マスタDTO", required = false)
  public List<MKbnGenre> getKbnMaster() {
    return kbnMaster;
  }

  public void setKbnMaster(List<MKbnGenre> kbnMaster) {
    this.kbnMaster = kbnMaster;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KbnMasterInfo kbnMasterInfo = (KbnMasterInfo) o;
    return Objects.equals(this.kbnMaster, kbnMasterInfo.kbnMaster);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kbnMaster);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KbnMasterInfo {\n");
    sb.append("    kbnMaster: ").append(toIndentedString(kbnMaster)).append("\n");
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

