package com.packt.modern.api.controller;

import com.packt.modern.api.ProductApi;
import com.packt.modern.api.hateoas.ProductRepresentationModelAssembler;
import com.packt.modern.api.model.Product;
import com.packt.modern.api.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

import static org.springframework.http.ResponseEntity.ok;


@RestController
public class ProductController implements ProductApi {

    private final ProductRepresentationModelAssembler assembler;
    private final ProductService service;

    public ProductController(ProductService service, ProductRepresentationModelAssembler assembler) {
        this.service = service;
        this.assembler = assembler;
    }

    @Override
    public ResponseEntity<Product> getProduct(String id) {
        return service.getProduct(id).map(assembler::toModel).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @Override
    public ResponseEntity<List<Product>> queryProducts(@Valid String tag, @Valid String name,
                                                       @Valid Integer page, @Valid Integer size) {
        return ok(assembler.toListModel(service.getAllProducts()));
    }
}
