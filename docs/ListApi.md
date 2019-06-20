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
> List&lt;Event&gt; getDistrictEvents(districtKey, ifModifiedSince)



Gets a list of events in the given district.

### Example
```java
// Import classes:
import net.thefletcher.tbaapi.v3client.ApiClient;
import net.thefletcher.tbaapi.v3client.ApiException;
import net.thefletcher.tbaapi.v3client.Configuration;
import net.thefletcher.tbaapi.v3client.auth.*;
import net.thefletcher.tbaapi.v3client.models.*;
import net.thefletcher.tbaapi.v3client.api.ListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ListApi apiInstance = new ListApi(defaultClient);
    String districtKey = "districtKey_example"; // String | TBA District Key, eg `2016fim`
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      List<Event> result = apiInstance.getDistrictEvents(districtKey, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#getDistrictEvents");
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

<a name="getDistrictEventsKeys"></a>
# **getDistrictEventsKeys**
> List&lt;String&gt; getDistrictEventsKeys(districtKey, ifModifiedSince)



Gets a list of event keys for events in the given district.

### Example
```java
// Import classes:
import net.thefletcher.tbaapi.v3client.ApiClient;
import net.thefletcher.tbaapi.v3client.ApiException;
import net.thefletcher.tbaapi.v3client.Configuration;
import net.thefletcher.tbaapi.v3client.auth.*;
import net.thefletcher.tbaapi.v3client.models.*;
import net.thefletcher.tbaapi.v3client.api.ListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ListApi apiInstance = new ListApi(defaultClient);
    String districtKey = "districtKey_example"; // String | TBA District Key, eg `2016fim`
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      List<String> result = apiInstance.getDistrictEventsKeys(districtKey, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#getDistrictEventsKeys");
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

<a name="getDistrictEventsSimple"></a>
# **getDistrictEventsSimple**
> List&lt;EventSimple&gt; getDistrictEventsSimple(districtKey, ifModifiedSince)



Gets a short-form list of events in the given district.

### Example
```java
// Import classes:
import net.thefletcher.tbaapi.v3client.ApiClient;
import net.thefletcher.tbaapi.v3client.ApiException;
import net.thefletcher.tbaapi.v3client.Configuration;
import net.thefletcher.tbaapi.v3client.auth.*;
import net.thefletcher.tbaapi.v3client.models.*;
import net.thefletcher.tbaapi.v3client.api.ListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ListApi apiInstance = new ListApi(defaultClient);
    String districtKey = "districtKey_example"; // String | TBA District Key, eg `2016fim`
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      List<EventSimple> result = apiInstance.getDistrictEventsSimple(districtKey, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#getDistrictEventsSimple");
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
import net.thefletcher.tbaapi.v3client.api.ListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ListApi apiInstance = new ListApi(defaultClient);
    String districtKey = "districtKey_example"; // String | TBA District Key, eg `2016fim`
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      List<DistrictRanking> result = apiInstance.getDistrictRankings(districtKey, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#getDistrictRankings");
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
import net.thefletcher.tbaapi.v3client.api.ListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ListApi apiInstance = new ListApi(defaultClient);
    String districtKey = "districtKey_example"; // String | TBA District Key, eg `2016fim`
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      List<Team> result = apiInstance.getDistrictTeams(districtKey, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#getDistrictTeams");
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
import net.thefletcher.tbaapi.v3client.api.ListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ListApi apiInstance = new ListApi(defaultClient);
    String districtKey = "districtKey_example"; // String | TBA District Key, eg `2016fim`
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      List<String> result = apiInstance.getDistrictTeamsKeys(districtKey, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#getDistrictTeamsKeys");
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
import net.thefletcher.tbaapi.v3client.api.ListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ListApi apiInstance = new ListApi(defaultClient);
    String districtKey = "districtKey_example"; // String | TBA District Key, eg `2016fim`
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      List<TeamSimple> result = apiInstance.getDistrictTeamsSimple(districtKey, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#getDistrictTeamsSimple");
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
import net.thefletcher.tbaapi.v3client.api.ListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ListApi apiInstance = new ListApi(defaultClient);
    String eventKey = "eventKey_example"; // String | TBA Event Key, eg `2016nytr`
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      List<Team> result = apiInstance.getEventTeams(eventKey, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#getEventTeams");
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
import net.thefletcher.tbaapi.v3client.api.ListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ListApi apiInstance = new ListApi(defaultClient);
    String eventKey = "eventKey_example"; // String | TBA Event Key, eg `2016nytr`
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      List<String> result = apiInstance.getEventTeamsKeys(eventKey, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#getEventTeamsKeys");
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
import net.thefletcher.tbaapi.v3client.api.ListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ListApi apiInstance = new ListApi(defaultClient);
    String eventKey = "eventKey_example"; // String | TBA Event Key, eg `2016nytr`
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      List<TeamSimple> result = apiInstance.getEventTeamsSimple(eventKey, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#getEventTeamsSimple");
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
import net.thefletcher.tbaapi.v3client.api.ListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ListApi apiInstance = new ListApi(defaultClient);
    String eventKey = "eventKey_example"; // String | TBA Event Key, eg `2016nytr`
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      Map<String, TeamEventStatus> result = apiInstance.getEventTeamsStatuses(eventKey, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#getEventTeamsStatuses");
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

<a name="getEventsByYear"></a>
# **getEventsByYear**
> List&lt;Event&gt; getEventsByYear(year, ifModifiedSince)



Gets a list of events in the given year.

### Example
```java
// Import classes:
import net.thefletcher.tbaapi.v3client.ApiClient;
import net.thefletcher.tbaapi.v3client.ApiException;
import net.thefletcher.tbaapi.v3client.Configuration;
import net.thefletcher.tbaapi.v3client.auth.*;
import net.thefletcher.tbaapi.v3client.models.*;
import net.thefletcher.tbaapi.v3client.api.ListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ListApi apiInstance = new ListApi(defaultClient);
    Integer year = 56; // Integer | Competition Year (or Season). Must be 4 digits.
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      List<Event> result = apiInstance.getEventsByYear(year, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#getEventsByYear");
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

<a name="getEventsByYearKeys"></a>
# **getEventsByYearKeys**
> List&lt;String&gt; getEventsByYearKeys(year, ifModifiedSince)



Gets a list of event keys in the given year.

### Example
```java
// Import classes:
import net.thefletcher.tbaapi.v3client.ApiClient;
import net.thefletcher.tbaapi.v3client.ApiException;
import net.thefletcher.tbaapi.v3client.Configuration;
import net.thefletcher.tbaapi.v3client.auth.*;
import net.thefletcher.tbaapi.v3client.models.*;
import net.thefletcher.tbaapi.v3client.api.ListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ListApi apiInstance = new ListApi(defaultClient);
    Integer year = 56; // Integer | Competition Year (or Season). Must be 4 digits.
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      List<String> result = apiInstance.getEventsByYearKeys(year, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#getEventsByYearKeys");
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

<a name="getEventsByYearSimple"></a>
# **getEventsByYearSimple**
> List&lt;EventSimple&gt; getEventsByYearSimple(year, ifModifiedSince)



Gets a short-form list of events in the given year.

### Example
```java
// Import classes:
import net.thefletcher.tbaapi.v3client.ApiClient;
import net.thefletcher.tbaapi.v3client.ApiException;
import net.thefletcher.tbaapi.v3client.Configuration;
import net.thefletcher.tbaapi.v3client.auth.*;
import net.thefletcher.tbaapi.v3client.models.*;
import net.thefletcher.tbaapi.v3client.api.ListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ListApi apiInstance = new ListApi(defaultClient);
    Integer year = 56; // Integer | Competition Year (or Season). Must be 4 digits.
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      List<EventSimple> result = apiInstance.getEventsByYearSimple(year, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#getEventsByYearSimple");
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
import net.thefletcher.tbaapi.v3client.api.ListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ListApi apiInstance = new ListApi(defaultClient);
    String teamKey = "teamKey_example"; // String | TBA Team Key, eg `frc254`
    Integer year = 56; // Integer | Competition Year (or Season). Must be 4 digits.
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      Map<String, TeamEventStatus> result = apiInstance.getTeamEventsStatusesByYear(teamKey, year, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#getTeamEventsStatusesByYear");
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
import net.thefletcher.tbaapi.v3client.api.ListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ListApi apiInstance = new ListApi(defaultClient);
    Integer pageNum = 56; // Integer | Page number of results to return, zero-indexed
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      List<Team> result = apiInstance.getTeams(pageNum, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#getTeams");
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
import net.thefletcher.tbaapi.v3client.api.ListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ListApi apiInstance = new ListApi(defaultClient);
    Integer year = 56; // Integer | Competition Year (or Season). Must be 4 digits.
    Integer pageNum = 56; // Integer | Page number of results to return, zero-indexed
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      List<Team> result = apiInstance.getTeamsByYear(year, pageNum, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#getTeamsByYear");
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
import net.thefletcher.tbaapi.v3client.api.ListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ListApi apiInstance = new ListApi(defaultClient);
    Integer year = 56; // Integer | Competition Year (or Season). Must be 4 digits.
    Integer pageNum = 56; // Integer | Page number of results to return, zero-indexed
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      List<String> result = apiInstance.getTeamsByYearKeys(year, pageNum, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#getTeamsByYearKeys");
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
import net.thefletcher.tbaapi.v3client.api.ListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ListApi apiInstance = new ListApi(defaultClient);
    Integer year = 56; // Integer | Competition Year (or Season). Must be 4 digits.
    Integer pageNum = 56; // Integer | Page number of results to return, zero-indexed
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      List<TeamSimple> result = apiInstance.getTeamsByYearSimple(year, pageNum, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#getTeamsByYearSimple");
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
import net.thefletcher.tbaapi.v3client.api.ListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ListApi apiInstance = new ListApi(defaultClient);
    Integer pageNum = 56; // Integer | Page number of results to return, zero-indexed
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      List<String> result = apiInstance.getTeamsKeys(pageNum, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#getTeamsKeys");
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
import net.thefletcher.tbaapi.v3client.api.ListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ListApi apiInstance = new ListApi(defaultClient);
    Integer pageNum = 56; // Integer | Page number of results to return, zero-indexed
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      List<TeamSimple> result = apiInstance.getTeamsSimple(pageNum, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#getTeamsSimple");
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

