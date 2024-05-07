package com.example.cafeinformation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CafeController {

    private CafeMapper cafeMapper;

    public CafeController(CafeMapper cafeMapper) {
        this.cafeMapper = cafeMapper;
    }

    @GetMapping("/cafes")
    public List<Cafe> getNames() {
        List<Cafe> cafes = cafeMapper.findAll();
        return cafes;
    }
}