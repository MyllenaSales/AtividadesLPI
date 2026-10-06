package evento.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Evento {

    private Long id;
    private String nome;
    private LocalDate data;
    private String local;
    private int capacidade;
    private Organizador organizador;
    private List<Programacao> programacao = new ArrayList<>();
    private Set<Participante> participantes = new HashSet<>();

    protected Evento() {
    }

    public Evento(String nome, LocalDate data, String local, int capacidade, Organizador organizador) {
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.capacidade = capacidade;
        this.organizador = organizador;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() <= 120) {
            this.nome = nome;
        }
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        if (data != null) {
            this.data = data;
        }
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        if (local.length() <= 80) {
            this.local = local;
        }
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        if (capacidade > 0) {
            this.capacidade = capacidade;
        }
    }

    public Organizador getOrganizador() {
        return organizador;
    }

    public void setOrganizador(Organizador organizador) {
        if (organizador != null) {
            this.organizador = organizador;
        }
    }

    public List<Programacao> getProgramacao() {
        return programacao;
    }

    public void setProgramacao(List<Programacao> programacao) {
        this.programacao = programacao;
    }

    public Set<Participante> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(Set<Participante> participantes) {
        this.participantes = participantes;
    }

}
