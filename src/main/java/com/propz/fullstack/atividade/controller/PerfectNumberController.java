package com.propz.fullstack.atividade.controller;

import com.propz.fullstack.atividade.model.PerfectNumberEntity;
import com.propz.fullstack.atividade.model.PerfectNumberRange;
import com.propz.fullstack.atividade.services.impl.PerfectNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/numbers")
public class PerfectNumberController {

    @Autowired
    private PerfectNumberService perfectNumberService;

    @GetMapping("/all")
    public List<PerfectNumberEntity> getAllPerfectNumbers() {
        return perfectNumberService.getAll();
    }

    @PostMapping("/verify")
    public boolean verifyPerfectNumber(@RequestBody String number) {
        return perfectNumberService.isPerfectNumber(Long.parseLong(number));
    }

    @PostMapping("/range")
    public List<Long> verifyAllPerfectNumbersBetween(@RequestBody PerfectNumberRange perfectNumberRange) {
        return perfectNumberService.getBetweenPerfectNumbers(perfectNumberRange);
    }
}
