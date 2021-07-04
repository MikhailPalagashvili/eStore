/*
 * Sample Ecommerce App
 * 'This is a ***sample ecommerce app API***.  You can find out more about Swagger at [swagger.io](http://swagger.io). Description supports markdown markup. For example, you can use the `inline code` using back ticks.' 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: mikhailpala@gmail.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.Shipment;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShipmentApi {
    private ApiClient localVarApiClient;

    public ShipmentApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ShipmentApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getShipmentByOrderId
     * @param id Order Identifier (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> For successful fetch. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getShipmentByOrderIdCall(String id, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/shipping"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getShipmentByOrderIdValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getShipmentByOrderId(Async)");
        }
        

        okhttp3.Call localVarCall = getShipmentByOrderIdCall(id, _callback);
        return localVarCall;

    }

    /**
     * Return the Shipment
     * Return the Shipment for the specified order
     * @param id Order Identifier (required)
     * @return List&lt;Shipment&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> For successful fetch. </td><td>  -  </td></tr>
     </table>
     */
    public List<Shipment> getShipmentByOrderId(String id) throws ApiException {
        ApiResponse<List<Shipment>> localVarResp = getShipmentByOrderIdWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * Return the Shipment
     * Return the Shipment for the specified order
     * @param id Order Identifier (required)
     * @return ApiResponse&lt;List&lt;Shipment&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> For successful fetch. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<Shipment>> getShipmentByOrderIdWithHttpInfo(String id) throws ApiException {
        okhttp3.Call localVarCall = getShipmentByOrderIdValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<List<Shipment>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Return the Shipment (asynchronously)
     * Return the Shipment for the specified order
     * @param id Order Identifier (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> For successful fetch. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getShipmentByOrderIdAsync(String id, final ApiCallback<List<Shipment>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getShipmentByOrderIdValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<List<Shipment>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}