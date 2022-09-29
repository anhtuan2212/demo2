package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
public class TBLGiangVien {
    @Id
    @Column(name = "MAGV")
    private Integer Magv;
    @Column(name = "HOTENGV")
    private String Hotengv;
    @Column(name = "LUONG")
    private BigDecimal Luong;
    @Column(name = "MAKHOA")
    private String Makhoa;
}
