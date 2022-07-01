package com.upchiapas.PooC2_Act1.models;

public class Pez extends Animal{
    private String color;

    public Pez(String tipo, String nombre, String sexo, int peso, String tipoSangre, int id, HistorialClinico historialClinico, String color) {
        super(tipo, nombre, sexo, peso, tipoSangre, id, historialClinico);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
