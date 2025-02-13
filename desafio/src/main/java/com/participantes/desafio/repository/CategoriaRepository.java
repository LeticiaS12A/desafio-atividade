package com.participantes.desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.participantes.desafio.entities.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
