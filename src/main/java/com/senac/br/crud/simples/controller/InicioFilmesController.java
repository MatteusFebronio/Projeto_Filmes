package com.senac.br.crud.simples.controller;

import com.senac.br.crud.simples.model.Filmes;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InicioFilmesController {
    @GetMapping("/filmes")
public String iniciofilmes (Filmes filmes){

    return "cadastro_filmes";

}

}
