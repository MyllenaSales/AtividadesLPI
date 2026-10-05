package model;

public class Organizador {

    private Long id;
    private String nome;
    private String email;
    private String setor;

    public Organizador() {
    }

    public Organizador(String nome, String email, String setor) {
        setNome(nome);
        setEmail(email);
        setSetor(setor);
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.strip().isEmpty()) {
            throw new IllegalArgumentException("O nome é obrigatório.");
        }

        if (nome.strip().length() > 100) {
            throw new IllegalArgumentException("O nome deve ter no máximo 100 caracteres.");
        }

        this.nome = nome.strip();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || email.strip().isEmpty()) {
            throw new IllegalArgumentException("O email é obrigatório.");
        }

        email = email.strip();

        if (email.length() > 120 || !email.matches("^[^\\s@]+@[^\\s@]+$")) {
            throw new IllegalArgumentException("O email deve estar no formato nome@dominio e ter no máximo 120 caracteres.");
        }

        this.email = email.toLowerCase();
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        if (setor == null || setor.strip().isEmpty()) {
            throw new IllegalArgumentException("O setor é obrigatório.");
        }

        if (setor.strip().length() > 80) {
            throw new IllegalArgumentException("O setor deve ter no máximo 80 caracteres.");
        }

        this.setor = setor.strip();
    }
}