package com.example.backendestadante.controller;


import java.util.List;

import com.example.backendestadante.entity.Estudante;
import com.example.backendestadante.repository.EstudanteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estudantes")
@CrossOrigin
public class EstudanteController {
    
    @Autowired 
    private EstudanteRepository repo;


    //end point GET
    @GetMapping
    public List<Estudante> getEstudantes() {
        List<Estudante> list = repo.findAll();
        return list;
    }

    //end point POST
    @PostMapping
    public Estudante salvar(@RequestBody Estudante estudante) {
        estudante = repo.save(estudante);
        return estudante;
    }

}