package com.example.t3_spring_dbserver.service;

import com.example.t3_spring_dbserver.DTOs.InventoryDto;
import com.example.t3_spring_dbserver.entity.Inventory;

import java.util.List;

public interface ISocksInventoryService {
    void create(Inventory inventory);
    List<Inventory> getAll();
    Inventory getById(long id);
    List<Inventory> getByCardId(int id);
    Inventory updateInventory(InventoryDto dto);
    void deleteByCardId(int id);
    void deleteById(long id);
    Inventory getByParameters(long cardId, String color, String size);
}
