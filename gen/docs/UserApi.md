# UserApi

All URIs are relative to *https://ecommerce.swagger.io/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAccessToken**](UserApi.md#getAccessToken) | **POST** /api/v1/auth/token/refresh | Provides new JWT based on valid refresh token.
[**signIn**](UserApi.md#signIn) | **POST** /api/v1/auth/token | Signin the customer (user)
[**signOut**](UserApi.md#signOut) | **DELETE** /api/v1/auth/token | Signouts the customer (user)
[**signUp**](UserApi.md#signUp) | **POST** /api/v1/users | Signup the a new customer (user)


<a name="getAccessToken"></a>
# **getAccessToken**
> SignedInUser getAccessToken(refreshToken)

Provides new JWT based on valid refresh token.

Provides new JWT based on valid refresh token.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://ecommerce.swagger.io/v2");

    UserApi apiInstance = new UserApi(defaultClient);
    RefreshToken refreshToken = new RefreshToken(); // RefreshToken | 
    try {
      SignedInUser result = apiInstance.getAccessToken(refreshToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#getAccessToken");
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
 **refreshToken** | [**RefreshToken**](RefreshToken.md)|  | [optional]

### Return type

[**SignedInUser**](SignedInUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | For successful operation. |  -  |

<a name="signIn"></a>
# **signIn**
> SignedInUser signIn(signInReq)

Signin the customer (user)

Signin the customer (user) that generates the JWT (access token) and refresh token, which can be used for accessing APIs.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://ecommerce.swagger.io/v2");

    UserApi apiInstance = new UserApi(defaultClient);
    SignInReq signInReq = new SignInReq(); // SignInReq | 
    try {
      SignedInUser result = apiInstance.signIn(signInReq);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#signIn");
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
 **signInReq** | [**SignInReq**](SignInReq.md)|  | [optional]

### Return type

[**SignedInUser**](SignedInUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | For user sign-in. Once successful, user receives the access and refresh token. |  -  |

<a name="signOut"></a>
# **signOut**
> signOut(refreshToken)

Signouts the customer (user)

Signouts the customer (user). It removes the refresh token from DB. Last issued JWT should be removed from client end that if not removed last for given expiration time.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://ecommerce.swagger.io/v2");

    UserApi apiInstance = new UserApi(defaultClient);
    RefreshToken refreshToken = new RefreshToken(); // RefreshToken | 
    try {
      apiInstance.signOut(refreshToken);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#signOut");
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
 **refreshToken** | [**RefreshToken**](RefreshToken.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Accepts the request for logout. |  -  |

<a name="signUp"></a>
# **signUp**
> SignedInUser signUp(user)

Signup the a new customer (user)

Creates a new customer (user), who can login and do the shopping.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://ecommerce.swagger.io/v2");

    UserApi apiInstance = new UserApi(defaultClient);
    User user = new User(); // User | 
    try {
      SignedInUser result = apiInstance.signUp(user);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#signUp");
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
 **user** | [**User**](User.md)|  | [optional]

### Return type

[**SignedInUser**](SignedInUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | For successful user creation. |  -  |

