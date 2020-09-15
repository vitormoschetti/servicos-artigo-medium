package br.com.artigo.livro.controller;

import br.com.artigo.livro.entity.Livro;
import br.com.artigo.livro.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

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

    @ResponseBody
    @Transactional
    @RequestMapping(path = "/livros/{isbn}", method = RequestMethod.DELETE)
    public void deletar(@PathVariable Long isbn) {

        livroRepository.deleteById(isbn);

    }


}
