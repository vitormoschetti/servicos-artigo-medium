package br.com.artigo.livro.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.artigo.livro.entity.Categoria;
import br.com.artigo.livro.entity.Livro;
import br.com.artigo.livro.entity.Modelo;

@Controller
public class LivroController {

	@ResponseBody
	@RequestMapping("/livros")
	public List<Livro> listar() {

		Livro livro = new Livro(123L, "Controller - Spring", 1, "Vitor", Categoria.INFORMATICA,
				Arrays.asList(Modelo.EBOOK, Modelo.FISICO));
		
		return Arrays.asList(livro, livro, livro);

	}

}
