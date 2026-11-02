package controller;

import java.util.ArrayList;
import model.Funcionario;

public class FuncionarioController {

    private ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public void cadastrarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void listarFuncionarios() {
        for (Funcionario f: funcionarios) {
            System.out.println("Matricula: " + f.getMatricula());
            System.out.println("Nome: " + f.getNome());
            System.out.println("Cargo: " + f.getCargo());
            System.out.println("Salario: " + f.getSalario());
        }
    }

    public void removerFuncionario(String matricula) {

        for (int i = 0; i < funcionarios.size(); i++) {

            if (funcionarios.get(i).getMatricula().equals(matricula)) {

                funcionarios.remove(i);
                System.out.println("Funcionario removido!");
                return;
            }
        }

        System.out.println("Funcionario nao encontrado!");
    }

    public float calcularMediaSalarial() {

        float soma = 0;

        if (funcionarios.isEmpty()) {
            return 0;
        }

        for (Funcionario f : funcionarios) {
            soma += f.getSalario();
        }

        return soma/funcionarios.size();
    }
}