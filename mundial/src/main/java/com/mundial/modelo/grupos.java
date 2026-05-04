package com.mundial.modelo;

public class grupos {
    private int idGrupo;
    private String nombreGrupo;

    public grupos(){}

    public grupos (int idGrupo, String nombreGrupo){
        this.idGrupo = idGrupo;
        this.nombreGrupo = nombreGrupo;
    }

    public int getIdGrupo() {
        return idGrupo;
    }
    public void setIdGrupo(int idGrupo) {
        this.idGrupo = idGrupo;
    }
    public String getNombreGrupo() {
        return nombreGrupo;
    }
    public void setNombreGrupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }
}
