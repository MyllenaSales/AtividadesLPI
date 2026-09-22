package model;

public class Participante {
    String nome;
    String cpf;
    String email;
    String instituicaoEnsino;
    String curso;
    String tipoParticipacao;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getInstituicaoEnsino() {
        return instituicaoEnsino;
    }
    public void setInstituicaoEnsino(String instituicaoEnsino) {
        this.instituicaoEnsino = instituicaoEnsino;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getTipoParticipacao() {
        return tipoParticipacao;
    }
    public void setTipoParticipacao(String tipoParticipacao) {
        this.tipoParticipacao = tipoParticipacao;
    }
    public Participante() {
    }
    public Participante(String nome, String cpf, String email, String instituicaoEnsino, String curso,
            String tipoParticipacao) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.instituicaoEnsino = instituicaoEnsino;
        this.curso = curso;
        this.tipoParticipacao = tipoParticipacao;
    }
    @Override
    public String toString() {
        return "Participante [nome=" + nome + ", cpf=" + cpf + ", email=" + email + ", instituicaoEnsino="
                + instituicaoEnsino + ", curso=" + curso + ", tipoParticipacao=" + tipoParticipacao + ", getNome()="
                + getNome() + ", getCpf()=" + getCpf() + ", getEmail()=" + getEmail() + ", getInstituicaoEnsino()="
                + getInstituicaoEnsino() + ", getCurso()=" + getCurso() + ", getTipoParticipacao()="
                + getTipoParticipacao() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
                + super.toString() + "]";
    }
}
