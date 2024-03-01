package com.senac.br.crud.simples.controller;

import com.senac.br.crud.simples.dao.FilmeRepository;
import com.senac.br.crud.simples.model.Filmes;
import com.senac.br.crud.simples.model.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

import static org.antlr.v4.runtime.tree.xpath.XPath.findAll;

@Controller
public class IndexController {

    @Autowired
    FilmeRepository filmeRepository;

    @GetMapping("/cad_pessoa")
    public String abrirCadastroPessoa(Pessoa pessoa) {
        return "cadastro_pessoa";

    }
        @GetMapping("/")
        public String abrirIndex(Model model){

        return "index";
        }

        @GetMapping("/login")
        public String getLoginPage() {
            return "index";
        }

        @GetMapping("/login-sucess")
        public String getLoginSucess(Model model) {

    List<Filmes> filmes = filmeRepository.findAll();

            model.addAttribute("Filmes", filmes);
            return "inicio";
}
        @GetMapping("/admin")
        public String getPaginaAdmin() {
            return "administrador";
        }

        @GetMapping("/user-comum")
        public String getPaginaComum() {
            return "comum";
    }

}
