package Ejercicio_2;

import java.util.ArrayList;

public class Fabrica {
    private String nombre;
    private ArrayList<Producto> productos_disponibles;

    public Fabrica(String nombre) {
        this.nombre = nombre;
        this.productos_disponibles = new ArrayList<Producto>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public ArrayList<Producto> getProductos_disponibles() {
        return new ArrayList<Producto>(this.productos_disponibles);
    }

    public void setProductos_disponibles(Producto productos) {
        if ((productos != null) && (!productos_disponibles.contains(productos))) {
            productos_disponibles.add(productos);
        }

    }

    public void getInfo() {
        System.out.println("Nombre de la fabrica: " + getNombre());
        System.out.println("Productos disponibles: " + getProductos_disponibles());
        System.out.println("-------------");
    }


    
}
