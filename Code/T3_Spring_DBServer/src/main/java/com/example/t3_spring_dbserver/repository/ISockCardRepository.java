package com.example.t3_spring_dbserver.repository;
import com.example.t3_spring_dbserver.entity.Inventory;
import com.example.t3_spring_dbserver.entity.SockCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Optional;
@Repository
public interface ISockCardRepository extends JpaRepository<SockCard, Long> {

    @Query("SELECT i  FROM SockCard i WHERE i.title = :title")
    SockCard findSockCardByTitle(@Param("title") String title);
}
