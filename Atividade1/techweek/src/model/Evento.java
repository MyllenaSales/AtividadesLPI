package model;

import java.time.LocalDateTime;

public class Evento {
    String nome;
    String descricao;
    LocalDateTime dataHorario;
    String local;
    String tema;
    String modalidade;
    String situacao;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
    public String getTema() {
        return tema;
    }
    public void setTema(String tema) {
        this.tema = tema;
    }
    public String getModalidade() {
        return modalidade;
    }
    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }
    public String getSituacao() {
        return situacao;
    }
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    public Evento() {
    }
    public Evento(String nome, String descricao, LocalDateTime dataHorario, String local, String tema,
            String modalidade, String situacao) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataHorario = dataHorario;
        this.local = local;
        this.tema = tema;
        this.modalidade = modalidade;
        this.situacao = situacao;
    }
    @Override
    public String toString() {
        return "Evento [nome=" + nome + ", descricao=" + descricao + ", dataHorario=" + dataHorario + ", local=" + local
                + ", tema=" + tema + ", modalidade=" + modalidade + ", situacao=" + situacao + ", getNome()="
                + getNome() + ", getDescricao()=" + getDescricao() + ", getDataHorario()=" + getDataHorario()
                + ", getLocal()=" + getLocal() + ", getTema()=" + getTema() + ", getModalidade()=" + getModalidade()
                + ", getSituacao()=" + getSituacao() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
                + ", toString()=" + super.toString() + "]";
    }
}


