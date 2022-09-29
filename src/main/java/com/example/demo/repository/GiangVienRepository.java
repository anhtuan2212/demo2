package com.example.demo.repository;

import com.example.demo.entity.TBLGiangVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface GiangVienRepository extends JpaRepository<TBLGiangVien,Integer> {
    @Query(value = "SELECT * FROM TBLGiangVien ",nativeQuery = true)
    List<TBLGiangVien> getAll();
}
