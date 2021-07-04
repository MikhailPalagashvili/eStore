package com.packt.modern.api.service;

import com.packt.modern.api.entity.ItemEntity;
import com.packt.modern.api.model.Item;

import java.util.List;


public interface ItemService {

    ItemEntity toEntity(Item m);

    List<ItemEntity> toEntityList(List<Item> items);

    Item toModel(ItemEntity e);

    List<Item> toModelList(List<ItemEntity> items);
}
