package com.example.t3_spring_dbserver.service;

import com.example.t3_spring_dbserver.entity.SockCard;
import com.example.t3_spring_dbserver.entity.Socks;

import java.util.List;

public interface ISocksService {

    void createSocks(Socks socks);
    Socks getSocksById(long id);
    List<Socks> getAll();
    void deleteById(long id);

}
