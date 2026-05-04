package com.mundial.modelo;

public class posiciones {
    private int idRegistro;
    private int idGrupo;
    private int idEquipo;
    private int partidosJugados;
    private int partidosGanados;
    private int partidosEmpatados;
    private int partidosPerdidos;
    private int golesFavor;
    private int golesContra;
    private int diferenciaGoles;
    private int puntos;
    private boolean eliminado;

    public posiciones(){}

    public posiciones(int idRegistro, int idGrupo, int idEquipo, int partidosJugados, int partidosGanados, int partidosEmpatados, int partidosPerdidos, int golesFavor, int golesContra, int diferenciaGoles, int puntos, boolean eliminado){
        this.idRegistro = idRegistro;
        this.idGrupo = idGrupo;
        this.idEquipo = idEquipo;
        this.partidosJugados = partidosJugados;
        this.partidosGanados = partidosGanados;
        this.partidosEmpatados = partidosEmpatados;
        this.partidosPerdidos = partidosPerdidos;
        this.golesFavor = golesFavor;
        this.golesContra = golesContra;
        this.diferenciaGoles = diferenciaGoles;
        this.puntos = puntos;
        this.eliminado = eliminado;
    }

    public int getIdRegistro() {
        return idRegistro;
    }
    public void setIdRegistro(int idRegistro) {
        this.idRegistro = idRegistro;
    }
    public int getIdGrupo() {
        return idGrupo;
    }
    public void setIdGrupo(int idGrupo) {
        this.idGrupo = idGrupo;
    }
    public int getIdEquipo() {
        return idEquipo;
    }
    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }
    public int getPartidosJugados() {
        return partidosJugados;
    }
    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }
    public int getPartidosGanados() {
        return partidosGanados;
    }
    public void setPartidosGanados(int partidosGanados) {
        this.partidosGanados = partidosGanados;
    }
    public int getPartidosEmpatados() {
        return partidosEmpatados;
    }
    public void setPartidosEmpatados(int partidosEmpatados) {
        this.partidosEmpatados = partidosEmpatados;
    }
    public int getPartidosPerdidos() {
        return partidosPerdidos;
    }
    public void setPartidosPerdidos(int partidosPerdidos) {
        this.partidosPerdidos = partidosPerdidos;
    }
    public int getGolesFavor() {
        return golesFavor;
    }
    public void setGolesFavor(int golesFavor) {
        this.golesFavor = golesFavor;
    }
    public int getGolesContra() {
        return golesContra;
    }
    public void setGolesContra(int golesContra) {
        this.golesContra = golesContra;
    }
    public int getDiferenciaGoles() {
        return diferenciaGoles;
    }
    public void setDiferenciaGoles(int diferenciaGoles) {
        this.diferenciaGoles = diferenciaGoles;
    }
    public int getPuntos() {
        return puntos;
    }
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    public boolean isEliminado() {
        return eliminado;
    }
    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }

}
