package com.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

/**
 * 登録または更新した年月週管理マスタDTOの情報
 */

@Schema(name = "postNentsukiShuKanri", description = "登録または更新した年月週管理マスタDTOの情報")
@JsonTypeName("postNentsukiShuKanri")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-10-24T18:18:54.919117+09:00[Asia/Tokyo]")
public class PostNentsukiShuKanri {

  @JsonProperty("items")
  private MNentsukiShuKanri items;

  public PostNentsukiShuKanri items(MNentsukiShuKanri items) {
    this.items = items;
    return this;
  }

  /**
   * Get items
   * @return items
  */
  @Valid 
  @Schema(name = "items", required = false)
  public MNentsukiShuKanri getItems() {
    return items;
  }

  public void setItems(MNentsukiShuKanri items) {
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
    PostNentsukiShuKanri postNentsukiShuKanri = (PostNentsukiShuKanri) o;
    return Objects.equals(this.items, postNentsukiShuKanri.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostNentsukiShuKanri {\n");
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

