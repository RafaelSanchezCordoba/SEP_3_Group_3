package com.example.t3_spring_dbserver.repository;

import com.example.t3_spring_dbserver.entity.Product;

import com.example.t3_spring_dbserver.entity.ProductCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductRepository extends JpaRepository<Product, Long> {

    @Query(value= "SELECT *  from sep_db.product where category = 'sock'",nativeQuery = true)
    List<Product> findAllSocks ();

    @Query(value= "SELECT *  from sep_db.product where category = 'trouser'",nativeQuery = true)
    List<Product> findAllTrousers ();
}
