package com.participantes.desafio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
	
	public Page<CategoriaDTO> buscarPagina(Pageable pagina){
		Page<Categoria> result = repo.findAll(pagina);
		return result.map(x -> new CategoriaDTO(x));
	}
	
	public CategoriaDTO adicionarCategoria(CategoriaDTO categoriaDTO) {
		Categoria categoria = new Categoria();
		
		categoria.setDescricao(categoriaDTO.getDescricao());
		
		Categoria savedCategoria = repo.save(categoria);
		return new CategoriaDTO(savedCategoria);
	}
}
