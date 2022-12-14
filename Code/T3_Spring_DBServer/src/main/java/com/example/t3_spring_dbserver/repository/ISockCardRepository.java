package com.example.t3_spring_dbserver.repository;
import com.example.t3_spring_dbserver.entity.SockCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import java.util.Optional;
@Repository
public interface ISockCardRepository extends JpaRepository<SockCard, Long> {

    Optional <SockCard> findSockCardByBrand (String brand);

    @Query( value = "SELECT *  FROM sep_db.sock_card s WHERE s.title = title limit 1",
    nativeQuery = true)
    Optional<SockCard> findSockCardByTitle(String title);
}
