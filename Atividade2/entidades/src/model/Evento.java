package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class Evento {

    private Long id;
    private String nome;
    private LocalDate data;
    private String local;
    private int capacidade;
    private Organizador organizador;
    private List<Programacao> programacao = new ArrayList<>();
    private Set<Participante> participantes = new HashSet<>();

    public Evento() {
    }

    public Evento(String nome, LocalDate data, String local, int capacidade, Organizador organizador) {
        setNome(nome);
        setData(data);
        setLocal(local);
        setCapacidade(capacidade);
        setOrganizador(organizador);
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

        if (nome.strip().length() > 120) {
            throw new IllegalArgumentException("Nome muito grande.");
        }

        this.nome = nome.strip();
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {

        if (data == null) {
            throw new IllegalArgumentException("Data obrigatória.");
        }

        this.data = data;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {

        if (local == null || local.strip().isEmpty()) {
            throw new IllegalArgumentException("Local obrigatório.");
        }

        if (local.strip().length() > 80) {
            throw new IllegalArgumentException("Local muito grande.");
        }

        this.local = local.strip();
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {

        if (capacidade <= 0) {
            throw new IllegalArgumentException("A capacidade deve ser maior que zero.");
        }

        this.capacidade = capacidade;
    }

    public Organizador getOrganizador() {
        return organizador;
    }

    public void setOrganizador(Organizador organizador) {

        if (organizador == null) {
            throw new IllegalArgumentException("Organizador obrigatório.");
        }

        this.organizador = organizador;
    }

    public List<Programacao> getProgramacao() {
        return new ArrayList<>(programacao);
    }

    public List<Participante> getParticipantes() {
        return new ArrayList<>(participantes);
    }
}