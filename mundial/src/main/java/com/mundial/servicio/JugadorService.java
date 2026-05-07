package com.mundial.servicio;

import com.mundial.dao.jugadordao;
import com.mundial.modelo.jugadores;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JugadorService {

    private final jugadordao jugadordao;

    public JugadorService(jugadordao jugadordao) {
        this.jugadordao = jugadordao;
    }

    public List<jugadores> listarJugadores() {
        return jugadordao.listarJugadores();
    }
}