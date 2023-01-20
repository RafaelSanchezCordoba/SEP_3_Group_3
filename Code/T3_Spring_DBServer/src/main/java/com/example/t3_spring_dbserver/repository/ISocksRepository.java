package com.example.t3_spring_dbserver.repository;

import com.example.t3_spring_dbserver.entity.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISocksRepository extends JpaRepository<Product, Long> {

}
