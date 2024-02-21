package com.propz.fullstack.atividade.dataseed;

import com.propz.fullstack.atividade.model.PerfectNumberEntity;
import com.propz.fullstack.atividade.repository.PerfectNumberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class Seeder implements CommandLineRunner {

    @Autowired
    PerfectNumberRepository perfectNumberRepository;

    @Override
    public void run(String... args) throws Exception {
        loadPerfectNumbers();
    }

    private void loadPerfectNumbers() {
        if (perfectNumberRepository.count() == 0) {
            PerfectNumberEntity perfectNumber1 = new PerfectNumberEntity(6L);
            PerfectNumberEntity perfectNumber2 = new PerfectNumberEntity(28L);
            PerfectNumberEntity perfectNumber3 = new PerfectNumberEntity(496L);
            PerfectNumberEntity perfectNumber4 = new PerfectNumberEntity(8128L);
            PerfectNumberEntity perfectNumber5 = new PerfectNumberEntity(33550336L);
            PerfectNumberEntity perfectNumber6 = new PerfectNumberEntity(8589869056L);
            PerfectNumberEntity perfectNumber7 = new PerfectNumberEntity(137438691328L);
            PerfectNumberEntity perfectNumber8 = new PerfectNumberEntity(2305843008139952128L);
            perfectNumberRepository.save(perfectNumber1);
            perfectNumberRepository.save(perfectNumber2);
            perfectNumberRepository.save(perfectNumber3);
            perfectNumberRepository.save(perfectNumber4);
            perfectNumberRepository.save(perfectNumber5);
            perfectNumberRepository.save(perfectNumber6);
            perfectNumberRepository.save(perfectNumber7);
            perfectNumberRepository.save(perfectNumber8);
        }
    }
}
