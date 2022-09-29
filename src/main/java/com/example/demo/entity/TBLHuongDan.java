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
public class TBLHuongDan {
    @Id
    @Column(name = "MASV")
    private String Masv;

    @Column(name = "MADT")
    private String Madt;

    @Column(name = "MAGV")
    private String Magv;

    @Column(name = "KETQUA")
    private BigDecimal KetQua;
}
