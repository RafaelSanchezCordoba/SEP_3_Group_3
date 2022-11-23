package com.example.t3_spring_dbserver.repository;
import com.example.t3_spring_dbserver.entity.SockCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.Optional;

public interface ISockCardRepository extends JpaRepository<SockCard, Long> {

    Optional <SockCard> findSockCardByBrand (String brand);
}
