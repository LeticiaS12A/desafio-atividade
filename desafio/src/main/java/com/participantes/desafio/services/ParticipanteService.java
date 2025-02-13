package com.participantes.desafio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.participantes.desafio.dto.ParticipanteDTO;
import com.participantes.desafio.entities.Participante;
import com.participantes.desafio.repository.ParticipanteRepository;

@Service
public class ParticipanteService {

	@Autowired
	ParticipanteRepository repo;
	
	public List<ParticipanteDTO> buscarTodos(){
		List<Participante> list = repo.findAll();
		return list.stream().map(x -> new ParticipanteDTO(x)).toList();
	}
	
}
