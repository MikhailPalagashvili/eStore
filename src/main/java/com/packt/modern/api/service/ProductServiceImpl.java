package com.packt.modern.api.service;

import com.packt.modern.api.entity.ProductEntity;
import com.packt.modern.api.repository.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.UUID;


@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repository;

    public ProductServiceImpl(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public Iterable<ProductEntity> getAllProducts() {
        return repository.findAll();
    }

    @Override
    public Optional<ProductEntity> getProduct(String id) {
        return repository
                .findById(UUID.fromString(id));
    }
}
