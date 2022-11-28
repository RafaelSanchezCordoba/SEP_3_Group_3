package com.example.t3_spring_dbserver.service;

import com.example.t3_spring_dbserver.entity.SockCard;

import java.util.List;

public interface ISockCardService {
    SockCard getById(long id);

    void saveCard(SockCard card);

    List<SockCard> getAllCards();

    SockCard deleteSockCard(long id);

    SockCard updateSockCard(SockCard sockCard);

    SockCard getByTitle(String title);
}
