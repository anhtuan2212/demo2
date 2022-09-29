package com.example.demo.repository;

import com.example.demo.entity.TBLSinhVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SinhVienRepository extends JpaRepository<TBLSinhVien,Integer> {
    @Query(value = "SELECT * FROM TBLSinhVien ",nativeQuery = true)
    List<TBLSinhVien> getAll();
}
