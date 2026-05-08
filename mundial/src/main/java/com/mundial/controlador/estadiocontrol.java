package com.mundial.controlador;

import com.mundial.servicio.EstadioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class estadiocontrol {

    private final EstadioService EstadioService;

    public estadiocontrol(EstadioService EstadioService) {
        this.EstadioService = EstadioService;
    }

    @GetMapping("/estadios")
    public String listarEstadios(Model model){
        model.addAttribute("estadios", EstadioService.listarEstadios());
        return "estadio";
    }
}

