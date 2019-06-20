# DistrictApi

All URIs are relative to *https://www.thebluealliance.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDistrictEvents**](DistrictApi.md#getDistrictEvents) | **GET** /district/{district_key}/events | 
[**getDistrictEventsKeys**](DistrictApi.md#getDistrictEventsKeys) | **GET** /district/{district_key}/events/keys | 
[**getDistrictEventsSimple**](DistrictApi.md#getDistrictEventsSimple) | **GET** /district/{district_key}/events/simple | 
[**getDistrictRankings**](DistrictApi.md#getDistrictRankings) | **GET** /district/{district_key}/rankings | 
[**getDistrictTeams**](DistrictApi.md#getDistrictTeams) | **GET** /district/{district_key}/teams | 
[**getDistrictTeamsKeys**](DistrictApi.md#getDistrictTeamsKeys) | **GET** /district/{district_key}/teams/keys | 
[**getDistrictTeamsSimple**](DistrictApi.md#getDistrictTeamsSimple) | **GET** /district/{district_key}/teams/simple | 
[**getDistrictsByYear**](DistrictApi.md#getDistrictsByYear) | **GET** /districts/{year} | 
[**getEventDistrictPoints**](DistrictApi.md#getEventDistrictPoints) | **GET** /event/{event_key}/district_points | 
[**getTeamDistricts**](DistrictApi.md#getTeamDistricts) | **GET** /team/{team_key}/districts | 


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
import net.thefletcher.tbaapi.v3client.api.DistrictApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    DistrictApi apiInstance = new DistrictApi(defaultClient);
    String districtKey = "districtKey_example"; // String | TBA District Key, eg `2016fim`
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      List<Event> result = apiInstance.getDistrictEvents(districtKey, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DistrictApi#getDistrictEvents");
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
import net.thefletcher.tbaapi.v3client.api.DistrictApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    DistrictApi apiInstance = new DistrictApi(defaultClient);
    String districtKey = "districtKey_example"; // String | TBA District Key, eg `2016fim`
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      List<String> result = apiInstance.getDistrictEventsKeys(districtKey, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DistrictApi#getDistrictEventsKeys");
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
import net.thefletcher.tbaapi.v3client.api.DistrictApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    DistrictApi apiInstance = new DistrictApi(defaultClient);
    String districtKey = "districtKey_example"; // String | TBA District Key, eg `2016fim`
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      List<EventSimple> result = apiInstance.getDistrictEventsSimple(districtKey, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DistrictApi#getDistrictEventsSimple");
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
import net.thefletcher.tbaapi.v3client.api.DistrictApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    DistrictApi apiInstance = new DistrictApi(defaultClient);
    String districtKey = "districtKey_example"; // String | TBA District Key, eg `2016fim`
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      List<DistrictRanking> result = apiInstance.getDistrictRankings(districtKey, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DistrictApi#getDistrictRankings");
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
import net.thefletcher.tbaapi.v3client.api.DistrictApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    DistrictApi apiInstance = new DistrictApi(defaultClient);
    String districtKey = "districtKey_example"; // String | TBA District Key, eg `2016fim`
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      List<Team> result = apiInstance.getDistrictTeams(districtKey, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DistrictApi#getDistrictTeams");
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
import net.thefletcher.tbaapi.v3client.api.DistrictApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    DistrictApi apiInstance = new DistrictApi(defaultClient);
    String districtKey = "districtKey_example"; // String | TBA District Key, eg `2016fim`
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      List<String> result = apiInstance.getDistrictTeamsKeys(districtKey, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DistrictApi#getDistrictTeamsKeys");
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
import net.thefletcher.tbaapi.v3client.api.DistrictApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    DistrictApi apiInstance = new DistrictApi(defaultClient);
    String districtKey = "districtKey_example"; // String | TBA District Key, eg `2016fim`
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      List<TeamSimple> result = apiInstance.getDistrictTeamsSimple(districtKey, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DistrictApi#getDistrictTeamsSimple");
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

<a name="getDistrictsByYear"></a>
# **getDistrictsByYear**
> List&lt;DistrictList&gt; getDistrictsByYear(year, ifModifiedSince)



Gets a list of districts and their corresponding district key, for the given year.

### Example
```java
// Import classes:
import net.thefletcher.tbaapi.v3client.ApiClient;
import net.thefletcher.tbaapi.v3client.ApiException;
import net.thefletcher.tbaapi.v3client.Configuration;
import net.thefletcher.tbaapi.v3client.auth.*;
import net.thefletcher.tbaapi.v3client.models.*;
import net.thefletcher.tbaapi.v3client.api.DistrictApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    DistrictApi apiInstance = new DistrictApi(defaultClient);
    Integer year = 56; // Integer | Competition Year (or Season). Must be 4 digits.
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      List<DistrictList> result = apiInstance.getDistrictsByYear(year, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DistrictApi#getDistrictsByYear");
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

<a name="getEventDistrictPoints"></a>
# **getEventDistrictPoints**
> EventDistrictPoints getEventDistrictPoints(eventKey, ifModifiedSince)



Gets a list of team rankings for the Event.

### Example
```java
// Import classes:
import net.thefletcher.tbaapi.v3client.ApiClient;
import net.thefletcher.tbaapi.v3client.ApiException;
import net.thefletcher.tbaapi.v3client.Configuration;
import net.thefletcher.tbaapi.v3client.auth.*;
import net.thefletcher.tbaapi.v3client.models.*;
import net.thefletcher.tbaapi.v3client.api.DistrictApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    DistrictApi apiInstance = new DistrictApi(defaultClient);
    String eventKey = "eventKey_example"; // String | TBA Event Key, eg `2016nytr`
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      EventDistrictPoints result = apiInstance.getEventDistrictPoints(eventKey, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DistrictApi#getEventDistrictPoints");
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

[**EventDistrictPoints**](EventDistrictPoints.md)

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
import net.thefletcher.tbaapi.v3client.api.DistrictApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    DistrictApi apiInstance = new DistrictApi(defaultClient);
    String teamKey = "teamKey_example"; // String | TBA Team Key, eg `frc254`
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      List<DistrictList> result = apiInstance.getTeamDistricts(teamKey, ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DistrictApi#getTeamDistricts");
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

