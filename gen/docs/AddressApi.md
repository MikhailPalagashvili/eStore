# AddressApi

All URIs are relative to *https://ecommerce.swagger.io/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAddress**](AddressApi.md#createAddress) | **POST** /api/v1/addresses | Creates a new user addresses
[**deleteAddressesById**](AddressApi.md#deleteAddressesById) | **DELETE** /api/v1/addresses/{id} | Deletes user&#39;s address
[**getAddressesById**](AddressApi.md#getAddressesById) | **GET** /api/v1/addresses/{id} | Returns user&#39;s address
[**getAllAddresses**](AddressApi.md#getAllAddresses) | **GET** /api/v1/addresses | Returns all user&#39;s addresses


<a name="createAddress"></a>
# **createAddress**
> Address createAddress(addAddressReq)

Creates a new user addresses

Creates a new user addresses. Does nothing if address already exists.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AddressApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://ecommerce.swagger.io/v2");

    AddressApi apiInstance = new AddressApi(defaultClient);
    AddAddressReq addAddressReq = new AddAddressReq(); // AddAddressReq | 
    try {
      Address result = apiInstance.createAddress(addAddressReq);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AddressApi#createAddress");
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
 **addAddressReq** | [**AddAddressReq**](AddAddressReq.md)|  | [optional]

### Return type

[**Address**](Address.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | For successful fetch. |  -  |

<a name="deleteAddressesById"></a>
# **deleteAddressesById**
> deleteAddressesById(id)

Deletes user&#39;s address

Deletes user&#39;s address based on given address ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AddressApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://ecommerce.swagger.io/v2");

    AddressApi apiInstance = new AddressApi(defaultClient);
    String id = "id_example"; // String | address Identifier
    try {
      apiInstance.deleteAddressesById(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling AddressApi#deleteAddressesById");
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
 **id** | **String**| address Identifier |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Accepts the deletion request and perform deletion. If ID does not exist, does nothing. |  -  |

<a name="getAddressesById"></a>
# **getAddressesById**
> Address getAddressesById(id)

Returns user&#39;s address

Returns user&#39;s address based on given address ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AddressApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://ecommerce.swagger.io/v2");

    AddressApi apiInstance = new AddressApi(defaultClient);
    String id = "id_example"; // String | address Identifier
    try {
      Address result = apiInstance.getAddressesById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AddressApi#getAddressesById");
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
 **id** | **String**| address Identifier |

### Return type

[**Address**](Address.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | For successful fetch. |  -  |

<a name="getAllAddresses"></a>
# **getAllAddresses**
> List&lt;Address&gt; getAllAddresses()

Returns all user&#39;s addresses

Returns all user&#39;s addresses, else empty collection

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AddressApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://ecommerce.swagger.io/v2");

    AddressApi apiInstance = new AddressApi(defaultClient);
    try {
      List<Address> result = apiInstance.getAllAddresses();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AddressApi#getAllAddresses");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Address&gt;**](Address.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | For successful fetch. |  -  |

