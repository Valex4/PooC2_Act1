package com.upchiapas.PooC2_Act1.models;

public class Diagnostico {
    private byte dia;
    private byte mes;
    private byte año;
    private String diagnostico;

    public Diagnostico(byte dia, byte mes, byte año, String diagnostico) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.diagnostico = diagnostico;
    }

    public byte getDia() {
        return dia;
    }

    public void setDia(byte dia) {
        this.dia = dia;
    }

    public byte getMes() {
        return mes;
    }

    public void setMes(byte mes) {
        this.mes = mes;
    }

    public byte getAño() {
        return año;
    }

    public void setAño(byte año) {
        this.año = año;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }
}
