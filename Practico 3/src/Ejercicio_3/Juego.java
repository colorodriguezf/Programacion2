package Ejercicio_3;

import java.util.ArrayList;

public class Juego {
    private String nombre;
    private ArrayList<Personaje> personajes;


    public Juego(String nombre) {
        this.nombre = nombre;
        this.personajes = new ArrayList<Personaje>();
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Personaje> getPersonaje() {
        return new ArrayList<Personaje>(this.personajes);
    }

    public void setPersonaje(Personaje personaje) {
        if ((personaje != null) && (!personajes.contains(personaje))) {
            personajes.add(personaje);
        }
    }

    public Personaje jugar(Personaje personaje1, Personaje personaje2, String cualidad) {
		return personaje1.compararCualidad(personaje2, cualidad);
	}

    



}
