package br.com.artigo.livro.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class Livro {
	
	private Long isbn;
	private String titulo;
	private Integer edicao;
	private String autor;
	private Categoria categoria;
	private List<Modelo> modelo;
	

}
