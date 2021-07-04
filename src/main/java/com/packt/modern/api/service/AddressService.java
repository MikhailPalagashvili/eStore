package com.packt.modern.api.service;

import com.packt.modern.api.entity.AddressEntity;
import com.packt.modern.api.model.AddAddressReq;

import java.util.Optional;

/**
 * @author : github.com/sharmasourabh
 * @project : Chapter06 - Modern API Development with Spring and Spring Boot
 **/
public interface AddressService {
    Optional<AddressEntity> createAddress(AddAddressReq addAddressReq);

    void deleteAddressesById(String id);

    Optional<AddressEntity> getAddressesById(String id);

    Iterable<AddressEntity> getAllAddresses();
}