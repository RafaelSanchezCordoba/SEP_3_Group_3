package com.example.t3_spring_dbserver.repository;
import com.example.t3_spring_dbserver.entity.ProductCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductCardRepository extends JpaRepository<ProductCard, Long> {

    @Query(value = "SELECT i  FROM ProductCard i WHERE i.title = :title AND category = 'sock'", nativeQuery = true)
    ProductCard findSockCardByTitle(@Param("title") String title);

    @Query(value = "SELECT i  FROM ProductCard i WHERE i.title = :title AND category = 'trouser'", nativeQuery = true)
    ProductCard findTrouserCardByTitle(@Param("title") String title);

    @Query(value= "SELECT *  from sep_db.product_card where category = 'sock'",nativeQuery = true)
    List<ProductCard> findAllSockCards ();

    @Query(value= "SELECT *  from sep_db.product_card where category = 'trouser'",nativeQuery = true)
    List<ProductCard> findAllTrouserCards ();



}
