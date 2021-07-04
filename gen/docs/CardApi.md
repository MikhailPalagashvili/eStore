# CardApi

All URIs are relative to *https://ecommerce.swagger.io/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteCardById**](CardApi.md#deleteCardById) | **DELETE** /api/v1/cards/{id} | Deletes card&#39;s address
[**getAllCards**](CardApi.md#getAllCards) | **GET** /api/v1/cards | Returns all user&#39;s cards
[**getCardById**](CardApi.md#getCardById) | **GET** /api/v1/cards/{id} | Returns user&#39;s card
[**registerCard**](CardApi.md#registerCard) | **POST** /api/v1/cards | Creates a new user addresses


<a name="deleteCardById"></a>
# **deleteCardById**
> deleteCardById(id)

Deletes card&#39;s address

Deletes card&#39;s address based on given card ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CardApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://ecommerce.swagger.io/v2");

    CardApi apiInstance = new CardApi(defaultClient);
    String id = "id_example"; // String | card Identifier
    try {
      apiInstance.deleteCardById(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#deleteCardById");
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
 **id** | **String**| card Identifier |

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

<a name="getAllCards"></a>
# **getAllCards**
> List&lt;Card&gt; getAllCards()

Returns all user&#39;s cards

Returns all user&#39;s cards, else empty collection

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CardApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://ecommerce.swagger.io/v2");

    CardApi apiInstance = new CardApi(defaultClient);
    try {
      List<Card> result = apiInstance.getAllCards();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#getAllCards");
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

[**List&lt;Card&gt;**](Card.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | For successful fetch. |  -  |

<a name="getCardById"></a>
# **getCardById**
> Card getCardById(id)

Returns user&#39;s card

Returns user&#39;s card based on given card ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CardApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://ecommerce.swagger.io/v2");

    CardApi apiInstance = new CardApi(defaultClient);
    String id = "id_example"; // String | card Identifier
    try {
      Card result = apiInstance.getCardById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#getCardById");
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
 **id** | **String**| card Identifier |

### Return type

[**Card**](Card.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | For successful fetch. |  -  |

<a name="registerCard"></a>
# **registerCard**
> Card registerCard(addCardReq)

Creates a new user addresses

Creates a new user addresses. Does nothing if address already exists.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CardApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://ecommerce.swagger.io/v2");

    CardApi apiInstance = new CardApi(defaultClient);
    AddCardReq addCardReq = new AddCardReq(); // AddCardReq | 
    try {
      Card result = apiInstance.registerCard(addCardReq);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#registerCard");
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
 **addCardReq** | [**AddCardReq**](AddCardReq.md)|  | [optional]

### Return type

[**Card**](Card.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | For successful fetch. |  -  |

