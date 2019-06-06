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
import net.thefletcher.tbaapi.v3client.model.MatchScoreBreakdown2015Alliance;

/**
 * See the 2015 FMS API documentation for a description of each value
 */
@ApiModel(description = "See the 2015 FMS API documentation for a description of each value")

public class MatchScoreBreakdown2015 {
  public static final String SERIALIZED_NAME_BLUE = "blue";
  @SerializedName(SERIALIZED_NAME_BLUE)
  private MatchScoreBreakdown2015Alliance blue = null;

  public static final String SERIALIZED_NAME_RED = "red";
  @SerializedName(SERIALIZED_NAME_RED)
  private MatchScoreBreakdown2015Alliance red = null;

  /**
   * Gets or Sets coopertition
   */
  @JsonAdapter(CoopertitionEnum.Adapter.class)
  public enum CoopertitionEnum {
    NONE("None"),
    
    UNKNOWN("Unknown"),
    
    STACK("Stack");

    private String value;

    CoopertitionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CoopertitionEnum fromValue(String value) {
      for (CoopertitionEnum b : CoopertitionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CoopertitionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CoopertitionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CoopertitionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CoopertitionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_COOPERTITION = "coopertition";
  @SerializedName(SERIALIZED_NAME_COOPERTITION)
  private CoopertitionEnum coopertition;

  public static final String SERIALIZED_NAME_COOPERTITION_POINTS = "coopertition_points";
  @SerializedName(SERIALIZED_NAME_COOPERTITION_POINTS)
  private Integer coopertitionPoints;

  public MatchScoreBreakdown2015 blue(MatchScoreBreakdown2015Alliance blue) {
    this.blue = blue;
    return this;
  }

   /**
   * Get blue
   * @return blue
  **/
  @ApiModelProperty(value = "")
  public MatchScoreBreakdown2015Alliance getBlue() {
    return blue;
  }

  public void setBlue(MatchScoreBreakdown2015Alliance blue) {
    this.blue = blue;
  }

  public MatchScoreBreakdown2015 red(MatchScoreBreakdown2015Alliance red) {
    this.red = red;
    return this;
  }

   /**
   * Get red
   * @return red
  **/
  @ApiModelProperty(value = "")
  public MatchScoreBreakdown2015Alliance getRed() {
    return red;
  }

  public void setRed(MatchScoreBreakdown2015Alliance red) {
    this.red = red;
  }

  public MatchScoreBreakdown2015 coopertition(CoopertitionEnum coopertition) {
    this.coopertition = coopertition;
    return this;
  }

   /**
   * Get coopertition
   * @return coopertition
  **/
  @ApiModelProperty(value = "")
  public CoopertitionEnum getCoopertition() {
    return coopertition;
  }

  public void setCoopertition(CoopertitionEnum coopertition) {
    this.coopertition = coopertition;
  }

  public MatchScoreBreakdown2015 coopertitionPoints(Integer coopertitionPoints) {
    this.coopertitionPoints = coopertitionPoints;
    return this;
  }

   /**
   * Get coopertitionPoints
   * @return coopertitionPoints
  **/
  @ApiModelProperty(value = "")
  public Integer getCoopertitionPoints() {
    return coopertitionPoints;
  }

  public void setCoopertitionPoints(Integer coopertitionPoints) {
    this.coopertitionPoints = coopertitionPoints;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchScoreBreakdown2015 matchScoreBreakdown2015 = (MatchScoreBreakdown2015) o;
    return Objects.equals(this.blue, matchScoreBreakdown2015.blue) &&
        Objects.equals(this.red, matchScoreBreakdown2015.red) &&
        Objects.equals(this.coopertition, matchScoreBreakdown2015.coopertition) &&
        Objects.equals(this.coopertitionPoints, matchScoreBreakdown2015.coopertitionPoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blue, red, coopertition, coopertitionPoints);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchScoreBreakdown2015 {\n");
    sb.append("    blue: ").append(toIndentedString(blue)).append("\n");
    sb.append("    red: ").append(toIndentedString(red)).append("\n");
    sb.append("    coopertition: ").append(toIndentedString(coopertition)).append("\n");
    sb.append("    coopertitionPoints: ").append(toIndentedString(coopertitionPoints)).append("\n");
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

