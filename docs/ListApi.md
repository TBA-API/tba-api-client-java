# ListApi

All URIs are relative to *https://www.thebluealliance.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDistrictEvents**](ListApi.md#getDistrictEvents) | **GET** /district/{district_key}/events | 
[**getDistrictEventsKeys**](ListApi.md#getDistrictEventsKeys) | **GET** /district/{district_key}/events/keys | 
[**getDistrictEventsSimple**](ListApi.md#getDistrictEventsSimple) | **GET** /district/{district_key}/events/simple | 
[**getDistrictRankings**](ListApi.md#getDistrictRankings) | **GET** /district/{district_key}/rankings | 
[**getDistrictTeams**](ListApi.md#getDistrictTeams) | **GET** /district/{district_key}/teams | 
[**getDistrictTeamsKeys**](ListApi.md#getDistrictTeamsKeys) | **GET** /district/{district_key}/teams/keys | 
[**getDistrictTeamsSimple**](ListApi.md#getDistrictTeamsSimple) | **GET** /district/{district_key}/teams/simple | 
[**getEventTeams**](ListApi.md#getEventTeams) | **GET** /event/{event_key}/teams | 
[**getEventTeamsKeys**](ListApi.md#getEventTeamsKeys) | **GET** /event/{event_key}/teams/keys | 
[**getEventTeamsSimple**](ListApi.md#getEventTeamsSimple) | **GET** /event/{event_key}/teams/simple | 
[**getEventTeamsStatuses**](ListApi.md#getEventTeamsStatuses) | **GET** /event/{event_key}/teams/statuses | 
[**getEventsByYear**](ListApi.md#getEventsByYear) | **GET** /events/{year} | 
[**getEventsByYearKeys**](ListApi.md#getEventsByYearKeys) | **GET** /events/{year}/keys | 
[**getEventsByYearSimple**](ListApi.md#getEventsByYearSimple) | **GET** /events/{year}/simple | 
[**getTeamEventsStatusesByYear**](ListApi.md#getTeamEventsStatusesByYear) | **GET** /team/{team_key}/events/{year}/statuses | 
[**getTeams**](ListApi.md#getTeams) | **GET** /teams/{page_num} | 
[**getTeamsByYear**](ListApi.md#getTeamsByYear) | **GET** /teams/{year}/{page_num} | 
[**getTeamsByYearKeys**](ListApi.md#getTeamsByYearKeys) | **GET** /teams/{year}/{page_num}/keys | 
[**getTeamsByYearSimple**](ListApi.md#getTeamsByYearSimple) | **GET** /teams/{year}/{page_num}/simple | 
[**getTeamsKeys**](ListApi.md#getTeamsKeys) | **GET** /teams/{page_num}/keys | 
[**getTeamsSimple**](ListApi.md#getTeamsSimple) | **GET** /teams/{page_num}/simple | 


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
//import net.thefletcher.tbaapi.v3client.api.ListApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ListApi apiInstance = new ListApi();
try {
    List<Event> result = apiInstance.getDistrictEvents();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListApi#getDistrictEvents");
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
//import net.thefletcher.tbaapi.v3client.api.ListApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ListApi apiInstance = new ListApi();
try {
    List<String> result = apiInstance.getDistrictEventsKeys();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListApi#getDistrictEventsKeys");
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
//import net.thefletcher.tbaapi.v3client.api.ListApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ListApi apiInstance = new ListApi();
String districtKey = "districtKey_example"; // String | TBA District Key, eg `2016fim`
try {
    List<EventSimple> result = apiInstance.getDistrictEventsSimple(districtKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListApi#getDistrictEventsSimple");
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

<a name="getDistrictRankings"></a>
# **getDistrictRankings**
> List&lt;DistrictRanking&gt; getDistrictRankings()



Gets a list of team district rankings for the given district.

### Example
```java
// Import classes:
//import net.thefletcher.tbaapi.v3client.ApiClient;
//import net.thefletcher.tbaapi.v3client.ApiException;
//import net.thefletcher.tbaapi.v3client.Configuration;
//import net.thefletcher.tbaapi.v3client.auth.*;
//import net.thefletcher.tbaapi.v3client.api.ListApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ListApi apiInstance = new ListApi();
try {
    List<DistrictRanking> result = apiInstance.getDistrictRankings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListApi#getDistrictRankings");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;DistrictRanking&gt;**](DistrictRanking.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDistrictTeams"></a>
# **getDistrictTeams**
> List&lt;Team&gt; getDistrictTeams()



Gets a list of &#x60;Team&#x60; objects that competed in events in the given district.

### Example
```java
// Import classes:
//import net.thefletcher.tbaapi.v3client.ApiClient;
//import net.thefletcher.tbaapi.v3client.ApiException;
//import net.thefletcher.tbaapi.v3client.Configuration;
//import net.thefletcher.tbaapi.v3client.auth.*;
//import net.thefletcher.tbaapi.v3client.api.ListApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ListApi apiInstance = new ListApi();
try {
    List<Team> result = apiInstance.getDistrictTeams();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListApi#getDistrictTeams");
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

<a name="getDistrictTeamsKeys"></a>
# **getDistrictTeamsKeys**
> List&lt;String&gt; getDistrictTeamsKeys()



Gets a list of &#x60;Team&#x60; objects that competed in events in the given district.

### Example
```java
// Import classes:
//import net.thefletcher.tbaapi.v3client.ApiClient;
//import net.thefletcher.tbaapi.v3client.ApiException;
//import net.thefletcher.tbaapi.v3client.Configuration;
//import net.thefletcher.tbaapi.v3client.auth.*;
//import net.thefletcher.tbaapi.v3client.api.ListApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ListApi apiInstance = new ListApi();
try {
    List<String> result = apiInstance.getDistrictTeamsKeys();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListApi#getDistrictTeamsKeys");
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

<a name="getDistrictTeamsSimple"></a>
# **getDistrictTeamsSimple**
> List&lt;TeamSimple&gt; getDistrictTeamsSimple()



Gets a short-form list of &#x60;Team&#x60; objects that competed in events in the given district.

### Example
```java
// Import classes:
//import net.thefletcher.tbaapi.v3client.ApiClient;
//import net.thefletcher.tbaapi.v3client.ApiException;
//import net.thefletcher.tbaapi.v3client.Configuration;
//import net.thefletcher.tbaapi.v3client.auth.*;
//import net.thefletcher.tbaapi.v3client.api.ListApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ListApi apiInstance = new ListApi();
try {
    List<TeamSimple> result = apiInstance.getDistrictTeamsSimple();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListApi#getDistrictTeamsSimple");
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
//import net.thefletcher.tbaapi.v3client.api.ListApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ListApi apiInstance = new ListApi();
try {
    List<Team> result = apiInstance.getEventTeams();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListApi#getEventTeams");
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
//import net.thefletcher.tbaapi.v3client.api.ListApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ListApi apiInstance = new ListApi();
try {
    List<String> result = apiInstance.getEventTeamsKeys();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListApi#getEventTeamsKeys");
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
//import net.thefletcher.tbaapi.v3client.api.ListApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ListApi apiInstance = new ListApi();
try {
    List<TeamSimple> result = apiInstance.getEventTeamsSimple();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListApi#getEventTeamsSimple");
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
//import net.thefletcher.tbaapi.v3client.api.ListApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ListApi apiInstance = new ListApi();
try {
    Map<String, TeamEventStatus> result = apiInstance.getEventTeamsStatuses();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListApi#getEventTeamsStatuses");
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
//import net.thefletcher.tbaapi.v3client.api.ListApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ListApi apiInstance = new ListApi();
try {
    List<Event> result = apiInstance.getEventsByYear();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListApi#getEventsByYear");
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
//import net.thefletcher.tbaapi.v3client.api.ListApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ListApi apiInstance = new ListApi();
try {
    List<String> result = apiInstance.getEventsByYearKeys();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListApi#getEventsByYearKeys");
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
//import net.thefletcher.tbaapi.v3client.api.ListApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ListApi apiInstance = new ListApi();
try {
    List<EventSimple> result = apiInstance.getEventsByYearSimple();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListApi#getEventsByYearSimple");
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
//import net.thefletcher.tbaapi.v3client.api.ListApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ListApi apiInstance = new ListApi();
try {
    Map<String, TeamEventStatus> result = apiInstance.getTeamEventsStatusesByYear();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListApi#getTeamEventsStatusesByYear");
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

<a name="getTeams"></a>
# **getTeams**
> List&lt;Team&gt; getTeams()



Gets a list of &#x60;Team&#x60; objects, paginated in groups of 500.

### Example
```java
// Import classes:
//import net.thefletcher.tbaapi.v3client.ApiClient;
//import net.thefletcher.tbaapi.v3client.ApiException;
//import net.thefletcher.tbaapi.v3client.Configuration;
//import net.thefletcher.tbaapi.v3client.auth.*;
//import net.thefletcher.tbaapi.v3client.api.ListApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ListApi apiInstance = new ListApi();
try {
    List<Team> result = apiInstance.getTeams();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListApi#getTeams");
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

<a name="getTeamsByYear"></a>
# **getTeamsByYear**
> List&lt;Team&gt; getTeamsByYear()



Gets a list of &#x60;Team&#x60; objects that competed in the given year, paginated in groups of 500.

### Example
```java
// Import classes:
//import net.thefletcher.tbaapi.v3client.ApiClient;
//import net.thefletcher.tbaapi.v3client.ApiException;
//import net.thefletcher.tbaapi.v3client.Configuration;
//import net.thefletcher.tbaapi.v3client.auth.*;
//import net.thefletcher.tbaapi.v3client.api.ListApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ListApi apiInstance = new ListApi();
try {
    List<Team> result = apiInstance.getTeamsByYear();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListApi#getTeamsByYear");
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

<a name="getTeamsByYearKeys"></a>
# **getTeamsByYearKeys**
> List&lt;String&gt; getTeamsByYearKeys()



Gets a list Team Keys that competed in the given year, paginated in groups of 500.

### Example
```java
// Import classes:
//import net.thefletcher.tbaapi.v3client.ApiClient;
//import net.thefletcher.tbaapi.v3client.ApiException;
//import net.thefletcher.tbaapi.v3client.Configuration;
//import net.thefletcher.tbaapi.v3client.auth.*;
//import net.thefletcher.tbaapi.v3client.api.ListApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ListApi apiInstance = new ListApi();
try {
    List<String> result = apiInstance.getTeamsByYearKeys();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListApi#getTeamsByYearKeys");
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

<a name="getTeamsByYearSimple"></a>
# **getTeamsByYearSimple**
> List&lt;TeamSimple&gt; getTeamsByYearSimple()



Gets a list of short form &#x60;Team_Simple&#x60; objects that competed in the given year, paginated in groups of 500.

### Example
```java
// Import classes:
//import net.thefletcher.tbaapi.v3client.ApiClient;
//import net.thefletcher.tbaapi.v3client.ApiException;
//import net.thefletcher.tbaapi.v3client.Configuration;
//import net.thefletcher.tbaapi.v3client.auth.*;
//import net.thefletcher.tbaapi.v3client.api.ListApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ListApi apiInstance = new ListApi();
try {
    List<TeamSimple> result = apiInstance.getTeamsByYearSimple();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListApi#getTeamsByYearSimple");
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

<a name="getTeamsKeys"></a>
# **getTeamsKeys**
> List&lt;String&gt; getTeamsKeys()



Gets a list of Team keys, paginated in groups of 500. (Note, each page will not have 500 teams, but will include the teams within that range of 500.)

### Example
```java
// Import classes:
//import net.thefletcher.tbaapi.v3client.ApiClient;
//import net.thefletcher.tbaapi.v3client.ApiException;
//import net.thefletcher.tbaapi.v3client.Configuration;
//import net.thefletcher.tbaapi.v3client.auth.*;
//import net.thefletcher.tbaapi.v3client.api.ListApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ListApi apiInstance = new ListApi();
try {
    List<String> result = apiInstance.getTeamsKeys();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListApi#getTeamsKeys");
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

<a name="getTeamsSimple"></a>
# **getTeamsSimple**
> List&lt;TeamSimple&gt; getTeamsSimple()



Gets a list of short form &#x60;Team_Simple&#x60; objects, paginated in groups of 500.

### Example
```java
// Import classes:
//import net.thefletcher.tbaapi.v3client.ApiClient;
//import net.thefletcher.tbaapi.v3client.ApiException;
//import net.thefletcher.tbaapi.v3client.Configuration;
//import net.thefletcher.tbaapi.v3client.auth.*;
//import net.thefletcher.tbaapi.v3client.api.ListApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ListApi apiInstance = new ListApi();
try {
    List<TeamSimple> result = apiInstance.getTeamsSimple();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListApi#getTeamsSimple");
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

