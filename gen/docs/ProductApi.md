# ProductApi

All URIs are relative to *https://ecommerce.swagger.io/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getProduct**](ProductApi.md#getProduct) | **GET** /api/v1/products/{id} | Returns a product
[**queryProducts**](ProductApi.md#queryProducts) | **GET** /api/v1/products | Returns all the matched products


<a name="getProduct"></a>
# **getProduct**
> Product getProduct(id)

Returns a product

Returns the product that matches the given product ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://ecommerce.swagger.io/v2");

    ProductApi apiInstance = new ProductApi(defaultClient);
    String id = "id_example"; // String | Product Identifier
    try {
      Product result = apiInstance.getProduct(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#getProduct");
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
 **id** | **String**| Product Identifier |

### Return type

[**Product**](Product.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | For successful fetch. |  -  |

<a name="queryProducts"></a>
# **queryProducts**
> List&lt;Product&gt; queryProducts(tag, name, page, size)

Returns all the matched products

Returns the products that matches the given query criteria

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://ecommerce.swagger.io/v2");

    ProductApi apiInstance = new ProductApi(defaultClient);
    String tag = "tag_example"; // String | Product tag
    String name = "name_example"; // String | Product name
    Integer page = 1; // Integer | Query page number
    Integer size = 10; // Integer | Query page size
    try {
      List<Product> result = apiInstance.queryProducts(tag, name, page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#queryProducts");
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
 **tag** | **String**| Product tag | [optional]
 **name** | **String**| Product name | [optional]
 **page** | **Integer**| Query page number | [optional] [default to 1]
 **size** | **Integer**| Query page size | [optional] [default to 10]

### Return type

[**List&lt;Product&gt;**](Product.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | For successful fetch. |  -  |

