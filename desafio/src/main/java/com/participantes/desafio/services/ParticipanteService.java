package com.participantes.desafio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.participantes.desafio.dto.CategoriaDTO;
import com.participantes.desafio.dto.ParticipanteDTO;
import com.participantes.desafio.entities.Categoria;
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
	
	public ParticipanteDTO adicionarParticipante(ParticipanteDTO participanteDTO) {
		Participante categoria = new Participante();
		
		categoria.(categoriaDTO.getDescricao());
		
		Categoria savedCategoria = repo.save(categoria);
		return new CategoriaDTO(savedCategoria);
	}
	
}
