package br.com.pedromota.desafioSpringWeb.desafioSpringWeb.controllers;

import br.com.pedromota.desafioSpringWeb.desafioSpringWeb.dto.FraseDTO;
import br.com.pedromota.desafioSpringWeb.desafioSpringWeb.services.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseController {
    @Autowired
    private FraseService service;

    @GetMapping("/series/frases")
    public FraseDTO obterFraseAleatoria(){
        return service.obterFraseAleatoria();
    }
}
