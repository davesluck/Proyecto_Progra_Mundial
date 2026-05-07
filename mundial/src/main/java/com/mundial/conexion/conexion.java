package com.mundial.conexion; 
//CONEXION ENTRE JAVA Y POSTGRESQL
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {
    private static final String URL = "jdbc:postgresql://localhost:5432/DataBaseProyectoMundial";
    private static final String USER ="postgres";
    private static final String PASSWORD = "574159daniel";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}