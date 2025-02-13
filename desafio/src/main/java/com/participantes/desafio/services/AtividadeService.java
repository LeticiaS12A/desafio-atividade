package com.participantes.desafio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.participantes.desafio.dto.AtividadeDTO;
import com.participantes.desafio.entities.Atividade;
import com.participantes.desafio.repository.AtividadeRepository;

@Service
public class AtividadeService {

	@Autowired
	AtividadeRepository repo;
	
	public List<AtividadeDTO> buscarTodos(){
		List<Atividade> list = repo.findAll();
		return list.stream().map(x -> new AtividadeDTO(x)).toList();
	}
}
