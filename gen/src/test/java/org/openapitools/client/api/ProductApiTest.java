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
import org.openapitools.client.model.Product;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProductApi
 */
@Ignore
public class ProductApiTest {

    private final ProductApi api = new ProductApi();

    
    /**
     * Returns a product
     *
     * Returns the product that matches the given product ID
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProductTest() throws ApiException {
        String id = null;
        Product response = api.getProduct(id);

        // TODO: test validations
    }
    
    /**
     * Returns all the matched products
     *
     * Returns the products that matches the given query criteria
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void queryProductsTest() throws ApiException {
        String tag = null;
        String name = null;
        Integer page = null;
        Integer size = null;
        List<Product> response = api.queryProducts(tag, name, page, size);

        // TODO: test validations
    }
    
}