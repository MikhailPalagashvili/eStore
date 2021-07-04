package com.packt.modern.api.service;

import com.packt.modern.api.entity.AddressEntity;
import com.packt.modern.api.model.AddAddressReq;

import java.util.Optional;

public interface AddressService {
    Optional<AddressEntity> createAddress(AddAddressReq addAddressReq);

    void deleteAddressesById(String id);

    Optional<AddressEntity> getAddressesById(String id);

    Iterable<AddressEntity> getAllAddresses();
}
