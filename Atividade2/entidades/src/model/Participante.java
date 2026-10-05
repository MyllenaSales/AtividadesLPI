package model;

import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;

public class Participante {

    private Long id;
    private String nome;
    private String email;
    private boolean pagante;
    private Set<Evento> eventos = new HashSet<>();

    public Participante() {
    }

    public Participante(String nome, String email) {
        this(nome, email, false);
    }

    public Participante(String nome, String email, boolean pagante) {
        setNome(nome);
        setEmail(email);
        setPagante(pagante);
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {

        if (nome == null || nome.strip().isEmpty()) {
            throw new IllegalArgumentException("Nome obrigatório.");
        }

        if (nome.strip().length() > 100) {
            throw new IllegalArgumentException("Nome muito grande.");
        }

        this.nome = nome.strip();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {

        if (email == null || email.strip().isEmpty()) {
            throw new IllegalArgumentException("Email obrigatório.");
        }

        email = email.strip();

        if (email.length() > 120) {
            throw new IllegalArgumentException("Email muito grande.");
        }

        if (!email.contains("@")) {
            throw new IllegalArgumentException("Email inválido.");
        }

        this.email = email.toLowerCase();
    }

    public boolean isPagante() {
        return pagante;
    }

    public void setPagante(boolean pagante) {
        this.pagante = pagante;
    }

    public List<Evento> getEventos() {
        return new ArrayList<>(eventos);
    }
}