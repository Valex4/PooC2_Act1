package com.upchiapas.PooC2_Act1.models;

public class Mamifero extends Animal{
    private String raza;
    private String color;
    public Mamifero(String tipo, String nombre, String sexo, int peso, String tipoSangre, int id, String raza, String color, HistorialClinico historialClinico) {
    super(tipo,nombre, sexo, peso, tipoSangre, id,historialClinico);
    this.raza = raza;
    this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
