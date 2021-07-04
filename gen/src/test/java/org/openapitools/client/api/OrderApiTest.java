/*
 * Sample Ecommerce App
 * 'This is a ***sample ecommerce app API***.  You can find out more about Swagger at [swagger.io](http://swagger.io). Description supports markdown markup. For example, you can use the `inline code` using back ticks.' 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@packtpub.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.NewOrder;
import org.openapitools.client.model.Order;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OrderApi
 */
@Ignore
public class OrderApiTest {

    private final OrderApi api = new OrderApi();

    
    /**
     * Creates a new order for the given order request
     *
     * Creates a new order for the given order request.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addOrderTest() throws ApiException {
        NewOrder newOrder = null;
        Order response = api.addOrder(newOrder);

        // TODO: test validations
    }
    
    /**
     * Returns the order of given order ID
     *
     * Returns orders of given order ID
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getByOrderIdTest() throws ApiException {
        String id = null;
        Order response = api.getByOrderId(id);

        // TODO: test validations
    }
    
    /**
     * Returns the orders of given user
     *
     * Returns orders of given user
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrdersByCustomerIdTest() throws ApiException {
        String customerId = null;
        List<Order> response = api.getOrdersByCustomerId(customerId);

        // TODO: test validations
    }
    
}
