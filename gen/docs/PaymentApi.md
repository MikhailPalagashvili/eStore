# PaymentApi

All URIs are relative to *https://ecommerce.swagger.io/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authorize**](PaymentApi.md#authorize) | **POST** /api/v1/payments | Authorize a payment request
[**getOrdersPaymentAuthorization**](PaymentApi.md#getOrdersPaymentAuthorization) | **GET** /api/v1/payments | Returns the payment authorization


<a name="authorize"></a>
# **authorize**
> Authorization authorize(paymentReq)

Authorize a payment request

Authorize a payment request.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://ecommerce.swagger.io/v2");

    PaymentApi apiInstance = new PaymentApi(defaultClient);
    PaymentReq paymentReq = new PaymentReq(); // PaymentReq | 
    try {
      Authorization result = apiInstance.authorize(paymentReq);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#authorize");
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
 **paymentReq** | [**PaymentReq**](PaymentReq.md)|  | [optional]

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
**200** | For successful fetch. |  -  |

<a name="getOrdersPaymentAuthorization"></a>
# **getOrdersPaymentAuthorization**
> Authorization getOrdersPaymentAuthorization(orderId)

Returns the payment authorization

Return the payment authorization for the specified order

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://ecommerce.swagger.io/v2");

    PaymentApi apiInstance = new PaymentApi(defaultClient);
    String orderId = "orderId_example"; // String | Order Identifier
    try {
      Authorization result = apiInstance.getOrdersPaymentAuthorization(orderId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#getOrdersPaymentAuthorization");
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
 **orderId** | **String**| Order Identifier |

### Return type

[**Authorization**](Authorization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | For successful fetch. |  -  |

