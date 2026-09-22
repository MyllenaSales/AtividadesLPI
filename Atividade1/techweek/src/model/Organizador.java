package model;

public class Organizador {
    String nome;
    String email;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Organizador() {
    }
    public Organizador(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
    @Override
    public String toString() {
        return "Organizador [nome=" + nome + ", email=" + email + ", getNome()=" + getNome() + ", getEmail()="
                + getEmail() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
                + super.toString() + "]";
    }
}
