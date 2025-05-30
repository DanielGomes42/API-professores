package com.l2.roomschedule.service;

import com.l2.roomschedule.dto.HorarioDTO;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class SalaService {

    public List<HorarioDTO> listarHorarios() {
        // Mock de exemplo — você pode substituir por uma consulta real depois
        return Arrays.asList(
                new HorarioDTO("Sala 101", "Segunda-feira", "08:00", "10:00", true),
                new HorarioDTO("Sala 101", "Segunda-feira", "10:00", "12:00", false),
                new HorarioDTO("Sala 102", "Terça-feira", "13:00", "15:00", true)
        );
    }

    public List<HorarioDTO> listarHorariosLivres() {
        return listarHorarios().stream()
                .filter(HorarioDTO::isDisponivel)
                .toList();
    }
    public List<HorarioDTO> filtrarHorarios(String dia, Boolean disponivel) {
        List<HorarioDTO> todosHorarios = listarHorarios();

        return todosHorarios.stream()
                .filter(h -> dia == null || h.getDiaSemana().equalsIgnoreCase(dia))
                .filter(h -> disponivel == null || h.isDisponivel() == disponivel)
                .toList();
    }

}
