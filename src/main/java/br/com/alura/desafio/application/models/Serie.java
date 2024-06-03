package br.com.alura.desafio.application.models;

import jakarta.persistence.*;

@Entity
@Table(name = "serie")
public class Serie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String poster;
    private String frase;
    private String personagem;

    public Serie(){}

    public Serie(SerieRecord serie, String personagem, String frase) {
        this.titulo = serie.titulo();
        this.poster = serie.poster();
        this.frase = frase;
        this.personagem = personagem;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", poster='" + poster + '\'' +
                ", frase='" + frase + '\'' +
                ", personagem='" + personagem + '\'' +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getPersonagem() {
        return personagem;
    }

    public void setPersonagem(String personagem) {
        this.personagem = personagem;
    }
}
