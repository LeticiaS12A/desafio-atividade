package com.participantes.desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.participantes.desafio.entities.Atividade;

public interface AtividadeRepository extends JpaRepository<Atividade, Integer> {

}
