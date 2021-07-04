# ShipmentApi

All URIs are relative to *https://ecommerce.swagger.io/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getShipmentByOrderId**](ShipmentApi.md#getShipmentByOrderId) | **GET** /api/v1/shipping | Return the Shipment


<a name="getShipmentByOrderId"></a>
# **getShipmentByOrderId**
> List&lt;Shipment&gt; getShipmentByOrderId(id)

Return the Shipment

Return the Shipment for the specified order

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://ecommerce.swagger.io/v2");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    String id = "id_example"; // String | Order Identifier
    try {
      List<Shipment> result = apiInstance.getShipmentByOrderId(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#getShipmentByOrderId");
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

[**List&lt;Shipment&gt;**](Shipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | For successful fetch. |  -  |

