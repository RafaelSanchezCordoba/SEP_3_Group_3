package com.example.t3_spring_dbserver.repository;

import com.example.t3_spring_dbserver.entity.Customer;
import com.example.t3_spring_dbserver.entity.ProductCard;
import com.example.t3_spring_dbserver.entity.ShippingInf;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface IUserRepository extends JpaRepository<Customer, Long> {

    @Query("SELECT i  FROM Customer i WHERE i.id = :id")
    Customer getById(@Param("id") long id);

    @Query("SELECT i  FROM Customer i WHERE i.email = :email")
    Customer getByEmail(@Param("email") String email);

    @Query("SELECT ShippingInf FROM Customer i WHERE i.id = :email")
    ShippingInf getAddressByUserId(@Param("id") long id);

}
