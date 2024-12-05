package com.aluracursos.frasesAleatorias.service;

import com.aluracursos.frasesAleatorias.dto.FraseDTO;
import com.aluracursos.frasesAleatorias.model.Frase;
import com.aluracursos.frasesAleatorias.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {

    @Autowired
    private FraseRepository repositorio;

    public FraseDTO obtenerUnaFraseAleatoria() {
        Frase frase = repositorio.obtenerUnaFraseAleatoria();

        return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonaje(), frase.getPoster());
    }
}
