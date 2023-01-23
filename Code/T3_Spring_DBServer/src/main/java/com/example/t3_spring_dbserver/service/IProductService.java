package com.example.t3_spring_dbserver.service;

import com.example.t3_spring_dbserver.entity.Product;

import java.util.List;

public interface IProductService {

    Product create(Product product);
    Product getSocksById(long id);

    List<Product> getAllSocks();
    List<Product> getAllTrousers();
    List<Product> getAll();
    void deleteById(long id);

}
