package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class TBLDeTai {
    @Id
    @Column(name = "MADT")
    private String Madt;

    @Column(name = "TENDT")
    private String Tendt ;

    @Column(name = "KINHPHI")
    private Integer Kinhphi;
    @Column(name = "NOITHUCTAP")
    private String Noithuctap;


}
