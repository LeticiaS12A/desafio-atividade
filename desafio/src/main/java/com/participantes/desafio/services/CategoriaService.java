package com.participantes.desafio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.participantes.desafio.dto.CategoriaDTO;
import com.participantes.desafio.entities.Categoria;
import com.participantes.desafio.repository.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	CategoriaRepository repo;
	
	public List<CategoriaDTO> buscarTodos(){
		List<Categoria> list = repo.findAll();
		return list.stream().map(x -> new CategoriaDTO(x)).toList();
	}
}
