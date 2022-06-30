package com.upchiapas.PooC2_Act1.models;

public class Animal{
    protected String tipoMamifero;
    protected String nombre;
    protected String sexo;
    protected int peso;
    protected String tipoSangre;
    protected byte id;

    public Animal() {
    }

    public Animal(String tipoMamifero, String nombre, String sexo, int peso, String tipoSangre, byte id) {
    }

    public String getTipoMamifero() {
        return tipoMamifero;
    }

    public void setTipoMamifero(String tipoMamifero) {
        this.tipoMamifero = tipoMamifero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public byte getId() {
        return id;
    }

    public void setId(byte id) {
        this.id = id;
    }
}
