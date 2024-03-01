package com.senac.br.crud.simples.dao;

import com.senac.br.crud.simples.model.Filmes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmeRepository extends JpaRepository<Filmes, Integer> {

}
