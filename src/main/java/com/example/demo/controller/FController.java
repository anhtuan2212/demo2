package com.example.demo.controller;

import com.example.demo.entity.*;
import com.example.demo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class FController {
    @Autowired
    KhoaRepository khoarp;
    @Autowired
    DeTaiRepository dtrp;
    @Autowired
    HuongDanRepository hdrp;
    @Autowired
    SinhVienRepository svrp;
    @Autowired
    GiangVienRepository gvrp;

    @GetMapping("/home")
    public String home(Model model) {
        List<TBLKhoa> lstkhoa = khoarp.getAll();
        model.addAttribute("lstkhoa", lstkhoa);

        List<TBLGiangVien> lstgv = gvrp.getAll();
        model.addAttribute("lstgv", lstgv);

        List<TBLSinhVien> lstsv = svrp.getAll();
        model.addAttribute("lstsv", lstsv);

        List<TBLHuongDan> lsthd = hdrp.getAll();
        model.addAttribute("lsthd", lsthd);

        List<TBLDeTai> lstdt = dtrp.getAll();
        model.addAttribute("lstdt", lstdt);
        return "home";
    }

//    @GetMapping("/sinhvien")
//    public String sinhvien(Model model) {
//        List<TBLSinhVien> lstsv = svrp.getAll();
//        model.addAttribute("lstsv", lstsv);
//        return "sinhvien";
//    }
//
//    @GetMapping("/huongdan")
//    public String huongdan(Model model) {
//        List<TBLHuongDan> lsthd = hdrp.getAll();
//        model.addAttribute("lsthd", lsthd);
//        return "huongdan";
//    }
//
//    @GetMapping("/detai")
//    public String detai(Model model) {
//        List<TBLDeTai> lstdt = dtrp.getAll();
//        model.addAttribute("lstdt", lstdt);
//        return "detai";
//    }
//
//    @GetMapping("/giangvien")
//    public String giangvien(Model model) {
//        List<TBLGiangVien> lstgv = gvrp.getAll();
//        model.addAttribute("lstgv", lstgv);
//        return "giangvien";
//    }

}
