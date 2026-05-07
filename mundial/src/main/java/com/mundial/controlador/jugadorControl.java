package com.mundial.controlador;

import com.mundial.servicio.JugadorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class jugadorControl {
    private final JugadorService jugadorService;

    public jugadorControl(JugadorService jugadorService) {
        this.jugadorService = jugadorService;
    }

    @GetMapping("/jugador")
    public String listarJugadores(Model model){
        model.addAttribute("jugadores", jugadorService.listarJugadores());
        return "jugador"; //nombre de la plantilla HTML
    
}
}
