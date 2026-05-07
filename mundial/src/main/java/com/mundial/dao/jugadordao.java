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
        String sql = "SELECT * FROM jugadores";

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
                
                lista.add(j);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public boolean insertarJugador(jugadores j) {
        String sql = "INSERT INTO jugadores (id_equipo, nombre_jugador, posicion_jugador, ataque, movimiento, " +
                     "serenidad, defensa, porteria, goles_anotados, goles_detenidos, tarjetas_amarillas, " +
                     "tarjetas_rojas, lesionado, suspendido) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try (Connection conn = conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ps.setInt(1, j.getIdEquipo());
            ps.setString(2, j.getNombreJugador());
            ps.setString(3, j.getPosicionJugador());
            ps.setInt(4, j.getAtaque());
            ps.setInt(5, j.getMovimiento());
            ps.setInt(6, j.getSerenidad());
            ps.setInt(7, j.getDefensa());
            ps.setInt(8, j.getPorteria());
            ps.setInt(9, j.getGolesAnotados());
            ps.setInt(10, j.getGolesDetenidos());
            ps.setInt(11, j.getTarjetasAmarillas());
            ps.setInt(12, j.getTarjetasRojas());
            ps.setBoolean(13, j.isLesionado());
            ps.setBoolean(14, j.isSuspendido());

            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean eliminarJugador(int id) {
        String sql = "DELETE FROM jugadores WHERE id_jugador = ?";
        try (Connection conn = conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}