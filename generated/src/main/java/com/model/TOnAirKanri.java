package com.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

/**
 * オンエア管理テーブルDTOの情報
 */

@Schema(name = "tOnAirKanri", description = "オンエア管理テーブルDTOの情報")
@JsonTypeName("tOnAirKanri")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-10-24T18:16:02.285946+09:00[Asia/Tokyo]")
public class TOnAirKanri {

  @JsonProperty("items")
  private TOnAirKanri1 items;

  public TOnAirKanri items(TOnAirKanri1 items) {
    this.items = items;
    return this;
  }

  /**
   * Get items
   * @return items
  */
  @Valid 
  @Schema(name = "items", required = false)
  public TOnAirKanri1 getItems() {
    return items;
  }

  public void setItems(TOnAirKanri1 items) {
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
    TOnAirKanri tOnAirKanri = (TOnAirKanri) o;
    return Objects.equals(this.items, tOnAirKanri.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TOnAirKanri {\n");
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

