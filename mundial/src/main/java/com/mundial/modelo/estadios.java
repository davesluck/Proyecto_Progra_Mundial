package com.mundial.modelo;

public class estadios {
    private int idEstadio;
    private String nombreEstadio;
    private String ciudad;
    private int capacidad;
    private String imgNomEstadio;
    private String imgDataEstadio;

    //Constructor vacío
    public estadios(){}
    //Constructor con parámetros
    public estadios(int idEstadio, String nombreEstadio, String ciudad, int capacidad, String imgNomEstadio, String imgDataEstadio){
        this.idEstadio = idEstadio;
        this.nombreEstadio = nombreEstadio;
        this.ciudad = ciudad;
        this.capacidad = capacidad;
        this.imgNomEstadio = imgNomEstadio;
        this.imgDataEstadio = imgDataEstadio;
    }

    //Getters y Setters
    public int getIdEstadio() {
        return idEstadio;
    }
    public void setIdEstadio(int idEstadio) {
        this.idEstadio = idEstadio;
    }
    public String getNombreEstadio() {
        return nombreEstadio;
    }
    public void setNombreEstadio(String nombreEstadio) {
        this.nombreEstadio = nombreEstadio;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public int getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    public String getImgNomEstadio() {
        return imgNomEstadio;
    }
    public void setImgNomEstadio(String imgNomEstadio) {
        this.imgNomEstadio = imgNomEstadio;
    }
    public String getImgDataEstadio() {
        return imgDataEstadio;
    }
    public void setImgDataEstadio(String imgDataEstadio) {
        this.imgDataEstadio = imgDataEstadio;
    }
    
}
