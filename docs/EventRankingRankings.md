
# EventRankingRankings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**matchesPlayed** | **Integer** | Number of matches played by this team. | 
**qualAverage** | **Integer** | The average match score during qualifications. Year specific. May be null if not relevant for a given year. |  [optional]
**extraStats** | [**List&lt;BigDecimal&gt;**](BigDecimal.md) | Additional special data on the team&#39;s performance calculated by TBA. |  [optional]
**sortOrders** | [**List&lt;BigDecimal&gt;**](BigDecimal.md) | Additional year-specific information, may be null. See parent &#x60;sort_order_info&#x60; for details. |  [optional]
**record** | [**WLTRecord**](WLTRecord.md) |  | 
**rank** | **Integer** | The team&#39;s rank at the event as provided by FIRST. | 
**dq** | **Integer** | Number of times disqualified. | 
**teamKey** | **String** | The team with this rank. | 



