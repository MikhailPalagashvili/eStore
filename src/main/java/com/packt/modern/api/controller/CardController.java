package com.packt.modern.api.controller;

import com.packt.modern.api.CardApi;
import com.packt.modern.api.hateoas.CardRepresentationModelAssembler;
import com.packt.modern.api.model.AddCardReq;
import com.packt.modern.api.model.Card;
import com.packt.modern.api.service.CardService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

import static org.springframework.http.ResponseEntity.*;

/**
 * @author : github.com/sharmasourabh
 * @project : Chapter06 - Modern API Development with Spring and Spring Boot
 **/
@RestController
public class CardController implements CardApi {

    private final CardRepresentationModelAssembler assembler;
    private final CardService service;

    public CardController(CardService service, CardRepresentationModelAssembler assembler) {
        this.service = service;
        this.assembler = assembler;
    }

    @Override
    public ResponseEntity<Void> deleteCardById(String id) {
        service.deleteCardById(id);
        return accepted().build();
    }

    @Override
    public ResponseEntity<List<Card>> getAllCards() {
        return ok(assembler.toListModel(service.getAllCards()));
    }

    @Override
    public ResponseEntity<Card> getCardById(String id) {
        return service.getCardById(id).map(assembler::toModel)
                .map(ResponseEntity::ok).orElse(notFound().build());
    }

    @Override
    public ResponseEntity<Card> registerCard(@Valid AddCardReq addCardReq) {
        return status(HttpStatus.CREATED).body(service.registerCard(addCardReq).map(assembler::toModel).get());
    }
}
