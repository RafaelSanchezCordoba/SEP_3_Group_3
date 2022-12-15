package com.example.t3_spring_dbserver.service;

import com.example.t3_spring_dbserver.entity.Socks;
import com.example.t3_spring_dbserver.entity.Trouser;

import java.util.List;

public interface ITrouserService {
    Trouser createTrouser(Trouser trouser);
    Trouser getTrouserById(long id);
    List<Trouser> getAll();
    void deleteById(long id);
}
