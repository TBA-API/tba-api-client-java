# TeamApi

All URIs are relative to *https://www.thebluealliance.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDistrictRankings**](TeamApi.md#getDistrictRankings) | **GET** /district/{district_key}/rankings | 
[**getDistrictTeams**](TeamApi.md#getDistrictTeams) | **GET** /district/{district_key}/teams | 
[**getDistrictTeamsKeys**](TeamApi.md#getDistrictTeamsKeys) | **GET** /district/{district_key}/teams/keys | 
[**getDistrictTeamsSimple**](TeamApi.md#getDistrictTeamsSimple) | **GET** /district/{district_key}/teams/simple | 
[**getEventTeams**](TeamApi.md#getEventTeams) | **GET** /event/{event_key}/teams | 
[**getEventTeamsKeys**](TeamApi.md#getEventTeamsKeys) | **GET** /event/{event_key}/teams/keys | 
[**getEventTeamsSimple**](TeamApi.md#getEventTeamsSimple) | **GET** /event/{event_key}/teams/simple | 
[**getEventTeamsStatuses**](TeamApi.md#getEventTeamsStatuses) | **GET** /event/{event_key}/teams/statuses | 
[**getTeam**](TeamApi.md#getTeam) | **GET** /team/{team_key} | 
[**getTeamAwards**](TeamApi.md#getTeamAwards) | **GET** /team/{team_key}/awards | 
[**getTeamAwardsByYear**](TeamApi.md#getTeamAwardsByYear) | **GET** /team/{team_key}/awards/{year} | 
[**getTeamDistricts**](TeamApi.md#getTeamDistricts) | **GET** /team/{team_key}/districts | 
[**getTeamEventAwards**](TeamApi.md#getTeamEventAwards) | **GET** /team/{team_key}/event/{event_key}/awards | 
[**getTeamEventMatches**](TeamApi.md#getTeamEventMatches) | **GET** /team/{team_key}/event/{event_key}/matches | 
[**getTeamEventMatchesKeys**](TeamApi.md#getTeamEventMatchesKeys) | **GET** /team/{team_key}/event/{event_key}/matches/keys | 
[**getTeamEventMatchesSimple**](TeamApi.md#getTeamEventMatchesSimple) | **GET** /team/{team_key}/event/{event_key}/matches/simple | 
[**getTeamEventStatus**](TeamApi.md#getTeamEventStatus) | **GET** /team/{team_key}/event/{event_key}/status | 
[**getTeamEvents**](TeamApi.md#getTeamEvents) | **GET** /team/{team_key}/events | 
[**getTeamEventsByYear**](TeamApi.md#getTeamEventsByYear) | **GET** /team/{team_key}/events/{year} | 
[**getTeamEventsByYearKeys**](TeamApi.md#getTeamEventsByYearKeys) | **GET** /team/{team_key}/events/{year}/keys | 
[**getTeamEventsByYearSimple**](TeamApi.md#getTeamEventsByYearSimple) | **GET** /team/{team_key}/events/{year}/simple | 
[**getTeamEventsKeys**](TeamApi.md#getTeamEventsKeys) | **GET** /team/{team_key}/events/keys | 
[**getTeamEventsSimple**](TeamApi.md#getTeamEventsSimple) | **GET** /team/{team_key}/events/simple | 
[**getTeamEventsStatusesByYear**](TeamApi.md#getTeamEventsStatusesByYear) | **GET** /team/{team_key}/events/{year}/statuses | 
[**getTeamMatchesByYear**](TeamApi.md#getTeamMatchesByYear) | **GET** /team/{team_key}/matches/{year} | 
[**getTeamMatchesByYearKeys**](TeamApi.md#getTeamMatchesByYearKeys) | **GET** /team/{team_key}/matches/{year}/keys | 
[**getTeamMatchesByYearSimple**](TeamApi.md#getTeamMatchesByYearSimple) | **GET** /team/{team_key}/matches/{year}/simple | 
[**getTeamMediaByTag**](TeamApi.md#getTeamMediaByTag) | **GET** /team/{team_key}/media/tag/{media_tag} | 
[**getTeamMediaByTagYear**](TeamApi.md#getTeamMediaByTagYear) | **GET** /team/{team_key}/media/tag/{media_tag}/{year} | 
[**getTeamMediaByYear**](TeamApi.md#getTeamMediaByYear) | **GET** /team/{team_key}/media/{year} | 
[**getTeamRobots**](TeamApi.md#getTeamRobots) | **GET** /team/{team_key}/robots | 
[**getTeamSimple**](TeamApi.md#getTeamSimple) | **GET** /team/{team_key}/simple | 
[**getTeamSocialMedia**](TeamApi.md#getTeamSocialMedia) | **GET** /team/{team_key}/social_media | 
[**getTeamYearsParticipated**](TeamApi.md#getTeamYearsParticipated) | **GET** /team/{team_key}/years_participated | 
[**getTeams**](TeamApi.md#getTeams) | **GET** /teams/{page_num} | 
[**getTeamsByYear**](TeamApi.md#getTeamsByYear) | **GET** /teams/{year}/{page_num} | 
[**getTeamsByYearKeys**](TeamApi.md#getTeamsByYearKeys) | **GET** /teams/{year}/{page_num}/keys | 
[**getTeamsByYearSimple**](TeamApi.md#getTeamsByYearSimple) | **GET** /teams/{year}/{page_num}/simple | 
[**getTeamsKeys**](TeamApi.md#getTeamsKeys) | **GET** /teams/{page_num}/keys | 
[**getTeamsSimple**](TeamApi.md#getTeamsSimple) | **GET** /teams/{page_num}/simple | 


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
//import net.thefletcher.tbaapi.v3client.api.TeamApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

TeamApi apiInstance = new TeamApi();
try {
    List<DistrictRanking> result = apiInstance.getDistrictRankings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#getDistrictRankings");
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
//import net.thefletcher.tbaapi.v3client.api.TeamApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

TeamApi apiInstance = new TeamApi();
try {
    List<Team> result = apiInstance.getDistrictTeams();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#getDistrictTeams");
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
//import net.thefletcher.tbaapi.v3client.api.TeamApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

TeamApi apiInstance = new TeamApi();
try {
    List<String> result = apiInstance.getDistrictTeamsKeys();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#getDistrictTeamsKeys");
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
//import net.thefletcher.tbaapi.v3client.api.TeamApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

TeamApi apiInstance = new TeamApi();
try {
    List<TeamSimple> result = apiInstance.getDistrictTeamsSimple();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#getDistrictTeamsSimple");
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
//import net.thefletcher.tbaapi.v3client.api.TeamApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

TeamApi apiInstance = new TeamApi();
try {
    List<Team> result = apiInstance.getEventTeams();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#getEventTeams");
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
//import net.thefletcher.tbaapi.v3client.api.TeamApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

TeamApi apiInstance = new TeamApi();
try {
    List<String> result = apiInstance.getEventTeamsKeys();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#getEventTeamsKeys");
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
//import net.thefletcher.tbaapi.v3client.api.TeamApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

TeamApi apiInstance = new TeamApi();
try {
    List<TeamSimple> result = apiInstance.getEventTeamsSimple();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#getEventTeamsSimple");
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
//import net.thefletcher.tbaapi.v3client.api.TeamApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

TeamApi apiInstance = new TeamApi();
try {
    Map<String, TeamEventStatus> result = apiInstance.getEventTeamsStatuses();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#getEventTeamsStatuses");
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

<a name="getTeam"></a>
# **getTeam**
> Team getTeam()



Gets a &#x60;Team&#x60; object for the team referenced by the given key.

### Example
```java
// Import classes:
//import net.thefletcher.tbaapi.v3client.ApiClient;
//import net.thefletcher.tbaapi.v3client.ApiException;
//import net.thefletcher.tbaapi.v3client.Configuration;
//import net.thefletcher.tbaapi.v3client.auth.*;
//import net.thefletcher.tbaapi.v3client.api.TeamApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

TeamApi apiInstance = new TeamApi();
try {
    Team result = apiInstance.getTeam();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#getTeam");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Team**](Team.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeamAwards"></a>
# **getTeamAwards**
> List&lt;Award&gt; getTeamAwards()



Gets a list of awards the given team has won.

### Example
```java
// Import classes:
//import net.thefletcher.tbaapi.v3client.ApiClient;
//import net.thefletcher.tbaapi.v3client.ApiException;
//import net.thefletcher.tbaapi.v3client.Configuration;
//import net.thefletcher.tbaapi.v3client.auth.*;
//import net.thefletcher.tbaapi.v3client.api.TeamApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

TeamApi apiInstance = new TeamApi();
try {
    List<Award> result = apiInstance.getTeamAwards();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#getTeamAwards");
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

<a name="getTeamAwardsByYear"></a>
# **getTeamAwardsByYear**
> List&lt;Award&gt; getTeamAwardsByYear()



Gets a list of awards the given team has won in a given year.

### Example
```java
// Import classes:
//import net.thefletcher.tbaapi.v3client.ApiClient;
//import net.thefletcher.tbaapi.v3client.ApiException;
//import net.thefletcher.tbaapi.v3client.Configuration;
//import net.thefletcher.tbaapi.v3client.auth.*;
//import net.thefletcher.tbaapi.v3client.api.TeamApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

TeamApi apiInstance = new TeamApi();
try {
    List<Award> result = apiInstance.getTeamAwardsByYear();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#getTeamAwardsByYear");
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

<a name="getTeamDistricts"></a>
# **getTeamDistricts**
> List&lt;DistrictList&gt; getTeamDistricts()



Gets an array of districts representing each year the team was in a district. Will return an empty array if the team was never in a district.

### Example
```java
// Import classes:
//import net.thefletcher.tbaapi.v3client.ApiClient;
//import net.thefletcher.tbaapi.v3client.ApiException;
//import net.thefletcher.tbaapi.v3client.Configuration;
//import net.thefletcher.tbaapi.v3client.auth.*;
//import net.thefletcher.tbaapi.v3client.api.TeamApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

TeamApi apiInstance = new TeamApi();
try {
    List<DistrictList> result = apiInstance.getTeamDistricts();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#getTeamDistricts");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;DistrictList&gt;**](DistrictList.md)

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
//import net.thefletcher.tbaapi.v3client.api.TeamApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

TeamApi apiInstance = new TeamApi();
try {
    List<Award> result = apiInstance.getTeamEventAwards();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#getTeamEventAwards");
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
//import net.thefletcher.tbaapi.v3client.api.TeamApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

TeamApi apiInstance = new TeamApi();
try {
    List<Match> result = apiInstance.getTeamEventMatches();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#getTeamEventMatches");
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
//import net.thefletcher.tbaapi.v3client.api.TeamApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

TeamApi apiInstance = new TeamApi();
try {
    List<String> result = apiInstance.getTeamEventMatchesKeys();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#getTeamEventMatchesKeys");
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
//import net.thefletcher.tbaapi.v3client.api.TeamApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

TeamApi apiInstance = new TeamApi();
try {
    List<Match> result = apiInstance.getTeamEventMatchesSimple();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#getTeamEventMatchesSimple");
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
//import net.thefletcher.tbaapi.v3client.api.TeamApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

TeamApi apiInstance = new TeamApi();
try {
    TeamEventStatus result = apiInstance.getTeamEventStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#getTeamEventStatus");
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
//import net.thefletcher.tbaapi.v3client.api.TeamApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

TeamApi apiInstance = new TeamApi();
try {
    List<Event> result = apiInstance.getTeamEvents();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#getTeamEvents");
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
//import net.thefletcher.tbaapi.v3client.api.TeamApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

TeamApi apiInstance = new TeamApi();
try {
    List<Event> result = apiInstance.getTeamEventsByYear();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#getTeamEventsByYear");
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
//import net.thefletcher.tbaapi.v3client.api.TeamApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

TeamApi apiInstance = new TeamApi();
try {
    List<String> result = apiInstance.getTeamEventsByYearKeys();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#getTeamEventsByYearKeys");
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
//import net.thefletcher.tbaapi.v3client.api.TeamApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

TeamApi apiInstance = new TeamApi();
try {
    List<EventSimple> result = apiInstance.getTeamEventsByYearSimple();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#getTeamEventsByYearSimple");
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
//import net.thefletcher.tbaapi.v3client.api.TeamApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

TeamApi apiInstance = new TeamApi();
try {
    List<String> result = apiInstance.getTeamEventsKeys();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#getTeamEventsKeys");
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
//import net.thefletcher.tbaapi.v3client.api.TeamApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

TeamApi apiInstance = new TeamApi();
try {
    List<EventSimple> result = apiInstance.getTeamEventsSimple();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#getTeamEventsSimple");
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
//import net.thefletcher.tbaapi.v3client.api.TeamApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

TeamApi apiInstance = new TeamApi();
try {
    Map<String, TeamEventStatus> result = apiInstance.getTeamEventsStatusesByYear();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#getTeamEventsStatusesByYear");
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

<a name="getTeamMatchesByYear"></a>
# **getTeamMatchesByYear**
> List&lt;Match&gt; getTeamMatchesByYear()



Gets a list of matches for the given team and year.

### Example
```java
// Import classes:
//import net.thefletcher.tbaapi.v3client.ApiClient;
//import net.thefletcher.tbaapi.v3client.ApiException;
//import net.thefletcher.tbaapi.v3client.Configuration;
//import net.thefletcher.tbaapi.v3client.auth.*;
//import net.thefletcher.tbaapi.v3client.api.TeamApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

TeamApi apiInstance = new TeamApi();
try {
    List<Match> result = apiInstance.getTeamMatchesByYear();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#getTeamMatchesByYear");
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

<a name="getTeamMatchesByYearKeys"></a>
# **getTeamMatchesByYearKeys**
> List&lt;String&gt; getTeamMatchesByYearKeys()



Gets a list of match keys for matches for the given team and year.

### Example
```java
// Import classes:
//import net.thefletcher.tbaapi.v3client.ApiClient;
//import net.thefletcher.tbaapi.v3client.ApiException;
//import net.thefletcher.tbaapi.v3client.Configuration;
//import net.thefletcher.tbaapi.v3client.auth.*;
//import net.thefletcher.tbaapi.v3client.api.TeamApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

TeamApi apiInstance = new TeamApi();
try {
    List<String> result = apiInstance.getTeamMatchesByYearKeys();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#getTeamMatchesByYearKeys");
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

<a name="getTeamMatchesByYearSimple"></a>
# **getTeamMatchesByYearSimple**
> List&lt;MatchSimple&gt; getTeamMatchesByYearSimple()



Gets a short-form list of matches for the given team and year.

### Example
```java
// Import classes:
//import net.thefletcher.tbaapi.v3client.ApiClient;
//import net.thefletcher.tbaapi.v3client.ApiException;
//import net.thefletcher.tbaapi.v3client.Configuration;
//import net.thefletcher.tbaapi.v3client.auth.*;
//import net.thefletcher.tbaapi.v3client.api.TeamApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

TeamApi apiInstance = new TeamApi();
try {
    List<MatchSimple> result = apiInstance.getTeamMatchesByYearSimple();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#getTeamMatchesByYearSimple");
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

<a name="getTeamMediaByTag"></a>
# **getTeamMediaByTag**
> List&lt;Media&gt; getTeamMediaByTag()



Gets a list of Media (videos / pictures) for the given team and tag.

### Example
```java
// Import classes:
//import net.thefletcher.tbaapi.v3client.ApiClient;
//import net.thefletcher.tbaapi.v3client.ApiException;
//import net.thefletcher.tbaapi.v3client.Configuration;
//import net.thefletcher.tbaapi.v3client.auth.*;
//import net.thefletcher.tbaapi.v3client.api.TeamApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

TeamApi apiInstance = new TeamApi();
try {
    List<Media> result = apiInstance.getTeamMediaByTag();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#getTeamMediaByTag");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Media&gt;**](Media.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeamMediaByTagYear"></a>
# **getTeamMediaByTagYear**
> List&lt;Media&gt; getTeamMediaByTagYear()



Gets a list of Media (videos / pictures) for the given team, tag and year.

### Example
```java
// Import classes:
//import net.thefletcher.tbaapi.v3client.ApiClient;
//import net.thefletcher.tbaapi.v3client.ApiException;
//import net.thefletcher.tbaapi.v3client.Configuration;
//import net.thefletcher.tbaapi.v3client.auth.*;
//import net.thefletcher.tbaapi.v3client.api.TeamApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

TeamApi apiInstance = new TeamApi();
try {
    List<Media> result = apiInstance.getTeamMediaByTagYear();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#getTeamMediaByTagYear");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Media&gt;**](Media.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeamMediaByYear"></a>
# **getTeamMediaByYear**
> List&lt;Media&gt; getTeamMediaByYear()



Gets a list of Media (videos / pictures) for the given team and year.

### Example
```java
// Import classes:
//import net.thefletcher.tbaapi.v3client.ApiClient;
//import net.thefletcher.tbaapi.v3client.ApiException;
//import net.thefletcher.tbaapi.v3client.Configuration;
//import net.thefletcher.tbaapi.v3client.auth.*;
//import net.thefletcher.tbaapi.v3client.api.TeamApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

TeamApi apiInstance = new TeamApi();
try {
    List<Media> result = apiInstance.getTeamMediaByYear();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#getTeamMediaByYear");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Media&gt;**](Media.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeamRobots"></a>
# **getTeamRobots**
> List&lt;TeamRobot&gt; getTeamRobots()



Gets a list of year and robot name pairs for each year that a robot name was provided. Will return an empty array if the team has never named a robot.

### Example
```java
// Import classes:
//import net.thefletcher.tbaapi.v3client.ApiClient;
//import net.thefletcher.tbaapi.v3client.ApiException;
//import net.thefletcher.tbaapi.v3client.Configuration;
//import net.thefletcher.tbaapi.v3client.auth.*;
//import net.thefletcher.tbaapi.v3client.api.TeamApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

TeamApi apiInstance = new TeamApi();
try {
    List<TeamRobot> result = apiInstance.getTeamRobots();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#getTeamRobots");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;TeamRobot&gt;**](TeamRobot.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeamSimple"></a>
# **getTeamSimple**
> TeamSimple getTeamSimple()



Gets a &#x60;Team_Simple&#x60; object for the team referenced by the given key.

### Example
```java
// Import classes:
//import net.thefletcher.tbaapi.v3client.ApiClient;
//import net.thefletcher.tbaapi.v3client.ApiException;
//import net.thefletcher.tbaapi.v3client.Configuration;
//import net.thefletcher.tbaapi.v3client.auth.*;
//import net.thefletcher.tbaapi.v3client.api.TeamApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

TeamApi apiInstance = new TeamApi();
try {
    TeamSimple result = apiInstance.getTeamSimple();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#getTeamSimple");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**TeamSimple**](TeamSimple.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeamSocialMedia"></a>
# **getTeamSocialMedia**
> List&lt;Media&gt; getTeamSocialMedia()



Gets a list of Media (social media) for the given team.

### Example
```java
// Import classes:
//import net.thefletcher.tbaapi.v3client.ApiClient;
//import net.thefletcher.tbaapi.v3client.ApiException;
//import net.thefletcher.tbaapi.v3client.Configuration;
//import net.thefletcher.tbaapi.v3client.auth.*;
//import net.thefletcher.tbaapi.v3client.api.TeamApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

TeamApi apiInstance = new TeamApi();
try {
    List<Media> result = apiInstance.getTeamSocialMedia();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#getTeamSocialMedia");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Media&gt;**](Media.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeamYearsParticipated"></a>
# **getTeamYearsParticipated**
> List&lt;Integer&gt; getTeamYearsParticipated()



Gets a list of years in which the team participated in at least one competition.

### Example
```java
// Import classes:
//import net.thefletcher.tbaapi.v3client.ApiClient;
//import net.thefletcher.tbaapi.v3client.ApiException;
//import net.thefletcher.tbaapi.v3client.Configuration;
//import net.thefletcher.tbaapi.v3client.auth.*;
//import net.thefletcher.tbaapi.v3client.api.TeamApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

TeamApi apiInstance = new TeamApi();
try {
    List<Integer> result = apiInstance.getTeamYearsParticipated();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#getTeamYearsParticipated");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;Integer&gt;**

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
//import net.thefletcher.tbaapi.v3client.api.TeamApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

TeamApi apiInstance = new TeamApi();
try {
    List<Team> result = apiInstance.getTeams();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#getTeams");
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
//import net.thefletcher.tbaapi.v3client.api.TeamApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

TeamApi apiInstance = new TeamApi();
try {
    List<Team> result = apiInstance.getTeamsByYear();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#getTeamsByYear");
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
//import net.thefletcher.tbaapi.v3client.api.TeamApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

TeamApi apiInstance = new TeamApi();
try {
    List<String> result = apiInstance.getTeamsByYearKeys();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#getTeamsByYearKeys");
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
//import net.thefletcher.tbaapi.v3client.api.TeamApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

TeamApi apiInstance = new TeamApi();
try {
    List<TeamSimple> result = apiInstance.getTeamsByYearSimple();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#getTeamsByYearSimple");
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
//import net.thefletcher.tbaapi.v3client.api.TeamApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

TeamApi apiInstance = new TeamApi();
try {
    List<String> result = apiInstance.getTeamsKeys();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#getTeamsKeys");
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
//import net.thefletcher.tbaapi.v3client.api.TeamApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

TeamApi apiInstance = new TeamApi();
try {
    List<TeamSimple> result = apiInstance.getTeamsSimple();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#getTeamsSimple");
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

