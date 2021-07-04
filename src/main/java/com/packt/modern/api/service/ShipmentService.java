package com.packt.modern.api.service;

import com.packt.modern.api.entity.ShipmentEntity;

import javax.validation.constraints.Min;


public interface ShipmentService {
    Iterable<ShipmentEntity> getShipmentByOrderId(@Min(value = 1L, message = "Invalid product ID.") String id);
}
