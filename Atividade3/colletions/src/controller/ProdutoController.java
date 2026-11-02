package controller;

import java.util.ArrayList;
import model.Produto;

public class ProdutoController {

    private ArrayList<Produto> produtos = new ArrayList<>();

    public void cadastrarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void listarProdutos() {
        for (Produto p : produtos) {
            System.out.println("Codigo: " + p.getCodigo());
            System.out.println("Descricao: " + p.getDescricao());
            System.out.println("Preco: " + p.getPreco());
            System.out.println("Estoque: " + p.getEstoque());
            System.out.println("Categoria: " + p.getCategoria());
        }
    }
}