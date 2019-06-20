# TbaApi

All URIs are relative to *https://www.thebluealliance.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getStatus**](TbaApi.md#getStatus) | **GET** /status | 


<a name="getStatus"></a>
# **getStatus**
> APIStatus getStatus(ifModifiedSince)



Returns API status, and TBA status information.

### Example
```java
// Import classes:
import net.thefletcher.tbaapi.v3client.ApiClient;
import net.thefletcher.tbaapi.v3client.ApiException;
import net.thefletcher.tbaapi.v3client.Configuration;
import net.thefletcher.tbaapi.v3client.auth.*;
import net.thefletcher.tbaapi.v3client.models.*;
import net.thefletcher.tbaapi.v3client.api.TbaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.thebluealliance.com/api/v3");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    TbaApi apiInstance = new TbaApi(defaultClient);
    String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
    try {
      APIStatus result = apiInstance.getStatus(ifModifiedSince);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TbaApi#getStatus");
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
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**APIStatus**](APIStatus.md)

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

