# ShippingApi

All URIs are relative to *https://ecommerce.swagger.io/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**shipOrder**](ShippingApi.md#shipOrder) | **POST** /api/v1/shipping | Ship the specified shipping request


<a name="shipOrder"></a>
# **shipOrder**
> Authorization shipOrder(shippingReq)

Ship the specified shipping request

Ship the specified shipping request

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShippingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://ecommerce.swagger.io/v2");

    ShippingApi apiInstance = new ShippingApi(defaultClient);
    ShippingReq shippingReq = new ShippingReq(); // ShippingReq | 
    try {
      Authorization result = apiInstance.shipOrder(shippingReq);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingApi#shipOrder");
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
 **shippingReq** | [**ShippingReq**](ShippingReq.md)|  | [optional]

### Return type

[**Authorization**](Authorization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | For successful fetch. |  -  |

