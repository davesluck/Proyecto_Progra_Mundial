package com.mundial.modelo;

public class estadios {
    private int idEstadio;
    private String nombreEstadio;
    private String ciudad;
    private int capacidad;
    private String imagen_nom_estadios;
    private String imagen_data_estadios;

    //Constructor vacío
    public estadios(){}
    //Constructor con parámetros
    public estadios(int idEstadio, String nombreEstadio, String ciudad, int capacidad, String imagen_nom_estadios, String imagen_data_estadios){
        this.idEstadio = idEstadio;
        this.nombreEstadio = nombreEstadio;
        this.ciudad = ciudad;
        this.capacidad = capacidad;
        this.imagen_nom_estadios = imagen_nom_estadios;
        this.imagen_data_estadios = imagen_data_estadios;
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
        return imagen_nom_estadios;
    }
    public void setImgNomEstadio(String imgNomEstadio) {
        this.imagen_nom_estadios = imgNomEstadio;
    }
    public String getImgDataEstadio() {
        return imagen_data_estadios;
    }
    public void setImgDataEstadio(String imgDataEstadio) {
        this.imagen_data_estadios = imgDataEstadio;
    }
    
}
