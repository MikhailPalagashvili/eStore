package com.packt.modern.api.service;

import com.packt.modern.api.entity.OrderEntity;
import com.packt.modern.api.model.NewOrder;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Optional;


public interface OrderService {

    Optional<OrderEntity> addOrder(@Valid NewOrder newOrder);

    Iterable<OrderEntity> getOrdersByCustomerId(@NotNull @Valid String customerId);

    Optional<OrderEntity> getByOrderId(String id);
}
