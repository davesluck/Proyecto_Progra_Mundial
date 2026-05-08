package com.mundial.dao;

import com.mundial.conexion.conexion;
import com.mundial.modelo.estadios;

import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Repository
public class estadiodao {

    public List<estadios> listarEstadios() {
        List<estadios> lista = new ArrayList<>();

        String sql = """
                SELECT *
                FROM estadios
                ORDER BY id_estadio ASC
                """;

        try (Connection conn = conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                estadios e = new estadios();
                e.setIdEstadio(rs.getInt("id_estadio"));
                e.setNombreEstadio(rs.getString("nombre_estadio"));
                e.setCiudad(rs.getString("ciudad"));
                e.setCapacidad(rs.getInt("capacidad"));
                e.setImgNomEstadio(rs.getString("imagen_nom_estadios"));
                e.setImgDataEstadio(rs.getString("imagen_data_estadios"));

                lista.add(e);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return lista;
    }
}
