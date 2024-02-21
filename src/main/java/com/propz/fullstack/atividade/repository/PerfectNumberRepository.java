package com.propz.fullstack.atividade.repository;

import com.propz.fullstack.atividade.model.PerfectNumberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PerfectNumberRepository extends JpaRepository<PerfectNumberEntity, Long> {

}
