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
    public ProductCard deleteSockCard(long id){
        Optional<ProductCard> sockCardData = repository.findById(id);
        repository.deleteById(id);
        return  sockCardData.get();

    }

    @Override
    public ProductCard updateSockCard(ProductCard sockCard) {
        return null;
    }


    public ProductCard updateSockCard(SockCardDto dtoCard){

        Optional<ProductCard> sockCardToUpdate = repository.findById(dtoCard.getId());
        sockCardToUpdate.get().setBrand(dtoCard.getBrand());
        sockCardToUpdate.get().setPrice(dtoCard.getPrice());
        sockCardToUpdate.get().setDescription(dtoCard.getDescription());
        sockCardToUpdate.get().setBrand(dtoCard.getBrand());
        sockCardToUpdate.get().setTitle(dtoCard.getTitle());
        sockCardToUpdate.get().setImage(dtoCard.getImage());
        sockCardToUpdate.get().setMaterial(dtoCard.getMaterial());
        sockCardToUpdate.get().setType(dtoCard.getType());


        repository.save(sockCardToUpdate.get());

        return repository.getReferenceById(dtoCard.getId());
    }

    @Override
    public ProductCard getByTitle(String title){
      ProductCard sockCardData = repository.findCardByTitle(title);
        System.out.println(sockCardData);
      return sockCardData;
    }
}
