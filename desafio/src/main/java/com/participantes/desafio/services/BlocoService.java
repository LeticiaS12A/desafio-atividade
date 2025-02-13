package com.participantes.desafio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
	
	public Page<BlocoDTO> buscarPagina(Pageable pagina){
		Page<Bloco> result = repo.findAll(pagina);
		return result.map(x -> new BlocoDTO(x));
	}
	
	public BlocoDTO adicionarBloco(BlocoDTO blocoDTO) {
		Bloco bloco = new Bloco();
		
		bloco.setInicio(blocoDTO.getInicio());
		bloco.setFim(blocoDTO.getFim());
		
		Bloco savedBloco = repo.save(bloco);
		return new BlocoDTO(savedBloco);
	}
}
