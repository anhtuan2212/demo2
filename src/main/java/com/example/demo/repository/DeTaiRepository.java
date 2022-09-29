package com.example.demo.repository;

import com.example.demo.entity.TBLDeTai;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeTaiRepository extends JpaRepository<TBLDeTai,String> {
    @Query(value = "SELECT * FROM TBLDeTai ",nativeQuery = true)
    List<TBLDeTai> getAll();
}
