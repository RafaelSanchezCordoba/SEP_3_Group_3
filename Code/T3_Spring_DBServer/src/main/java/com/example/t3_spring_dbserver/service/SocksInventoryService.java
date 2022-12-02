package com.example.t3_spring_dbserver.service;

import com.example.t3_spring_dbserver.entity.Inventory;
import com.example.t3_spring_dbserver.repository.ISockCardRepository;
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
    public void updateInventory(Inventory inventory) {
        Optional<Inventory> inventoryToUpdate = repository.findById(inventory.getId());
        inventoryToUpdate.get().setColor(inventory.getColor());
        inventoryToUpdate.get().setSize(inventory.getSize());
        inventoryToUpdate.get().setQuantity(inventory.getQuantity());

        repository.save(inventoryToUpdate.get());
    }

    @Override
    public void deleteByCardId(int id) {
        repository.deleteByCardId(id);
    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);
    }
}
