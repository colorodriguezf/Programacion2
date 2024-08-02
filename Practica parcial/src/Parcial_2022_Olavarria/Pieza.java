package Parcial_2022_Olavarria;

import java.util.ArrayList;

import Parcial_2022_Olavarria.filtro.Filtro;

public class Pieza extends Jugueteria {
    private String color;
    private double peso, costo, cantidad_encastres;


    public Pieza(String marca, String color, double peso, double costo, double cantidad_encastres) {
        super(marca);
        this.color = color;
        this.peso = peso;
        this.costo = costo;
        this.cantidad_encastres = cantidad_encastres;
    }

    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public double getPeso() {
        return peso;
    }


    public void setPeso(double peso) {
        this.peso = peso;
    }


    public double getCosto() {
        return costo;
    }


    public void setCosto(double costo) {
        this.costo = costo;
    }


    public double getCantidadEncastres() {
        return cantidad_encastres;
    }


    public void setCantidadEncastres(double cantidad_encastres) {
        this.cantidad_encastres = cantidad_encastres;
    }

    @Override //1
    public ArrayList<Jugueteria> getElementosQue(Filtro f) {
       ArrayList<Jugueteria> cumplen = new ArrayList<>();
       if(f.cumple(this)) {
        cumplen.add(this);
       }
       return cumplen;
    }

    @Override
    public String toString() {
        return "Pieza [marca=" + getMarca() + ", color=" + color + ", peso=" + peso + ", costo=" + costo
                + ", cantidad_encastres=" + cantidad_encastres + "]\n";
    }

    


    

    
}
