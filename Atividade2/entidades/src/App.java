import java.time.LocalDate;
import evento.dominio.Evento;
import evento.dominio.Organizador;
import evento.dominio.Participante;

public class App {
    public static void main(String[] args) throws Exception {

        Organizador organizador = new Organizador("Maria", "maria@ifba.edu.br", "Computação!");
        Participante participante1 = new Participante("Jose", "jose@ifba.edu.br");
        Participante participante2 = new Participante("João", "joao@ifba.edu.br", true);
        Evento evento = new Evento("Teck week", LocalDate.of(2026, 10, 20), "IFBA", 100, organizador);
        System.out.println( "O evento " + evento.getNome() + " foi organizado por " + evento.getOrganizador().getNome() + ", do curso de " + evento.getOrganizador().getSetor() );
    }
}
