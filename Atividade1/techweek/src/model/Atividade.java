package model;

import java.time.LocalDateTime;

public class Atividade {
    private String nome;
    private LocalDateTime dataHorario;
    private String local;
    private String descricao;
    private Palestrante responsavel;
    private String tipo;
    public String getNome() {
        return nome;
    }
    public LocalDateTime getDataHorario() {
        return dataHorario;
    }
    public String getLocal() {
        return local;
    }
    public String getDescricao() {
        return descricao;
    }
    public Palestrante getResponsavel() {
        return responsavel;
    }
    public String getTipo() {
        return tipo;
    }
    public Atividade() {
    }
    public Atividade(String nome, LocalDateTime dataHorario, String local, String descricao, Palestrante responsavel,
            String tipo) {
        this.nome = nome;
        this.dataHorario = dataHorario;
        this.local = local;
        this.descricao = descricao;
        this.responsavel = responsavel;
        this.tipo = tipo;
    }
    @Override
    public String toString() {
        return "Atividade [nome=" + nome + ", dataHorario=" + dataHorario + ", local=" + local + ", descricao="
                + descricao + ", responsavel=" + responsavel + ", tipo=" + tipo + ", getNome()=" + getNome()
                + ", getDataHorario()=" + getDataHorario() + ", getLocal()=" + getLocal() + ", getDescricao()="
                + getDescricao() + ", getResponsavel()=" + getResponsavel() + ", getTipo()=" + getTipo()
                + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
                + "]";
    }

}



