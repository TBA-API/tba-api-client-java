/*
 * The Blue Alliance API v3
 * # Overview    Information and statistics about FIRST Robotics Competition teams and events.   # Authentication   All endpoints require an Auth Key to be passed in the header `X-TBA-Auth-Key`. If you do not have an auth key yet, you can obtain one from your [Account Page](/account).    A `User-Agent` header may need to be set to prevent a 403 Unauthorized error.
 *
 * The version of the OpenAPI document: 3.5
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
import net.thefletcher.tbaapi.v3client.model.WLTRecord;

/**
 * Playoff status for this team, may be null if the team did not make playoffs, or playoffs have not begun.
 */
@ApiModel(description = "Playoff status for this team, may be null if the team did not make playoffs, or playoffs have not begun.")

public class TeamEventStatusPlayoff {
  /**
   * The highest playoff level the team reached.
   */
  @JsonAdapter(LevelEnum.Adapter.class)
  public enum LevelEnum {
    QM("qm"),
    
    EF("ef"),
    
    QF("qf"),
    
    SF("sf"),
    
    F("f");

    private String value;

    LevelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LevelEnum fromValue(String value) {
      for (LevelEnum b : LevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<LevelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LevelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LevelEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return LevelEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_LEVEL = "level";
  @SerializedName(SERIALIZED_NAME_LEVEL)
  private LevelEnum level;

  public static final String SERIALIZED_NAME_CURRENT_LEVEL_RECORD = "current_level_record";
  @SerializedName(SERIALIZED_NAME_CURRENT_LEVEL_RECORD)
  private WLTRecord currentLevelRecord = null;

  public static final String SERIALIZED_NAME_RECORD = "record";
  @SerializedName(SERIALIZED_NAME_RECORD)
  private WLTRecord record = null;

  /**
   * Current competition status for the playoffs.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    WON("won"),
    
    ELIMINATED("eliminated"),
    
    PLAYING("playing");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_PLAYOFF_AVERAGE = "playoff_average";
  @SerializedName(SERIALIZED_NAME_PLAYOFF_AVERAGE)
  private Integer playoffAverage;

  public TeamEventStatusPlayoff level(LevelEnum level) {
    this.level = level;
    return this;
  }

   /**
   * The highest playoff level the team reached.
   * @return level
  **/
  @ApiModelProperty(value = "The highest playoff level the team reached.")
  public LevelEnum getLevel() {
    return level;
  }

  public void setLevel(LevelEnum level) {
    this.level = level;
  }

  public TeamEventStatusPlayoff currentLevelRecord(WLTRecord currentLevelRecord) {
    this.currentLevelRecord = currentLevelRecord;
    return this;
  }

   /**
   * Get currentLevelRecord
   * @return currentLevelRecord
  **/
  @ApiModelProperty(value = "")
  public WLTRecord getCurrentLevelRecord() {
    return currentLevelRecord;
  }

  public void setCurrentLevelRecord(WLTRecord currentLevelRecord) {
    this.currentLevelRecord = currentLevelRecord;
  }

  public TeamEventStatusPlayoff record(WLTRecord record) {
    this.record = record;
    return this;
  }

   /**
   * Get record
   * @return record
  **/
  @ApiModelProperty(value = "")
  public WLTRecord getRecord() {
    return record;
  }

  public void setRecord(WLTRecord record) {
    this.record = record;
  }

  public TeamEventStatusPlayoff status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Current competition status for the playoffs.
   * @return status
  **/
  @ApiModelProperty(value = "Current competition status for the playoffs.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public TeamEventStatusPlayoff playoffAverage(Integer playoffAverage) {
    this.playoffAverage = playoffAverage;
    return this;
  }

   /**
   * The average match score during playoffs. Year specific. May be null if not relevant for a given year.
   * @return playoffAverage
  **/
  @ApiModelProperty(value = "The average match score during playoffs. Year specific. May be null if not relevant for a given year.")
  public Integer getPlayoffAverage() {
    return playoffAverage;
  }

  public void setPlayoffAverage(Integer playoffAverage) {
    this.playoffAverage = playoffAverage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamEventStatusPlayoff teamEventStatusPlayoff = (TeamEventStatusPlayoff) o;
    return Objects.equals(this.level, teamEventStatusPlayoff.level) &&
        Objects.equals(this.currentLevelRecord, teamEventStatusPlayoff.currentLevelRecord) &&
        Objects.equals(this.record, teamEventStatusPlayoff.record) &&
        Objects.equals(this.status, teamEventStatusPlayoff.status) &&
        Objects.equals(this.playoffAverage, teamEventStatusPlayoff.playoffAverage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(level, currentLevelRecord, record, status, playoffAverage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamEventStatusPlayoff {\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    currentLevelRecord: ").append(toIndentedString(currentLevelRecord)).append("\n");
    sb.append("    record: ").append(toIndentedString(record)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    playoffAverage: ").append(toIndentedString(playoffAverage)).append("\n");
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

