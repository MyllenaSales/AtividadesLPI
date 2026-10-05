package model;

import java.time.LocalTime;

public class Programacao {

    private Long id;
    private String titulo;
    private LocalTime horario;
    private String responsavel;
    private Evento evento;

    public Programacao() {
    }

    public Programacao(Evento evento, String titulo, LocalTime horario, String responsavel) {

        if (titulo == null || titulo.strip().isEmpty()) {
            throw new IllegalArgumentException("Título obrigatório.");
        }

        if (titulo.strip().length() > 120) {
            throw new IllegalArgumentException("Título muito grande.");
        }

        if (horario == null) {
            throw new IllegalArgumentException("Horário obrigatório.");
        }

        this.evento = evento;
        this.titulo = titulo.strip();
        this.horario = horario;

        if (responsavel == null || responsavel.strip().isEmpty()) {
            this.responsavel = "a definir";
        } else {
            this.responsavel = responsavel.strip();
        }
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public Evento getEvento() {
        return evento;
    }
}