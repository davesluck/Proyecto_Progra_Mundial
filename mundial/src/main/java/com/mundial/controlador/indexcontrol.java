package com.mundial.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexcontrol{

    @GetMapping("/")
    public String inicio() {
        return "index";
    }

}