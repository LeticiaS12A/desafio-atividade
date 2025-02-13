package com.participantes.desafio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.participantes.desafio.dto.AtividadeDTO;
import com.participantes.desafio.services.AtividadeService;

@RestController
@RequestMapping(value = "/atividade")
public class AtividadeController {

	@Autowired
	AtividadeService service;
	
	@GetMapping
	public ResponseEntity<List<AtividadeDTO>> buscar(){
		return ResponseEntity.ok(service.buscarTodos());
	}
	
	@GetMapping(value = "pagina")
	public ResponseEntity<Page<AtividadeDTO>> buscarPagina(Pageable pagina){
		return ResponseEntity.ok(service.buscarPagina(pagina));
	}
	
	@PostMapping("create")
		public ResponseEntity<AtividadeDTO> adicionarAtividade(@RequestBody AtividadeDTO atividadeDTO){
		
		AtividadeDTO savedAtividade = service.adicionarAtividade(atividadeDTO);
		return ResponseEntity.ok(savedAtividade);
	}
	
}
