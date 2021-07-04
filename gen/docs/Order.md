

# Order

Represents an order
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Order identifier |  [optional]
**customer** | [**User**](User.md) |  |  [optional]
**address** | [**Address**](Address.md) |  |  [optional]
**card** | [**Card**](Card.md) |  |  [optional]
**date** | **OffsetDateTime** | Order&#39;s data and time details |  [optional]
**items** | [**List&lt;Item&gt;**](Item.md) | Collection of order items. |  [optional]
**total** | **java.math.BigDecimal** | Order total |  [optional]
**payment** | [**Payment**](Payment.md) |  |  [optional]
**shipment** | [**Shipment**](Shipment.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Order Status |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
CREATED | &quot;CREATED&quot;
PAID | &quot;PAID&quot;
SHIPPED | &quot;SHIPPED&quot;
PAYMENT_FAILED | &quot;PAYMENT_FAILED&quot;
SHIPMENT_FAILED | &quot;SHIPMENT_FAILED&quot;
COMPLETED | &quot;COMPLETED&quot;



