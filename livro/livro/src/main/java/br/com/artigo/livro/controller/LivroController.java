package br.com.artigo.livro.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.artigo.livro.entity.Categoria;
import br.com.artigo.livro.entity.Livro;
import br.com.artigo.livro.entity.Modelo;
import br.com.artigo.livro.repository.LivroRepository;
import org.springframework.web.bind.annotation.*;

@Controller
public class LivroController {
	
	@Autowired
	private LivroRepository livroRepository;

	@ResponseBody
	@RequestMapping("/livros")
	public List<Livro> listar() {
		List<Livro> livros = livroRepository.findAll();
		return livros;
	}

	@ResponseBody
	@Transactional
	@RequestMapping(path = "/livros", method = RequestMethod.POST)
	public void salvar(@RequestBody Livro livro) {

		livroRepository.save(livro);
	}

	@ResponseBody
	@Transactional
	@RequestMapping(path = "/livros", method = RequestMethod.PUT)
	public void atualizar(@RequestBody Livro livro) {

		livroRepository.save(livro);

	}



}
