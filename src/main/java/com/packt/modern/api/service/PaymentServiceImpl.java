package com.packt.modern.api.service;

import com.packt.modern.api.entity.AuthorizationEntity;
import com.packt.modern.api.model.PaymentReq;
import com.packt.modern.api.repository.OrderRepository;
import com.packt.modern.api.repository.PaymentRepository;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Optional;
import java.util.UUID;


@Service
public class PaymentServiceImpl implements PaymentService {

    private final PaymentRepository repository;
    private final OrderRepository orderRepo;

    public PaymentServiceImpl(PaymentRepository repository, OrderRepository orderRepo) {
        this.repository = repository;
        this.orderRepo = orderRepo;
    }

    @Override
    public Optional<AuthorizationEntity> authorize(@Valid PaymentReq paymentReq) {
        return Optional.empty();
    }

    @Override
    public Optional<AuthorizationEntity> getOrdersPaymentAuthorization(@NotNull String orderId) {
        return orderRepo.findById(UUID.fromString(orderId)).map(oe -> oe.getAuthorizationEntity());
    }

  /*private AuthorizationEntity toEntity(PaymentReq m) {
    PaymentEntity e = new PaymentEntity();
    e.setAuthorized(true).setMessage()
  }*/
}
