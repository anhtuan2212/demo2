package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class TBLKhoa {
    @Id
    @Column(name = "MAKHOA")
    private String MaKhoa;
    @Column(name = "TENKHOA")
    private String TenKhoa;
    @Column(name = "DIENTHOAI")
    private String Dienthoai;
}
