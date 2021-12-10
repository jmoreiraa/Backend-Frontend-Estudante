package com.example.backendestadante.repository;


import com.example.backendestadante.entity.Estudante;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudanteRepository  extends JpaRepository<Estudante, Integer>{    
    
}
