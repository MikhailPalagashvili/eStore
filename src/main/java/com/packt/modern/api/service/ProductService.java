package com.packt.modern.api.service;

import com.packt.modern.api.entity.ProductEntity;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Optional;


@Validated
public interface ProductService {
    @NotNull Iterable<ProductEntity> getAllProducts();

    Optional<ProductEntity> getProduct(@Min(value = 1L, message = "Invalid product ID.") String id);
}