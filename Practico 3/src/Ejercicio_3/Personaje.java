package Ejercicio_3;

import java.util.HashMap;

public class Personaje {
private String nombre_real;    
private String nombre_ficticio;
private HashMap<String, Integer> cualidades;

public Personaje(String nombre_real, String nombre_ficticio) {
    this.nombre_real = nombre_real;
    this.nombre_ficticio = nombre_ficticio;
    this.cualidades = new HashMap<>();
}

public String getNombre_real() {
    return nombre_real;
}

public void setNombre_real(String nombre_real) {
    this.nombre_real = nombre_real;
}

public String getNombre_ficticio() {
    return nombre_ficticio;
}

public void setNombre_ficticio(String nombre_ficticio) {
    this.nombre_ficticio = nombre_ficticio;
}

public HashMap<String, Integer> getCualidades() {
    return new HashMap<>(this.cualidades);
}

public void setCualidades(String nombre, int valor) {
    if (!this.cualidades.containsKey(nombre)) {
        if (nombre != null) {
            this.cualidades.put(nombre, valor);
        }
    }
}

public Personaje compararCualidad(Personaje personaje, String cualidad) {
    if(this.getCualidades().get(cualidad)>personaje.getCualidades().get(cualidad)) {
        return this;
    }else if(this.getCualidades().get(cualidad)<personaje.getCualidades().get(cualidad)) {
        return personaje;
    }
    return null;
}






}
