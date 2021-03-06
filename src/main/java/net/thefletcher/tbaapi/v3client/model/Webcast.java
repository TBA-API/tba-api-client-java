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

/**
 * Webcast
 */

public class Webcast {
  /**
   * Type of webcast, typically descriptive of the streaming provider.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    YOUTUBE("youtube"),
    
    TWITCH("twitch"),
    
    USTREAM("ustream"),
    
    IFRAME("iframe"),
    
    HTML5("html5"),
    
    RTMP("rtmp"),
    
    LIVESTREAM("livestream"),
    
    DIRECT_LINK("direct_link"),
    
    MMS("mms"),
    
    JUSTIN("justin"),
    
    STEMTV("stemtv"),
    
    DACAST("dacast");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private String channel;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private String date;

  public static final String SERIALIZED_NAME_FILE = "file";
  @SerializedName(SERIALIZED_NAME_FILE)
  private String file;


  public Webcast type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type of webcast, typically descriptive of the streaming provider.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Type of webcast, typically descriptive of the streaming provider.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public Webcast channel(String channel) {
    
    this.channel = channel;
    return this;
  }

   /**
   * Type specific channel information. May be the YouTube stream, or Twitch channel name. In the case of iframe types, contains HTML to embed the stream in an HTML iframe.
   * @return channel
  **/
  @ApiModelProperty(required = true, value = "Type specific channel information. May be the YouTube stream, or Twitch channel name. In the case of iframe types, contains HTML to embed the stream in an HTML iframe.")

  public String getChannel() {
    return channel;
  }


  public void setChannel(String channel) {
    this.channel = channel;
  }


  public Webcast date(String date) {
    
    this.date = date;
    return this;
  }

   /**
   * The date for the webcast in &#x60;yyyy-mm-dd&#x60; format. May be null.
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date for the webcast in `yyyy-mm-dd` format. May be null.")

  public String getDate() {
    return date;
  }


  public void setDate(String date) {
    this.date = date;
  }


  public Webcast file(String file) {
    
    this.file = file;
    return this;
  }

   /**
   * File identification as may be required for some types. May be null.
   * @return file
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "File identification as may be required for some types. May be null.")

  public String getFile() {
    return file;
  }


  public void setFile(String file) {
    this.file = file;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Webcast webcast = (Webcast) o;
    return Objects.equals(this.type, webcast.type) &&
        Objects.equals(this.channel, webcast.channel) &&
        Objects.equals(this.date, webcast.date) &&
        Objects.equals(this.file, webcast.file);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, channel, date, file);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Webcast {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
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

