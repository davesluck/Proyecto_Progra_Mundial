package com.mundial.dao;

import com.mundial.conexion.conexion;
import org.springframework.stereotype.Repository;

import java.sql.Connection;

@Repository
public class pruebadao {

    public void probarConexion() {
        System.out.println("Entró al DAO 🗃");

        try (Connection conn = conexion.getConnection()) {
            System.out.println("Conectado a PostgreSQL ✅");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}