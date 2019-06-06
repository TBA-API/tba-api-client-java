# TbaApi

All URIs are relative to *https://www.thebluealliance.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getStatus**](TbaApi.md#getStatus) | **GET** /status | 


<a name="getStatus"></a>
# **getStatus**
> APIStatus getStatus()



Returns API status, and TBA status information.

### Example
```java
// Import classes:
//import net.thefletcher.tbaapi.v3client.ApiClient;
//import net.thefletcher.tbaapi.v3client.ApiException;
//import net.thefletcher.tbaapi.v3client.Configuration;
//import net.thefletcher.tbaapi.v3client.auth.*;
//import net.thefletcher.tbaapi.v3client.api.TbaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

TbaApi apiInstance = new TbaApi();
try {
    APIStatus result = apiInstance.getStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TbaApi#getStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**APIStatus**](APIStatus.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

