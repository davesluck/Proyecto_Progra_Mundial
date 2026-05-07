package com.mundial.dao;
import com.mundial.conexion.conexion;
import com.mundial.modelo.jugadores;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Repository
public class jugadordao {
    public List<jugadores> listarJugadores() {
        List<jugadores> lista = new ArrayList<>();

        String sql= """
                SELECT j.*, e.nombre_pais
                FROM jugadores j
                JOIN equipos e ON j.id_equipo = e.id_equipo""";
        try (Connection conn = conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                jugadores j = new jugadores();
                j.setIdJugador(rs.getInt("id_jugador"));
                j.setIdEquipo(rs.getInt("id_equipo"));
                j.setNombreJugador(rs.getString("nombre_jugador"));
                j.setPosicionJugador(rs.getString("posicion_jugador"));
                j.setAtaque(rs.getInt("ataque"));
                j.setMovimiento(rs.getInt("movimiento"));
                j.setSerenidad(rs.getInt("serenidad"));
                j.setDefensa(rs.getInt("defensa"));    
                j.setPorteria(rs.getInt("porteria"));
                j.setGolesAnotados(rs.getInt("goles_anotados"));
                j.setGolesDetenidos(rs.getInt("goles_detenidos"));
                j.setTarjetasAmarillas(rs.getInt("tarjetas_amarillas"));
                j.setTarjetasRojas(rs.getInt("tarjetas_rojas"));
                j.setLesionado(rs.getBoolean("lesionado"));
                j.setSuspendido(rs.getBoolean("suspendido"));
                j.setNombrePais(rs.getString("nombre_pais"));
                lista.add(j);
            }
        }
            catch (Exception j) {
                j.printStackTrace();
}
return lista;
 }
}


            


