package com.participantes.desafio.dto;

import com.participantes.desafio.entities.Categoria;

public class CategoriaDTO {

	private Integer id;
	private String descricao;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public CategoriaDTO() {
		
	}
	public CategoriaDTO(Integer id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}
	
	public CategoriaDTO(Categoria c) {
		id = c.getId();
		descricao = c.getDescricao();
	}
	
}
