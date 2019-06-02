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
import java.math.BigDecimal;

/**
 * EventRankingExtraStatsInfo
 */

public class EventRankingExtraStatsInfo {
  public static final String SERIALIZED_NAME_PRECISION = "precision";
  @SerializedName(SERIALIZED_NAME_PRECISION)
  private BigDecimal precision;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public EventRankingExtraStatsInfo precision(BigDecimal precision) {
    this.precision = precision;
    return this;
  }

   /**
   * Integer expressing the number of digits of precision in the number provided in &#x60;sort_orders&#x60;.
   * @return precision
  **/
  @ApiModelProperty(required = true, value = "Integer expressing the number of digits of precision in the number provided in `sort_orders`.")
  public BigDecimal getPrecision() {
    return precision;
  }

  public void setPrecision(BigDecimal precision) {
    this.precision = precision;
  }

  public EventRankingExtraStatsInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the field used in the &#x60;extra_stats&#x60; array.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the field used in the `extra_stats` array.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventRankingExtraStatsInfo eventRankingExtraStatsInfo = (EventRankingExtraStatsInfo) o;
    return Objects.equals(this.precision, eventRankingExtraStatsInfo.precision) &&
        Objects.equals(this.name, eventRankingExtraStatsInfo.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(precision, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventRankingExtraStatsInfo {\n");
    sb.append("    precision: ").append(toIndentedString(precision)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

