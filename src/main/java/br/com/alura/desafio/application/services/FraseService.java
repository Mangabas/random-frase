package br.com.alura.desafio.application.services;

import br.com.alura.desafio.application.DTO.SerieDTO;
import br.com.alura.desafio.application.models.Serie;
import br.com.alura.desafio.application.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {

    @Autowired
    private FraseRepository fraseRepository;

    public SerieDTO fraseAleatoria() {
        Serie frase = fraseRepository.fraseAleatoria();
        return new SerieDTO(frase.getTitulo(), frase.getPoster(), frase.getFrase(), frase.getPersonagem());
    }
}
