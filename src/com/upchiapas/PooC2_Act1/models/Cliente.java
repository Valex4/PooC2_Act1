package com.upchiapas.PooC2_Act1.models;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private int folio;
    public ArrayList<Animal> listaAnimales = new ArrayList<>();

    public Cliente(String nombre, int folio) {
        this.nombre = nombre;
        this.folio = folio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public ArrayList<Animal> getListaAnimales() {
        return listaAnimales;
    }

    public void setListaAnimales(ArrayList<Animal> listaAnimales) {
        this.listaAnimales = listaAnimales;
    }
}
