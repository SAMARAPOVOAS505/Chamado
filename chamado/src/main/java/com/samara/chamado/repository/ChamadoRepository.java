package com.samara.chamado.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.samara.chamado.model.chamados;

@Repository
public interface ChamadoRepository extends JpaRepository <chamados, Long> {

    
}
