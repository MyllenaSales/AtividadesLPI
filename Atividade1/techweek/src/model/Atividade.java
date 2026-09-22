package model;

import java.time.LocalDateTime;

public class Atividade {
    String nome;
    LocalDateTime dataHorario;
    String local;
    String descricao;
    Palestrante responsavel;
    String tipo;

    public Atividade() {
    }

    public Atividade(String nome, LocalDateTime dataHorario, String local, String descricao, Palestrante responsavel, String tipo) {
    this.nome = nome;
    this.dataHorario = dataHorario;
    this.local = local;
    this.descricao = descricao;
    this.responsavel = responsavel;
    this.tipo = tipo;
}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getDataHorario() {
        return dataHorario;
    }

    public void setDataHorario(LocalDateTime dataHorario) {
        this.dataHorario = dataHorario;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Palestrante getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Palestrante responsavel) {
        this.responsavel = responsavel;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
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



