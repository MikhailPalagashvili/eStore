package com.packt.modern.api.repository;

import com.packt.modern.api.entity.CardEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;


public interface CardRepository extends CrudRepository<CardEntity, UUID> {
}

