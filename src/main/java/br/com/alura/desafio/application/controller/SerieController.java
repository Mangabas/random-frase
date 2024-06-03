package br.com.alura.desafio.application.controller;

import br.com.alura.desafio.application.DTO.SerieDTO;
import br.com.alura.desafio.application.services.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SerieController {

    @Autowired
    private FraseService servico;

    @GetMapping("/series/frases")
    public SerieDTO obterFrase(){
        return servico.fraseAleatoria();
    }
}
