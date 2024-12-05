package com.aluracursos.frasesAleatorias.model;

import jakarta.persistence.*;

@Entity
@Table(name = "frases")
public class Frase {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String frase;
    private String personaje;
    private String poster;

    //Constructor vacío
    public Frase() {}

    //Constructor con los atributos
    public Frase(Long id, String titulo, String frase, String personaje, String poster) {
        this.id = id;
        this.titulo = titulo;
        this.frase = frase;
        this.personaje = personaje;
        this.poster = poster;
    }

    //Getters y Setters de los atributos
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getPersonaje() {
        return personaje;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

}
