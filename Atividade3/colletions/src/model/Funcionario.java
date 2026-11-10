package model;

public class Funcionario {
    private String matricula, nome, cargo;
    private float salario;
    public Funcionario() {
    }
    public Funcionario(String matricula, String nome, String cargo, float salario) {
        setMatricula(matricula);
        setNome(nome);
        setCargo(cargo);
        setSalario(salario);
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
  
}

