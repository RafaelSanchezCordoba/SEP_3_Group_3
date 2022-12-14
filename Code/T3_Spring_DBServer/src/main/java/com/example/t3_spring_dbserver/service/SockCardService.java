package com.example.t3_spring_dbserver.service;

import com.example.t3_spring_dbserver.DTOs.SockCardDto;
import com.example.t3_spring_dbserver.entity.SockCard;
import com.example.t3_spring_dbserver.repository.ISockCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpServerErrorException;

import java.util.List;
import java.util.Optional;

@Service
public class SockCardService implements ISockCardService {

    @Autowired
    ISockCardRepository repository;

    @Override
    public SockCard getById(long id){
        Optional<SockCard> sockCardData = repository.findById(id);
        return sockCardData.get();

    }

    @Override
    public SockCard saveCard(SockCard card){
        return repository.save(card);
    }

    @Override
    public List<SockCard> getAllCards(){
       return repository.findAll();
    }

    @Override
    public SockCard deleteSockCard(long id){
        Optional<SockCard> sockCardData = repository.findById(id);
        repository.deleteById(id);
        return  sockCardData.get();

    }

    @Override
    public SockCard updateSockCard(SockCard sockCard) {
        return null;
    }


    public SockCard updateSockCard(SockCardDto dtoCard){

        Optional<SockCard> sockCardToUpdate = repository.findById(dtoCard.getId());
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
    public SockCard getByTitle(String title){
      SockCard sockCardData = repository.findSockCardByTitle(title);
        System.out.println(sockCardData);
      return sockCardData;
    }
}
