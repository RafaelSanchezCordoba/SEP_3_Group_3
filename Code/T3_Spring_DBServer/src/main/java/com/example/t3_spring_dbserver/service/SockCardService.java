package com.example.t3_spring_dbserver.service;

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
    public void saveCard(SockCard card){
        repository.save(card);
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
    public SockCard updateSockCard(SockCard sockCard){

        Optional<SockCard> sockCardData = repository.findById(sockCard.getId());
        repository.save(sockCard);
        return sockCardData.get();
    }

    @Override
    public SockCard getByTitle(String title){
      Optional<SockCard> sockCardData = repository.findSockCardByTitle(title);
      return sockCardData.get();
    }
}
