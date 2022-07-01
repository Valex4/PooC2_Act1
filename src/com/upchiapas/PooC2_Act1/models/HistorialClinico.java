package com.upchiapas.PooC2_Act1.models;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class HistorialClinico {
    private String tipo;
    private String nombre;
    private String sexo;
    private int peso;
    private String color;
    private String raza;
    private String padecimiento;
    private String medicamentoPreventivo;
    private String esterilizado;
    public ArrayList<Diagnostico> listaDiagnosticos = new ArrayList<>();

    public HistorialClinico(String tipo, String nombre, String sexo, int peso, String color, String raza, String padecimiento, String medicamentoPreventivo, String esterilizado) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.sexo = sexo;
        this.peso = peso;
        this.color = color;
        this.raza = raza;
        this.padecimiento = padecimiento;
        this.medicamentoPreventivo = medicamentoPreventivo;
        this.esterilizado = esterilizado;
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

    public String getPadecimiento() {
        return padecimiento;
    }

    public void setPadecimiento(String padecimiento) {
        this.padecimiento = padecimiento;
    }

    public String getMedicamentoPreventivo() {
        return medicamentoPreventivo;
    }

    public void setMedicamentoPreventivo(String medicamentoPreventivo) {
        this.medicamentoPreventivo = medicamentoPreventivo;
    }

    public String getEsterilizado() {
        return esterilizado;
    }

    public void setEsterilizado(String esterilizado) {
        this.esterilizado = esterilizado;
    }
}

