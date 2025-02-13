package com.participantes.desafio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.participantes.desafio.dto.BlocoDTO;
import com.participantes.desafio.entities.Bloco;
import com.participantes.desafio.repository.BlocoRepository;

@Service
public class BlocoService {
	
	@Autowired
	BlocoRepository repo;
	
	public List<BlocoDTO> buscarTodos(){
		List<Bloco> list = repo.findAll();
		return list.stream().map(x -> new BlocoDTO(x)).toList();
	}
}
