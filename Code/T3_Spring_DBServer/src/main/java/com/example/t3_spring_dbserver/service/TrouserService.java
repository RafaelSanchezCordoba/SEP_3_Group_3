package com.example.t3_spring_dbserver.service;

import com.example.t3_spring_dbserver.entity.Socks;
import com.example.t3_spring_dbserver.entity.Trouser;
import com.example.t3_spring_dbserver.repository.ISocksRepository;
import com.example.t3_spring_dbserver.repository.ITrouserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrouserService implements ITrouserService{
    @Autowired
    ITrouserRepository repository;

    @Override
    public Trouser createTrouser(Trouser trouser) {
        return repository.save(trouser);
    }

    @Override
    public Trouser getTrouserById(long id) {
        Optional<Trouser> trouser = repository.findById(id);
        return trouser.get();
    }

    @Override
    public List<Trouser> getAll() {
        return repository.findAll();
    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);
    }
}
