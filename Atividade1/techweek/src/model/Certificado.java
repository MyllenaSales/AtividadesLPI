package model;
import java.time.LocalDateTime;

public class Certificado {
    Participante participante;
    Evento evento;
    int cargaHoraria;
    LocalDateTime dataEmissao;
    String codigoValidacao;
    
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
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    public LocalDateTime getDataEmissao() {
        return dataEmissao;
    }
    public void setDataEmissao(LocalDateTime dataEmissao) {
        this.dataEmissao = dataEmissao;
    }
    public String getCodigoValidacao() {
        return codigoValidacao;
    }
    public void setCodigoValidacao(String codigoValidacao) {
        this.codigoValidacao = codigoValidacao;
    }
    public Certificado() {
    }
    public Certificado(Participante participante, Evento evento, int cargaHoraria, LocalDateTime dataEmissao,
            String codigoValidacao) {
        this.participante = participante;
        this.evento = evento;
        this.cargaHoraria = cargaHoraria;
        this.dataEmissao = dataEmissao;
        this.codigoValidacao = codigoValidacao;
    }
    @Override
    public String toString() {
        return "Certificado [participante=" + participante + ", evento=" + evento + ", cargaHoraria=" + cargaHoraria
                + ", dataEmissao=" + dataEmissao + ", codigoValidacao=" + codigoValidacao + ", getParticipante()="
                + getParticipante() + ", getEvento()=" + getEvento() + ", getCargaHoraria()=" + getCargaHoraria()
                + ", getDataEmissao()=" + getDataEmissao() + ", getCodigoValidacao()=" + getCodigoValidacao()
                + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
                + "]";
    }
}
