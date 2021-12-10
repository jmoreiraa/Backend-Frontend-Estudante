package com.example.backendestadante.controller;


import com.example.backendestadante.repository.EstudanteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estudante")
@CrossOrigin
public class EstudanteController {
    
    @Autowired 
    private EstudanteRepository repo;
}
