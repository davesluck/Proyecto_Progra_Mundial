package com.mundial.modelo;

public class fases {
    private int idFase;
    private String nombreFase;
    private boolean fase_actual;
    private boolean permite_penales;
    private boolean permite_tiempoextra;

    public fases() {}

    public fases(int idFase, String nombreFase, boolean fase_actual, boolean permite_penales, boolean permite_tiempoextra) {
        this.idFase = idFase;
        this.nombreFase = nombreFase;
        this.fase_actual = fase_actual;
        this.permite_penales = permite_penales;
        this.permite_tiempoextra = permite_tiempoextra;
    }

    public int getIdFase() {
        return idFase;
    }
    public void setIdFase(int idFase) {
        this.idFase = idFase;
    }
    public String getNombreFase() {
        return nombreFase;
    }
    public void setNombreFase(String nombreFase) {
        this.nombreFase = nombreFase;
    }
    public boolean isFase_actual() {
        return fase_actual;
    }
    public void setFase_actual(boolean fase_actual) {
        this.fase_actual = fase_actual;
    }
    public boolean isPermite_penales() {
        return permite_penales;
    }
    public void setPermite_penales(boolean permite_penales) {
        this.permite_penales = permite_penales;
    }
    public boolean isPermite_tiempoextra() {
        return permite_tiempoextra;
    }
    public void setPermite_tiempoextra(boolean permite_tiempoextra) {
        this.permite_tiempoextra = permite_tiempoextra;
    }

}
