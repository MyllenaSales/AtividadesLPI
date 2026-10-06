package evento.dominio;

public abstract class Usuario {
    private Long id;
    private String nome;
    private String email;

    protected Usuario(){}
    
    protected Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
    public Long getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        if(nome.length()<=100){
            this.nome = nome;
        }
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        if(nome.length()<=120 && email.contains("@")){
            this.email = email;
        }
    }
}
