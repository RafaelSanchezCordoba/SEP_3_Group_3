package com.example.t3_spring_dbserver.service;

import com.example.t3_spring_dbserver.entity.Socks;

import java.util.List;

public interface ISocksService {

    Socks createSocks(Socks socks);
    Socks getSocksById(long id);
    List<Socks> getAll();
    void deleteById(long id);

}
