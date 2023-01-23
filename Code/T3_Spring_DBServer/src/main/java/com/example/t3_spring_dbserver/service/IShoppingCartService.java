package com.example.t3_spring_dbserver.service;

import com.example.t3_spring_dbserver.entity.Product;
import com.example.t3_spring_dbserver.entity.ShoppingCart;

import java.util.List;

public interface IShoppingCartService {
    ShoppingCart createShoppingCart(ShoppingCart shoppingCart);
    List<ShoppingCart> getAllShoppingCart();
    ShoppingCart getShoppingCartByProductCardId(int id);
    List<Product> getProductsByShoppingCartId(int id);
    ShoppingCart addProductIntoShoppingCart(Product product, int shoppingCartId);
    ShoppingCart deleteProductFromShoppingCart(int shoppingCartId, Product product);
    String deleteShoppingCartById(int shoppingCartId);

}
