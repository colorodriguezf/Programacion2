package Parcial_2023;

import java.util.ArrayList;

import Parcial_2023.filtros.Filtro;

public abstract class Empresa {
    protected String nombre;
    protected String descripcion;
    protected int precio_grpla;
    protected int precio_segundo;

    public Empresa(String nombre, String descripcion, int precio_grpla, int precio_segundo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio_grpla = precio_grpla;
        this.precio_segundo = precio_segundo;
    }

    public int getPrecio_grpla() {
        return precio_grpla;
    }

    public void setPrecio_grpla(int precio_grpla) {
        this.precio_grpla = precio_grpla;
    }

    public int getPrecio_segundo() {
        return precio_segundo;
    }

    public void setPrecio_segundo(int precio_segundo) {
        this.precio_segundo = precio_segundo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public abstract int getPla(); //1a
    public abstract int getTiempo(); //1b
    public abstract ArrayList<String> getColor(); //1c

    public abstract int getCantPiezas(); //2a
    public abstract ArrayList<Pieza> getPiezasQue(Filtro f); //2b

    public abstract int getCosto(); //3

    
}
