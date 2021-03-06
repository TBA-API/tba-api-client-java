/*
 * The Blue Alliance API v3
 * # Overview    Information and statistics about FIRST Robotics Competition teams and events.   # Authentication   All endpoints require an Auth Key to be passed in the header `X-TBA-Auth-Key`. If you do not have an auth key yet, you can obtain one from your [Account Page](/account).    A `User-Agent` header may need to be set to prevent a 403 Unauthorized error.
 *
 * The version of the OpenAPI document: 3.8.0
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
import java.util.ArrayList;
import java.util.List;
import net.thefletcher.tbaapi.v3client.model.ZebraTeam;

/**
 * ZebraAlliances
 */

public class ZebraAlliances {
  public static final String SERIALIZED_NAME_RED = "red";
  @SerializedName(SERIALIZED_NAME_RED)
  private List<ZebraTeam> red = null;

  public static final String SERIALIZED_NAME_BLUE = "blue";
  @SerializedName(SERIALIZED_NAME_BLUE)
  private List<ZebraTeam> blue = null;


  public ZebraAlliances red(List<ZebraTeam> red) {
    
    this.red = red;
    return this;
  }

  public ZebraAlliances addRedItem(ZebraTeam redItem) {
    if (this.red == null) {
      this.red = new ArrayList<ZebraTeam>();
    }
    this.red.add(redItem);
    return this;
  }

   /**
   * Zebra MotionWorks data for teams on the red alliance
   * @return red
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Zebra MotionWorks data for teams on the red alliance")

  public List<ZebraTeam> getRed() {
    return red;
  }


  public void setRed(List<ZebraTeam> red) {
    this.red = red;
  }


  public ZebraAlliances blue(List<ZebraTeam> blue) {
    
    this.blue = blue;
    return this;
  }

  public ZebraAlliances addBlueItem(ZebraTeam blueItem) {
    if (this.blue == null) {
      this.blue = new ArrayList<ZebraTeam>();
    }
    this.blue.add(blueItem);
    return this;
  }

   /**
   * Zebra data for teams on the blue alliance
   * @return blue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Zebra data for teams on the blue alliance")

  public List<ZebraTeam> getBlue() {
    return blue;
  }


  public void setBlue(List<ZebraTeam> blue) {
    this.blue = blue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZebraAlliances zebraAlliances = (ZebraAlliances) o;
    return Objects.equals(this.red, zebraAlliances.red) &&
        Objects.equals(this.blue, zebraAlliances.blue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(red, blue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZebraAlliances {\n");
    sb.append("    red: ").append(toIndentedString(red)).append("\n");
    sb.append("    blue: ").append(toIndentedString(blue)).append("\n");
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

