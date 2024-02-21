package com.propz.fullstack.atividade.services;

import com.propz.fullstack.atividade.model.PerfectNumberEntity;
import com.propz.fullstack.atividade.model.PerfectNumberRange;

import java.util.List;

public interface IPerfectNumberService {
    List<Long> getBetweenPerfectNumbers(PerfectNumberRange perfectNumberRange);

    boolean isPerfectNumber(Long number);

    List<PerfectNumberEntity> getAll();
}
