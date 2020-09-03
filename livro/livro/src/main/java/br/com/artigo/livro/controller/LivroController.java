package br.com.artigo.livro.controller;

import java.util.Arrays;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.artigo.livro.entity.Categoria;
import br.com.artigo.livro.entity.Livro;
import br.com.artigo.livro.entity.Modelo;
import br.com.artigo.livro.repository.LivroRepository;

@Controller
public class LivroController {
	
	@Autowired
	private LivroRepository livroRepository;

	@ResponseBody
	@RequestMapping("/livros")
	public List<Livro> listar() {

		Livro livro = new Livro(123L, "Controller - Spring", 1, "Vitor", Categoria.INFORMATICA, Modelo.EBOOK);

		return Arrays.asList(livro, livro, livro);

	}

	@ResponseBody
	@Transactional
	@RequestMapping(path = "/livros", method = RequestMethod.POST)
	public void salvar(@RequestBody Livro livro) {
		
		livroRepository.save(livro);
	}

}
