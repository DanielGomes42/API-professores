package com.l2.roomschedule.controller;

import com.l2.roomschedule.dto.HorarioDTO;
import com.l2.roomschedule.service.SalaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/salas")
public class SalaController {

    @Autowired
    private SalaService salaService;



    @GetMapping("/horarios-livres")
    public List<HorarioDTO> getHorariosLivres() {
        return salaService.listarHorariosLivres();
    }

    @GetMapping("/horarios")
    public List<HorarioDTO> getHorariosFiltrados(
            @RequestParam(required = false) String dia,
            @RequestParam(required = false) Boolean disponivel
    ) {
        return salaService.filtrarHorarios(dia, disponivel);
    }


}
