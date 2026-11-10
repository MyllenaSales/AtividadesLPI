package model;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private int id;
    private String nome, professor, curso;
    private List<Float> notas = new ArrayList<>();
    public Disciplina() {
        
    }
    public Disciplina(int id, String nome, String professor, String curso, List<Float> notas) {
        setId(id);
        setNome(nome);
        setProfessor(professor);
        setCurso(curso);
        setNotas(notas);
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getProfessor() {
        return professor;
    }
    public void setProfessor(String professor) {
        this.professor = professor;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public List<Float> getNotas() {
        return notas;
    }
    public void setNotas(List<Float> notas) {
        this.notas = notas;
    }
    
}