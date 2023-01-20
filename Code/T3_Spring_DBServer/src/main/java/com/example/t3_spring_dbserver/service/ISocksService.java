package com.example.t3_spring_dbserver.service;

import com.example.t3_spring_dbserver.entity.Product;

import java.util.List;

public interface ISocksService {

    Product createSocks(Product product);
    Product getSocksById(long id);
    List<Product> getAll();
    void deleteById(long id);

}
