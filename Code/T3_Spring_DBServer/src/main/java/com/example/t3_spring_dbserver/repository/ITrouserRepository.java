package com.example.t3_spring_dbserver.repository;

import com.example.t3_spring_dbserver.entity.Trouser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITrouserRepository extends JpaRepository<Trouser, Long> {
}
