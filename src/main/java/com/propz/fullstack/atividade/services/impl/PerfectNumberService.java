package com.propz.fullstack.atividade.services.impl;

import com.propz.fullstack.atividade.model.PerfectNumberEntity;
import com.propz.fullstack.atividade.model.PerfectNumberRange;
import com.propz.fullstack.atividade.repository.PerfectNumberRepository;
import com.propz.fullstack.atividade.services.IPerfectNumberService;
import com.propz.fullstack.atividade.util.PerfectNumberUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PerfectNumberService implements IPerfectNumberService {

    @Autowired
    PerfectNumberRepository perfectNumberRepository;

    PerfectNumberUtil perfectNumberUtil = new PerfectNumberUtil();;

    public PerfectNumberService(PerfectNumberRepository perfectNumberRepository) {
        this.perfectNumberRepository = perfectNumberRepository;
    }

    @Override
    public List<Long> getBetweenPerfectNumbers(PerfectNumberRange perfectNumberRange) {
        //make list for all perfectNumbers
        List<PerfectNumberEntity> perfectNumberEntities = perfectNumberRepository.findAll();
        System.out.println(perfectNumberEntities);
        List<Long> perfectNumbers = Arrays.stream(perfectNumberEntities.toArray()).map(entity -> {
            PerfectNumberEntity perfectNumber = new PerfectNumberEntity((PerfectNumberEntity) entity);
            return perfectNumber.getPerfectNumber();
        }).toList();

        //check all itens of list and go through the list and find the perfect numbers between them
        return this.perfectNumberUtil.findBetweenNumbers(perfectNumberRange, perfectNumbers);
    }


    @Override
    public boolean isPerfectNumber(Long number) {
        boolean isPerfect = this.perfectNumberUtil.isPerfect(number);
        if (isPerfect) {
            System.out.println("The number " + number + " is a perfect number");
            return true;
        }
        System.out.println("The number " + number + " doesn't a perfect number");
        return false;
    }

    @Override
    public List<PerfectNumberEntity> getAll() {
        return perfectNumberRepository.findAll();
    }
}
