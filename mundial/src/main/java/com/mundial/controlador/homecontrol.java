
package com.mundial.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mundial.servicio.EquipoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class homecontrol {

  @Autowired
private EquipoService service;

@GetMapping("/db")
@ResponseBody
public String db() {
    System.out.println("Entró al endpoint 🔥");
    service.testConexion();
    return "ok";
}
    }
    

