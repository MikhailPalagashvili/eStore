package com.packt.modern.api.repository;

import com.packt.modern.api.entity.AddressEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

/**
 * @author : github.com/sharmasourabh
 * @project : Chapter06 - Modern API Development with Spring and Spring Boot
 **/
public interface AddressRepository extends CrudRepository<AddressEntity, UUID> {
}

