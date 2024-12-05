package com.aluracursos.frasesAleatorias.controller;

import com.aluracursos.frasesAleatorias.dto.FraseDTO;
import com.aluracursos.frasesAleatorias.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/series")
public class FraseController {

    @Autowired
    private FraseService servicio;

    @GetMapping("/frases")
    public FraseDTO obtenerUnaFraseAleatoria() {
        return servicio.obtenerUnaFraseAleatoria();
    }

}
