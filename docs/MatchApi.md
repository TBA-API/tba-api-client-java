# MatchApi

All URIs are relative to *https://www.thebluealliance.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEventMatchTimeseries**](MatchApi.md#getEventMatchTimeseries) | **GET** /event/{event_key}/matches/timeseries | 
[**getEventMatches**](MatchApi.md#getEventMatches) | **GET** /event/{event_key}/matches | 
[**getEventMatchesKeys**](MatchApi.md#getEventMatchesKeys) | **GET** /event/{event_key}/matches/keys | 
[**getEventMatchesSimple**](MatchApi.md#getEventMatchesSimple) | **GET** /event/{event_key}/matches/simple | 
[**getMatch**](MatchApi.md#getMatch) | **GET** /match/{match_key} | 
[**getMatchSimple**](MatchApi.md#getMatchSimple) | **GET** /match/{match_key}/simple | 
[**getMatchTimeseries**](MatchApi.md#getMatchTimeseries) | **GET** /match/{match_key}/timeseries | 
[**getTeamEventMatches**](MatchApi.md#getTeamEventMatches) | **GET** /team/{team_key}/event/{event_key}/matches | 
[**getTeamEventMatchesKeys**](MatchApi.md#getTeamEventMatchesKeys) | **GET** /team/{team_key}/event/{event_key}/matches/keys | 
[**getTeamEventMatchesSimple**](MatchApi.md#getTeamEventMatchesSimple) | **GET** /team/{team_key}/event/{event_key}/matches/simple | 
[**getTeamMatchesByYear**](MatchApi.md#getTeamMatchesByYear) | **GET** /team/{team_key}/matches/{year} | 
[**getTeamMatchesByYearKeys**](MatchApi.md#getTeamMatchesByYearKeys) | **GET** /team/{team_key}/matches/{year}/keys | 
[**getTeamMatchesByYearSimple**](MatchApi.md#getTeamMatchesByYearSimple) | **GET** /team/{team_key}/matches/{year}/simple | 


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
//import net.thefletcher.tbaapi.v3client.api.MatchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

MatchApi apiInstance = new MatchApi();
try {
    List<String> result = apiInstance.getEventMatchTimeseries();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MatchApi#getEventMatchTimeseries");
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
//import net.thefletcher.tbaapi.v3client.api.MatchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

MatchApi apiInstance = new MatchApi();
try {
    List<Match> result = apiInstance.getEventMatches();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MatchApi#getEventMatches");
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
//import net.thefletcher.tbaapi.v3client.api.MatchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

MatchApi apiInstance = new MatchApi();
try {
    List<String> result = apiInstance.getEventMatchesKeys();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MatchApi#getEventMatchesKeys");
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
//import net.thefletcher.tbaapi.v3client.api.MatchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

MatchApi apiInstance = new MatchApi();
try {
    List<MatchSimple> result = apiInstance.getEventMatchesSimple();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MatchApi#getEventMatchesSimple");
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

<a name="getMatch"></a>
# **getMatch**
> Match getMatch()



Gets a &#x60;Match&#x60; object for the given match key.

### Example
```java
// Import classes:
//import net.thefletcher.tbaapi.v3client.ApiClient;
//import net.thefletcher.tbaapi.v3client.ApiException;
//import net.thefletcher.tbaapi.v3client.Configuration;
//import net.thefletcher.tbaapi.v3client.auth.*;
//import net.thefletcher.tbaapi.v3client.api.MatchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

MatchApi apiInstance = new MatchApi();
try {
    Match result = apiInstance.getMatch();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MatchApi#getMatch");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Match**](Match.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMatchSimple"></a>
# **getMatchSimple**
> MatchSimple getMatchSimple()



Gets a short-form &#x60;Match&#x60; object for the given match key.

### Example
```java
// Import classes:
//import net.thefletcher.tbaapi.v3client.ApiClient;
//import net.thefletcher.tbaapi.v3client.ApiException;
//import net.thefletcher.tbaapi.v3client.Configuration;
//import net.thefletcher.tbaapi.v3client.auth.*;
//import net.thefletcher.tbaapi.v3client.api.MatchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

MatchApi apiInstance = new MatchApi();
try {
    MatchSimple result = apiInstance.getMatchSimple();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MatchApi#getMatchSimple");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MatchSimple**](MatchSimple.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMatchTimeseries"></a>
# **getMatchTimeseries**
> List&lt;Object&gt; getMatchTimeseries()



Gets an array of game-specific Match Timeseries objects for the given match key or an empty array if not available. *WARNING:* This is *not* official data, and is subject to a significant possibility of error, or missing data. Do not rely on this data for any purpose. In fact, pretend we made it up. *WARNING:* This endpoint and corresponding data models are under *active development* and may change at any time, including in breaking ways.

### Example
```java
// Import classes:
//import net.thefletcher.tbaapi.v3client.ApiClient;
//import net.thefletcher.tbaapi.v3client.ApiException;
//import net.thefletcher.tbaapi.v3client.Configuration;
//import net.thefletcher.tbaapi.v3client.auth.*;
//import net.thefletcher.tbaapi.v3client.api.MatchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

MatchApi apiInstance = new MatchApi();
try {
    List<Object> result = apiInstance.getMatchTimeseries();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MatchApi#getMatchTimeseries");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;Object&gt;**

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
//import net.thefletcher.tbaapi.v3client.api.MatchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

MatchApi apiInstance = new MatchApi();
try {
    List<Match> result = apiInstance.getTeamEventMatches();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MatchApi#getTeamEventMatches");
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
//import net.thefletcher.tbaapi.v3client.api.MatchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

MatchApi apiInstance = new MatchApi();
try {
    List<String> result = apiInstance.getTeamEventMatchesKeys();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MatchApi#getTeamEventMatchesKeys");
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
//import net.thefletcher.tbaapi.v3client.api.MatchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

MatchApi apiInstance = new MatchApi();
try {
    List<Match> result = apiInstance.getTeamEventMatchesSimple();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MatchApi#getTeamEventMatchesSimple");
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
//import net.thefletcher.tbaapi.v3client.api.MatchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

MatchApi apiInstance = new MatchApi();
try {
    List<Match> result = apiInstance.getTeamMatchesByYear();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MatchApi#getTeamMatchesByYear");
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
//import net.thefletcher.tbaapi.v3client.api.MatchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

MatchApi apiInstance = new MatchApi();
try {
    List<String> result = apiInstance.getTeamMatchesByYearKeys();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MatchApi#getTeamMatchesByYearKeys");
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
//import net.thefletcher.tbaapi.v3client.api.MatchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

MatchApi apiInstance = new MatchApi();
try {
    List<MatchSimple> result = apiInstance.getTeamMatchesByYearSimple();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MatchApi#getTeamMatchesByYearSimple");
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

