
package view;

import model.*;
import controller.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        FuncionarioController funcionarioController = new FuncionarioController();
        LivroController livroController = new LivroController();
        ProdutoController produtoController = new ProdutoController();
        DisciplinaController disciplinaController = new DisciplinaController();

        int opcao;

        do {
            System.out.println("\n----- MENU -----");
            System.out.println("0 - SAIR");
            System.out.println("1 - Funcionarios");
            System.out.println("2 - Livros");
            System.out.println("3 - Produtos");
            System.out.println("4 - Disciplinas");
            System.out.print("Escolha uma opcao: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\nCONTROLE DE FUNCIONARIOS");
                    System.out.println("1 - Cadastrar");
                    System.out.println("2 - Listar");
                    System.out.println("3 - Remover");
                    System.out.println("4 - Media salarial");
                    int opF = scanner.nextInt();
                    scanner.nextLine();

                    if (opF == 1) {

                        String matricula, nome, cargo;
                        Float salario;

                        System.out.print("Matricula: ");
                        matricula = scanner.nextLine();
                        System.out.print("Nome: ");
                        nome = scanner.nextLine();
                        System.out.print("Cargo: ");
                        cargo = scanner.nextLine();
                        System.out.print("Salario: ");
                        salario = scanner.nextFloat();
                        scanner.nextLine();

                        Funcionario f = new Funcionario(matricula, nome, cargo, salario);
                        funcionarioController.cadastrarFuncionario(f);

                    } else if (opF == 2) {
                        funcionarioController.listarFuncionarios();

                    } else if (opF == 3) {
                        String matricula;

                        System.out.print("Matricula: ");
                        matricula = scanner.nextLine();

                        funcionarioController.removerFuncionario(matricula);

                    } else if (opF == 4) {
                        System.out.println("Media salarial: " +
                                funcionarioController.calcularMediaSalarial());
                    }

                    break;

                case 2:

                    System.out.println("\nCONTROLE DE LIVROS");
                    System.out.println("1 - Cadastrar");
                    System.out.println("2 - Listar");

                    int opL = scanner.nextInt();
                    scanner.nextLine();

                    if (opL == 1) {

                        String isbn, titulo, autor;
                        int ano, paginas;
                        boolean disponivel;

                        System.out.print("Isbn: ");
                        isbn = scanner.nextLine();
                        System.out.print("Titulo: ");
                        titulo = scanner.nextLine();
                        System.out.print("Autor: ");
                        autor = scanner.nextLine();
                        System.out.print("Ano: ");
                        ano = scanner.nextInt();
                        System.out.print("Paginas: ");
                        paginas = scanner.nextInt();
                        System.out.print("Disponivel (true/false): ");
                        disponivel = scanner.nextBoolean();
                        scanner.nextLine();

                        Livro l = new Livro(ano, paginas, isbn, titulo, autor, disponivel);
                        livroController.cadastrarLivro(l);

                    } else if (opL == 2) {
                        livroController.listarLivros();
                    }

                    break;

                case 3:

                    System.out.println("\nCONTROLE DE PRODUTOS");
                    System.out.println("1 - Cadastrar");
                    System.out.println("2 - Listar");

                    int opP = scanner.nextInt();
                    scanner.nextLine();

                    if (opP == 1) {

                        int codigo, estoque;
                        String descricao, categoria;
                        float preco;

                        System.out.print("Codigo: ");
                        codigo = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Descricao: ");
                        descricao = scanner.nextLine();
                        System.out.print("Preco: ");
                        preco = scanner.nextFloat();
                        System.out.print("Estoque: ");
                        estoque = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Categoria: ");
                        categoria = scanner.nextLine();

                        Produto p = new Produto(codigo, estoque, descricao, categoria, preco);
                        produtoController.cadastrarProduto(p);

                    } else if (opP == 2) {
                        produtoController.listarProdutos();
                    }

                    break;

                case 4:

                    System.out.println("\nCONTROLE DE DISCIPLINAS");
                    System.out.println("1 - Cadastrar");
                    System.out.println("2 - Listar");

                    int opD = scanner.nextInt();
                    scanner.nextLine();

                    if (opD == 1) {

                        int id, quantidade;
                        String nome, professor, curso;
                        ArrayList<Float> notas = new ArrayList<>();

                        System.out.print("ID: ");
                        id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Nome: ");
                        nome = scanner.nextLine();
                        System.out.print("Professor: ");
                        professor = scanner.nextLine();
                        System.out.print("Curso: ");
                        curso = scanner.nextLine();
                        System.out.print("Quantidade de notas: ");
                        quantidade = scanner.nextInt();

                        for (int i = 0; i < quantidade; i++) {
                            System.out.print("Nota " + (i + 1) + ": ");
                            notas.add(scanner.nextFloat());
                        }

                        scanner.nextLine();

                        Disciplina d = new Disciplina(id, nome, professor, curso, notas);
                        disciplinaController.cadastrarDisciplina(d);

                    } else if (opD == 2) {
                        disciplinaController.listarDisciplinas();
                    }

                    break;

                case 0:
                    System.out.println("Programa encerrado!");
                    break;

                default:
                    System.out.println("Opcao invalida!");

            }

        } while (opcao != 0);
        scanner.close();
    }
}
