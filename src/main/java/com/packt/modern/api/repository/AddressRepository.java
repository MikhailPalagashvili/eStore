package com.packt.modern.api.repository;

import com.packt.modern.api.entity.AddressEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;


public interface AddressRepository extends CrudRepository<AddressEntity, UUID> {
}

