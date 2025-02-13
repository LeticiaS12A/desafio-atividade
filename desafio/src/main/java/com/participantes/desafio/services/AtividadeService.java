package com.participantes.desafio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
	
	public Page<AtividadeDTO> buscarPagina(Pageable pagina){
		Page<Atividade> result = repo.findAll(pagina);
		return result.map(x -> new AtividadeDTO(x));
	}
	
	public AtividadeDTO adicionarAtividade(AtividadeDTO atividadeDTO) {
		Atividade atividade = new Atividade();
		
		atividade.setNome(atividadeDTO.getNome());
		atividade.setDescricao(atividadeDTO.getDescricao());
		atividade.setPreco(atividadeDTO.getPreco());
		
		Atividade savedAtividade = repo.save(atividade);
		return new AtividadeDTO(savedAtividade);
	}
	
}
