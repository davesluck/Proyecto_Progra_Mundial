package com.mundial.modelo;

public class equipos {
    private int idEquipo;
    private int idGrupo;
    private String nombrePais;
    private String confederacion;
    private int ranking;

    //constructor
    public equipos(){}

    //constrcuctor con parametros
    public equipos(int idEquipo, int idGrupo, String nombrePais, String confederacion, int ranking) {
        this.idEquipo = idEquipo;
        this.idGrupo = idGrupo;
        this.nombrePais = nombrePais;
        this.confederacion = confederacion;
        this.ranking = ranking;
    }

    //get y set
    public int getIdEquipo() {
        return idEquipo;
    }
    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }
    public int getIdGrupo() {
        return idGrupo;
    }
    public void setIdGrupo(int idGrupo) {
        this.idGrupo = idGrupo;
    }
    public String getNombrePais() {
        return nombrePais;
    }
    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }
    public String getConfederacion() {
        return confederacion;
    }
    public void setConfederacion(String confederacion) {
        this.confederacion = confederacion;
    }
    public int getRanking() {
        return ranking;
    }
    public void setRanking(int ranking) {
        this.ranking = ranking;
    }
}
