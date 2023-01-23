package com.example.t3_spring_dbserver.service;

import com.example.t3_spring_dbserver.entity.*;

import java.util.List;

public interface IProductCardService {
    ProductCard getById(long id);

    ProductCard saveCard(ProductCard card);

    List<ProductCard> getAllCards();

    List<ProductCard> getAllSockCards();

    List<ProductCard> getAllTrouserCards();

    ProductCard deleteByCardId(long id);

    ProductCard updateSockCard(ProductCard productCard);

    ProductCard getByTitleSockCard(String title);
    ProductCard getByTitleTrouserCard(String title);
}
