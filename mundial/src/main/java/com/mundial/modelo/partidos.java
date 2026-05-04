package com.mundial.modelo;

import java.sql.Date;
import java.sql.Time;

public class partidos {
    private int idPartido;
    private int idFase;
    private int idEstadio;
    private int idEquipoLocal;
    private int idEquipoVisitante;
    private int golesEquipoLocal;
    private int golesEquipoVisitante;
    private boolean penales;
    private int golesPenalesEquipoLocal;
    private int golesPenalesEquipoVisitante;
    private int idGanador;
    private Date fechaPartido;
    private Time horaPartido;

    public partidos(){}

    public partidos(int idPartido, int idFase, int idEstadio, int idEquipoLocal, int idEquipoVisitante, int golesEquipoLocal, int golesEquipoVisitante, boolean penales, int golesPenalesEquipoLocal, int golesPenalesEquipoVisitante, int idGanador, Date fechaPartido, Time horaPartido){
        this.idPartido = idPartido;
        this.idFase = idFase;
        this.idEstadio = idEstadio;
        this.idEquipoLocal = idEquipoLocal;
        this.idEquipoVisitante = idEquipoVisitante;
        this.golesEquipoLocal = golesEquipoLocal;
        this.golesEquipoVisitante = golesEquipoVisitante;
        this.penales = penales;
        this.golesPenalesEquipoLocal = golesPenalesEquipoLocal;
        this.golesPenalesEquipoVisitante = golesPenalesEquipoVisitante;
        this.idGanador = idGanador;
        this.fechaPartido = fechaPartido;
        this.horaPartido = horaPartido;
    }

    public int getIdPartido() {
        return idPartido;
    }
    public void setIdPartido(int idPartido) {
        this.idPartido = idPartido;
    }
    public int getIdFase() {
        return idFase;
    }
    public void setIdFase(int idFase) {
        this.idFase = idFase;
    }
    public int getIdEstadio() {
        return idEstadio;
    }
    public void setIdEstadio(int idEstadio) {
        this.idEstadio = idEstadio;
    }
    public int getIdEquipoLocal() {
        return idEquipoLocal;
    }
    public void setIdEquipoLocal(int idEquipoLocal) {
        this.idEquipoLocal = idEquipoLocal;
    }
    public int getIdEquipoVisitante() {
        return idEquipoVisitante;
    }
    public void setIdEquipoVisitante(int idEquipoVisitante) {
        this.idEquipoVisitante = idEquipoVisitante;
    }
    public int getGolesEquipoLocal() {
        return golesEquipoLocal;
    }
    public void setGolesEquipoLocal(int golesEquipoLocal) {
        this.golesEquipoLocal = golesEquipoLocal;
    }
    public int getGolesEquipoVisitante() {
        return golesEquipoVisitante;
    }
    public void setGolesEquipoVisitante(int golesEquipoVisitante) {
        this.golesEquipoVisitante = golesEquipoVisitante;
    }
    public boolean isPenales() {
        return penales;
    }
    public void setPenales(boolean penales) {
        this.penales = penales;
    }
    public int getGolesPenalesEquipoLocal() {
        return golesPenalesEquipoLocal;
    }
    public void setGolesPenalesEquipoLocal(int golesPenalesEquipoLocal) {
        this.golesPenalesEquipoLocal = golesPenalesEquipoLocal;
    }
    public int getGolesPenalesEquipoVisitante() {
        return golesPenalesEquipoVisitante;
    }
    public void setGolesPenalesEquipoVisitante(int golesPenalesEquipoVisitante) {
        this.golesPenalesEquipoVisitante = golesPenalesEquipoVisitante;
    }
    public int getIdGanador() {
        return idGanador;
    }
    public void setIdGanador(int idGanador) {
        this.idGanador = idGanador;
    }
    public Date getFechaPartido() {
        return fechaPartido;
    }
    public void setFechaPartido(Date fechaPartido) {
        this.fechaPartido = fechaPartido;
    }
    public Time getHoraPartido() {
        return horaPartido;
    }
    public void setHoraPartido(Time horaPartido) {
        this.horaPartido = horaPartido;
    }

}
