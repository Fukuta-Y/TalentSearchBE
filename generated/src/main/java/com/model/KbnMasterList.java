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

@Schema(name = "kbnMasterList", description = "区分マスタDTO")
@JsonTypeName("kbnMasterList")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-11-03T17:07:29.665089+09:00[Asia/Tokyo]")
public class KbnMasterList {

  @JsonProperty("mKbnGenre")
  @Valid
  private List<MKbnGenre> mKbnGenre = null;

  public KbnMasterList mKbnGenre(List<MKbnGenre> mKbnGenre) {
    this.mKbnGenre = mKbnGenre;
    return this;
  }

  public KbnMasterList addMKbnGenreItem(MKbnGenre mKbnGenreItem) {
    if (this.mKbnGenre == null) {
      this.mKbnGenre = new ArrayList<>();
    }
    this.mKbnGenre.add(mKbnGenreItem);
    return this;
  }

  /**
   * 区分マスタDTO
   * @return mKbnGenre
  */
  @Valid 
  @Schema(name = "mKbnGenre", description = "区分マスタDTO", required = false)
  public List<MKbnGenre> getmKbnGenre() {
    return mKbnGenre;
  }

  public void setmKbnGenre(List<MKbnGenre> mKbnGenre) {
    this.mKbnGenre = mKbnGenre;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KbnMasterList kbnMasterList = (KbnMasterList) o;
    return Objects.equals(this.mKbnGenre, kbnMasterList.mKbnGenre);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mKbnGenre);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KbnMasterList {\n");
    sb.append("    mKbnGenre: ").append(toIndentedString(mKbnGenre)).append("\n");
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

