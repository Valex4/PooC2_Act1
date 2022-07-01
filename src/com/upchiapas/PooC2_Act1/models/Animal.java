package com.upchiapas.PooC2_Act1.models;

public class Animal{
    protected String tipo;
    protected String nombre;
    protected String sexo;
    protected int peso;
    protected String tipoSangre;
    protected int id;
    protected HistorialClinico historialClinico;

    public Animal() {
    }

    public Animal(String tipo, String nombre, String sexo, int peso, String tipoSangre, int id, HistorialClinico historialClinico) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.sexo = sexo;
        this.peso = peso;
        this.tipoSangre = tipoSangre;
        this.id = id;
        this.historialClinico = historialClinico;
    }

    public HistorialClinico getHistorialClinico() {
        return historialClinico;
    }

    public void setHistorialClinico(HistorialClinico historialClinico) {
        this.historialClinico = historialClinico;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
