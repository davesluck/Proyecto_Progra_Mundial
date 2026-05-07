package com.mundial.dao;

import com.mundial.conexion.conexion;
import com.mundial.modelo.equipos;

import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Repository
public class equipodao {
    public List<equipos> listarEquipos() {
        List<equipos> lista = new ArrayList<>();

        String sql = """
                SELECT e.*, g.nombre_grupo
                FROM equipos e
                JOIN grupos g
                ON e.id_grupo = g.id_grupo
                ORDER BY id_grupo ASC 
                """;
        try (Connection conn = conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                equipos e = new equipos();
                e.setIdEquipo(rs.getInt("id_equipo"));
                e.setIdGrupo(rs.getInt("id_grupo"));
                e.setNombrePais(rs.getString("nombre_pais"));
                e.setConfederacion(rs.getString("confederacion"));
                e.setRanking(rs.getInt("ranking"));
                e.setNombreGrupo(rs.getString("nombre_grupo"));
                
                lista.add(e);
            }
        } catch (Exception e) {
            e.printStackTrace();
    }    
    return lista;
}
}
