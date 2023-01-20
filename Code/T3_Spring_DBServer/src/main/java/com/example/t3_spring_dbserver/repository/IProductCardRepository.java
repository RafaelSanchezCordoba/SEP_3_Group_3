package com.example.t3_spring_dbserver.repository;
import com.example.t3_spring_dbserver.entity.ProductCard;
import com.example.t3_spring_dbserver.entity.SockCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductCardRepository extends JpaRepository<ProductCard, Long> {

    @Query("SELECT i  FROM ProductCard i WHERE i.title = :title")
    ProductCard findCardByTitle(@Param("title") String title);

    @Query(value= "SELECT *  from sep_db.product_card where category = 'sock'",nativeQuery = true)
    List<ProductCard> findAllSockCards ();

}
