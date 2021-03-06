package com.packt.modern.api.controller;

import com.packt.modern.api.ShipmentApi;
import com.packt.modern.api.hateoas.ShipmentRepresentationModelAssembler;
import com.packt.modern.api.model.Shipment;
import com.packt.modern.api.service.ShipmentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
public class ShipmentController implements ShipmentApi {

    private final ShipmentRepresentationModelAssembler assembler;
    private final ShipmentService service;

    public ShipmentController(ShipmentService service, ShipmentRepresentationModelAssembler assembler) {
        this.service = service;
        this.assembler = assembler;
    }

    @Override
    public ResponseEntity<List<Shipment>> getShipmentByOrderId(@NotNull @Valid String id) {
        return ResponseEntity.ok(assembler.toListModel(service.getShipmentByOrderId(id)));
    }
}
