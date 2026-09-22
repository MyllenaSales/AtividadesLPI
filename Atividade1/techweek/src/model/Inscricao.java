package model;

import java.time.LocalDateTime;

public class Inscricao {
    Participante participante;
    Evento evento;
    LocalDateTime dataInscricao;
    String status;
    String tipoInscricao;
    
    public Participante getParticipante() {
        return participante;
    }
    public void setParticipante(Participante participante) {
        this.participante = participante;
    }
    public Evento getEvento() {
        return evento;
    }
    public void setEvento(Evento evento) {
        this.evento = evento;
    }
    public LocalDateTime getDataInscricao() {
        return dataInscricao;
    }
    public void setDataInscricao(LocalDateTime dataInscricao) {
        this.dataInscricao = dataInscricao;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getTipoInscricao() {
        return tipoInscricao;
    }
    public void setTipoInscricao(String tipoInscricao) {
        this.tipoInscricao = tipoInscricao;
    }
    public Inscricao() {
    }
    public Inscricao(Participante participante, Evento evento, LocalDateTime dataInscricao, String status,
            String tipoInscricao) {
        this.participante = participante;
        this.evento = evento;
        this.dataInscricao = dataInscricao;
        this.status = status;
        this.tipoInscricao = tipoInscricao;
    }
    @Override
    public String toString() {
        return "Inscricao [participante=" + participante + ", evento=" + evento + ", dataInscricao=" + dataInscricao
                + ", status=" + status + ", tipoInscricao=" + tipoInscricao + ", getParticipante()=" + getParticipante()
                + ", getEvento()=" + getEvento() + ", getDataInscricao()=" + getDataInscricao() + ", getStatus()="
                + getStatus() + ", getTipoInscricao()=" + getTipoInscricao() + ", getClass()=" + getClass()
                + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    }
}
