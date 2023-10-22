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
 * タレントマスタDTOの情報
 */

@Schema(name = "mTalent", description = "タレントマスタDTOの情報")
@JsonTypeName("mTalent")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-10-22T20:07:51.984801+09:00[Asia/Tokyo]")
public class MTalent {

  @JsonProperty("mTalent")
  @Valid
  private List<MTalent1> mTalent = null;

  public MTalent mTalent(List<MTalent1> mTalent) {
    this.mTalent = mTalent;
    return this;
  }

  public MTalent addMTalentItem(MTalent1 mTalentItem) {
    if (this.mTalent == null) {
      this.mTalent = new ArrayList<>();
    }
    this.mTalent.add(mTalentItem);
    return this;
  }

  /**
   * タレントマスタDTO
   * @return mTalent
  */
  @Valid 
  @Schema(name = "mTalent", description = "タレントマスタDTO", required = false)
  public List<MTalent1> getmTalent() {
    return mTalent;
  }

  public void setmTalent(List<MTalent1> mTalent) {
    this.mTalent = mTalent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MTalent mTalent = (MTalent) o;
    return Objects.equals(this.mTalent, mTalent.mTalent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mTalent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MTalent {\n");
    sb.append("    mTalent: ").append(toIndentedString(mTalent)).append("\n");
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

