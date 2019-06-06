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
import net.thefletcher.tbaapi.v3client.model.MatchAlliances;

/**
 * MatchSimple
 */

public class MatchSimple {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  /**
   * The competition level the match was played at.
   */
  @JsonAdapter(CompLevelEnum.Adapter.class)
  public enum CompLevelEnum {
    QM("qm"),
    
    EF("ef"),
    
    QF("qf"),
    
    SF("sf"),
    
    F("f");

    private String value;

    CompLevelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CompLevelEnum fromValue(String value) {
      for (CompLevelEnum b : CompLevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CompLevelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CompLevelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CompLevelEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CompLevelEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_COMP_LEVEL = "comp_level";
  @SerializedName(SERIALIZED_NAME_COMP_LEVEL)
  private CompLevelEnum compLevel;

  public static final String SERIALIZED_NAME_SET_NUMBER = "set_number";
  @SerializedName(SERIALIZED_NAME_SET_NUMBER)
  private Integer setNumber;

  public static final String SERIALIZED_NAME_MATCH_NUMBER = "match_number";
  @SerializedName(SERIALIZED_NAME_MATCH_NUMBER)
  private Integer matchNumber;

  public static final String SERIALIZED_NAME_ALLIANCES = "alliances";
  @SerializedName(SERIALIZED_NAME_ALLIANCES)
  private MatchAlliances alliances = null;

  /**
   * The color (red/blue) of the winning alliance. Will contain an empty string in the event of no winner, or a tie.
   */
  @JsonAdapter(WinningAllianceEnum.Adapter.class)
  public enum WinningAllianceEnum {
    RED("red"),
    
    BLUE("blue");

    private String value;

    WinningAllianceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static WinningAllianceEnum fromValue(String value) {
      for (WinningAllianceEnum b : WinningAllianceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<WinningAllianceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WinningAllianceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WinningAllianceEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return WinningAllianceEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_WINNING_ALLIANCE = "winning_alliance";
  @SerializedName(SERIALIZED_NAME_WINNING_ALLIANCE)
  private WinningAllianceEnum winningAlliance;

  public static final String SERIALIZED_NAME_EVENT_KEY = "event_key";
  @SerializedName(SERIALIZED_NAME_EVENT_KEY)
  private String eventKey;

  public static final String SERIALIZED_NAME_TIME = "time";
  @SerializedName(SERIALIZED_NAME_TIME)
  private Long time;

  public static final String SERIALIZED_NAME_PREDICTED_TIME = "predicted_time";
  @SerializedName(SERIALIZED_NAME_PREDICTED_TIME)
  private Long predictedTime;

  public static final String SERIALIZED_NAME_ACTUAL_TIME = "actual_time";
  @SerializedName(SERIALIZED_NAME_ACTUAL_TIME)
  private Long actualTime;

  public MatchSimple key(String key) {
    this.key = key;
    return this;
  }

   /**
   * TBA match key with the format &#x60;yyyy[EVENT_CODE]_[COMP_LEVEL]m[MATCH_NUMBER]&#x60;, where &#x60;yyyy&#x60; is the year, and &#x60;EVENT_CODE&#x60; is the event code of the event, &#x60;COMP_LEVEL&#x60; is (qm, ef, qf, sf, f), and &#x60;MATCH_NUMBER&#x60; is the match number in the competition level. A set number may append the competition level if more than one match in required per set.
   * @return key
  **/
  @ApiModelProperty(required = true, value = "TBA match key with the format `yyyy[EVENT_CODE]_[COMP_LEVEL]m[MATCH_NUMBER]`, where `yyyy` is the year, and `EVENT_CODE` is the event code of the event, `COMP_LEVEL` is (qm, ef, qf, sf, f), and `MATCH_NUMBER` is the match number in the competition level. A set number may append the competition level if more than one match in required per set.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public MatchSimple compLevel(CompLevelEnum compLevel) {
    this.compLevel = compLevel;
    return this;
  }

   /**
   * The competition level the match was played at.
   * @return compLevel
  **/
  @ApiModelProperty(required = true, value = "The competition level the match was played at.")
  public CompLevelEnum getCompLevel() {
    return compLevel;
  }

  public void setCompLevel(CompLevelEnum compLevel) {
    this.compLevel = compLevel;
  }

  public MatchSimple setNumber(Integer setNumber) {
    this.setNumber = setNumber;
    return this;
  }

   /**
   * The set number in a series of matches where more than one match is required in the match series.
   * @return setNumber
  **/
  @ApiModelProperty(required = true, value = "The set number in a series of matches where more than one match is required in the match series.")
  public Integer getSetNumber() {
    return setNumber;
  }

  public void setSetNumber(Integer setNumber) {
    this.setNumber = setNumber;
  }

  public MatchSimple matchNumber(Integer matchNumber) {
    this.matchNumber = matchNumber;
    return this;
  }

   /**
   * The match number of the match in the competition level.
   * @return matchNumber
  **/
  @ApiModelProperty(required = true, value = "The match number of the match in the competition level.")
  public Integer getMatchNumber() {
    return matchNumber;
  }

  public void setMatchNumber(Integer matchNumber) {
    this.matchNumber = matchNumber;
  }

  public MatchSimple alliances(MatchAlliances alliances) {
    this.alliances = alliances;
    return this;
  }

   /**
   * Get alliances
   * @return alliances
  **/
  @ApiModelProperty(value = "")
  public MatchAlliances getAlliances() {
    return alliances;
  }

  public void setAlliances(MatchAlliances alliances) {
    this.alliances = alliances;
  }

  public MatchSimple winningAlliance(WinningAllianceEnum winningAlliance) {
    this.winningAlliance = winningAlliance;
    return this;
  }

   /**
   * The color (red/blue) of the winning alliance. Will contain an empty string in the event of no winner, or a tie.
   * @return winningAlliance
  **/
  @ApiModelProperty(value = "The color (red/blue) of the winning alliance. Will contain an empty string in the event of no winner, or a tie.")
  public WinningAllianceEnum getWinningAlliance() {
    return winningAlliance;
  }

  public void setWinningAlliance(WinningAllianceEnum winningAlliance) {
    this.winningAlliance = winningAlliance;
  }

  public MatchSimple eventKey(String eventKey) {
    this.eventKey = eventKey;
    return this;
  }

   /**
   * Event key of the event the match was played at.
   * @return eventKey
  **/
  @ApiModelProperty(required = true, value = "Event key of the event the match was played at.")
  public String getEventKey() {
    return eventKey;
  }

  public void setEventKey(String eventKey) {
    this.eventKey = eventKey;
  }

  public MatchSimple time(Long time) {
    this.time = time;
    return this;
  }

   /**
   * UNIX timestamp (seconds since 1-Jan-1970 00:00:00) of the scheduled match time, as taken from the published schedule.
   * @return time
  **/
  @ApiModelProperty(value = "UNIX timestamp (seconds since 1-Jan-1970 00:00:00) of the scheduled match time, as taken from the published schedule.")
  public Long getTime() {
    return time;
  }

  public void setTime(Long time) {
    this.time = time;
  }

  public MatchSimple predictedTime(Long predictedTime) {
    this.predictedTime = predictedTime;
    return this;
  }

   /**
   * UNIX timestamp (seconds since 1-Jan-1970 00:00:00) of the TBA predicted match start time.
   * @return predictedTime
  **/
  @ApiModelProperty(value = "UNIX timestamp (seconds since 1-Jan-1970 00:00:00) of the TBA predicted match start time.")
  public Long getPredictedTime() {
    return predictedTime;
  }

  public void setPredictedTime(Long predictedTime) {
    this.predictedTime = predictedTime;
  }

  public MatchSimple actualTime(Long actualTime) {
    this.actualTime = actualTime;
    return this;
  }

   /**
   * UNIX timestamp (seconds since 1-Jan-1970 00:00:00) of actual match start time.
   * @return actualTime
  **/
  @ApiModelProperty(value = "UNIX timestamp (seconds since 1-Jan-1970 00:00:00) of actual match start time.")
  public Long getActualTime() {
    return actualTime;
  }

  public void setActualTime(Long actualTime) {
    this.actualTime = actualTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchSimple matchSimple = (MatchSimple) o;
    return Objects.equals(this.key, matchSimple.key) &&
        Objects.equals(this.compLevel, matchSimple.compLevel) &&
        Objects.equals(this.setNumber, matchSimple.setNumber) &&
        Objects.equals(this.matchNumber, matchSimple.matchNumber) &&
        Objects.equals(this.alliances, matchSimple.alliances) &&
        Objects.equals(this.winningAlliance, matchSimple.winningAlliance) &&
        Objects.equals(this.eventKey, matchSimple.eventKey) &&
        Objects.equals(this.time, matchSimple.time) &&
        Objects.equals(this.predictedTime, matchSimple.predictedTime) &&
        Objects.equals(this.actualTime, matchSimple.actualTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, compLevel, setNumber, matchNumber, alliances, winningAlliance, eventKey, time, predictedTime, actualTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchSimple {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    compLevel: ").append(toIndentedString(compLevel)).append("\n");
    sb.append("    setNumber: ").append(toIndentedString(setNumber)).append("\n");
    sb.append("    matchNumber: ").append(toIndentedString(matchNumber)).append("\n");
    sb.append("    alliances: ").append(toIndentedString(alliances)).append("\n");
    sb.append("    winningAlliance: ").append(toIndentedString(winningAlliance)).append("\n");
    sb.append("    eventKey: ").append(toIndentedString(eventKey)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    predictedTime: ").append(toIndentedString(predictedTime)).append("\n");
    sb.append("    actualTime: ").append(toIndentedString(actualTime)).append("\n");
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

