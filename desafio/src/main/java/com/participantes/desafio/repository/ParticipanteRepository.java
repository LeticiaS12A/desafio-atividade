package com.participantes.desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.participantes.desafio.entities.Participante;

@Repository
public interface ParticipanteRepository extends JpaRepository<Participante, Integer> {

}
