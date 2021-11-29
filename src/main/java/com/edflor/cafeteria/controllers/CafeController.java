package com.edflor.cafeteria.controllers;

import com.edflor.cafeteria.entity.Cafe;
import com.edflor.cafeteria.services.ICafeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class CafeController {

    @Autowired
    private ICafeService cafeService;

    @GetMapping("/cafes")
    public List<Cafe> getCafeList() {
        return cafeService.findAll();
    }

}
