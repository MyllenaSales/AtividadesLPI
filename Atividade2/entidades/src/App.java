import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

import evento.dominio.Evento;
import evento.dominio.Organizador;
import evento.dominio.Participante;

public class App {
    public static void main(String[] args) throws Exception {

        Organizador organizador = new Organizador("Maria", "maria@ifba.edu.br", "Computação!");

        List<Participante> participantes = new Vector<>();
        Participante participante1 = new Participante("Jose", "jose@ifba.edu.br");
        Participante participante2 = new Participante("João", "joao@ifba.edu.br", true);
        participantes.add(participante1);
        participantes.add(participante2);

        Scanner input = new Scanner(System.in);
        List<Atividade> atividades = new ArrayList<>();

        /*
        for(int i=0;i<3;i++){
            System.out.println("Titulo: ");
            String titulo = input.nextLine();
    
            System.out.println("Descricao: ");
            String descricao = input.nextLine();
    
            System.out.println("responsavel: ");
            String responsavel = input.nextLine();
            
            System.out.println("tipo: ");
            String tipo = input.nextLine();
            Atividade a1 = new Atividade(titulo, descricao, responsavel, tipo);

            atividades.add(a1);
        }

        for(Atividade a: atividades){
            System.out.println("/nTitulo"+a.titulo);
            System.out.println("Descricao"+a.descricao);
            System.out.println("Responsavel"+a.responsavel);
            System.out.println("Tipo"+a.tipo);
        }

       // Evento evento = new Evento("Teck week", LocalDate.of(2026, 10, 20), "IFBA", 100, organizador);
       // System.out.println( "O evento " + evento.getNome() + " foi organizado por " + evento.getOrganizador().getNome() + ", do curso de " + evento.getOrganizador().getSetor() );
                 */

        List<Aluno> alunos = new ArrayList<>();

        int qtdAlunos =0;
        System.out.println("Informe a qtd de alunos que vc quer cadastrar: ");
        qtdAlunos = input.nextInt();
    
        for(int i=0; i<qtdAlunos; i++){
            System.out.println("Nome: ");
            String nome = input.next();
            System.out.println("Turma: ");
            String turma = input.next();
            System.out.println("Nota: ");
            int nota = input.nextInt();

            Aluno aluno = new Aluno(nome, turma, nota);

            alunos.add(aluno);
        }

        for(Aluno a: alunos){
            System.out.println("Nome: "+a.nome);
            System.out.println("Nome: "+a.turma);
            System.out.println("Nome: "+a.nota);
        }

        input.close();

    }

}
class Atividade{
    String titulo, descricao, responsavel, tipo;

	public Atividade(String titulo, String descricao, String responsavel, String tipo) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.responsavel = responsavel;
		this.tipo = tipo;
	}

	public Atividade() {
	}

}

class Aluno{
    String nome;
    String turma;
    int nota;

	public Aluno() {
	}

	public Aluno(String nome, String turma, int nota) {
		this.nome = nome;
		this.turma = turma;
		this.nota = nota;
	}
    
}
