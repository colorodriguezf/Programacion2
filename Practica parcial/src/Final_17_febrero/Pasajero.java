package Final_17_febrero;

import java.util.ArrayList;

public class Pasajero {
    private String nombre;
    private int edad;
    private ArrayList<String> preferencias;

    public Pasajero(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.preferencias = new ArrayList<>();
    }
}
