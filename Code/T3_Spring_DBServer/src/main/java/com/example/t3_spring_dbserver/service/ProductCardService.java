package com.example.t3_spring_dbserver.service;

import com.example.t3_spring_dbserver.DTOs.SockCardDto;
import com.example.t3_spring_dbserver.entity.*;
import com.example.t3_spring_dbserver.repository.IProductCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductCardService implements IProductCardService {

    @Autowired
    IProductCardRepository repository;

    @Override
    public ProductCard getById(long id){
        Optional<ProductCard> sockCardData = repository.findById(id);
        return sockCardData.get();

    }

    @Override
    public ProductCard saveCard(ProductCard card){
        return repository.save(card);
    }

    @Override
    public List<ProductCard> getAllCards(){
       return repository.findAll();
    }

    @Override
    public List<ProductCard> getAllSockCards() {
        return repository.findAllSockCards();
    }

    @Override
    public List<ProductCard> getAllTrouserCards() {
        return repository.findAllTrouserCards();
    }

    @Override
    public ProductCard deleteByCardId(long id) {
        Optional<ProductCard> productCard = repository.findById(id);
        repository.deleteById(id);
        return productCard.get();
    }

    @Override
    public ProductCard updateSockCard(ProductCard productCard) {
        Optional<ProductCard> productCardToUpdate = repository.findById(productCard.getId());
        productCardToUpdate.get().setBrand(productCard.getBrand());
        productCardToUpdate.get().setPrice(productCard.getPrice());
        productCardToUpdate.get().setDescription(productCard.getDescription());
        productCardToUpdate.get().setBrand(productCard.getBrand());
        productCardToUpdate.get().setTitle(productCard.getTitle());
        productCardToUpdate.get().setImage(productCard.getImage());
        productCardToUpdate.get().setMaterial(productCard.getMaterial());
        productCardToUpdate.get().setType(productCard.getType());

        repository.save(productCardToUpdate.get());
        return repository.getReferenceById(productCard.getId());
    }


    @Override
    public ProductCard getByTitleSockCard(String title){
      ProductCard sockCard = repository.findSockCardByTitle(title);
      System.out.println(sockCard);
      return sockCard;
    }

    @Override
    public ProductCard getByTitleTrouserCard(String title) {
        ProductCard trouserCard = repository.findTrouserCardByTitle(title);
        System.out.println(trouserCard);
        return trouserCard;
    }
}
