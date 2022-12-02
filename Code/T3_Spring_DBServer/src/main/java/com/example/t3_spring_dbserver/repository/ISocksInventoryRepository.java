package com.example.t3_spring_dbserver.repository;

import com.example.t3_spring_dbserver.entity.Inventory;
import com.example.t3_spring_dbserver.entity.SockCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ISocksInventoryRepository extends JpaRepository<Inventory, Long> {
    @Query( value = "SELECT *  FROM sep_db.inventory i WHERE i.pc_id = id limit 1",
            nativeQuery = true)
    List<Inventory> getByCardId(int id);

    @Query(value = "DELETE * FROM sep_db.inventory i WHERE i.pc_id = id limit 1",
        nativeQuery = true)
    void deleteByCardId(int id);
}
