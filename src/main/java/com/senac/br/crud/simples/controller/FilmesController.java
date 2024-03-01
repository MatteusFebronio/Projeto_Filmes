package com.senac.br.crud.simples.controller;

import com.senac.br.crud.simples.dao.FilmeRepository;
import com.senac.br.crud.simples.dao.PessoaRepository;
import com.senac.br.crud.simples.model.Filmes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FilmesController {

    @Autowired
    private FilmeRepository filmeRepository;




    @PostMapping("/filmes")
    public String AbrirFilmes (Filmes filmes){

        filmes.setImagem("imagens/"+filmes.getImagem()+".jpg");

        filmeRepository.save(filmes);

        return "cadastro_filmes";

    }

}
