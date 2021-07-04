package com.packt.modern.api.service;

import com.packt.modern.api.entity.CardEntity;
import com.packt.modern.api.model.AddCardReq;

import javax.validation.Valid;
import java.util.Optional;

public interface CardService {
    void deleteCardById(String id);

    Iterable<CardEntity> getAllCards();

    Optional<CardEntity> getCardById(String id);

    Optional<CardEntity> registerCard(@Valid AddCardReq addCardReq);
}
