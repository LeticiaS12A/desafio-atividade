package com.participantes.desafio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.participantes.desafio.dto.BlocoDTO;
import com.participantes.desafio.services.BlocoService;

@RestController
@RequestMapping(value = "/bloco")
public class BlocoController {

	@Autowired
	BlocoService service;
	
	@GetMapping
	public ResponseEntity<List<BlocoDTO>> buscar(){
		return ResponseEntity.ok(service.buscarTodos());
	}
}
