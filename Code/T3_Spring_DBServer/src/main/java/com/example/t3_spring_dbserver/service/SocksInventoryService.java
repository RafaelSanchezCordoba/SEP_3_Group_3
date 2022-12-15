package com.example.t3_spring_dbserver.service;

import com.example.t3_spring_dbserver.DTOs.InventoryDto;
import com.example.t3_spring_dbserver.entity.Inventory;
import com.example.t3_spring_dbserver.repository.ISocksInventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SocksInventoryService implements ISocksInventoryService {
    @Autowired
    ISocksInventoryRepository repository;

    @Override
    public void create(Inventory inventory) {
        repository.save(inventory);
    }

    @Override
    public List<Inventory> getAll() {
        return repository.findAll();
    }

    @Override
    public Inventory getById(long id) {
        Optional<Inventory> socksInventory = repository.findById(id);
        return socksInventory.get();
    }

    @Override
    public List<Inventory> getByCardId(int id) {
        return repository.getByCardId(id);
    }

    @Override
    public Inventory updateInventory(InventoryDto dto) {
        Optional<Inventory> inventoryToUpdate = repository.findById(dto.getId());
        inventoryToUpdate.get().setColor(dto.getColor());
        inventoryToUpdate.get().setSize(dto.getSize());
        inventoryToUpdate.get().setQuantity(dto.getQuantity());

        repository.save(inventoryToUpdate.get());
        return null;
    }

    @Override
    public void deleteByCardId(int id) {
        repository.deleteByCardId(id);
    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);
    }

    @Override
    public Inventory getByParameters(long cardId, String color, String size) {
        return repository.getByParameters(cardId, color, size);
    }
}
