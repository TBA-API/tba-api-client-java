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
> List&lt;DistrictRanking&gt; getDistrictRankings(districtKey, ifModifiedSince)



Gets a list of team district rankings for the given district.

### Example
```java
// Import classes:
import net.thefletcher.tbaapi.v3client.ApiClient;
import net.thefletcher.tbaapi.v3client.ApiException;
import net.thefletcher.tbaapi.v3client.Configuration;
import net.thefletcher.tbaapi.v3client.auth.*;
import net.thefletcher.tbaapi.v3client.models.*;
import net.thefletcher.tbaapi.v3client.api.TeamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    TeamApi apiInstance = new TeamApi(defaultClient);
    String districtKey = "districtKey_example"; // String | TBA District Key, eg `2016fim`
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      List<DistrictRanking> result = apiInstance.getDistrictRankings(districtKey, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamApi#getDistrictRankings");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **districtKey** | **String**| TBA District Key, eg &#x60;2016fim&#x60; |
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**List&lt;DistrictRanking&gt;**](DistrictRanking.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  * Cache-Control - The &#x60;Cache-Control&#x60; header, in particular the &#x60;max-age&#x60; value, contains the number of seconds the result should be considered valid for. During this time subsequent calls should return from the local cache directly. <br>  * Last-Modified - Indicates the date and time the data returned was last updated. Used by clients in the &#x60;If-Modified-Since&#x60; request header. <br>  |
**304** | Not Modified - Use Local Cached Value |  -  |
**401** |  |  -  |

<a name="getDistrictTeams"></a>
# **getDistrictTeams**
> List&lt;Team&gt; getDistrictTeams(districtKey, ifModifiedSince)



Gets a list of &#x60;Team&#x60; objects that competed in events in the given district.

### Example
```java
// Import classes:
import net.thefletcher.tbaapi.v3client.ApiClient;
import net.thefletcher.tbaapi.v3client.ApiException;
import net.thefletcher.tbaapi.v3client.Configuration;
import net.thefletcher.tbaapi.v3client.auth.*;
import net.thefletcher.tbaapi.v3client.models.*;
import net.thefletcher.tbaapi.v3client.api.TeamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    TeamApi apiInstance = new TeamApi(defaultClient);
    String districtKey = "districtKey_example"; // String | TBA District Key, eg `2016fim`
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      List<Team> result = apiInstance.getDistrictTeams(districtKey, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamApi#getDistrictTeams");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **districtKey** | **String**| TBA District Key, eg &#x60;2016fim&#x60; |
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**List&lt;Team&gt;**](Team.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  * Cache-Control - The &#x60;Cache-Control&#x60; header, in particular the &#x60;max-age&#x60; value, contains the number of seconds the result should be considered valid for. During this time subsequent calls should return from the local cache directly. <br>  * Last-Modified - Indicates the date and time the data returned was last updated. Used by clients in the &#x60;If-Modified-Since&#x60; request header. <br>  |
**304** | Not Modified - Use Local Cached Value |  -  |
**401** |  |  -  |

<a name="getDistrictTeamsKeys"></a>
# **getDistrictTeamsKeys**
> List&lt;String&gt; getDistrictTeamsKeys(districtKey, ifModifiedSince)



Gets a list of &#x60;Team&#x60; objects that competed in events in the given district.

### Example
```java
// Import classes:
import net.thefletcher.tbaapi.v3client.ApiClient;
import net.thefletcher.tbaapi.v3client.ApiException;
import net.thefletcher.tbaapi.v3client.Configuration;
import net.thefletcher.tbaapi.v3client.auth.*;
import net.thefletcher.tbaapi.v3client.models.*;
import net.thefletcher.tbaapi.v3client.api.TeamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    TeamApi apiInstance = new TeamApi(defaultClient);
    String districtKey = "districtKey_example"; // String | TBA District Key, eg `2016fim`
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      List<String> result = apiInstance.getDistrictTeamsKeys(districtKey, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamApi#getDistrictTeamsKeys");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **districtKey** | **String**| TBA District Key, eg &#x60;2016fim&#x60; |
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

**List&lt;String&gt;**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  * Cache-Control - The &#x60;Cache-Control&#x60; header, in particular the &#x60;max-age&#x60; value, contains the number of seconds the result should be considered valid for. During this time subsequent calls should return from the local cache directly. <br>  * Last-Modified - Indicates the date and time the data returned was last updated. Used by clients in the &#x60;If-Modified-Since&#x60; request header. <br>  |
**304** | Not Modified - Use Local Cached Value |  -  |
**401** |  |  -  |

<a name="getDistrictTeamsSimple"></a>
# **getDistrictTeamsSimple**
> List&lt;TeamSimple&gt; getDistrictTeamsSimple(districtKey, ifModifiedSince)



Gets a short-form list of &#x60;Team&#x60; objects that competed in events in the given district.

### Example
```java
// Import classes:
import net.thefletcher.tbaapi.v3client.ApiClient;
import net.thefletcher.tbaapi.v3client.ApiException;
import net.thefletcher.tbaapi.v3client.Configuration;
import net.thefletcher.tbaapi.v3client.auth.*;
import net.thefletcher.tbaapi.v3client.models.*;
import net.thefletcher.tbaapi.v3client.api.TeamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    TeamApi apiInstance = new TeamApi(defaultClient);
    String districtKey = "districtKey_example"; // String | TBA District Key, eg `2016fim`
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      List<TeamSimple> result = apiInstance.getDistrictTeamsSimple(districtKey, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamApi#getDistrictTeamsSimple");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **districtKey** | **String**| TBA District Key, eg &#x60;2016fim&#x60; |
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**List&lt;TeamSimple&gt;**](TeamSimple.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  * Cache-Control - The &#x60;Cache-Control&#x60; header, in particular the &#x60;max-age&#x60; value, contains the number of seconds the result should be considered valid for. During this time subsequent calls should return from the local cache directly. <br>  * Last-Modified - Indicates the date and time the data returned was last updated. Used by clients in the &#x60;If-Modified-Since&#x60; request header. <br>  |
**304** | Not Modified - Use Local Cached Value |  -  |
**401** |  |  -  |

<a name="getEventTeams"></a>
# **getEventTeams**
> List&lt;Team&gt; getEventTeams(eventKey, ifModifiedSince)



Gets a list of &#x60;Team&#x60; objects that competed in the given event.

### Example
```java
// Import classes:
import net.thefletcher.tbaapi.v3client.ApiClient;
import net.thefletcher.tbaapi.v3client.ApiException;
import net.thefletcher.tbaapi.v3client.Configuration;
import net.thefletcher.tbaapi.v3client.auth.*;
import net.thefletcher.tbaapi.v3client.models.*;
import net.thefletcher.tbaapi.v3client.api.TeamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    TeamApi apiInstance = new TeamApi(defaultClient);
    String eventKey = "eventKey_example"; // String | TBA Event Key, eg `2016nytr`
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      List<Team> result = apiInstance.getEventTeams(eventKey, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamApi#getEventTeams");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventKey** | **String**| TBA Event Key, eg &#x60;2016nytr&#x60; |
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**List&lt;Team&gt;**](Team.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  * Cache-Control - The &#x60;Cache-Control&#x60; header, in particular the &#x60;max-age&#x60; value, contains the number of seconds the result should be considered valid for. During this time subsequent calls should return from the local cache directly. <br>  * Last-Modified - Indicates the date and time the data returned was last updated. Used by clients in the &#x60;If-Modified-Since&#x60; request header. <br>  |
**304** | Not Modified - Use Local Cached Value |  -  |
**401** |  |  -  |

<a name="getEventTeamsKeys"></a>
# **getEventTeamsKeys**
> List&lt;String&gt; getEventTeamsKeys(eventKey, ifModifiedSince)



Gets a list of &#x60;Team&#x60; keys that competed in the given event.

### Example
```java
// Import classes:
import net.thefletcher.tbaapi.v3client.ApiClient;
import net.thefletcher.tbaapi.v3client.ApiException;
import net.thefletcher.tbaapi.v3client.Configuration;
import net.thefletcher.tbaapi.v3client.auth.*;
import net.thefletcher.tbaapi.v3client.models.*;
import net.thefletcher.tbaapi.v3client.api.TeamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    TeamApi apiInstance = new TeamApi(defaultClient);
    String eventKey = "eventKey_example"; // String | TBA Event Key, eg `2016nytr`
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      List<String> result = apiInstance.getEventTeamsKeys(eventKey, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamApi#getEventTeamsKeys");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventKey** | **String**| TBA Event Key, eg &#x60;2016nytr&#x60; |
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

**List&lt;String&gt;**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  * Cache-Control - The &#x60;Cache-Control&#x60; header, in particular the &#x60;max-age&#x60; value, contains the number of seconds the result should be considered valid for. During this time subsequent calls should return from the local cache directly. <br>  * Last-Modified - Indicates the date and time the data returned was last updated. Used by clients in the &#x60;If-Modified-Since&#x60; request header. <br>  |
**304** | Not Modified - Use Local Cached Value |  -  |
**401** |  |  -  |

<a name="getEventTeamsSimple"></a>
# **getEventTeamsSimple**
> List&lt;TeamSimple&gt; getEventTeamsSimple(eventKey, ifModifiedSince)



Gets a short-form list of &#x60;Team&#x60; objects that competed in the given event.

### Example
```java
// Import classes:
import net.thefletcher.tbaapi.v3client.ApiClient;
import net.thefletcher.tbaapi.v3client.ApiException;
import net.thefletcher.tbaapi.v3client.Configuration;
import net.thefletcher.tbaapi.v3client.auth.*;
import net.thefletcher.tbaapi.v3client.models.*;
import net.thefletcher.tbaapi.v3client.api.TeamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    TeamApi apiInstance = new TeamApi(defaultClient);
    String eventKey = "eventKey_example"; // String | TBA Event Key, eg `2016nytr`
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      List<TeamSimple> result = apiInstance.getEventTeamsSimple(eventKey, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamApi#getEventTeamsSimple");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventKey** | **String**| TBA Event Key, eg &#x60;2016nytr&#x60; |
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**List&lt;TeamSimple&gt;**](TeamSimple.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  * Cache-Control - The &#x60;Cache-Control&#x60; header, in particular the &#x60;max-age&#x60; value, contains the number of seconds the result should be considered valid for. During this time subsequent calls should return from the local cache directly. <br>  * Last-Modified - Indicates the date and time the data returned was last updated. Used by clients in the &#x60;If-Modified-Since&#x60; request header. <br>  |
**304** | Not Modified - Use Local Cached Value |  -  |
**401** |  |  -  |

<a name="getEventTeamsStatuses"></a>
# **getEventTeamsStatuses**
> Map&lt;String, TeamEventStatus&gt; getEventTeamsStatuses(eventKey, ifModifiedSince)



Gets a key-value list of the event statuses for teams competing at the given event.

### Example
```java
// Import classes:
import net.thefletcher.tbaapi.v3client.ApiClient;
import net.thefletcher.tbaapi.v3client.ApiException;
import net.thefletcher.tbaapi.v3client.Configuration;
import net.thefletcher.tbaapi.v3client.auth.*;
import net.thefletcher.tbaapi.v3client.models.*;
import net.thefletcher.tbaapi.v3client.api.TeamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    TeamApi apiInstance = new TeamApi(defaultClient);
    String eventKey = "eventKey_example"; // String | TBA Event Key, eg `2016nytr`
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      Map<String, TeamEventStatus> result = apiInstance.getEventTeamsStatuses(eventKey, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamApi#getEventTeamsStatuses");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventKey** | **String**| TBA Event Key, eg &#x60;2016nytr&#x60; |
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**Map&lt;String, TeamEventStatus&gt;**](TeamEventStatus.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  * Cache-Control - The &#x60;Cache-Control&#x60; header, in particular the &#x60;max-age&#x60; value, contains the number of seconds the result should be considered valid for. During this time subsequent calls should return from the local cache directly. <br>  * Last-Modified - Indicates the date and time the data returned was last updated. Used by clients in the &#x60;If-Modified-Since&#x60; request header. <br>  |
**304** | Not Modified - Use Local Cached Value |  -  |
**401** |  |  -  |

<a name="getTeam"></a>
# **getTeam**
> Team getTeam(teamKey, ifModifiedSince)



Gets a &#x60;Team&#x60; object for the team referenced by the given key.

### Example
```java
// Import classes:
import net.thefletcher.tbaapi.v3client.ApiClient;
import net.thefletcher.tbaapi.v3client.ApiException;
import net.thefletcher.tbaapi.v3client.Configuration;
import net.thefletcher.tbaapi.v3client.auth.*;
import net.thefletcher.tbaapi.v3client.models.*;
import net.thefletcher.tbaapi.v3client.api.TeamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    TeamApi apiInstance = new TeamApi(defaultClient);
    String teamKey = "teamKey_example"; // String | TBA Team Key, eg `frc254`
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      Team result = apiInstance.getTeam(teamKey, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamApi#getTeam");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **String**| TBA Team Key, eg &#x60;frc254&#x60; |
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**Team**](Team.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  * Cache-Control - The &#x60;Cache-Control&#x60; header, in particular the &#x60;max-age&#x60; value, contains the number of seconds the result should be considered valid for. During this time subsequent calls should return from the local cache directly. <br>  * Last-Modified - Indicates the date and time the data returned was last updated. Used by clients in the &#x60;If-Modified-Since&#x60; request header. <br>  |
**304** | Not Modified - Use Local Cached Value |  -  |
**401** |  |  -  |

<a name="getTeamAwards"></a>
# **getTeamAwards**
> List&lt;Award&gt; getTeamAwards(teamKey, ifModifiedSince)



Gets a list of awards the given team has won.

### Example
```java
// Import classes:
import net.thefletcher.tbaapi.v3client.ApiClient;
import net.thefletcher.tbaapi.v3client.ApiException;
import net.thefletcher.tbaapi.v3client.Configuration;
import net.thefletcher.tbaapi.v3client.auth.*;
import net.thefletcher.tbaapi.v3client.models.*;
import net.thefletcher.tbaapi.v3client.api.TeamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    TeamApi apiInstance = new TeamApi(defaultClient);
    String teamKey = "teamKey_example"; // String | TBA Team Key, eg `frc254`
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      List<Award> result = apiInstance.getTeamAwards(teamKey, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamApi#getTeamAwards");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **String**| TBA Team Key, eg &#x60;frc254&#x60; |
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**List&lt;Award&gt;**](Award.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  * Cache-Control - The &#x60;Cache-Control&#x60; header, in particular the &#x60;max-age&#x60; value, contains the number of seconds the result should be considered valid for. During this time subsequent calls should return from the local cache directly. <br>  * Last-Modified - Indicates the date and time the data returned was last updated. Used by clients in the &#x60;If-Modified-Since&#x60; request header. <br>  |
**304** | Not Modified - Use Local Cached Value |  -  |
**401** |  |  -  |

<a name="getTeamAwardsByYear"></a>
# **getTeamAwardsByYear**
> List&lt;Award&gt; getTeamAwardsByYear(teamKey, year, ifModifiedSince)



Gets a list of awards the given team has won in a given year.

### Example
```java
// Import classes:
import net.thefletcher.tbaapi.v3client.ApiClient;
import net.thefletcher.tbaapi.v3client.ApiException;
import net.thefletcher.tbaapi.v3client.Configuration;
import net.thefletcher.tbaapi.v3client.auth.*;
import net.thefletcher.tbaapi.v3client.models.*;
import net.thefletcher.tbaapi.v3client.api.TeamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    TeamApi apiInstance = new TeamApi(defaultClient);
    String teamKey = "teamKey_example"; // String | TBA Team Key, eg `frc254`
    Integer year = 56; // Integer | Competition Year (or Season). Must be 4 digits.
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      List<Award> result = apiInstance.getTeamAwardsByYear(teamKey, year, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamApi#getTeamAwardsByYear");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **String**| TBA Team Key, eg &#x60;frc254&#x60; |
 **year** | **Integer**| Competition Year (or Season). Must be 4 digits. |
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**List&lt;Award&gt;**](Award.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  * Cache-Control - The &#x60;Cache-Control&#x60; header, in particular the &#x60;max-age&#x60; value, contains the number of seconds the result should be considered valid for. During this time subsequent calls should return from the local cache directly. <br>  * Last-Modified - Indicates the date and time the data returned was last updated. Used by clients in the &#x60;If-Modified-Since&#x60; request header. <br>  |
**304** | Not Modified - Use Local Cached Value |  -  |
**401** |  |  -  |

<a name="getTeamDistricts"></a>
# **getTeamDistricts**
> List&lt;DistrictList&gt; getTeamDistricts(teamKey, ifModifiedSince)



Gets an array of districts representing each year the team was in a district. Will return an empty array if the team was never in a district.

### Example
```java
// Import classes:
import net.thefletcher.tbaapi.v3client.ApiClient;
import net.thefletcher.tbaapi.v3client.ApiException;
import net.thefletcher.tbaapi.v3client.Configuration;
import net.thefletcher.tbaapi.v3client.auth.*;
import net.thefletcher.tbaapi.v3client.models.*;
import net.thefletcher.tbaapi.v3client.api.TeamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    TeamApi apiInstance = new TeamApi(defaultClient);
    String teamKey = "teamKey_example"; // String | TBA Team Key, eg `frc254`
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      List<DistrictList> result = apiInstance.getTeamDistricts(teamKey, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamApi#getTeamDistricts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **String**| TBA Team Key, eg &#x60;frc254&#x60; |
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**List&lt;DistrictList&gt;**](DistrictList.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  * Cache-Control - The &#x60;Cache-Control&#x60; header, in particular the &#x60;max-age&#x60; value, contains the number of seconds the result should be considered valid for. During this time subsequent calls should return from the local cache directly. <br>  * Last-Modified - Indicates the date and time the data returned was last updated. Used by clients in the &#x60;If-Modified-Since&#x60; request header. <br>  |
**304** | Not Modified - Use Local Cached Value |  -  |
**401** |  |  -  |

<a name="getTeamEventAwards"></a>
# **getTeamEventAwards**
> List&lt;Award&gt; getTeamEventAwards(teamKey, eventKey, ifModifiedSince)



Gets a list of awards the given team won at the given event.

### Example
```java
// Import classes:
import net.thefletcher.tbaapi.v3client.ApiClient;
import net.thefletcher.tbaapi.v3client.ApiException;
import net.thefletcher.tbaapi.v3client.Configuration;
import net.thefletcher.tbaapi.v3client.auth.*;
import net.thefletcher.tbaapi.v3client.models.*;
import net.thefletcher.tbaapi.v3client.api.TeamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    TeamApi apiInstance = new TeamApi(defaultClient);
    String teamKey = "teamKey_example"; // String | TBA Team Key, eg `frc254`
    String eventKey = "eventKey_example"; // String | TBA Event Key, eg `2016nytr`
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      List<Award> result = apiInstance.getTeamEventAwards(teamKey, eventKey, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamApi#getTeamEventAwards");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **String**| TBA Team Key, eg &#x60;frc254&#x60; |
 **eventKey** | **String**| TBA Event Key, eg &#x60;2016nytr&#x60; |
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**List&lt;Award&gt;**](Award.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  * Cache-Control - The &#x60;Cache-Control&#x60; header, in particular the &#x60;max-age&#x60; value, contains the number of seconds the result should be considered valid for. During this time subsequent calls should return from the local cache directly. <br>  * Last-Modified - Indicates the date and time the data returned was last updated. Used by clients in the &#x60;If-Modified-Since&#x60; request header. <br>  |
**304** | Not Modified - Use Local Cached Value |  -  |
**401** |  |  -  |

<a name="getTeamEventMatches"></a>
# **getTeamEventMatches**
> List&lt;Match&gt; getTeamEventMatches(teamKey, eventKey, ifModifiedSince)



Gets a list of matches for the given team and event.

### Example
```java
// Import classes:
import net.thefletcher.tbaapi.v3client.ApiClient;
import net.thefletcher.tbaapi.v3client.ApiException;
import net.thefletcher.tbaapi.v3client.Configuration;
import net.thefletcher.tbaapi.v3client.auth.*;
import net.thefletcher.tbaapi.v3client.models.*;
import net.thefletcher.tbaapi.v3client.api.TeamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    TeamApi apiInstance = new TeamApi(defaultClient);
    String teamKey = "teamKey_example"; // String | TBA Team Key, eg `frc254`
    String eventKey = "eventKey_example"; // String | TBA Event Key, eg `2016nytr`
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      List<Match> result = apiInstance.getTeamEventMatches(teamKey, eventKey, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamApi#getTeamEventMatches");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **String**| TBA Team Key, eg &#x60;frc254&#x60; |
 **eventKey** | **String**| TBA Event Key, eg &#x60;2016nytr&#x60; |
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**List&lt;Match&gt;**](Match.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  * Cache-Control - The &#x60;Cache-Control&#x60; header, in particular the &#x60;max-age&#x60; value, contains the number of seconds the result should be considered valid for. During this time subsequent calls should return from the local cache directly. <br>  * Last-Modified - Indicates the date and time the data returned was last updated. Used by clients in the &#x60;If-Modified-Since&#x60; request header. <br>  |
**304** | Not Modified - Use Local Cached Value |  -  |
**401** |  |  -  |

<a name="getTeamEventMatchesKeys"></a>
# **getTeamEventMatchesKeys**
> List&lt;String&gt; getTeamEventMatchesKeys(teamKey, eventKey, ifModifiedSince)



Gets a list of match keys for matches for the given team and event.

### Example
```java
// Import classes:
import net.thefletcher.tbaapi.v3client.ApiClient;
import net.thefletcher.tbaapi.v3client.ApiException;
import net.thefletcher.tbaapi.v3client.Configuration;
import net.thefletcher.tbaapi.v3client.auth.*;
import net.thefletcher.tbaapi.v3client.models.*;
import net.thefletcher.tbaapi.v3client.api.TeamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    TeamApi apiInstance = new TeamApi(defaultClient);
    String teamKey = "teamKey_example"; // String | TBA Team Key, eg `frc254`
    String eventKey = "eventKey_example"; // String | TBA Event Key, eg `2016nytr`
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      List<String> result = apiInstance.getTeamEventMatchesKeys(teamKey, eventKey, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamApi#getTeamEventMatchesKeys");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **String**| TBA Team Key, eg &#x60;frc254&#x60; |
 **eventKey** | **String**| TBA Event Key, eg &#x60;2016nytr&#x60; |
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

**List&lt;String&gt;**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  * Cache-Control - The &#x60;Cache-Control&#x60; header, in particular the &#x60;max-age&#x60; value, contains the number of seconds the result should be considered valid for. During this time subsequent calls should return from the local cache directly. <br>  * Last-Modified - Indicates the date and time the data returned was last updated. Used by clients in the &#x60;If-Modified-Since&#x60; request header. <br>  |
**304** | Not Modified - Use Local Cached Value |  -  |
**401** |  |  -  |

<a name="getTeamEventMatchesSimple"></a>
# **getTeamEventMatchesSimple**
> List&lt;Match&gt; getTeamEventMatchesSimple(teamKey, eventKey, ifModifiedSince)



Gets a short-form list of matches for the given team and event.

### Example
```java
// Import classes:
import net.thefletcher.tbaapi.v3client.ApiClient;
import net.thefletcher.tbaapi.v3client.ApiException;
import net.thefletcher.tbaapi.v3client.Configuration;
import net.thefletcher.tbaapi.v3client.auth.*;
import net.thefletcher.tbaapi.v3client.models.*;
import net.thefletcher.tbaapi.v3client.api.TeamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    TeamApi apiInstance = new TeamApi(defaultClient);
    String teamKey = "teamKey_example"; // String | TBA Team Key, eg `frc254`
    String eventKey = "eventKey_example"; // String | TBA Event Key, eg `2016nytr`
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      List<Match> result = apiInstance.getTeamEventMatchesSimple(teamKey, eventKey, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamApi#getTeamEventMatchesSimple");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **String**| TBA Team Key, eg &#x60;frc254&#x60; |
 **eventKey** | **String**| TBA Event Key, eg &#x60;2016nytr&#x60; |
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**List&lt;Match&gt;**](Match.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  * Cache-Control - The &#x60;Cache-Control&#x60; header, in particular the &#x60;max-age&#x60; value, contains the number of seconds the result should be considered valid for. During this time subsequent calls should return from the local cache directly. <br>  * Last-Modified - Indicates the date and time the data returned was last updated. Used by clients in the &#x60;If-Modified-Since&#x60; request header. <br>  |
**304** | Not Modified - Use Local Cached Value |  -  |
**401** |  |  -  |

<a name="getTeamEventStatus"></a>
# **getTeamEventStatus**
> TeamEventStatus getTeamEventStatus(teamKey, eventKey, ifModifiedSince)



Gets the competition rank and status of the team at the given event.

### Example
```java
// Import classes:
import net.thefletcher.tbaapi.v3client.ApiClient;
import net.thefletcher.tbaapi.v3client.ApiException;
import net.thefletcher.tbaapi.v3client.Configuration;
import net.thefletcher.tbaapi.v3client.auth.*;
import net.thefletcher.tbaapi.v3client.models.*;
import net.thefletcher.tbaapi.v3client.api.TeamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    TeamApi apiInstance = new TeamApi(defaultClient);
    String teamKey = "teamKey_example"; // String | TBA Team Key, eg `frc254`
    String eventKey = "eventKey_example"; // String | TBA Event Key, eg `2016nytr`
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      TeamEventStatus result = apiInstance.getTeamEventStatus(teamKey, eventKey, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamApi#getTeamEventStatus");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **String**| TBA Team Key, eg &#x60;frc254&#x60; |
 **eventKey** | **String**| TBA Event Key, eg &#x60;2016nytr&#x60; |
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**TeamEventStatus**](TeamEventStatus.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  * Cache-Control - The &#x60;Cache-Control&#x60; header, in particular the &#x60;max-age&#x60; value, contains the number of seconds the result should be considered valid for. During this time subsequent calls should return from the local cache directly. <br>  * Last-Modified - Indicates the date and time the data returned was last updated. Used by clients in the &#x60;If-Modified-Since&#x60; request header. <br>  |
**304** | Not Modified - Use Local Cached Value |  -  |
**401** |  |  -  |

<a name="getTeamEvents"></a>
# **getTeamEvents**
> List&lt;Event&gt; getTeamEvents(teamKey, ifModifiedSince)



Gets a list of all events this team has competed at.

### Example
```java
// Import classes:
import net.thefletcher.tbaapi.v3client.ApiClient;
import net.thefletcher.tbaapi.v3client.ApiException;
import net.thefletcher.tbaapi.v3client.Configuration;
import net.thefletcher.tbaapi.v3client.auth.*;
import net.thefletcher.tbaapi.v3client.models.*;
import net.thefletcher.tbaapi.v3client.api.TeamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    TeamApi apiInstance = new TeamApi(defaultClient);
    String teamKey = "teamKey_example"; // String | TBA Team Key, eg `frc254`
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      List<Event> result = apiInstance.getTeamEvents(teamKey, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamApi#getTeamEvents");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **String**| TBA Team Key, eg &#x60;frc254&#x60; |
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**List&lt;Event&gt;**](Event.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  * Cache-Control - The &#x60;Cache-Control&#x60; header, in particular the &#x60;max-age&#x60; value, contains the number of seconds the result should be considered valid for. During this time subsequent calls should return from the local cache directly. <br>  * Last-Modified - Indicates the date and time the data returned was last updated. Used by clients in the &#x60;If-Modified-Since&#x60; request header. <br>  |
**304** | Not Modified - Use Local Cached Value |  -  |
**401** |  |  -  |

<a name="getTeamEventsByYear"></a>
# **getTeamEventsByYear**
> List&lt;Event&gt; getTeamEventsByYear(teamKey, year, ifModifiedSince)



Gets a list of events this team has competed at in the given year.

### Example
```java
// Import classes:
import net.thefletcher.tbaapi.v3client.ApiClient;
import net.thefletcher.tbaapi.v3client.ApiException;
import net.thefletcher.tbaapi.v3client.Configuration;
import net.thefletcher.tbaapi.v3client.auth.*;
import net.thefletcher.tbaapi.v3client.models.*;
import net.thefletcher.tbaapi.v3client.api.TeamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    TeamApi apiInstance = new TeamApi(defaultClient);
    String teamKey = "teamKey_example"; // String | TBA Team Key, eg `frc254`
    Integer year = 56; // Integer | Competition Year (or Season). Must be 4 digits.
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      List<Event> result = apiInstance.getTeamEventsByYear(teamKey, year, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamApi#getTeamEventsByYear");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **String**| TBA Team Key, eg &#x60;frc254&#x60; |
 **year** | **Integer**| Competition Year (or Season). Must be 4 digits. |
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**List&lt;Event&gt;**](Event.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  * Cache-Control - The &#x60;Cache-Control&#x60; header, in particular the &#x60;max-age&#x60; value, contains the number of seconds the result should be considered valid for. During this time subsequent calls should return from the local cache directly. <br>  * Last-Modified - Indicates the date and time the data returned was last updated. Used by clients in the &#x60;If-Modified-Since&#x60; request header. <br>  |
**304** | Not Modified - Use Local Cached Value |  -  |
**401** |  |  -  |

<a name="getTeamEventsByYearKeys"></a>
# **getTeamEventsByYearKeys**
> List&lt;String&gt; getTeamEventsByYearKeys(teamKey, year, ifModifiedSince)



Gets a list of the event keys for events this team has competed at in the given year.

### Example
```java
// Import classes:
import net.thefletcher.tbaapi.v3client.ApiClient;
import net.thefletcher.tbaapi.v3client.ApiException;
import net.thefletcher.tbaapi.v3client.Configuration;
import net.thefletcher.tbaapi.v3client.auth.*;
import net.thefletcher.tbaapi.v3client.models.*;
import net.thefletcher.tbaapi.v3client.api.TeamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    TeamApi apiInstance = new TeamApi(defaultClient);
    String teamKey = "teamKey_example"; // String | TBA Team Key, eg `frc254`
    Integer year = 56; // Integer | Competition Year (or Season). Must be 4 digits.
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      List<String> result = apiInstance.getTeamEventsByYearKeys(teamKey, year, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamApi#getTeamEventsByYearKeys");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **String**| TBA Team Key, eg &#x60;frc254&#x60; |
 **year** | **Integer**| Competition Year (or Season). Must be 4 digits. |
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

**List&lt;String&gt;**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  * Cache-Control - The &#x60;Cache-Control&#x60; header, in particular the &#x60;max-age&#x60; value, contains the number of seconds the result should be considered valid for. During this time subsequent calls should return from the local cache directly. <br>  * Last-Modified - Indicates the date and time the data returned was last updated. Used by clients in the &#x60;If-Modified-Since&#x60; request header. <br>  |
**304** | Not Modified - Use Local Cached Value |  -  |
**401** |  |  -  |

<a name="getTeamEventsByYearSimple"></a>
# **getTeamEventsByYearSimple**
> List&lt;EventSimple&gt; getTeamEventsByYearSimple(teamKey, year, ifModifiedSince)



Gets a short-form list of events this team has competed at in the given year.

### Example
```java
// Import classes:
import net.thefletcher.tbaapi.v3client.ApiClient;
import net.thefletcher.tbaapi.v3client.ApiException;
import net.thefletcher.tbaapi.v3client.Configuration;
import net.thefletcher.tbaapi.v3client.auth.*;
import net.thefletcher.tbaapi.v3client.models.*;
import net.thefletcher.tbaapi.v3client.api.TeamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    TeamApi apiInstance = new TeamApi(defaultClient);
    String teamKey = "teamKey_example"; // String | TBA Team Key, eg `frc254`
    Integer year = 56; // Integer | Competition Year (or Season). Must be 4 digits.
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      List<EventSimple> result = apiInstance.getTeamEventsByYearSimple(teamKey, year, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamApi#getTeamEventsByYearSimple");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **String**| TBA Team Key, eg &#x60;frc254&#x60; |
 **year** | **Integer**| Competition Year (or Season). Must be 4 digits. |
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**List&lt;EventSimple&gt;**](EventSimple.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  * Cache-Control - The &#x60;Cache-Control&#x60; header, in particular the &#x60;max-age&#x60; value, contains the number of seconds the result should be considered valid for. During this time subsequent calls should return from the local cache directly. <br>  * Last-Modified - Indicates the date and time the data returned was last updated. Used by clients in the &#x60;If-Modified-Since&#x60; request header. <br>  |
**304** | Not Modified - Use Local Cached Value |  -  |
**401** |  |  -  |

<a name="getTeamEventsKeys"></a>
# **getTeamEventsKeys**
> List&lt;String&gt; getTeamEventsKeys(teamKey, ifModifiedSince)



Gets a list of the event keys for all events this team has competed at.

### Example
```java
// Import classes:
import net.thefletcher.tbaapi.v3client.ApiClient;
import net.thefletcher.tbaapi.v3client.ApiException;
import net.thefletcher.tbaapi.v3client.Configuration;
import net.thefletcher.tbaapi.v3client.auth.*;
import net.thefletcher.tbaapi.v3client.models.*;
import net.thefletcher.tbaapi.v3client.api.TeamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    TeamApi apiInstance = new TeamApi(defaultClient);
    String teamKey = "teamKey_example"; // String | TBA Team Key, eg `frc254`
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      List<String> result = apiInstance.getTeamEventsKeys(teamKey, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamApi#getTeamEventsKeys");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **String**| TBA Team Key, eg &#x60;frc254&#x60; |
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

**List&lt;String&gt;**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  * Cache-Control - The &#x60;Cache-Control&#x60; header, in particular the &#x60;max-age&#x60; value, contains the number of seconds the result should be considered valid for. During this time subsequent calls should return from the local cache directly. <br>  * Last-Modified - Indicates the date and time the data returned was last updated. Used by clients in the &#x60;If-Modified-Since&#x60; request header. <br>  |
**304** | Not Modified - Use Local Cached Value |  -  |
**401** |  |  -  |

<a name="getTeamEventsSimple"></a>
# **getTeamEventsSimple**
> List&lt;EventSimple&gt; getTeamEventsSimple(teamKey, ifModifiedSince)



Gets a short-form list of all events this team has competed at.

### Example
```java
// Import classes:
import net.thefletcher.tbaapi.v3client.ApiClient;
import net.thefletcher.tbaapi.v3client.ApiException;
import net.thefletcher.tbaapi.v3client.Configuration;
import net.thefletcher.tbaapi.v3client.auth.*;
import net.thefletcher.tbaapi.v3client.models.*;
import net.thefletcher.tbaapi.v3client.api.TeamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    TeamApi apiInstance = new TeamApi(defaultClient);
    String teamKey = "teamKey_example"; // String | TBA Team Key, eg `frc254`
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      List<EventSimple> result = apiInstance.getTeamEventsSimple(teamKey, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamApi#getTeamEventsSimple");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **String**| TBA Team Key, eg &#x60;frc254&#x60; |
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**List&lt;EventSimple&gt;**](EventSimple.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  * Cache-Control - The &#x60;Cache-Control&#x60; header, in particular the &#x60;max-age&#x60; value, contains the number of seconds the result should be considered valid for. During this time subsequent calls should return from the local cache directly. <br>  * Last-Modified - Indicates the date and time the data returned was last updated. Used by clients in the &#x60;If-Modified-Since&#x60; request header. <br>  |
**304** | Not Modified - Use Local Cached Value |  -  |
**401** |  |  -  |

<a name="getTeamEventsStatusesByYear"></a>
# **getTeamEventsStatusesByYear**
> Map&lt;String, TeamEventStatus&gt; getTeamEventsStatusesByYear(teamKey, year, ifModifiedSince)



Gets a key-value list of the event statuses for events this team has competed at in the given year.

### Example
```java
// Import classes:
import net.thefletcher.tbaapi.v3client.ApiClient;
import net.thefletcher.tbaapi.v3client.ApiException;
import net.thefletcher.tbaapi.v3client.Configuration;
import net.thefletcher.tbaapi.v3client.auth.*;
import net.thefletcher.tbaapi.v3client.models.*;
import net.thefletcher.tbaapi.v3client.api.TeamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    TeamApi apiInstance = new TeamApi(defaultClient);
    String teamKey = "teamKey_example"; // String | TBA Team Key, eg `frc254`
    Integer year = 56; // Integer | Competition Year (or Season). Must be 4 digits.
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      Map<String, TeamEventStatus> result = apiInstance.getTeamEventsStatusesByYear(teamKey, year, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamApi#getTeamEventsStatusesByYear");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **String**| TBA Team Key, eg &#x60;frc254&#x60; |
 **year** | **Integer**| Competition Year (or Season). Must be 4 digits. |
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**Map&lt;String, TeamEventStatus&gt;**](TeamEventStatus.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  * Cache-Control - The &#x60;Cache-Control&#x60; header, in particular the &#x60;max-age&#x60; value, contains the number of seconds the result should be considered valid for. During this time subsequent calls should return from the local cache directly. <br>  * Last-Modified - Indicates the date and time the data returned was last updated. Used by clients in the &#x60;If-Modified-Since&#x60; request header. <br>  |
**304** | Not Modified - Use Local Cached Value |  -  |
**401** |  |  -  |

<a name="getTeamMatchesByYear"></a>
# **getTeamMatchesByYear**
> List&lt;Match&gt; getTeamMatchesByYear(teamKey, year, ifModifiedSince)



Gets a list of matches for the given team and year.

### Example
```java
// Import classes:
import net.thefletcher.tbaapi.v3client.ApiClient;
import net.thefletcher.tbaapi.v3client.ApiException;
import net.thefletcher.tbaapi.v3client.Configuration;
import net.thefletcher.tbaapi.v3client.auth.*;
import net.thefletcher.tbaapi.v3client.models.*;
import net.thefletcher.tbaapi.v3client.api.TeamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    TeamApi apiInstance = new TeamApi(defaultClient);
    String teamKey = "teamKey_example"; // String | TBA Team Key, eg `frc254`
    Integer year = 56; // Integer | Competition Year (or Season). Must be 4 digits.
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      List<Match> result = apiInstance.getTeamMatchesByYear(teamKey, year, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamApi#getTeamMatchesByYear");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **String**| TBA Team Key, eg &#x60;frc254&#x60; |
 **year** | **Integer**| Competition Year (or Season). Must be 4 digits. |
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**List&lt;Match&gt;**](Match.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  * Cache-Control - The &#x60;Cache-Control&#x60; header, in particular the &#x60;max-age&#x60; value, contains the number of seconds the result should be considered valid for. During this time subsequent calls should return from the local cache directly. <br>  * Last-Modified - Indicates the date and time the data returned was last updated. Used by clients in the &#x60;If-Modified-Since&#x60; request header. <br>  |
**304** | Not Modified - Use Local Cached Value |  -  |
**401** |  |  -  |

<a name="getTeamMatchesByYearKeys"></a>
# **getTeamMatchesByYearKeys**
> List&lt;String&gt; getTeamMatchesByYearKeys(teamKey, year, ifModifiedSince)



Gets a list of match keys for matches for the given team and year.

### Example
```java
// Import classes:
import net.thefletcher.tbaapi.v3client.ApiClient;
import net.thefletcher.tbaapi.v3client.ApiException;
import net.thefletcher.tbaapi.v3client.Configuration;
import net.thefletcher.tbaapi.v3client.auth.*;
import net.thefletcher.tbaapi.v3client.models.*;
import net.thefletcher.tbaapi.v3client.api.TeamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    TeamApi apiInstance = new TeamApi(defaultClient);
    String teamKey = "teamKey_example"; // String | TBA Team Key, eg `frc254`
    Integer year = 56; // Integer | Competition Year (or Season). Must be 4 digits.
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      List<String> result = apiInstance.getTeamMatchesByYearKeys(teamKey, year, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamApi#getTeamMatchesByYearKeys");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **String**| TBA Team Key, eg &#x60;frc254&#x60; |
 **year** | **Integer**| Competition Year (or Season). Must be 4 digits. |
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

**List&lt;String&gt;**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  * Cache-Control - The &#x60;Cache-Control&#x60; header, in particular the &#x60;max-age&#x60; value, contains the number of seconds the result should be considered valid for. During this time subsequent calls should return from the local cache directly. <br>  * Last-Modified - Indicates the date and time the data returned was last updated. Used by clients in the &#x60;If-Modified-Since&#x60; request header. <br>  |
**304** | Not Modified - Use Local Cached Value |  -  |
**401** |  |  -  |

<a name="getTeamMatchesByYearSimple"></a>
# **getTeamMatchesByYearSimple**
> List&lt;MatchSimple&gt; getTeamMatchesByYearSimple(teamKey, year, ifModifiedSince)



Gets a short-form list of matches for the given team and year.

### Example
```java
// Import classes:
import net.thefletcher.tbaapi.v3client.ApiClient;
import net.thefletcher.tbaapi.v3client.ApiException;
import net.thefletcher.tbaapi.v3client.Configuration;
import net.thefletcher.tbaapi.v3client.auth.*;
import net.thefletcher.tbaapi.v3client.models.*;
import net.thefletcher.tbaapi.v3client.api.TeamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    TeamApi apiInstance = new TeamApi(defaultClient);
    String teamKey = "teamKey_example"; // String | TBA Team Key, eg `frc254`
    Integer year = 56; // Integer | Competition Year (or Season). Must be 4 digits.
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      List<MatchSimple> result = apiInstance.getTeamMatchesByYearSimple(teamKey, year, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamApi#getTeamMatchesByYearSimple");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **String**| TBA Team Key, eg &#x60;frc254&#x60; |
 **year** | **Integer**| Competition Year (or Season). Must be 4 digits. |
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**List&lt;MatchSimple&gt;**](MatchSimple.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  * Cache-Control - The &#x60;Cache-Control&#x60; header, in particular the &#x60;max-age&#x60; value, contains the number of seconds the result should be considered valid for. During this time subsequent calls should return from the local cache directly. <br>  * Last-Modified - Indicates the date and time the data returned was last updated. Used by clients in the &#x60;If-Modified-Since&#x60; request header. <br>  |
**304** | Not Modified - Use Local Cached Value |  -  |
**401** |  |  -  |

<a name="getTeamMediaByTag"></a>
# **getTeamMediaByTag**
> List&lt;Media&gt; getTeamMediaByTag(teamKey, mediaTag, ifModifiedSince)



Gets a list of Media (videos / pictures) for the given team and tag.

### Example
```java
// Import classes:
import net.thefletcher.tbaapi.v3client.ApiClient;
import net.thefletcher.tbaapi.v3client.ApiException;
import net.thefletcher.tbaapi.v3client.Configuration;
import net.thefletcher.tbaapi.v3client.auth.*;
import net.thefletcher.tbaapi.v3client.models.*;
import net.thefletcher.tbaapi.v3client.api.TeamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    TeamApi apiInstance = new TeamApi(defaultClient);
    String teamKey = "teamKey_example"; // String | TBA Team Key, eg `frc254`
    String mediaTag = "mediaTag_example"; // String | Media Tag which describes the Media.
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      List<Media> result = apiInstance.getTeamMediaByTag(teamKey, mediaTag, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamApi#getTeamMediaByTag");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **String**| TBA Team Key, eg &#x60;frc254&#x60; |
 **mediaTag** | **String**| Media Tag which describes the Media. |
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**List&lt;Media&gt;**](Media.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  * Cache-Control - The &#x60;Cache-Control&#x60; header, in particular the &#x60;max-age&#x60; value, contains the number of seconds the result should be considered valid for. During this time subsequent calls should return from the local cache directly. <br>  * Last-Modified - Indicates the date and time the data returned was last updated. Used by clients in the &#x60;If-Modified-Since&#x60; request header. <br>  |
**304** | Not Modified - Use Local Cached Value |  -  |
**401** |  |  -  |

<a name="getTeamMediaByTagYear"></a>
# **getTeamMediaByTagYear**
> List&lt;Media&gt; getTeamMediaByTagYear(teamKey, mediaTag, year, ifModifiedSince)



Gets a list of Media (videos / pictures) for the given team, tag and year.

### Example
```java
// Import classes:
import net.thefletcher.tbaapi.v3client.ApiClient;
import net.thefletcher.tbaapi.v3client.ApiException;
import net.thefletcher.tbaapi.v3client.Configuration;
import net.thefletcher.tbaapi.v3client.auth.*;
import net.thefletcher.tbaapi.v3client.models.*;
import net.thefletcher.tbaapi.v3client.api.TeamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    TeamApi apiInstance = new TeamApi(defaultClient);
    String teamKey = "teamKey_example"; // String | TBA Team Key, eg `frc254`
    String mediaTag = "mediaTag_example"; // String | Media Tag which describes the Media.
    Integer year = 56; // Integer | Competition Year (or Season). Must be 4 digits.
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      List<Media> result = apiInstance.getTeamMediaByTagYear(teamKey, mediaTag, year, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamApi#getTeamMediaByTagYear");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **String**| TBA Team Key, eg &#x60;frc254&#x60; |
 **mediaTag** | **String**| Media Tag which describes the Media. |
 **year** | **Integer**| Competition Year (or Season). Must be 4 digits. |
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**List&lt;Media&gt;**](Media.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  * Cache-Control - The &#x60;Cache-Control&#x60; header, in particular the &#x60;max-age&#x60; value, contains the number of seconds the result should be considered valid for. During this time subsequent calls should return from the local cache directly. <br>  * Last-Modified - Indicates the date and time the data returned was last updated. Used by clients in the &#x60;If-Modified-Since&#x60; request header. <br>  |
**304** | Not Modified - Use Local Cached Value |  -  |
**401** |  |  -  |

<a name="getTeamMediaByYear"></a>
# **getTeamMediaByYear**
> List&lt;Media&gt; getTeamMediaByYear(teamKey, year, ifModifiedSince)



Gets a list of Media (videos / pictures) for the given team and year.

### Example
```java
// Import classes:
import net.thefletcher.tbaapi.v3client.ApiClient;
import net.thefletcher.tbaapi.v3client.ApiException;
import net.thefletcher.tbaapi.v3client.Configuration;
import net.thefletcher.tbaapi.v3client.auth.*;
import net.thefletcher.tbaapi.v3client.models.*;
import net.thefletcher.tbaapi.v3client.api.TeamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    TeamApi apiInstance = new TeamApi(defaultClient);
    String teamKey = "teamKey_example"; // String | TBA Team Key, eg `frc254`
    Integer year = 56; // Integer | Competition Year (or Season). Must be 4 digits.
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      List<Media> result = apiInstance.getTeamMediaByYear(teamKey, year, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamApi#getTeamMediaByYear");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **String**| TBA Team Key, eg &#x60;frc254&#x60; |
 **year** | **Integer**| Competition Year (or Season). Must be 4 digits. |
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**List&lt;Media&gt;**](Media.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  * Cache-Control - The &#x60;Cache-Control&#x60; header, in particular the &#x60;max-age&#x60; value, contains the number of seconds the result should be considered valid for. During this time subsequent calls should return from the local cache directly. <br>  * Last-Modified - Indicates the date and time the data returned was last updated. Used by clients in the &#x60;If-Modified-Since&#x60; request header. <br>  |
**304** | Not Modified - Use Local Cached Value |  -  |
**401** |  |  -  |

<a name="getTeamRobots"></a>
# **getTeamRobots**
> List&lt;TeamRobot&gt; getTeamRobots(teamKey, ifModifiedSince)



Gets a list of year and robot name pairs for each year that a robot name was provided. Will return an empty array if the team has never named a robot.

### Example
```java
// Import classes:
import net.thefletcher.tbaapi.v3client.ApiClient;
import net.thefletcher.tbaapi.v3client.ApiException;
import net.thefletcher.tbaapi.v3client.Configuration;
import net.thefletcher.tbaapi.v3client.auth.*;
import net.thefletcher.tbaapi.v3client.models.*;
import net.thefletcher.tbaapi.v3client.api.TeamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    TeamApi apiInstance = new TeamApi(defaultClient);
    String teamKey = "teamKey_example"; // String | TBA Team Key, eg `frc254`
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      List<TeamRobot> result = apiInstance.getTeamRobots(teamKey, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamApi#getTeamRobots");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **String**| TBA Team Key, eg &#x60;frc254&#x60; |
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**List&lt;TeamRobot&gt;**](TeamRobot.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  * Cache-Control - The &#x60;Cache-Control&#x60; header, in particular the &#x60;max-age&#x60; value, contains the number of seconds the result should be considered valid for. During this time subsequent calls should return from the local cache directly. <br>  * Last-Modified - Indicates the date and time the data returned was last updated. Used by clients in the &#x60;If-Modified-Since&#x60; request header. <br>  |
**304** | Not Modified - Use Local Cached Value |  -  |
**401** |  |  -  |

<a name="getTeamSimple"></a>
# **getTeamSimple**
> TeamSimple getTeamSimple(teamKey, ifModifiedSince)



Gets a &#x60;Team_Simple&#x60; object for the team referenced by the given key.

### Example
```java
// Import classes:
import net.thefletcher.tbaapi.v3client.ApiClient;
import net.thefletcher.tbaapi.v3client.ApiException;
import net.thefletcher.tbaapi.v3client.Configuration;
import net.thefletcher.tbaapi.v3client.auth.*;
import net.thefletcher.tbaapi.v3client.models.*;
import net.thefletcher.tbaapi.v3client.api.TeamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    TeamApi apiInstance = new TeamApi(defaultClient);
    String teamKey = "teamKey_example"; // String | TBA Team Key, eg `frc254`
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      TeamSimple result = apiInstance.getTeamSimple(teamKey, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamApi#getTeamSimple");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **String**| TBA Team Key, eg &#x60;frc254&#x60; |
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**TeamSimple**](TeamSimple.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  * Cache-Control - The &#x60;Cache-Control&#x60; header, in particular the &#x60;max-age&#x60; value, contains the number of seconds the result should be considered valid for. During this time subsequent calls should return from the local cache directly. <br>  * Last-Modified - Indicates the date and time the data returned was last updated. Used by clients in the &#x60;If-Modified-Since&#x60; request header. <br>  |
**304** | Not Modified - Use Local Cached Value |  -  |
**401** |  |  -  |

<a name="getTeamSocialMedia"></a>
# **getTeamSocialMedia**
> List&lt;Media&gt; getTeamSocialMedia(teamKey, ifModifiedSince)



Gets a list of Media (social media) for the given team.

### Example
```java
// Import classes:
import net.thefletcher.tbaapi.v3client.ApiClient;
import net.thefletcher.tbaapi.v3client.ApiException;
import net.thefletcher.tbaapi.v3client.Configuration;
import net.thefletcher.tbaapi.v3client.auth.*;
import net.thefletcher.tbaapi.v3client.models.*;
import net.thefletcher.tbaapi.v3client.api.TeamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    TeamApi apiInstance = new TeamApi(defaultClient);
    String teamKey = "teamKey_example"; // String | TBA Team Key, eg `frc254`
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      List<Media> result = apiInstance.getTeamSocialMedia(teamKey, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamApi#getTeamSocialMedia");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **String**| TBA Team Key, eg &#x60;frc254&#x60; |
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**List&lt;Media&gt;**](Media.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  * Cache-Control - The &#x60;Cache-Control&#x60; header, in particular the &#x60;max-age&#x60; value, contains the number of seconds the result should be considered valid for. During this time subsequent calls should return from the local cache directly. <br>  * Last-Modified - Indicates the date and time the data returned was last updated. Used by clients in the &#x60;If-Modified-Since&#x60; request header. <br>  |
**304** | Not Modified - Use Local Cached Value |  -  |
**401** |  |  -  |

<a name="getTeamYearsParticipated"></a>
# **getTeamYearsParticipated**
> List&lt;Integer&gt; getTeamYearsParticipated(teamKey, ifModifiedSince)



Gets a list of years in which the team participated in at least one competition.

### Example
```java
// Import classes:
import net.thefletcher.tbaapi.v3client.ApiClient;
import net.thefletcher.tbaapi.v3client.ApiException;
import net.thefletcher.tbaapi.v3client.Configuration;
import net.thefletcher.tbaapi.v3client.auth.*;
import net.thefletcher.tbaapi.v3client.models.*;
import net.thefletcher.tbaapi.v3client.api.TeamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    TeamApi apiInstance = new TeamApi(defaultClient);
    String teamKey = "teamKey_example"; // String | TBA Team Key, eg `frc254`
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      List<Integer> result = apiInstance.getTeamYearsParticipated(teamKey, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamApi#getTeamYearsParticipated");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **String**| TBA Team Key, eg &#x60;frc254&#x60; |
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

**List&lt;Integer&gt;**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  * Cache-Control - The &#x60;Cache-Control&#x60; header, in particular the &#x60;max-age&#x60; value, contains the number of seconds the result should be considered valid for. During this time subsequent calls should return from the local cache directly. <br>  * Last-Modified - Indicates the date and time the data returned was last updated. Used by clients in the &#x60;If-Modified-Since&#x60; request header. <br>  |
**304** | Not Modified - Use Local Cached Value |  -  |
**401** |  |  -  |

<a name="getTeams"></a>
# **getTeams**
> List&lt;Team&gt; getTeams(pageNum, ifModifiedSince)



Gets a list of &#x60;Team&#x60; objects, paginated in groups of 500.

### Example
```java
// Import classes:
import net.thefletcher.tbaapi.v3client.ApiClient;
import net.thefletcher.tbaapi.v3client.ApiException;
import net.thefletcher.tbaapi.v3client.Configuration;
import net.thefletcher.tbaapi.v3client.auth.*;
import net.thefletcher.tbaapi.v3client.models.*;
import net.thefletcher.tbaapi.v3client.api.TeamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    TeamApi apiInstance = new TeamApi(defaultClient);
    Integer pageNum = 56; // Integer | Page number of results to return, zero-indexed
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      List<Team> result = apiInstance.getTeams(pageNum, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamApi#getTeams");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageNum** | **Integer**| Page number of results to return, zero-indexed |
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**List&lt;Team&gt;**](Team.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  * Cache-Control - The &#x60;Cache-Control&#x60; header, in particular the &#x60;max-age&#x60; value, contains the number of seconds the result should be considered valid for. During this time subsequent calls should return from the local cache directly. <br>  * Last-Modified - Indicates the date and time the data returned was last updated. Used by clients in the &#x60;If-Modified-Since&#x60; request header. <br>  |
**304** | Not Modified - Use Local Cached Value |  -  |
**401** |  |  -  |

<a name="getTeamsByYear"></a>
# **getTeamsByYear**
> List&lt;Team&gt; getTeamsByYear(year, pageNum, ifModifiedSince)



Gets a list of &#x60;Team&#x60; objects that competed in the given year, paginated in groups of 500.

### Example
```java
// Import classes:
import net.thefletcher.tbaapi.v3client.ApiClient;
import net.thefletcher.tbaapi.v3client.ApiException;
import net.thefletcher.tbaapi.v3client.Configuration;
import net.thefletcher.tbaapi.v3client.auth.*;
import net.thefletcher.tbaapi.v3client.models.*;
import net.thefletcher.tbaapi.v3client.api.TeamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    TeamApi apiInstance = new TeamApi(defaultClient);
    Integer year = 56; // Integer | Competition Year (or Season). Must be 4 digits.
    Integer pageNum = 56; // Integer | Page number of results to return, zero-indexed
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      List<Team> result = apiInstance.getTeamsByYear(year, pageNum, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamApi#getTeamsByYear");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **year** | **Integer**| Competition Year (or Season). Must be 4 digits. |
 **pageNum** | **Integer**| Page number of results to return, zero-indexed |
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**List&lt;Team&gt;**](Team.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  * Cache-Control - The &#x60;Cache-Control&#x60; header, in particular the &#x60;max-age&#x60; value, contains the number of seconds the result should be considered valid for. During this time subsequent calls should return from the local cache directly. <br>  * Last-Modified - Indicates the date and time the data returned was last updated. Used by clients in the &#x60;If-Modified-Since&#x60; request header. <br>  |
**304** | Not Modified - Use Local Cached Value |  -  |
**401** |  |  -  |

<a name="getTeamsByYearKeys"></a>
# **getTeamsByYearKeys**
> List&lt;String&gt; getTeamsByYearKeys(year, pageNum, ifModifiedSince)



Gets a list Team Keys that competed in the given year, paginated in groups of 500.

### Example
```java
// Import classes:
import net.thefletcher.tbaapi.v3client.ApiClient;
import net.thefletcher.tbaapi.v3client.ApiException;
import net.thefletcher.tbaapi.v3client.Configuration;
import net.thefletcher.tbaapi.v3client.auth.*;
import net.thefletcher.tbaapi.v3client.models.*;
import net.thefletcher.tbaapi.v3client.api.TeamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    TeamApi apiInstance = new TeamApi(defaultClient);
    Integer year = 56; // Integer | Competition Year (or Season). Must be 4 digits.
    Integer pageNum = 56; // Integer | Page number of results to return, zero-indexed
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      List<String> result = apiInstance.getTeamsByYearKeys(year, pageNum, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamApi#getTeamsByYearKeys");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **year** | **Integer**| Competition Year (or Season). Must be 4 digits. |
 **pageNum** | **Integer**| Page number of results to return, zero-indexed |
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

**List&lt;String&gt;**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  * Cache-Control - The &#x60;Cache-Control&#x60; header, in particular the &#x60;max-age&#x60; value, contains the number of seconds the result should be considered valid for. During this time subsequent calls should return from the local cache directly. <br>  * Last-Modified - Indicates the date and time the data returned was last updated. Used by clients in the &#x60;If-Modified-Since&#x60; request header. <br>  |
**304** | Not Modified - Use Local Cached Value |  -  |
**401** |  |  -  |

<a name="getTeamsByYearSimple"></a>
# **getTeamsByYearSimple**
> List&lt;TeamSimple&gt; getTeamsByYearSimple(year, pageNum, ifModifiedSince)



Gets a list of short form &#x60;Team_Simple&#x60; objects that competed in the given year, paginated in groups of 500.

### Example
```java
// Import classes:
import net.thefletcher.tbaapi.v3client.ApiClient;
import net.thefletcher.tbaapi.v3client.ApiException;
import net.thefletcher.tbaapi.v3client.Configuration;
import net.thefletcher.tbaapi.v3client.auth.*;
import net.thefletcher.tbaapi.v3client.models.*;
import net.thefletcher.tbaapi.v3client.api.TeamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    TeamApi apiInstance = new TeamApi(defaultClient);
    Integer year = 56; // Integer | Competition Year (or Season). Must be 4 digits.
    Integer pageNum = 56; // Integer | Page number of results to return, zero-indexed
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      List<TeamSimple> result = apiInstance.getTeamsByYearSimple(year, pageNum, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamApi#getTeamsByYearSimple");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **year** | **Integer**| Competition Year (or Season). Must be 4 digits. |
 **pageNum** | **Integer**| Page number of results to return, zero-indexed |
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**List&lt;TeamSimple&gt;**](TeamSimple.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  * Cache-Control - The &#x60;Cache-Control&#x60; header, in particular the &#x60;max-age&#x60; value, contains the number of seconds the result should be considered valid for. During this time subsequent calls should return from the local cache directly. <br>  * Last-Modified - Indicates the date and time the data returned was last updated. Used by clients in the &#x60;If-Modified-Since&#x60; request header. <br>  |
**304** | Not Modified - Use Local Cached Value |  -  |
**401** |  |  -  |

<a name="getTeamsKeys"></a>
# **getTeamsKeys**
> List&lt;String&gt; getTeamsKeys(pageNum, ifModifiedSince)



Gets a list of Team keys, paginated in groups of 500. (Note, each page will not have 500 teams, but will include the teams within that range of 500.)

### Example
```java
// Import classes:
import net.thefletcher.tbaapi.v3client.ApiClient;
import net.thefletcher.tbaapi.v3client.ApiException;
import net.thefletcher.tbaapi.v3client.Configuration;
import net.thefletcher.tbaapi.v3client.auth.*;
import net.thefletcher.tbaapi.v3client.models.*;
import net.thefletcher.tbaapi.v3client.api.TeamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    TeamApi apiInstance = new TeamApi(defaultClient);
    Integer pageNum = 56; // Integer | Page number of results to return, zero-indexed
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      List<String> result = apiInstance.getTeamsKeys(pageNum, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamApi#getTeamsKeys");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageNum** | **Integer**| Page number of results to return, zero-indexed |
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

**List&lt;String&gt;**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  * Cache-Control - The &#x60;Cache-Control&#x60; header, in particular the &#x60;max-age&#x60; value, contains the number of seconds the result should be considered valid for. During this time subsequent calls should return from the local cache directly. <br>  * Last-Modified - Indicates the date and time the data returned was last updated. Used by clients in the &#x60;If-Modified-Since&#x60; request header. <br>  |
**304** | Not Modified - Use Local Cached Value |  -  |
**401** |  |  -  |

<a name="getTeamsSimple"></a>
# **getTeamsSimple**
> List&lt;TeamSimple&gt; getTeamsSimple(pageNum, ifModifiedSince)



Gets a list of short form &#x60;Team_Simple&#x60; objects, paginated in groups of 500.

### Example
```java
// Import classes:
import net.thefletcher.tbaapi.v3client.ApiClient;
import net.thefletcher.tbaapi.v3client.ApiException;
import net.thefletcher.tbaapi.v3client.Configuration;
import net.thefletcher.tbaapi.v3client.auth.*;
import net.thefletcher.tbaapi.v3client.models.*;
import net.thefletcher.tbaapi.v3client.api.TeamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    TeamApi apiInstance = new TeamApi(defaultClient);
    Integer pageNum = 56; // Integer | Page number of results to return, zero-indexed
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      List<TeamSimple> result = apiInstance.getTeamsSimple(pageNum, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamApi#getTeamsSimple");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageNum** | **Integer**| Page number of results to return, zero-indexed |
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**List&lt;TeamSimple&gt;**](TeamSimple.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  * Cache-Control - The &#x60;Cache-Control&#x60; header, in particular the &#x60;max-age&#x60; value, contains the number of seconds the result should be considered valid for. During this time subsequent calls should return from the local cache directly. <br>  * Last-Modified - Indicates the date and time the data returned was last updated. Used by clients in the &#x60;If-Modified-Since&#x60; request header. <br>  |
**304** | Not Modified - Use Local Cached Value |  -  |
**401** |  |  -  |

