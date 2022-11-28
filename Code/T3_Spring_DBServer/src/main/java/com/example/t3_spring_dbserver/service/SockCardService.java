package com.example.t3_spring_dbserver.service;

import com.example.t3_spring_dbserver.entity.SockCard;
import com.example.t3_spring_dbserver.repository.ISockCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SockCardService {

    @Autowired
    ISockCardRepository repository;

    public SockCard getById(long id){
        Optional<SockCard> sockCardData = repository.findById(id);
        return sockCardData.get();

    }

    public void saveCard(SockCard card){
        repository.save(card);
    }

    public List<SockCard> getAllCards(){
       return repository.findAll();
    }

    public void deleteSockCard(long id){
        repository.deleteById(id);
    }
}
