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
 * 年月週管理マスタDTOの情報
 */

@Schema(name = "getNentsukiShuKanri", description = "年月週管理マスタDTOの情報")
@JsonTypeName("getNentsukiShuKanri")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-10-24T18:18:54.919117+09:00[Asia/Tokyo]")
public class GetNentsukiShuKanri {

  @JsonProperty("mNentsukiShuKanri")
  @Valid
  private List<MNentsukiShuKanri> mNentsukiShuKanri = null;

  public GetNentsukiShuKanri mNentsukiShuKanri(List<MNentsukiShuKanri> mNentsukiShuKanri) {
    this.mNentsukiShuKanri = mNentsukiShuKanri;
    return this;
  }

  public GetNentsukiShuKanri addMNentsukiShuKanriItem(MNentsukiShuKanri mNentsukiShuKanriItem) {
    if (this.mNentsukiShuKanri == null) {
      this.mNentsukiShuKanri = new ArrayList<>();
    }
    this.mNentsukiShuKanri.add(mNentsukiShuKanriItem);
    return this;
  }

  /**
   * 年月週管理マスタDTOの情報
   * @return mNentsukiShuKanri
  */
  @Valid 
  @Schema(name = "mNentsukiShuKanri", description = "年月週管理マスタDTOの情報", required = false)
  public List<MNentsukiShuKanri> getmNentsukiShuKanri() {
    return mNentsukiShuKanri;
  }

  public void setmNentsukiShuKanri(List<MNentsukiShuKanri> mNentsukiShuKanri) {
    this.mNentsukiShuKanri = mNentsukiShuKanri;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetNentsukiShuKanri getNentsukiShuKanri = (GetNentsukiShuKanri) o;
    return Objects.equals(this.mNentsukiShuKanri, getNentsukiShuKanri.mNentsukiShuKanri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mNentsukiShuKanri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetNentsukiShuKanri {\n");
    sb.append("    mNentsukiShuKanri: ").append(toIndentedString(mNentsukiShuKanri)).append("\n");
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

