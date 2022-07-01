package com.upchiapas.PooC2_Act1.models;

public class Servicio {
    private String servicio;
    private float precio;

    public Servicio(String servicio, float precio) {
        this.servicio = servicio;
        this.precio = precio;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
