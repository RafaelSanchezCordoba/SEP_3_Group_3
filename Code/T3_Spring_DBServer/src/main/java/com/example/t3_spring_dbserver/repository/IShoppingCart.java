package com.example.t3_spring_dbserver.repository;

import com.example.t3_spring_dbserver.entity.ProductCard;
import com.example.t3_spring_dbserver.entity.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IShoppingCart extends JpaRepository<ShoppingCart, Long> {

    @Query(value = "SELECT *  FROM ProductCard p WHERE p.sc_id = :cartId", nativeQuery = true)
    ShoppingCart getProductsByCartId(@Param("cartId") int cartId);

    @Query(value = "INSERT INTO product (id, color, size, sc_id) VALUES (?,?,?,?)", nativeQuery = true)
    ShoppingCart addProductInCart(@Param("id") int id, @Param("color") String color, @Param("size") String size, @Param("sc_id") int sc_id);

    @Query(value = "DELETE FROM product p WHERE p.id =: id AND p.color =: color AND p.size =: size AND p.sc_id =: sc_id", nativeQuery = true)
    ShoppingCart deleteProductInCart(@Param("id") int id, @Param("color") String color, @Param("size") String size, @Param("sc_id") int sc_id);

    @Query(value = "SELECT SUM(price) FROM product p WHERE p.sc_id = :cartId", nativeQuery = true)
    Integer getTotalPrice(@Param("sc_id") int cartId);

    @Query(value = "SELECT * FROM shopping_cart s WHERE s.customer_id = :customerId", nativeQuery = true)
    ShoppingCart getCartByUserId(@Param("customer_id") int customerId);

}
