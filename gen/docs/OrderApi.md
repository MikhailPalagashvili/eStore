# OrderApi

All URIs are relative to *https://ecommerce.swagger.io/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addOrder**](OrderApi.md#addOrder) | **POST** /api/v1/orders | Creates a new order for the given order request
[**getByOrderId**](OrderApi.md#getByOrderId) | **GET** /api/v1/orders/{id} | Returns the order of given order ID
[**getOrdersByCustomerId**](OrderApi.md#getOrdersByCustomerId) | **GET** /api/v1/orders | Returns the orders of given user


<a name="addOrder"></a>
# **addOrder**
> Order addOrder(newOrder)

Creates a new order for the given order request

Creates a new order for the given order request.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://ecommerce.swagger.io/v2");

    OrderApi apiInstance = new OrderApi(defaultClient);
    NewOrder newOrder = new NewOrder(); // NewOrder | New Order Request object
    try {
      Order result = apiInstance.addOrder(newOrder);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#addOrder");
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
 **newOrder** | [**NewOrder**](NewOrder.md)| New Order Request object | [optional]

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Order added successfully |  -  |
**406** | If payment is not authorized. |  -  |

<a name="getByOrderId"></a>
# **getByOrderId**
> Order getByOrderId(id)

Returns the order of given order ID

Returns orders of given order ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://ecommerce.swagger.io/v2");

    OrderApi apiInstance = new OrderApi(defaultClient);
    String id = "id_example"; // String | Order Identifier
    try {
      Order result = apiInstance.getByOrderId(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#getByOrderId");
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
 **id** | **String**| Order Identifier |

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | If order exists. |  -  |
**404** | Order doesn&#39;t exist for given user. |  -  |

<a name="getOrdersByCustomerId"></a>
# **getOrdersByCustomerId**
> List&lt;Order&gt; getOrdersByCustomerId(customerId)

Returns the orders of given user

Returns orders of given user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://ecommerce.swagger.io/v2");

    OrderApi apiInstance = new OrderApi(defaultClient);
    String customerId = "customerId_example"; // String | Customer Identifier
    try {
      List<Order> result = apiInstance.getOrdersByCustomerId(customerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#getOrdersByCustomerId");
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
 **customerId** | **String**| Customer Identifier |

### Return type

[**List&lt;Order&gt;**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | If order exists. |  -  |
**404** | Order doesn&#39;t exist for given user. |  -  |

