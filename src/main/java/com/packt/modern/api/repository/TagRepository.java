package com.packt.modern.api.repository;

import com.packt.modern.api.entity.TagEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;


public interface TagRepository extends CrudRepository<TagEntity, UUID> {
}
