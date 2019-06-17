/*
 * The Blue Alliance API v3
 * # Overview    Information and statistics about FIRST Robotics Competition teams and events.   # Authentication   All endpoints require an Auth Key to be passed in the header `X-TBA-Auth-Key`. If you do not have an auth key yet, you can obtain one from your [Account Page](/account).    A `User-Agent` header may need to be set to prevent a 403 Unauthorized error.
 *
 * The version of the OpenAPI document: 3.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package net.thefletcher.tbaapi.v3client.api;

import net.thefletcher.tbaapi.v3client.ApiCallback;
import net.thefletcher.tbaapi.v3client.ApiClient;
import net.thefletcher.tbaapi.v3client.ApiException;
import net.thefletcher.tbaapi.v3client.ApiResponse;
import net.thefletcher.tbaapi.v3client.Configuration;
import net.thefletcher.tbaapi.v3client.Pair;
import net.thefletcher.tbaapi.v3client.ProgressRequestBody;
import net.thefletcher.tbaapi.v3client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import net.thefletcher.tbaapi.v3client.model.APIStatus;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TbaApi {
    private ApiClient localVarApiClient;

    public TbaApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TbaApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getStatus
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getStatusCall(String ifModifiedSince, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/status";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifModifiedSince != null) {
            localVarHeaderParams.put("If-Modified-Since", localVarApiClient.parameterToString(ifModifiedSince));
        }

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "apiKey" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getStatusValidateBeforeCall(String ifModifiedSince, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getStatusCall(ifModifiedSince, _callback);
        return localVarCall;

    }

    /**
     * 
     * Returns API status, and TBA status information.
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return APIStatus
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public APIStatus getStatus(String ifModifiedSince) throws ApiException {
        ApiResponse<APIStatus> localVarResp = getStatusWithHttpInfo(ifModifiedSince);
        return localVarResp.getData();
    }

    /**
     * 
     * Returns API status, and TBA status information.
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @return ApiResponse&lt;APIStatus&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<APIStatus> getStatusWithHttpInfo(String ifModifiedSince) throws ApiException {
        okhttp3.Call localVarCall = getStatusValidateBeforeCall(ifModifiedSince, null);
        Type localVarReturnType = new TypeToken<APIStatus>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Returns API status, and TBA status information.
     * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getStatusAsync(String ifModifiedSince, final ApiCallback<APIStatus> _callback) throws ApiException {

        okhttp3.Call localVarCall = getStatusValidateBeforeCall(ifModifiedSince, _callback);
        Type localVarReturnType = new TypeToken<APIStatus>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
