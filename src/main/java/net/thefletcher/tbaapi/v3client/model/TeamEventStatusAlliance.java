/*
 * The Blue Alliance API v3
 * # Overview    Information and statistics about FIRST Robotics Competition teams and events.   # Authentication   All endpoints require an Auth Key to be passed in the header `X-TBA-Auth-Key`. If you do not have an auth key yet, you can obtain one from your [Account Page](/account).    A `User-Agent` header may need to be set to prevent a 403 Unauthorized error.
 *
 * The version of the OpenAPI document: 3.04.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package net.thefletcher.tbaapi.v3client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import net.thefletcher.tbaapi.v3client.model.TeamEventStatusAllianceBackup;

/**
 * TeamEventStatusAlliance
 */

public class TeamEventStatusAlliance {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private Integer number;

  public static final String SERIALIZED_NAME_BACKUP = "backup";
  @SerializedName(SERIALIZED_NAME_BACKUP)
  private TeamEventStatusAllianceBackup backup = null;

  public static final String SERIALIZED_NAME_PICK = "pick";
  @SerializedName(SERIALIZED_NAME_PICK)
  private Integer pick;

  public TeamEventStatusAlliance name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Alliance name, may be null.
   * @return name
  **/
  @ApiModelProperty(value = "Alliance name, may be null.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TeamEventStatusAlliance number(Integer number) {
    this.number = number;
    return this;
  }

   /**
   * Alliance number.
   * @return number
  **/
  @ApiModelProperty(required = true, value = "Alliance number.")
  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public TeamEventStatusAlliance backup(TeamEventStatusAllianceBackup backup) {
    this.backup = backup;
    return this;
  }

   /**
   * Get backup
   * @return backup
  **/
  @ApiModelProperty(value = "")
  public TeamEventStatusAllianceBackup getBackup() {
    return backup;
  }

  public void setBackup(TeamEventStatusAllianceBackup backup) {
    this.backup = backup;
  }

  public TeamEventStatusAlliance pick(Integer pick) {
    this.pick = pick;
    return this;
  }

   /**
   * Order the team was picked in the alliance from 0-2, with 0 being alliance captain.
   * @return pick
  **/
  @ApiModelProperty(required = true, value = "Order the team was picked in the alliance from 0-2, with 0 being alliance captain.")
  public Integer getPick() {
    return pick;
  }

  public void setPick(Integer pick) {
    this.pick = pick;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamEventStatusAlliance teamEventStatusAlliance = (TeamEventStatusAlliance) o;
    return Objects.equals(this.name, teamEventStatusAlliance.name) &&
        Objects.equals(this.number, teamEventStatusAlliance.number) &&
        Objects.equals(this.backup, teamEventStatusAlliance.backup) &&
        Objects.equals(this.pick, teamEventStatusAlliance.pick);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, number, backup, pick);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamEventStatusAlliance {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    backup: ").append(toIndentedString(backup)).append("\n");
    sb.append("    pick: ").append(toIndentedString(pick)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

