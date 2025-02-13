package com.participantes.desafio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.participantes.desafio.dto.CategoriaDTO;
import com.participantes.desafio.services.CategoriaService;

@RestController
@RequestMapping(value = "/categoria")
public class CategoriaController {

	@Autowired
	CategoriaService service;
	
	@GetMapping
	public ResponseEntity<List<CategoriaDTO>> buscar(){
		return ResponseEntity.ok(service.buscarTodos());
	}
}
