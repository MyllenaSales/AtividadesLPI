import java.time.LocalDate;
import java.time.LocalTime;
import model.Organizador;
import model.Participante;
import model.Evento;
import model.Programacao;

public class App {
    public static void main(String[] args) throws Exception {

        Organizador organizador = new Organizador("Maria", "maria@ifba.edu.br", "Tecnologia");
        Participante participante1 = new Participante("Jose", "jose@ifba.edu.br");
        Participante participante2 = new Participante("João", "joao@ifba.edu.br", true);
        Evento evento = new Evento("Semana de Tecnologia", LocalDate.of(2026, 10, 20), "IFBA", 100, organizador);
        Programacao programacao = new Programacao(evento, "Palestra de Tecnologia", LocalTime.of(19, 0), "Professor");

        System.out.println("ORGANIZADOR");
        System.out.println("Nome: " + organizador.getNome());
        System.out.println("Email: " + organizador.getEmail());
        System.out.println("Setor: " + organizador.getSetor());

        System.out.println();

        System.out.println("PARTICIPANTE 1");
        System.out.println("Nome: " + participante1.getNome());
        System.out.println("Email: " + participante1.getEmail());
        System.out.println("Pagante: " + participante1.isPagante());

        System.out.println();

        System.out.println("PARTICIPANTE 2");
        System.out.println("Nome: " + participante2.getNome());
        System.out.println("Email: " + participante2.getEmail());
        System.out.println("Pagante: " + participante2.isPagante());

        System.out.println();

        System.out.println("EVENTO");
        System.out.println("Nome: " + evento.getNome());
        System.out.println("Data: " + evento.getData());
        System.out.println("Local: " + evento.getLocal());
        System.out.println("Capacidade: " + evento.getCapacidade());
        System.out.println("Organizador: " + evento.getOrganizador().getNome());

        System.out.println();

        System.out.println("PROGRAMACAO");
        System.out.println("Título: " + programacao.getTitulo());
        System.out.println("Horário: " + programacao.getHorario());
        System.out.println("Responsável: " + programacao.getResponsavel());
        System.out.println();

        System.out.println("teste de validacao");

        try {
            organizador.setNome("");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            organizador.setEmail("emailinvalido");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            organizador.setSetor("");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            evento.setNome("");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            evento.setData(null);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            evento.setLocal("");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            evento.setCapacidade(0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            evento.setOrganizador(null);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
