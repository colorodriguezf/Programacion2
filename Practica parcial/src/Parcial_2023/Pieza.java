package Parcial_2023;

import java.util.ArrayList;

import Parcial_2023.filtros.Filtro;

public class Pieza extends Empresa{
    private int pla;
    private String color;
    private int segundos;

    public Pieza(String nombre, String descripcion, int pla, String color, int segundos, int precio_grpla, int precio_segundo) {
       super(nombre, descripcion, precio_grpla, precio_segundo);
        this.pla = pla;
        this.color = color;
        this.segundos = segundos;
    }

    public void setPla(int pla) {
        this.pla = pla;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSegundos() {
        return segundos;
    }
    public void setSegundos(int seg) {
        segundos = seg;
    }
    
    
    @Override //1a
    public int getPla() {
       return pla;
    }
    
    @Override //1b
    public int getTiempo() {
       return segundos;
    }
    
    @Override //1c
    public ArrayList<String> getColor() {
       ArrayList<String> color = new ArrayList<>();
       color.add(this.color);
       return color;
    }

    @Override //2a
    public int getCantPiezas() { 
       return 1;
    }
    @Override //2b
    public ArrayList<Pieza> getPiezasQue(Filtro f) {
       ArrayList<Pieza> cumplen = new ArrayList<>();
       if(f.cumple(this)) {
        cumplen.add(this);
       }
       return cumplen;
    }

    @Override //3
    public int getCosto() {
       int total = ((getPla() + getPrecio_grpla()) + (getSegundos() + getPrecio_segundo()));
       return total;
    }

}
