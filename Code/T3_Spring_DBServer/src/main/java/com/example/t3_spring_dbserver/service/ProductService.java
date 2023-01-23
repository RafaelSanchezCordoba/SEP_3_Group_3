package com.example.t3_spring_dbserver.service;

import com.example.t3_spring_dbserver.entity.Product;
import com.example.t3_spring_dbserver.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements IProductService {

    @Autowired
    IProductRepository repository;

    @Override
    public Product create(Product product) {
        return repository.save(product);
    }

    @Override
    public Product getSocksById(long id) {
        Optional<Product> socks = repository.findById(id);
        return socks.get();
    }

    @Override
    public List<Product> getAllSocks() {
        return repository.findAllSocks();
    }

    @Override
    public List<Product> getAllTrousers() {
        return repository.findAllTrousers();
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
