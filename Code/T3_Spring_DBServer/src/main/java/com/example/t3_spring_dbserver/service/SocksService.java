package com.example.t3_spring_dbserver.service;

import com.example.t3_spring_dbserver.entity.Product;
import com.example.t3_spring_dbserver.repository.ISocksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SocksService implements ISocksService{

    @Autowired
    ISocksRepository repository;

    @Override
    public Product createSocks(Product product) {
        return repository.save(product);
    }

    @Override
    public Product getSocksById(long id) {
        Optional<Product> socks = repository.findById(id);
        return socks.get();
    }

    @Override
    public List<Product> getAll() {
        return repository.findAll();
    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);
    }
}
