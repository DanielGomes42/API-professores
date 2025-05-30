package com.l2.roomschedule.dto;

public class HorarioDTO {
    private String sala;
    private String diaSemana;
    private String horarioInicio;
    private String horarioFim;
    private boolean disponivel;

    public HorarioDTO(String sala, String diaSemana, String horarioInicio, String horarioFim, boolean disponivel) {
        this.sala = sala;
        this.diaSemana = diaSemana;
        this.horarioInicio = horarioInicio;
        this.horarioFim = horarioFim;
        this.disponivel = disponivel;
    }

    public String getSala() {
        return sala;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public String getHorarioInicio() {
        return horarioInicio;
    }

    public String getHorarioFim() {
        return horarioFim;
    }

    public boolean isDisponivel() {
        return disponivel;
    }
}
