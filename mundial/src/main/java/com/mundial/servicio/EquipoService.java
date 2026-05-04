package com.mundial.servicio;

import com.mundial.dao.pruebadao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EquipoService {

    @Autowired
    private pruebadao dao;

    public void testConexion() {
        System.out.println("Entró al service ⚙️");
        dao.probarConexion();
    }
}
