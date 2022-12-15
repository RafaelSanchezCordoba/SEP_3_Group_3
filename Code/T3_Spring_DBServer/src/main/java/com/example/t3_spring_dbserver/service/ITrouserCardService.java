package com.example.t3_spring_dbserver.service;

import com.example.t3_spring_dbserver.entity.SockCard;
import com.example.t3_spring_dbserver.entity.TrouserCard;

import java.util.List;

public interface ITrouserCardService {
    TrouserCard getById(long id);

    TrouserCard saveCard(TrouserCard trouserCard);

    List<TrouserCard> getAllCards();

    TrouserCard deleteTrouserCard(long id);

    TrouserCard updateTrouserCard(TrouserCard trouserCard);

    TrouserCard getByTitle(String title);
}
