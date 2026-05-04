package com.mundial.modelo;

public class jugadores {
    private int idJugador;
    private int idEquipo;
    private String nombreJugador;
    private String posicionJugador;
    private int ataque;
    private int movimiento;
    private int serenidad;
    private int defensa;
    private int porteria;
    private int golesAnotados;
    private int golesDetenidos;
    private int tarjetasAmarillas;
    private int tarjetasRojas;
    private boolean lesionado;
    private boolean suspendido;

    public jugadores(){}

    public jugadores(int idJugador, int idEquipo, String nombreJugador, String posicionJugador, int ataque, int movimiento, int serenidad, int defensa, int porteria, int golesAnotados, int golesDetenidos, int tarjetasAmarillas, int tarjetasRojas, boolean lesionado, boolean suspendido){
        this.idJugador = idJugador;
        this.idEquipo = idEquipo;
        this.nombreJugador = nombreJugador;
        this.posicionJugador = posicionJugador;
        this.ataque = ataque;
        this.movimiento = movimiento;
        this.serenidad = serenidad;
        this.defensa = defensa;
        this.porteria = porteria;
        this.golesAnotados = golesAnotados;
        this.golesDetenidos = golesDetenidos;
        this.tarjetasAmarillas = tarjetasAmarillas;
        this.tarjetasRojas = tarjetasRojas;
        this.lesionado = lesionado;
        this.suspendido = suspendido;
    }

    public int getIdJugador() {
        return idJugador;
    }
    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }
    public int getIdEquipo() {
        return idEquipo;
    }
    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }
    public String getNombreJugador() {
        return nombreJugador;
    }
    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }
    public String getPosicionJugador() {
        return posicionJugador;
    }
    public void setPosicionJugador(String posicionJugador) {
        this.posicionJugador = posicionJugador;
    }
    public int getAtaque() {
        return ataque;
    }
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    public int getMovimiento() {
        return movimiento;
    }
    public void setMovimiento(int movimiento) {
        this.movimiento = movimiento;
    }
    public int getSerenidad() {
        return serenidad;
    }
    public void setSerenidad(int serenidad) {
        this.serenidad = serenidad;
    }
    public int getDefensa() {
        return defensa;
    }
    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }
    public int getPorteria() {
        return porteria;
    }
    public void setPorteria(int porteria) {
        this.porteria = porteria;
    }
    public int getGolesAnotados() {
        return golesAnotados;
    }
    public void setGolesAnotados(int golesAnotados) {
        this.golesAnotados = golesAnotados;
    }
    public int getGolesDetenidos() {
        return golesDetenidos;
    }
    public void setGolesDetenidos(int golesDetenidos) {
        this.golesDetenidos = golesDetenidos;
    }
    public int getTarjetasAmarillas() {
        return tarjetasAmarillas;
    }
    public void setTarjetasAmarillas(int tarjetasAmarillas) {
        this.tarjetasAmarillas = tarjetasAmarillas;
    }
    public int getTarjetasRojas() {
        return tarjetasRojas;
    }
    public void setTarjetasRojas(int tarjetasRojas) {
        this.tarjetasRojas = tarjetasRojas;
    }
    public boolean isLesionado() {
        return lesionado;
    }
    public void setLesionado(boolean lesionado) {
        this.lesionado = lesionado;
    }
    public boolean isSuspendido() {
        return suspendido;
    }
    public void setSuspendido(boolean suspendido) {
        this.suspendido = suspendido;
    }
}
