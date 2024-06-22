package model;

public class Sale {
    private int dia;
    private int canas_vendidas;
    private int botellas_vendidas;
    private int total_canas;
    private int total_botellas;
    private int total_dia;

    public Sale(){

    }

    public Sale(int dia, int canas_vendidas, int botellas_vendidas, int total_canas, int total_botellas, int total_dia) {
        this.dia = dia;
        this.canas_vendidas = canas_vendidas;
        this.botellas_vendidas = botellas_vendidas;
        this.total_canas = total_canas;
        this.total_botellas = total_botellas;
        this.total_dia = total_dia;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getCanas_vendidas() {
        return canas_vendidas;
    }

    public void setCanas_vendidas(int canas_vendidas) {
        this.canas_vendidas = canas_vendidas;
    }

    public int getBotellas_vendidas() {
        return botellas_vendidas;
    }

    public void setBotellas_vendidas(int botellas_vendidas) {
        this.botellas_vendidas = botellas_vendidas;
    }

    public int getTotal_canas() {
        return total_canas;
    }

    public void setTotal_canas(int total_canas) {
        this.total_canas = total_canas;
    }

    public int getTotal_botellas() {
        return total_botellas;
    }

    public void setTotal_botellas(int total_botellas) {
        this.total_botellas = total_botellas;
    }

    public int getTotal_dia() {
        return total_dia;
    }

    public void setTotal_dia(int total_dia) {
        this.total_dia = total_dia;
    }
}
