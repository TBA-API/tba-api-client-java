# EventApi

All URIs are relative to *https://www.thebluealliance.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDistrictEvents**](EventApi.md#getDistrictEvents) | **GET** /district/{district_key}/events | 
[**getDistrictEventsKeys**](EventApi.md#getDistrictEventsKeys) | **GET** /district/{district_key}/events/keys | 
[**getDistrictEventsSimple**](EventApi.md#getDistrictEventsSimple) | **GET** /district/{district_key}/events/simple | 
[**getEvent**](EventApi.md#getEvent) | **GET** /event/{event_key} | 
[**getEventAlliances**](EventApi.md#getEventAlliances) | **GET** /event/{event_key}/alliances | 
[**getEventAwards**](EventApi.md#getEventAwards) | **GET** /event/{event_key}/awards | 
[**getEventDistrictPoints**](EventApi.md#getEventDistrictPoints) | **GET** /event/{event_key}/district_points | 
[**getEventInsights**](EventApi.md#getEventInsights) | **GET** /event/{event_key}/insights | 
[**getEventMatchTimeseries**](EventApi.md#getEventMatchTimeseries) | **GET** /event/{event_key}/matches/timeseries | 
[**getEventMatches**](EventApi.md#getEventMatches) | **GET** /event/{event_key}/matches | 
[**getEventMatchesKeys**](EventApi.md#getEventMatchesKeys) | **GET** /event/{event_key}/matches/keys | 
[**getEventMatchesSimple**](EventApi.md#getEventMatchesSimple) | **GET** /event/{event_key}/matches/simple | 
[**getEventOPRs**](EventApi.md#getEventOPRs) | **GET** /event/{event_key}/oprs | 
[**getEventPredictions**](EventApi.md#getEventPredictions) | **GET** /event/{event_key}/predictions | 
[**getEventRankings**](EventApi.md#getEventRankings) | **GET** /event/{event_key}/rankings | 
[**getEventSimple**](EventApi.md#getEventSimple) | **GET** /event/{event_key}/simple | 
[**getEventTeams**](EventApi.md#getEventTeams) | **GET** /event/{event_key}/teams | 
[**getEventTeamsKeys**](EventApi.md#getEventTeamsKeys) | **GET** /event/{event_key}/teams/keys | 
[**getEventTeamsSimple**](EventApi.md#getEventTeamsSimple) | **GET** /event/{event_key}/teams/simple | 
[**getEventTeamsStatuses**](EventApi.md#getEventTeamsStatuses) | **GET** /event/{event_key}/teams/statuses | 
[**getEventsByYear**](EventApi.md#getEventsByYear) | **GET** /events/{year} | 
[**getEventsByYearKeys**](EventApi.md#getEventsByYearKeys) | **GET** /events/{year}/keys | 
[**getEventsByYearSimple**](EventApi.md#getEventsByYearSimple) | **GET** /events/{year}/simple | 
[**getTeamEventAwards**](EventApi.md#getTeamEventAwards) | **GET** /team/{team_key}/event/{event_key}/awards | 
[**getTeamEventMatches**](EventApi.md#getTeamEventMatches) | **GET** /team/{team_key}/event/{event_key}/matches | 
[**getTeamEventMatchesKeys**](EventApi.md#getTeamEventMatchesKeys) | **GET** /team/{team_key}/event/{event_key}/matches/keys | 
[**getTeamEventMatchesSimple**](EventApi.md#getTeamEventMatchesSimple) | **GET** /team/{team_key}/event/{event_key}/matches/simple | 
[**getTeamEventStatus**](EventApi.md#getTeamEventStatus) | **GET** /team/{team_key}/event/{event_key}/status | 
[**getTeamEvents**](EventApi.md#getTeamEvents) | **GET** /team/{team_key}/events | 
[**getTeamEventsByYear**](EventApi.md#getTeamEventsByYear) | **GET** /team/{team_key}/events/{year} | 
[**getTeamEventsByYearKeys**](EventApi.md#getTeamEventsByYearKeys) | **GET** /team/{team_key}/events/{year}/keys | 
[**getTeamEventsByYearSimple**](EventApi.md#getTeamEventsByYearSimple) | **GET** /team/{team_key}/events/{year}/simple | 
[**getTeamEventsKeys**](EventApi.md#getTeamEventsKeys) | **GET** /team/{team_key}/events/keys | 
[**getTeamEventsSimple**](EventApi.md#getTeamEventsSimple) | **GET** /team/{team_key}/events/simple | 
[**getTeamEventsStatusesByYear**](EventApi.md#getTeamEventsStatusesByYear) | **GET** /team/{team_key}/events/{year}/statuses | 


<a name="getDistrictEvents"></a>
# **getDistrictEvents**
> List&lt;Event&gt; getDistrictEvents()



Gets a list of events in the given district.

### Example
```java
// Import classes:
//import net.thefletcher.tbaapi.v3client.ApiClient;
//import net.thefletcher.tbaapi.v3client.ApiException;
//import net.thefletcher.tbaapi.v3client.Configuration;
//import net.thefletcher.tbaapi.v3client.auth.*;
//import net.thefletcher.tbaapi.v3client.api.EventApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

EventApi apiInstance = new EventApi();
try {
    List<Event> result = apiInstance.getDistrictEvents();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#getDistrictEvents");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Event&gt;**](Event.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDistrictEventsKeys"></a>
# **getDistrictEventsKeys**
> List&lt;String&gt; getDistrictEventsKeys()



Gets a list of event keys for events in the given district.

### Example
```java
// Import classes:
//import net.thefletcher.tbaapi.v3client.ApiClient;
//import net.thefletcher.tbaapi.v3client.ApiException;
//import net.thefletcher.tbaapi.v3client.Configuration;
//import net.thefletcher.tbaapi.v3client.auth.*;
//import net.thefletcher.tbaapi.v3client.api.EventApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

EventApi apiInstance = new EventApi();
try {
    List<String> result = apiInstance.getDistrictEventsKeys();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#getDistrictEventsKeys");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDistrictEventsSimple"></a>
# **getDistrictEventsSimple**
> List&lt;EventSimple&gt; getDistrictEventsSimple(districtKey)



Gets a short-form list of events in the given district.

### Example
```java
// Import classes:
//import net.thefletcher.tbaapi.v3client.ApiClient;
//import net.thefletcher.tbaapi.v3client.ApiException;
//import net.thefletcher.tbaapi.v3client.Configuration;
//import net.thefletcher.tbaapi.v3client.auth.*;
//import net.thefletcher.tbaapi.v3client.api.EventApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

EventApi apiInstance = new EventApi();
String districtKey = "districtKey_example"; // String | TBA District Key, eg `2016fim`
try {
    List<EventSimple> result = apiInstance.getDistrictEventsSimple(districtKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#getDistrictEventsSimple");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **districtKey** | **String**| TBA District Key, eg &#x60;2016fim&#x60; |

### Return type

[**List&lt;EventSimple&gt;**](EventSimple.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEvent"></a>
# **getEvent**
> Event getEvent()



Gets an Event.

### Example
```java
// Import classes:
//import net.thefletcher.tbaapi.v3client.ApiClient;
//import net.thefletcher.tbaapi.v3client.ApiException;
//import net.thefletcher.tbaapi.v3client.Configuration;
//import net.thefletcher.tbaapi.v3client.auth.*;
//import net.thefletcher.tbaapi.v3client.api.EventApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

EventApi apiInstance = new EventApi();
try {
    Event result = apiInstance.getEvent();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#getEvent");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Event**](Event.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEventAlliances"></a>
# **getEventAlliances**
> List&lt;EliminationAlliance&gt; getEventAlliances()



Gets a list of Elimination Alliances for the given Event.

### Example
```java
// Import classes:
//import net.thefletcher.tbaapi.v3client.ApiClient;
//import net.thefletcher.tbaapi.v3client.ApiException;
//import net.thefletcher.tbaapi.v3client.Configuration;
//import net.thefletcher.tbaapi.v3client.auth.*;
//import net.thefletcher.tbaapi.v3client.api.EventApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

EventApi apiInstance = new EventApi();
try {
    List<EliminationAlliance> result = apiInstance.getEventAlliances();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#getEventAlliances");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;EliminationAlliance&gt;**](EliminationAlliance.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEventAwards"></a>
# **getEventAwards**
> List&lt;Award&gt; getEventAwards()



Gets a list of awards from the given event.

### Example
```java
// Import classes:
//import net.thefletcher.tbaapi.v3client.ApiClient;
//import net.thefletcher.tbaapi.v3client.ApiException;
//import net.thefletcher.tbaapi.v3client.Configuration;
//import net.thefletcher.tbaapi.v3client.auth.*;
//import net.thefletcher.tbaapi.v3client.api.EventApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

EventApi apiInstance = new EventApi();
try {
    List<Award> result = apiInstance.getEventAwards();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#getEventAwards");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Award&gt;**](Award.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEventDistrictPoints"></a>
# **getEventDistrictPoints**
> EventDistrictPoints getEventDistrictPoints()



Gets a list of team rankings for the Event.

### Example
```java
// Import classes:
//import net.thefletcher.tbaapi.v3client.ApiClient;
//import net.thefletcher.tbaapi.v3client.ApiException;
//import net.thefletcher.tbaapi.v3client.Configuration;
//import net.thefletcher.tbaapi.v3client.auth.*;
//import net.thefletcher.tbaapi.v3client.api.EventApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

EventApi apiInstance = new EventApi();
try {
    EventDistrictPoints result = apiInstance.getEventDistrictPoints();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#getEventDistrictPoints");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**EventDistrictPoints**](EventDistrictPoints.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEventInsights"></a>
# **getEventInsights**
> EventInsights getEventInsights()



Gets a set of Event-specific insights for the given Event.

### Example
```java
// Import classes:
//import net.thefletcher.tbaapi.v3client.ApiClient;
//import net.thefletcher.tbaapi.v3client.ApiException;
//import net.thefletcher.tbaapi.v3client.Configuration;
//import net.thefletcher.tbaapi.v3client.auth.*;
//import net.thefletcher.tbaapi.v3client.api.EventApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

EventApi apiInstance = new EventApi();
try {
    EventInsights result = apiInstance.getEventInsights();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#getEventInsights");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**EventInsights**](EventInsights.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEventMatchTimeseries"></a>
# **getEventMatchTimeseries**
> List&lt;String&gt; getEventMatchTimeseries()



Gets an array of Match Keys for the given event key that have timeseries data. Returns an empty array if no matches have timeseries data. *WARNING:* This is *not* official data, and is subject to a significant possibility of error, or missing data. Do not rely on this data for any purpose. In fact, pretend we made it up. *WARNING:* This endpoint and corresponding data models are under *active development* and may change at any time, including in breaking ways.

### Example
```java
// Import classes:
//import net.thefletcher.tbaapi.v3client.ApiClient;
//import net.thefletcher.tbaapi.v3client.ApiException;
//import net.thefletcher.tbaapi.v3client.Configuration;
//import net.thefletcher.tbaapi.v3client.auth.*;
//import net.thefletcher.tbaapi.v3client.api.EventApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

EventApi apiInstance = new EventApi();
try {
    List<String> result = apiInstance.getEventMatchTimeseries();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#getEventMatchTimeseries");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEventMatches"></a>
# **getEventMatches**
> List&lt;Match&gt; getEventMatches()



Gets a list of matches for the given event.

### Example
```java
// Import classes:
//import net.thefletcher.tbaapi.v3client.ApiClient;
//import net.thefletcher.tbaapi.v3client.ApiException;
//import net.thefletcher.tbaapi.v3client.Configuration;
//import net.thefletcher.tbaapi.v3client.auth.*;
//import net.thefletcher.tbaapi.v3client.api.EventApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

EventApi apiInstance = new EventApi();
try {
    List<Match> result = apiInstance.getEventMatches();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#getEventMatches");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Match&gt;**](Match.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEventMatchesKeys"></a>
# **getEventMatchesKeys**
> List&lt;String&gt; getEventMatchesKeys()



Gets a list of match keys for the given event.

### Example
```java
// Import classes:
//import net.thefletcher.tbaapi.v3client.ApiClient;
//import net.thefletcher.tbaapi.v3client.ApiException;
//import net.thefletcher.tbaapi.v3client.Configuration;
//import net.thefletcher.tbaapi.v3client.auth.*;
//import net.thefletcher.tbaapi.v3client.api.EventApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

EventApi apiInstance = new EventApi();
try {
    List<String> result = apiInstance.getEventMatchesKeys();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#getEventMatchesKeys");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEventMatchesSimple"></a>
# **getEventMatchesSimple**
> List&lt;MatchSimple&gt; getEventMatchesSimple()



Gets a short-form list of matches for the given event.

### Example
```java
// Import classes:
//import net.thefletcher.tbaapi.v3client.ApiClient;
//import net.thefletcher.tbaapi.v3client.ApiException;
//import net.thefletcher.tbaapi.v3client.Configuration;
//import net.thefletcher.tbaapi.v3client.auth.*;
//import net.thefletcher.tbaapi.v3client.api.EventApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

EventApi apiInstance = new EventApi();
try {
    List<MatchSimple> result = apiInstance.getEventMatchesSimple();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#getEventMatchesSimple");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;MatchSimple&gt;**](MatchSimple.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEventOPRs"></a>
# **getEventOPRs**
> EventOPRs getEventOPRs()



Gets a set of Event OPRs (including OPR, DPR, and CCWM) for the given Event.

### Example
```java
// Import classes:
//import net.thefletcher.tbaapi.v3client.ApiClient;
//import net.thefletcher.tbaapi.v3client.ApiException;
//import net.thefletcher.tbaapi.v3client.Configuration;
//import net.thefletcher.tbaapi.v3client.auth.*;
//import net.thefletcher.tbaapi.v3client.api.EventApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

EventApi apiInstance = new EventApi();
try {
    EventOPRs result = apiInstance.getEventOPRs();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#getEventOPRs");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**EventOPRs**](EventOPRs.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEventPredictions"></a>
# **getEventPredictions**
> Object getEventPredictions()



Gets information on TBA-generated predictions for the given Event. Contains year-specific information. *WARNING* This endpoint is currently under development and may change at any time.

### Example
```java
// Import classes:
//import net.thefletcher.tbaapi.v3client.ApiClient;
//import net.thefletcher.tbaapi.v3client.ApiException;
//import net.thefletcher.tbaapi.v3client.Configuration;
//import net.thefletcher.tbaapi.v3client.auth.*;
//import net.thefletcher.tbaapi.v3client.api.EventApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

EventApi apiInstance = new EventApi();
try {
    Object result = apiInstance.getEventPredictions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#getEventPredictions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEventRankings"></a>
# **getEventRankings**
> EventRanking getEventRankings()



Gets a list of team rankings for the Event.

### Example
```java
// Import classes:
//import net.thefletcher.tbaapi.v3client.ApiClient;
//import net.thefletcher.tbaapi.v3client.ApiException;
//import net.thefletcher.tbaapi.v3client.Configuration;
//import net.thefletcher.tbaapi.v3client.auth.*;
//import net.thefletcher.tbaapi.v3client.api.EventApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

EventApi apiInstance = new EventApi();
try {
    EventRanking result = apiInstance.getEventRankings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#getEventRankings");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**EventRanking**](EventRanking.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEventSimple"></a>
# **getEventSimple**
> EventSimple getEventSimple()



Gets a short-form Event.

### Example
```java
// Import classes:
//import net.thefletcher.tbaapi.v3client.ApiClient;
//import net.thefletcher.tbaapi.v3client.ApiException;
//import net.thefletcher.tbaapi.v3client.Configuration;
//import net.thefletcher.tbaapi.v3client.auth.*;
//import net.thefletcher.tbaapi.v3client.api.EventApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

EventApi apiInstance = new EventApi();
try {
    EventSimple result = apiInstance.getEventSimple();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#getEventSimple");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**EventSimple**](EventSimple.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEventTeams"></a>
# **getEventTeams**
> List&lt;Team&gt; getEventTeams()



Gets a list of &#x60;Team&#x60; objects that competed in the given event.

### Example
```java
// Import classes:
//import net.thefletcher.tbaapi.v3client.ApiClient;
//import net.thefletcher.tbaapi.v3client.ApiException;
//import net.thefletcher.tbaapi.v3client.Configuration;
//import net.thefletcher.tbaapi.v3client.auth.*;
//import net.thefletcher.tbaapi.v3client.api.EventApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

EventApi apiInstance = new EventApi();
try {
    List<Team> result = apiInstance.getEventTeams();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#getEventTeams");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Team&gt;**](Team.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEventTeamsKeys"></a>
# **getEventTeamsKeys**
> List&lt;String&gt; getEventTeamsKeys()



Gets a list of &#x60;Team&#x60; keys that competed in the given event.

### Example
```java
// Import classes:
//import net.thefletcher.tbaapi.v3client.ApiClient;
//import net.thefletcher.tbaapi.v3client.ApiException;
//import net.thefletcher.tbaapi.v3client.Configuration;
//import net.thefletcher.tbaapi.v3client.auth.*;
//import net.thefletcher.tbaapi.v3client.api.EventApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

EventApi apiInstance = new EventApi();
try {
    List<String> result = apiInstance.getEventTeamsKeys();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#getEventTeamsKeys");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEventTeamsSimple"></a>
# **getEventTeamsSimple**
> List&lt;TeamSimple&gt; getEventTeamsSimple()



Gets a short-form list of &#x60;Team&#x60; objects that competed in the given event.

### Example
```java
// Import classes:
//import net.thefletcher.tbaapi.v3client.ApiClient;
//import net.thefletcher.tbaapi.v3client.ApiException;
//import net.thefletcher.tbaapi.v3client.Configuration;
//import net.thefletcher.tbaapi.v3client.auth.*;
//import net.thefletcher.tbaapi.v3client.api.EventApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

EventApi apiInstance = new EventApi();
try {
    List<TeamSimple> result = apiInstance.getEventTeamsSimple();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#getEventTeamsSimple");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;TeamSimple&gt;**](TeamSimple.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEventTeamsStatuses"></a>
# **getEventTeamsStatuses**
> Map&lt;String, TeamEventStatus&gt; getEventTeamsStatuses()



Gets a key-value list of the event statuses for teams competing at the given event.

### Example
```java
// Import classes:
//import net.thefletcher.tbaapi.v3client.ApiClient;
//import net.thefletcher.tbaapi.v3client.ApiException;
//import net.thefletcher.tbaapi.v3client.Configuration;
//import net.thefletcher.tbaapi.v3client.auth.*;
//import net.thefletcher.tbaapi.v3client.api.EventApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

EventApi apiInstance = new EventApi();
try {
    Map<String, TeamEventStatus> result = apiInstance.getEventTeamsStatuses();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#getEventTeamsStatuses");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Map&lt;String, TeamEventStatus&gt;**](TeamEventStatus.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEventsByYear"></a>
# **getEventsByYear**
> List&lt;Event&gt; getEventsByYear()



Gets a list of events in the given year.

### Example
```java
// Import classes:
//import net.thefletcher.tbaapi.v3client.ApiClient;
//import net.thefletcher.tbaapi.v3client.ApiException;
//import net.thefletcher.tbaapi.v3client.Configuration;
//import net.thefletcher.tbaapi.v3client.auth.*;
//import net.thefletcher.tbaapi.v3client.api.EventApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

EventApi apiInstance = new EventApi();
try {
    List<Event> result = apiInstance.getEventsByYear();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#getEventsByYear");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Event&gt;**](Event.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEventsByYearKeys"></a>
# **getEventsByYearKeys**
> List&lt;String&gt; getEventsByYearKeys()



Gets a list of event keys in the given year.

### Example
```java
// Import classes:
//import net.thefletcher.tbaapi.v3client.ApiClient;
//import net.thefletcher.tbaapi.v3client.ApiException;
//import net.thefletcher.tbaapi.v3client.Configuration;
//import net.thefletcher.tbaapi.v3client.auth.*;
//import net.thefletcher.tbaapi.v3client.api.EventApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

EventApi apiInstance = new EventApi();
try {
    List<String> result = apiInstance.getEventsByYearKeys();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#getEventsByYearKeys");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEventsByYearSimple"></a>
# **getEventsByYearSimple**
> List&lt;EventSimple&gt; getEventsByYearSimple()



Gets a short-form list of events in the given year.

### Example
```java
// Import classes:
//import net.thefletcher.tbaapi.v3client.ApiClient;
//import net.thefletcher.tbaapi.v3client.ApiException;
//import net.thefletcher.tbaapi.v3client.Configuration;
//import net.thefletcher.tbaapi.v3client.auth.*;
//import net.thefletcher.tbaapi.v3client.api.EventApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

EventApi apiInstance = new EventApi();
try {
    List<EventSimple> result = apiInstance.getEventsByYearSimple();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#getEventsByYearSimple");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;EventSimple&gt;**](EventSimple.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeamEventAwards"></a>
# **getTeamEventAwards**
> List&lt;Award&gt; getTeamEventAwards()



Gets a list of awards the given team won at the given event.

### Example
```java
// Import classes:
//import net.thefletcher.tbaapi.v3client.ApiClient;
//import net.thefletcher.tbaapi.v3client.ApiException;
//import net.thefletcher.tbaapi.v3client.Configuration;
//import net.thefletcher.tbaapi.v3client.auth.*;
//import net.thefletcher.tbaapi.v3client.api.EventApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

EventApi apiInstance = new EventApi();
try {
    List<Award> result = apiInstance.getTeamEventAwards();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#getTeamEventAwards");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Award&gt;**](Award.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeamEventMatches"></a>
# **getTeamEventMatches**
> List&lt;Match&gt; getTeamEventMatches()



Gets a list of matches for the given team and event.

### Example
```java
// Import classes:
//import net.thefletcher.tbaapi.v3client.ApiClient;
//import net.thefletcher.tbaapi.v3client.ApiException;
//import net.thefletcher.tbaapi.v3client.Configuration;
//import net.thefletcher.tbaapi.v3client.auth.*;
//import net.thefletcher.tbaapi.v3client.api.EventApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

EventApi apiInstance = new EventApi();
try {
    List<Match> result = apiInstance.getTeamEventMatches();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#getTeamEventMatches");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Match&gt;**](Match.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeamEventMatchesKeys"></a>
# **getTeamEventMatchesKeys**
> List&lt;String&gt; getTeamEventMatchesKeys()



Gets a list of match keys for matches for the given team and event.

### Example
```java
// Import classes:
//import net.thefletcher.tbaapi.v3client.ApiClient;
//import net.thefletcher.tbaapi.v3client.ApiException;
//import net.thefletcher.tbaapi.v3client.Configuration;
//import net.thefletcher.tbaapi.v3client.auth.*;
//import net.thefletcher.tbaapi.v3client.api.EventApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

EventApi apiInstance = new EventApi();
try {
    List<String> result = apiInstance.getTeamEventMatchesKeys();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#getTeamEventMatchesKeys");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeamEventMatchesSimple"></a>
# **getTeamEventMatchesSimple**
> List&lt;Match&gt; getTeamEventMatchesSimple()



Gets a short-form list of matches for the given team and event.

### Example
```java
// Import classes:
//import net.thefletcher.tbaapi.v3client.ApiClient;
//import net.thefletcher.tbaapi.v3client.ApiException;
//import net.thefletcher.tbaapi.v3client.Configuration;
//import net.thefletcher.tbaapi.v3client.auth.*;
//import net.thefletcher.tbaapi.v3client.api.EventApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

EventApi apiInstance = new EventApi();
try {
    List<Match> result = apiInstance.getTeamEventMatchesSimple();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#getTeamEventMatchesSimple");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Match&gt;**](Match.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeamEventStatus"></a>
# **getTeamEventStatus**
> TeamEventStatus getTeamEventStatus()



Gets the competition rank and status of the team at the given event.

### Example
```java
// Import classes:
//import net.thefletcher.tbaapi.v3client.ApiClient;
//import net.thefletcher.tbaapi.v3client.ApiException;
//import net.thefletcher.tbaapi.v3client.Configuration;
//import net.thefletcher.tbaapi.v3client.auth.*;
//import net.thefletcher.tbaapi.v3client.api.EventApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

EventApi apiInstance = new EventApi();
try {
    TeamEventStatus result = apiInstance.getTeamEventStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#getTeamEventStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**TeamEventStatus**](TeamEventStatus.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeamEvents"></a>
# **getTeamEvents**
> List&lt;Event&gt; getTeamEvents()



Gets a list of all events this team has competed at.

### Example
```java
// Import classes:
//import net.thefletcher.tbaapi.v3client.ApiClient;
//import net.thefletcher.tbaapi.v3client.ApiException;
//import net.thefletcher.tbaapi.v3client.Configuration;
//import net.thefletcher.tbaapi.v3client.auth.*;
//import net.thefletcher.tbaapi.v3client.api.EventApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

EventApi apiInstance = new EventApi();
try {
    List<Event> result = apiInstance.getTeamEvents();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#getTeamEvents");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Event&gt;**](Event.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeamEventsByYear"></a>
# **getTeamEventsByYear**
> List&lt;Event&gt; getTeamEventsByYear()



Gets a list of events this team has competed at in the given year.

### Example
```java
// Import classes:
//import net.thefletcher.tbaapi.v3client.ApiClient;
//import net.thefletcher.tbaapi.v3client.ApiException;
//import net.thefletcher.tbaapi.v3client.Configuration;
//import net.thefletcher.tbaapi.v3client.auth.*;
//import net.thefletcher.tbaapi.v3client.api.EventApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

EventApi apiInstance = new EventApi();
try {
    List<Event> result = apiInstance.getTeamEventsByYear();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#getTeamEventsByYear");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Event&gt;**](Event.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeamEventsByYearKeys"></a>
# **getTeamEventsByYearKeys**
> List&lt;String&gt; getTeamEventsByYearKeys()



Gets a list of the event keys for events this team has competed at in the given year.

### Example
```java
// Import classes:
//import net.thefletcher.tbaapi.v3client.ApiClient;
//import net.thefletcher.tbaapi.v3client.ApiException;
//import net.thefletcher.tbaapi.v3client.Configuration;
//import net.thefletcher.tbaapi.v3client.auth.*;
//import net.thefletcher.tbaapi.v3client.api.EventApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

EventApi apiInstance = new EventApi();
try {
    List<String> result = apiInstance.getTeamEventsByYearKeys();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#getTeamEventsByYearKeys");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeamEventsByYearSimple"></a>
# **getTeamEventsByYearSimple**
> List&lt;EventSimple&gt; getTeamEventsByYearSimple()



Gets a short-form list of events this team has competed at in the given year.

### Example
```java
// Import classes:
//import net.thefletcher.tbaapi.v3client.ApiClient;
//import net.thefletcher.tbaapi.v3client.ApiException;
//import net.thefletcher.tbaapi.v3client.Configuration;
//import net.thefletcher.tbaapi.v3client.auth.*;
//import net.thefletcher.tbaapi.v3client.api.EventApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

EventApi apiInstance = new EventApi();
try {
    List<EventSimple> result = apiInstance.getTeamEventsByYearSimple();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#getTeamEventsByYearSimple");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;EventSimple&gt;**](EventSimple.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeamEventsKeys"></a>
# **getTeamEventsKeys**
> List&lt;String&gt; getTeamEventsKeys()



Gets a list of the event keys for all events this team has competed at.

### Example
```java
// Import classes:
//import net.thefletcher.tbaapi.v3client.ApiClient;
//import net.thefletcher.tbaapi.v3client.ApiException;
//import net.thefletcher.tbaapi.v3client.Configuration;
//import net.thefletcher.tbaapi.v3client.auth.*;
//import net.thefletcher.tbaapi.v3client.api.EventApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

EventApi apiInstance = new EventApi();
try {
    List<String> result = apiInstance.getTeamEventsKeys();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#getTeamEventsKeys");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeamEventsSimple"></a>
# **getTeamEventsSimple**
> List&lt;EventSimple&gt; getTeamEventsSimple()



Gets a short-form list of all events this team has competed at.

### Example
```java
// Import classes:
//import net.thefletcher.tbaapi.v3client.ApiClient;
//import net.thefletcher.tbaapi.v3client.ApiException;
//import net.thefletcher.tbaapi.v3client.Configuration;
//import net.thefletcher.tbaapi.v3client.auth.*;
//import net.thefletcher.tbaapi.v3client.api.EventApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

EventApi apiInstance = new EventApi();
try {
    List<EventSimple> result = apiInstance.getTeamEventsSimple();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#getTeamEventsSimple");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;EventSimple&gt;**](EventSimple.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeamEventsStatusesByYear"></a>
# **getTeamEventsStatusesByYear**
> Map&lt;String, TeamEventStatus&gt; getTeamEventsStatusesByYear()



Gets a key-value list of the event statuses for events this team has competed at in the given year.

### Example
```java
// Import classes:
//import net.thefletcher.tbaapi.v3client.ApiClient;
//import net.thefletcher.tbaapi.v3client.ApiException;
//import net.thefletcher.tbaapi.v3client.Configuration;
//import net.thefletcher.tbaapi.v3client.auth.*;
//import net.thefletcher.tbaapi.v3client.api.EventApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

EventApi apiInstance = new EventApi();
try {
    Map<String, TeamEventStatus> result = apiInstance.getTeamEventsStatusesByYear();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#getTeamEventsStatusesByYear");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Map&lt;String, TeamEventStatus&gt;**](TeamEventStatus.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

