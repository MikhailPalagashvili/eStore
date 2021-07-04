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


import org.openapitools.client.model.RefreshToken;
import org.openapitools.client.model.SignInReq;
import org.openapitools.client.model.SignedInUser;
import org.openapitools.client.model.User;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserApi {
    private ApiClient localVarApiClient;

    public UserApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UserApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getAccessToken
     * @param refreshToken  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> For successful operation. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAccessTokenCall(RefreshToken refreshToken, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = refreshToken;

        // create path and map variables
        String localVarPath = "/api/v1/auth/token/refresh";

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
            "application/xml", "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAccessTokenValidateBeforeCall(RefreshToken refreshToken, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getAccessTokenCall(refreshToken, _callback);
        return localVarCall;

    }

    /**
     * Provides new JWT based on valid refresh token.
     * Provides new JWT based on valid refresh token.
     * @param refreshToken  (optional)
     * @return SignedInUser
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> For successful operation. </td><td>  -  </td></tr>
     </table>
     */
    public SignedInUser getAccessToken(RefreshToken refreshToken) throws ApiException {
        ApiResponse<SignedInUser> localVarResp = getAccessTokenWithHttpInfo(refreshToken);
        return localVarResp.getData();
    }

    /**
     * Provides new JWT based on valid refresh token.
     * Provides new JWT based on valid refresh token.
     * @param refreshToken  (optional)
     * @return ApiResponse&lt;SignedInUser&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> For successful operation. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SignedInUser> getAccessTokenWithHttpInfo(RefreshToken refreshToken) throws ApiException {
        okhttp3.Call localVarCall = getAccessTokenValidateBeforeCall(refreshToken, null);
        Type localVarReturnType = new TypeToken<SignedInUser>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Provides new JWT based on valid refresh token. (asynchronously)
     * Provides new JWT based on valid refresh token.
     * @param refreshToken  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> For successful operation. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAccessTokenAsync(RefreshToken refreshToken, final ApiCallback<SignedInUser> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAccessTokenValidateBeforeCall(refreshToken, _callback);
        Type localVarReturnType = new TypeToken<SignedInUser>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for signIn
     * @param signInReq  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> For user sign-in. Once successful, user receives the access and refresh token. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call signInCall(SignInReq signInReq, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = signInReq;

        // create path and map variables
        String localVarPath = "/api/v1/auth/token";

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
            "application/xml", "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call signInValidateBeforeCall(SignInReq signInReq, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = signInCall(signInReq, _callback);
        return localVarCall;

    }

    /**
     * Signin the customer (user)
     * Signin the customer (user) that generates the JWT (access token) and refresh token, which can be used for accessing APIs.
     * @param signInReq  (optional)
     * @return SignedInUser
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> For user sign-in. Once successful, user receives the access and refresh token. </td><td>  -  </td></tr>
     </table>
     */
    public SignedInUser signIn(SignInReq signInReq) throws ApiException {
        ApiResponse<SignedInUser> localVarResp = signInWithHttpInfo(signInReq);
        return localVarResp.getData();
    }

    /**
     * Signin the customer (user)
     * Signin the customer (user) that generates the JWT (access token) and refresh token, which can be used for accessing APIs.
     * @param signInReq  (optional)
     * @return ApiResponse&lt;SignedInUser&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> For user sign-in. Once successful, user receives the access and refresh token. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SignedInUser> signInWithHttpInfo(SignInReq signInReq) throws ApiException {
        okhttp3.Call localVarCall = signInValidateBeforeCall(signInReq, null);
        Type localVarReturnType = new TypeToken<SignedInUser>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Signin the customer (user) (asynchronously)
     * Signin the customer (user) that generates the JWT (access token) and refresh token, which can be used for accessing APIs.
     * @param signInReq  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> For user sign-in. Once successful, user receives the access and refresh token. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call signInAsync(SignInReq signInReq, final ApiCallback<SignedInUser> _callback) throws ApiException {

        okhttp3.Call localVarCall = signInValidateBeforeCall(signInReq, _callback);
        Type localVarReturnType = new TypeToken<SignedInUser>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for signOut
     * @param refreshToken  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Accepts the request for logout. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call signOutCall(RefreshToken refreshToken, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = refreshToken;

        // create path and map variables
        String localVarPath = "/api/v1/auth/token";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call signOutValidateBeforeCall(RefreshToken refreshToken, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = signOutCall(refreshToken, _callback);
        return localVarCall;

    }

    /**
     * Signouts the customer (user)
     * Signouts the customer (user). It removes the refresh token from DB. Last issued JWT should be removed from client end that if not removed last for given expiration time.
     * @param refreshToken  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Accepts the request for logout. </td><td>  -  </td></tr>
     </table>
     */
    public void signOut(RefreshToken refreshToken) throws ApiException {
        signOutWithHttpInfo(refreshToken);
    }

    /**
     * Signouts the customer (user)
     * Signouts the customer (user). It removes the refresh token from DB. Last issued JWT should be removed from client end that if not removed last for given expiration time.
     * @param refreshToken  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Accepts the request for logout. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> signOutWithHttpInfo(RefreshToken refreshToken) throws ApiException {
        okhttp3.Call localVarCall = signOutValidateBeforeCall(refreshToken, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Signouts the customer (user) (asynchronously)
     * Signouts the customer (user). It removes the refresh token from DB. Last issued JWT should be removed from client end that if not removed last for given expiration time.
     * @param refreshToken  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Accepts the request for logout. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call signOutAsync(RefreshToken refreshToken, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = signOutValidateBeforeCall(refreshToken, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for signUp
     * @param user  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> For successful user creation. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call signUpCall(User user, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = user;

        // create path and map variables
        String localVarPath = "/api/v1/users";

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
            "application/xml", "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call signUpValidateBeforeCall(User user, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = signUpCall(user, _callback);
        return localVarCall;

    }

    /**
     * Signup the a new customer (user)
     * Creates a new customer (user), who can login and do the shopping.
     * @param user  (optional)
     * @return SignedInUser
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> For successful user creation. </td><td>  -  </td></tr>
     </table>
     */
    public SignedInUser signUp(User user) throws ApiException {
        ApiResponse<SignedInUser> localVarResp = signUpWithHttpInfo(user);
        return localVarResp.getData();
    }

    /**
     * Signup the a new customer (user)
     * Creates a new customer (user), who can login and do the shopping.
     * @param user  (optional)
     * @return ApiResponse&lt;SignedInUser&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> For successful user creation. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SignedInUser> signUpWithHttpInfo(User user) throws ApiException {
        okhttp3.Call localVarCall = signUpValidateBeforeCall(user, null);
        Type localVarReturnType = new TypeToken<SignedInUser>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Signup the a new customer (user) (asynchronously)
     * Creates a new customer (user), who can login and do the shopping.
     * @param user  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> For successful user creation. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call signUpAsync(User user, final ApiCallback<SignedInUser> _callback) throws ApiException {

        okhttp3.Call localVarCall = signUpValidateBeforeCall(user, _callback);
        Type localVarReturnType = new TypeToken<SignedInUser>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}