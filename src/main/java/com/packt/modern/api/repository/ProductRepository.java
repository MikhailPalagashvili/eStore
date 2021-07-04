package com.packt.modern.api.repository;

import com.packt.modern.api.entity.ProductEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;


public interface ProductRepository extends CrudRepository<ProductEntity, UUID> {
}

