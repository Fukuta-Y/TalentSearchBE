package com.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * オンエア管理テーブル情報（全列）
 */

@Schema(name = "tOnAirKanri", description = "オンエア管理テーブル情報（全列）")
@JsonTypeName("tOnAirKanri")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-07-11T23:29:51.001355+09:00[Asia/Tokyo]")
public class TOnAirKanri {

  @JsonProperty("id")
  private String id;

  @JsonProperty("onairDay")
  private String onairDay;

  @JsonProperty("programId")
  private String programId;

  @JsonProperty("talentId")
  private String talentId;

  @JsonProperty("nentsuki")
  private Integer nentsuki;

  @JsonProperty("shu")
  private Integer shu;

  @JsonProperty("deleteFlg")
  private Integer deleteFlg;

  @JsonProperty("torokuDay")
  private String torokuDay;

  @JsonProperty("koushinDay")
  private String koushinDay;

  public TOnAirKanri id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID
   * @return id
  */
  @Size(max = 8) 
  @Schema(name = "id", description = "ID", required = false)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TOnAirKanri onairDay(String onairDay) {
    this.onairDay = onairDay;
    return this;
  }

  /**
   * オンエア日
   * @return onairDay
  */
  @Valid 
  @Schema(name = "onairDay", description = "オンエア日", required = false)
  public String getonairDay() {
    return onairDay;
  }

  public void setonairDay(String onairDay) {
    this.onairDay = onairDay;
  }

  public TOnAirKanri programId(String programId) {
    this.programId = programId;
    return this;
  }

  /**
   * 番組ID
   * @return programId
  */
  @NotNull @Size(max = 8) 
  @Schema(name = "programId", description = "番組ID", required = true)
  public String getProgramId() {
    return programId;
  }

  public void setProgramId(String programId) {
    this.programId = programId;
  }

  public TOnAirKanri talentId(String talentId) {
    this.talentId = talentId;
    return this;
  }

  /**
   * タレントID
   * @return talentId
  */
  @Size(max = 8) 
  @Schema(name = "talentId", description = "タレントID", required = false)
  public String getTalentId() {
    return talentId;
  }

  public void setTalentId(String talentId) {
    this.talentId = talentId;
  }

  public TOnAirKanri nentsuki(Integer nentsuki) {
    this.nentsuki = nentsuki;
    return this;
  }

  /**
   * 対象年月
   * minimum: 1990
   * maximum: 2100
   * @return nentsuki
  */
  @Min(1990) @Max(2100) 
  @Schema(name = "nentsuki", description = "対象年月", required = false)
  public Integer getnentsuki() {
    return nentsuki;
  }

  public void setnentsuki(Integer nentsuki) {
    this.nentsuki = nentsuki;
  }

  public TOnAirKanri shu(Integer shu) {
    this.shu = shu;
    return this;
  }

  /**
   * 対象週
   * minimum: 1
   * maximum: 5
   * @return shu
  */
  @Min(1) @Max(5) 
  @Schema(name = "shu", description = "対象週", required = false)
  public Integer getshu() {
    return shu;
  }

  public void setshu(Integer shu) {
    this.shu = shu;
  }

  public TOnAirKanri deleteFlg(Integer deleteFlg) {
    this.deleteFlg = deleteFlg;
    return this;
  }

  /**
   * 論理削除フラグ
   * minimum: 0
   * maximum: 9
   * @return deleteFlg
  */
  @Min(0) @Max(9) 
  @Schema(name = "deleteFlg", description = "論理削除フラグ", required = false)
  public Integer getDeleteFlg() {
    return deleteFlg;
  }

  public void setDeleteFlg(Integer deleteFlg) {
    this.deleteFlg = deleteFlg;
  }

  public TOnAirKanri torokuDay(String torokuDay) {
    this.torokuDay = torokuDay;
    return this;
  }

  /**
   * 登録日
   * @return torokuDay
  */
  
  @Schema(name = "torokuDay", description = "登録日", required = false)
  public String getTorokuDay() {
    return torokuDay;
  }

  public void setTorokuDay(String torokuDay) {
    this.torokuDay = torokuDay;
  }

  public TOnAirKanri koushinDay(String koushinDay) {
    this.koushinDay = koushinDay;
    return this;
  }

  /**
   * 更新日
   * @return koushinDay
  */
  
  @Schema(name = "koushinDay", description = "更新日", required = false)
  public String getKoushinDay() {
    return koushinDay;
  }

  public void setKoushinDay(String koushinDay) {
    this.koushinDay = koushinDay;
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
    return Objects.equals(this.id, tOnAirKanri.id) &&
        Objects.equals(this.onairDay, tOnAirKanri.onairDay) &&
        Objects.equals(this.programId, tOnAirKanri.programId) &&
        Objects.equals(this.talentId, tOnAirKanri.talentId) &&
        Objects.equals(this.nentsuki, tOnAirKanri.nentsuki) &&
        Objects.equals(this.shu, tOnAirKanri.shu) &&
        Objects.equals(this.deleteFlg, tOnAirKanri.deleteFlg) &&
        Objects.equals(this.torokuDay, tOnAirKanri.torokuDay) &&
        Objects.equals(this.koushinDay, tOnAirKanri.koushinDay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, onairDay, programId, talentId, nentsuki, shu, deleteFlg, torokuDay, koushinDay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TOnAirKanri {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    onairDay: ").append(toIndentedString(onairDay)).append("\n");
    sb.append("    programId: ").append(toIndentedString(programId)).append("\n");
    sb.append("    talentId: ").append(toIndentedString(talentId)).append("\n");
    sb.append("    nentsuki: ").append(toIndentedString(nentsuki)).append("\n");
    sb.append("    shu: ").append(toIndentedString(shu)).append("\n");
    sb.append("    deleteFlg: ").append(toIndentedString(deleteFlg)).append("\n");
    sb.append("    torokuDay: ").append(toIndentedString(torokuDay)).append("\n");
    sb.append("    koushinDay: ").append(toIndentedString(koushinDay)).append("\n");
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

