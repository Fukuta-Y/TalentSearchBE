package com.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

/**
 * 区分マスタ
 */

@Schema(name = "kbnMaster", description = "区分マスタ")
@JsonTypeName("kbnMaster")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-10-29T21:08:21.181617+09:00[Asia/Tokyo]")
public class KbnMaster {

  @JsonProperty("items")
  private MKbnGenre items;

  public KbnMaster items(MKbnGenre items) {
    this.items = items;
    return this;
  }

  /**
   * Get items
   * @return items
  */
  @Valid 
  @Schema(name = "items", required = false)
  public MKbnGenre getItems() {
    return items;
  }

  public void setItems(MKbnGenre items) {
    this.items = items;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KbnMaster kbnMaster = (KbnMaster) o;
    return Objects.equals(this.items, kbnMaster.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KbnMaster {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

