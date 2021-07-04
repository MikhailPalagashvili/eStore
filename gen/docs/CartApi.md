# CartApi

All URIs are relative to *https://ecommerce.swagger.io/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCartItemsByCustomerId**](CartApi.md#addCartItemsByCustomerId) | **POST** /api/v1/carts/{customerId}/items | Adds an item in shopping cart
[**addOrReplaceItemsByCustomerId**](CartApi.md#addOrReplaceItemsByCustomerId) | **PUT** /api/v1/carts/{customerId}/items | Replace/add an item in shopping cart
[**deleteCart**](CartApi.md#deleteCart) | **DELETE** /api/v1/carts/{customerId} | Delete the shopping cart
[**deleteItemFromCart**](CartApi.md#deleteItemFromCart) | **DELETE** /api/v1/carts/{customerId}/items/{itemId} | Delete the item from shopping cart
[**getCartByCustomerId**](CartApi.md#getCartByCustomerId) | **GET** /api/v1/carts/{customerId} | Returns the shopping cart
[**getCartItemsByCustomerId**](CartApi.md#getCartItemsByCustomerId) | **GET** /api/v1/carts/{customerId}/items | Returns the list of products in user&#39;s shopping cart
[**getCartItemsByItemId**](CartApi.md#getCartItemsByItemId) | **GET** /api/v1/carts/{customerId}/items/{itemId} | Returns given item from user&#39;s shopping cart


<a name="addCartItemsByCustomerId"></a>
# **addCartItemsByCustomerId**
> List&lt;Item&gt; addCartItemsByCustomerId(customerId, item)

Adds an item in shopping cart

Adds an item to the shopping cart if it doesn&#39;t already exist, or increment quantity by the specified number of items if it does.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CartApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://ecommerce.swagger.io/v2");

    CartApi apiInstance = new CartApi(defaultClient);
    String customerId = "customerId_example"; // String | Customer Identifier
    Item item = new Item(); // Item | Item object
    try {
      List<Item> result = apiInstance.addCartItemsByCustomerId(customerId, item);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartApi#addCartItemsByCustomerId");
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
 **item** | [**Item**](Item.md)| Item object | [optional]

### Return type

[**List&lt;Item&gt;**](Item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Item added successfully |  -  |
**404** | Given customer ID doesn&#39;t exist |  -  |

<a name="addOrReplaceItemsByCustomerId"></a>
# **addOrReplaceItemsByCustomerId**
> List&lt;Item&gt; addOrReplaceItemsByCustomerId(customerId, item)

Replace/add an item in shopping cart

Adds an item to the shopping cart if it doesn&#39;t already exist, or replace with given item if it does.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CartApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://ecommerce.swagger.io/v2");

    CartApi apiInstance = new CartApi(defaultClient);
    String customerId = "customerId_example"; // String | Customer Identifier
    Item item = new Item(); // Item | Item object
    try {
      List<Item> result = apiInstance.addOrReplaceItemsByCustomerId(customerId, item);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartApi#addOrReplaceItemsByCustomerId");
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
 **item** | [**Item**](Item.md)| Item object | [optional]

### Return type

[**List&lt;Item&gt;**](Item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Item added successfully |  -  |
**404** | Given customer ID doesn&#39;t exist |  -  |

<a name="deleteCart"></a>
# **deleteCart**
> deleteCart(customerId)

Delete the shopping cart

Deletes the shopping cart of given customer

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CartApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://ecommerce.swagger.io/v2");

    CartApi apiInstance = new CartApi(defaultClient);
    String customerId = "customerId_example"; // String | Customer Identifier
    try {
      apiInstance.deleteCart(customerId);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartApi#deleteCart");
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

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | successful operation |  -  |
**404** | Given customer ID doesn&#39;t exist |  -  |

<a name="deleteItemFromCart"></a>
# **deleteItemFromCart**
> deleteItemFromCart(customerId, itemId)

Delete the item from shopping cart

Deletes the item from shopping cart of given customer

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CartApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://ecommerce.swagger.io/v2");

    CartApi apiInstance = new CartApi(defaultClient);
    String customerId = "customerId_example"; // String | Customer Identifier
    String itemId = "itemId_example"; // String | Item (product) Identifier
    try {
      apiInstance.deleteItemFromCart(customerId, itemId);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartApi#deleteItemFromCart");
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
 **itemId** | **String**| Item (product) Identifier |

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
**202** | Accepts the request, regardless of whether the specified item exists in the cart or not. |  -  |

<a name="getCartByCustomerId"></a>
# **getCartByCustomerId**
> Cart getCartByCustomerId(customerId)

Returns the shopping cart

Returns the shopping cart of given customer

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CartApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://ecommerce.swagger.io/v2");

    CartApi apiInstance = new CartApi(defaultClient);
    String customerId = "customerId_example"; // String | Customer Identifier
    try {
      Cart result = apiInstance.getCartByCustomerId(customerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartApi#getCartByCustomerId");
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

[**Cart**](Cart.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |
**404** | Given customer ID doesn&#39;t exist |  -  |

<a name="getCartItemsByCustomerId"></a>
# **getCartItemsByCustomerId**
> List&lt;Item&gt; getCartItemsByCustomerId(customerId)

Returns the list of products in user&#39;s shopping cart

Returns the items in shopping cart of given customer

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CartApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://ecommerce.swagger.io/v2");

    CartApi apiInstance = new CartApi(defaultClient);
    String customerId = "customerId_example"; // String | Customer Identifier
    try {
      List<Item> result = apiInstance.getCartItemsByCustomerId(customerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartApi#getCartItemsByCustomerId");
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

[**List&lt;Item&gt;**](Item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |
**404** | Given customer ID doesn&#39;t exist |  -  |

<a name="getCartItemsByItemId"></a>
# **getCartItemsByItemId**
> Item getCartItemsByItemId(customerId, itemId)

Returns given item from user&#39;s shopping cart

Returns given item from shopping cart of given customer

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CartApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://ecommerce.swagger.io/v2");

    CartApi apiInstance = new CartApi(defaultClient);
    String customerId = "customerId_example"; // String | Customer Identifier
    String itemId = "itemId_example"; // String | Item (product) Identifier
    try {
      Item result = apiInstance.getCartItemsByItemId(customerId, itemId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartApi#getCartItemsByItemId");
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
 **itemId** | **String**| Item (product) Identifier |

### Return type

[**Item**](Item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | If item exists in cart |  -  |
**404** | Given item (product) ID doesn&#39;t exist |  -  |

