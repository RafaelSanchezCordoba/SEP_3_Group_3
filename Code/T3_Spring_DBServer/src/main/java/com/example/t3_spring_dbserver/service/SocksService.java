package com.example.t3_spring_dbserver.service;

import com.example.t3_spring_dbserver.entity.Socks;
import com.example.t3_spring_dbserver.repository.ISocksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SocksService implements ISocksService{

    @Autowired
    ISocksRepository repository;

    @Override
    public void createSocks(Socks socks) {
        repository.save(socks);
    }

    @Override
    public Socks getSocksById(long id) {
        Optional<Socks> socks = repository.findById(id);
        return socks.get();
    }

    @Override
    public List<Socks> getAll() {
        return repository.findAll();
    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);
    }
}
