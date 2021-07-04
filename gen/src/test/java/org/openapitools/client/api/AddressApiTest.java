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
import org.openapitools.client.model.AddAddressReq;
import org.openapitools.client.model.Address;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AddressApi
 */
@Ignore
public class AddressApiTest {

    private final AddressApi api = new AddressApi();

    
    /**
     * Creates a new user addresses
     *
     * Creates a new user addresses. Does nothing if address already exists.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAddressTest() throws ApiException {
        AddAddressReq addAddressReq = null;
        Address response = api.createAddress(addAddressReq);

        // TODO: test validations
    }
    
    /**
     * Deletes user&#39;s address
     *
     * Deletes user&#39;s address based on given address ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAddressesByIdTest() throws ApiException {
        String id = null;
        api.deleteAddressesById(id);

        // TODO: test validations
    }
    
    /**
     * Returns user&#39;s address
     *
     * Returns user&#39;s address based on given address ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAddressesByIdTest() throws ApiException {
        String id = null;
        Address response = api.getAddressesById(id);

        // TODO: test validations
    }
    
    /**
     * Returns all user&#39;s addresses
     *
     * Returns all user&#39;s addresses, else empty collection
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllAddressesTest() throws ApiException {
        List<Address> response = api.getAllAddresses();

        // TODO: test validations
    }
    
}
