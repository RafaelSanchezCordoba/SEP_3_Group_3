package com.example.t3_spring_dbserver.repository;

import com.example.t3_spring_dbserver.entity.SockCard;
import com.example.t3_spring_dbserver.entity.TrouserCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ITrouserCardRepository extends JpaRepository<TrouserCard, Long> {
    @Query("SELECT i  FROM TrouserCard i WHERE i.title = :title")
    TrouserCard findTrouserCardByTitle(@Param("title") String title);
}
