/*
 * The Blue Alliance API v3
 * # Overview    Information and statistics about FIRST Robotics Competition teams and events.   # Authentication   All endpoints require an Auth Key to be passed in the header `X-TBA-Auth-Key`. If you do not have an auth key yet, you can obtain one from your [Account Page](/account).    A `User-Agent` header may need to be set to prevent a 403 Unauthorized error.
 *
 * OpenAPI spec version: 3.03.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package net.thefletcher.tbaapi.v3client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Backup team called in, may be null.
 */
@ApiModel(description = "Backup team called in, may be null.")

public class EliminationAllianceBackup {
  @SerializedName("out")
  private String out = null;

  @SerializedName("in")
  private String in = null;

  public EliminationAllianceBackup out(String out) {
    this.out = out;
    return this;
  }

   /**
   * Team key that was replaced by the backup team.
   * @return out
  **/
  @ApiModelProperty(value = "Team key that was replaced by the backup team.")
  public String getOut() {
    return out;
  }

  public void setOut(String out) {
    this.out = out;
  }

  public EliminationAllianceBackup in(String in) {
    this.in = in;
    return this;
  }

   /**
   * Team key that was called in as the backup.
   * @return in
  **/
  @ApiModelProperty(value = "Team key that was called in as the backup.")
  public String getIn() {
    return in;
  }

  public void setIn(String in) {
    this.in = in;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EliminationAllianceBackup eliminationAllianceBackup = (EliminationAllianceBackup) o;
    return Objects.equals(this.out, eliminationAllianceBackup.out) &&
        Objects.equals(this.in, eliminationAllianceBackup.in);
  }

  @Override
  public int hashCode() {
    return Objects.hash(out, in);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EliminationAllianceBackup {\n");
    
    sb.append("    out: ").append(toIndentedString(out)).append("\n");
    sb.append("    in: ").append(toIndentedString(in)).append("\n");
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

