package com.participantes.desafio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
	
	public Page<ParticipanteDTO> buscarPagina(Pageable pagina){
		Page<Participante> result = repo.findAll(pagina);
		return result.map(x -> new ParticipanteDTO(x));
	}
	
	public ParticipanteDTO adicionarCategoria(ParticipanteDTO participanteDTO) {
		Participante participante = new Participante();
		
		participante.setNome(participanteDTO.getNome());
		participante.setEmail(participanteDTO.getEmail());
		
		Participante savedParticipante = repo.save(participante);
		return new ParticipanteDTO(savedParticipante);
	}
	
}
