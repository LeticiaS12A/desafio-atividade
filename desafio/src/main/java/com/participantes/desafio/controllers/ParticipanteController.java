package com.participantes.desafio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.participantes.desafio.dto.ParticipanteDTO;
import com.participantes.desafio.services.ParticipanteService;

@RestController
@RequestMapping(value = "/participante")
public class ParticipanteController {

	@Autowired
	ParticipanteService service;
	
	@GetMapping
	public ResponseEntity<List<ParticipanteDTO>> buscar(){
		return ResponseEntity.ok(service.buscarTodos());
	}
	
}
