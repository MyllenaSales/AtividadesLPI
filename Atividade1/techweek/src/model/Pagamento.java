package model;

import java.time.LocalDateTime;

public class Pagamento {
    double valor;
    LocalDateTime data;
    String formaPagamento;
    String status;
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public LocalDateTime getData() {
        return data;
    }
    public void setData(LocalDateTime data) {
        this.data = data;
    }
    public String getFormaPagamento() {
        return formaPagamento;
    }
    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Pagamento() {
    }
    public Pagamento(double valor, LocalDateTime data, String formaPagamento, String status) {
        this.valor = valor;
        this.data = data;
        this.formaPagamento = formaPagamento;
        this.status = status;
    }
    @Override
    public String toString() {
        return "Pagamento [valor=" + valor + ", data=" + data + ", formaPagamento=" + formaPagamento + ", status="
                + status + ", getValor()=" + getValor() + ", getData()=" + getData() + ", getFormaPagamento()="
                + getFormaPagamento() + ", getStatus()=" + getStatus() + ", getClass()=" + getClass() + ", hashCode()="
                + hashCode() + ", toString()=" + super.toString() + "]";
    }
}
