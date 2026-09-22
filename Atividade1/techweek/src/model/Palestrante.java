package model;

public class Palestrante {
    String nome;
    String foto;
    String email;
    String biografia;
    String atuacao;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getFoto() {
        return foto;
    }
    public void setFoto(String foto) {
        this.foto = foto;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getBiografia() {
        return biografia;
    }
    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }
    public String getAtuacao() {
        return atuacao;
    }
    public void setAtuacao(String atuacao) {
        this.atuacao = atuacao;
    }
    public Palestrante() {
    }
    public Palestrante(String nome, String foto, String email, String biografia, String atuacao) {
        this.nome = nome;
        this.foto = foto;
        this.email = email;
        this.biografia = biografia;
        this.atuacao = atuacao;
    }
    @Override
    public String toString() {
        return "Palestrante [nome=" + nome + ", foto=" + foto + ", email=" + email + ", biografia=" + biografia
                + ", atuacao=" + atuacao + ", getNome()=" + getNome() + ", getFoto()=" + getFoto() + ", getEmail()="
                + getEmail() + ", getBiografia()=" + getBiografia() + ", getAtuacao()=" + getAtuacao() + ", getClass()="
                + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    }
}
