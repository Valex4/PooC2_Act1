package com.upchiapas.PooC2_Act1.models;

public class Fecha {
    private byte day;
    private byte month;
    private byte year;

    public Fecha(byte day, byte month, byte year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public byte getDay() {
        return day;
    }

    public void setDay(byte day) {
        this.day = day;
    }

    public byte getMonth() {
        return month;
    }

    public void setMonth(byte month) {
        this.month = month;
    }

    public byte getYear() {
        return year;
    }

    public void setYear(byte year) {
        this.year = year;
    }
}
