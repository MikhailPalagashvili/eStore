package com.packt.modern.api.service;

import com.packt.modern.api.entity.ShipmentEntity;
import com.packt.modern.api.repository.ShipmentRepository;
import org.springframework.stereotype.Service;

import javax.validation.constraints.Min;
import java.util.List;
import java.util.UUID;


@Service
public class ShipmentServiceImpl implements ShipmentService {

    private final ShipmentRepository repository;

    public ShipmentServiceImpl(ShipmentRepository repository) {
        this.repository = repository;
    }

    @Override
    public Iterable<ShipmentEntity> getShipmentByOrderId(
            @Min(value = 1L, message = "Invalid shipment ID.") String id) {
        return repository.findAllById(List.of(UUID.fromString(id)));
    }
}
