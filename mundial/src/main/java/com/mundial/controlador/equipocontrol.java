package com.mundial.controlador;

import com.mundial.servicio.EquipoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class equipocontrol {
    private final EquipoService equipoService;

    public equipocontrol(EquipoService equipoService) {
        this.equipoService = equipoService;
    }

    @GetMapping("/equipos")
    public String listarEquipos(Model model){
        model.addAttribute("equipos", equipoService.listarEquipos());
        return "equipos"; //nombre de la plantilla HTML

    }
}
