package Ejercicio_1;

import java.time.LocalDate;

public class Pelicula extends Item {
    private String nombre_pelicula;
    private int cantidad_copias_stock;

    

    public Pelicula(String nombre_pelicula, int cantidad_copias_stock) {
        super();
        this.nombre_pelicula = nombre_pelicula;
        this.cantidad_copias_stock = cantidad_copias_stock;
    }

    
    
    public String getNombre_pelicula() {
        return nombre_pelicula;
    }



    public void setNombre_pelicula(String nombre_pelicula) {
        this.nombre_pelicula = nombre_pelicula;
    }



    public int getCantidad_copias_stock() {
        return cantidad_copias_stock;
    }



    public void setCantidad_copias_stock(int cantidad_copias_stock) {
        this.cantidad_copias_stock += cantidad_copias_stock;
    }

    



    @Override
    public boolean estaDisponible() {
        if (this.getCantidad_copias_stock() > 0) {
           return true;
        }
        return false;
    }



    @Override
    public void alquilado() {
        if(this.getCantidad_copias_stock()>0) {
            this.cantidad_copias_stock--;
            }else {
            System.out.println("no quedan copias");
            }        
    }



    @Override
    public void devuelto() {
        this.setCantidad_copias_stock(this.getCantidad_copias_stock()+1);        
    }


}
    

