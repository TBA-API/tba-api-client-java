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
import java.util.ArrayList;
import java.util.List;
import net.thefletcher.tbaapi.v3client.model.EventRankingExtraStatsInfo;
import net.thefletcher.tbaapi.v3client.model.EventRankingRankings;
import net.thefletcher.tbaapi.v3client.model.EventRankingSortOrderInfo;

/**
 * EventRanking
 */

public class EventRanking {
  public static final String SERIALIZED_NAME_RANKINGS = "rankings";
  @SerializedName(SERIALIZED_NAME_RANKINGS)
  private List<EventRankingRankings> rankings = new ArrayList<EventRankingRankings>();

  public static final String SERIALIZED_NAME_EXTRA_STATS_INFO = "extra_stats_info";
  @SerializedName(SERIALIZED_NAME_EXTRA_STATS_INFO)
  private List<EventRankingExtraStatsInfo> extraStatsInfo = new ArrayList<EventRankingExtraStatsInfo>();

  public static final String SERIALIZED_NAME_SORT_ORDER_INFO = "sort_order_info";
  @SerializedName(SERIALIZED_NAME_SORT_ORDER_INFO)
  private List<EventRankingSortOrderInfo> sortOrderInfo = new ArrayList<EventRankingSortOrderInfo>();

  public EventRanking rankings(List<EventRankingRankings> rankings) {
    this.rankings = rankings;
    return this;
  }

  public EventRanking addRankingsItem(EventRankingRankings rankingsItem) {
    this.rankings.add(rankingsItem);
    return this;
  }

   /**
   * List of rankings at the event.
   * @return rankings
  **/
  @ApiModelProperty(required = true, value = "List of rankings at the event.")
  public List<EventRankingRankings> getRankings() {
    return rankings;
  }

  public void setRankings(List<EventRankingRankings> rankings) {
    this.rankings = rankings;
  }

  public EventRanking extraStatsInfo(List<EventRankingExtraStatsInfo> extraStatsInfo) {
    this.extraStatsInfo = extraStatsInfo;
    return this;
  }

  public EventRanking addExtraStatsInfoItem(EventRankingExtraStatsInfo extraStatsInfoItem) {
    if (this.extraStatsInfo == null) {
      this.extraStatsInfo = new ArrayList<EventRankingExtraStatsInfo>();
    }
    this.extraStatsInfo.add(extraStatsInfoItem);
    return this;
  }

   /**
   * List of special TBA-generated values provided in the &#x60;extra_stats&#x60; array for each item.
   * @return extraStatsInfo
  **/
  @ApiModelProperty(value = "List of special TBA-generated values provided in the `extra_stats` array for each item.")
  public List<EventRankingExtraStatsInfo> getExtraStatsInfo() {
    return extraStatsInfo;
  }

  public void setExtraStatsInfo(List<EventRankingExtraStatsInfo> extraStatsInfo) {
    this.extraStatsInfo = extraStatsInfo;
  }

  public EventRanking sortOrderInfo(List<EventRankingSortOrderInfo> sortOrderInfo) {
    this.sortOrderInfo = sortOrderInfo;
    return this;
  }

  public EventRanking addSortOrderInfoItem(EventRankingSortOrderInfo sortOrderInfoItem) {
    this.sortOrderInfo.add(sortOrderInfoItem);
    return this;
  }

   /**
   * List of year-specific values provided in the &#x60;sort_orders&#x60; array for each team.
   * @return sortOrderInfo
  **/
  @ApiModelProperty(required = true, value = "List of year-specific values provided in the `sort_orders` array for each team.")
  public List<EventRankingSortOrderInfo> getSortOrderInfo() {
    return sortOrderInfo;
  }

  public void setSortOrderInfo(List<EventRankingSortOrderInfo> sortOrderInfo) {
    this.sortOrderInfo = sortOrderInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventRanking eventRanking = (EventRanking) o;
    return Objects.equals(this.rankings, eventRanking.rankings) &&
        Objects.equals(this.extraStatsInfo, eventRanking.extraStatsInfo) &&
        Objects.equals(this.sortOrderInfo, eventRanking.sortOrderInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rankings, extraStatsInfo, sortOrderInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventRanking {\n");
    sb.append("    rankings: ").append(toIndentedString(rankings)).append("\n");
    sb.append("    extraStatsInfo: ").append(toIndentedString(extraStatsInfo)).append("\n");
    sb.append("    sortOrderInfo: ").append(toIndentedString(sortOrderInfo)).append("\n");
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

