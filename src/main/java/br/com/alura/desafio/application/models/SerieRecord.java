package br.com.alura.desafio.application.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record SerieRecord(@JsonAlias("Title") String titulo,
                          @JsonAlias("Poster") String poster) {
}
