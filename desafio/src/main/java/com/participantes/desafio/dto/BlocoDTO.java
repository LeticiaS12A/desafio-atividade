package com.participantes.desafio.dto;

import java.time.Instant;

import com.participantes.desafio.entities.Bloco;

public class BlocoDTO {
	
	private Integer id;
	private Instant inicio;
	private Instant fim;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Instant getInicio() {
		return inicio;
	}
	public void setInicio(Instant inicio) {
		this.inicio = inicio;
	}
	public Instant getFim() {
		return fim;
	}
	public void setFim(Instant fim) {
		this.fim = fim;
	}
	
	public BlocoDTO() {
		
	}
	public BlocoDTO(Integer id, Instant inicio, Instant fim) {
		this.id = id;
		this.inicio = inicio;
		this.fim = fim;
	}
	
	public BlocoDTO(Bloco b) {
		id = b.getId();
		inicio = b.getInicio();
		fim = b.getInicio();
	}
	

}
