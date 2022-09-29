package com.example.demo.repository;

import com.example.demo.entity.TBLKhoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KhoaRepository extends JpaRepository<TBLKhoa,String> {
    @Query(value = "SELECT * FROM TBLKhoa ",nativeQuery = true)
    List<TBLKhoa> getAll();
}
