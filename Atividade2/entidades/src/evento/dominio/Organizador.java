package evento.dominio;

public class Organizador extends Usuario{
    private String setor;

    protected Organizador(){}
  
    public Organizador(String nome, String email, String setor) {
        super(nome, email);
        setSetor(setor);
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        if(setor.length()<=80){
            this.setor = setor;
        }
    }
    
}
