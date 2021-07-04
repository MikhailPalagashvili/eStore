package com.packt.modern.api.repository;

import com.packt.modern.api.entity.PaymentEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;


public interface PaymentRepository extends CrudRepository<PaymentEntity, UUID> {
}

