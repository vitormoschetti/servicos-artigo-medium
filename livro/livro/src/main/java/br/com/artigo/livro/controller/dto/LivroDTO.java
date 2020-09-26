package br.com.artigo.livro.controller.dto;

import br.com.artigo.livro.entity.Livro;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
public class LivroDTO {

    private Long isbn;
    private String titulo;
    private Integer edicao;
    private String autor;

    public LivroDTO(Livro livro) {
        isbn = livro.getIsbn();
        titulo = livro.getTitulo();
        edicao = livro.getEdicao();
        autor = livro.getAutor();
    }

    public static List<LivroDTO> converter(List<Livro> livros) {
        return livros.stream().map(LivroDTO::new).collect(Collectors.toList());
    }
}
