package controller;

import java.util.ArrayList;
import model.Livro;

public class LivroController {

    private ArrayList<Livro> livros = new ArrayList<>();

    public void cadastrarLivro(Livro livro) {
        livros.add(livro);
    }

    public void listarLivros() {
        for (Livro l : livros) {
            System.out.println("ISBN: " + l.getIsbn());
            System.out.println("Titulo: " + l.getTitulo());
            System.out.println("Autor: " + l.getAutor());
            System.out.println("Ano: " + l.getAno());
            System.out.println("Paginas: " + l.getPaginas());
            System.out.println("Disponivel: " + l.isDisponivel());
        }
    }
}