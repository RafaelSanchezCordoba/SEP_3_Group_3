package com.example.t3_spring_dbserver.service;

import com.example.t3_spring_dbserver.DTOs.SockCardDto;
import com.example.t3_spring_dbserver.DTOs.TrouserCardDto;
import com.example.t3_spring_dbserver.entity.SockCard;
import com.example.t3_spring_dbserver.entity.TrouserCard;
import com.example.t3_spring_dbserver.repository.ITrouserCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrouserCardService implements ITrouserCardService{

    @Autowired
    ITrouserCardRepository repository;

    @Override
    public TrouserCard getById(long id){
        Optional<TrouserCard> trouserCard = repository.findById(id);
        return trouserCard.get();

    }

    @Override
    public TrouserCard saveCard(TrouserCard card){
        return repository.save(card);
    }

    @Override
    public List<TrouserCard> getAllCards(){
        return repository.findAll();
    }

    @Override
    public TrouserCard deleteTrouserCard(long id){
        Optional<TrouserCard> trouserCard = repository.findById(id);
        repository.deleteById(id);
        return trouserCard.get();

    }

    @Override
    public TrouserCard updateTrouserCard(TrouserCard trouserCard) {
        return null;
    }


    public TrouserCard updateTrouserCard(TrouserCardDto dtoCard){

        Optional<TrouserCard> trouserCardToUpdate = repository.findById(dtoCard.getId());
        trouserCardToUpdate.get().setBrand(dtoCard.getBrand());
        trouserCardToUpdate.get().setPrice(dtoCard.getPrice());
        trouserCardToUpdate.get().setDescription(dtoCard.getDescription());
        trouserCardToUpdate.get().setBrand(dtoCard.getBrand());
        trouserCardToUpdate.get().setTitle(dtoCard.getTitle());
        trouserCardToUpdate.get().setImage(dtoCard.getImage());
        trouserCardToUpdate.get().setMaterial(dtoCard.getMaterial());
        trouserCardToUpdate.get().setType(dtoCard.getType());


        repository.save(trouserCardToUpdate.get());

        return repository.getReferenceById(dtoCard.getId());
    }

    @Override
    public TrouserCard getByTitle(String title){
        TrouserCard trouserCard = repository.findTrouserCardByTitle(title);
        System.out.println(trouserCard);
        return trouserCard;
    }
}
