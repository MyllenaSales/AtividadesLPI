package controller;

import java.util.ArrayList;
import model.Disciplina;

public class DisciplinaController {

    private ArrayList<Disciplina> disciplinas = new ArrayList<>();

    public void cadastrarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public void listarDisciplinas() {
        for (Disciplina d : disciplinas) {
            System.out.println("ID: " + d.getId());
            System.out.println("Nome: " + d.getNome());
            System.out.println("Professor: " + d.getProfessor());
            System.out.println("Curso: " + d.getCurso());
            System.out.println("Notas: " + d.getNotas());
        }
    }
}