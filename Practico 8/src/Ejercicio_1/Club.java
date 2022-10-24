package Ejercicio_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import Ejercicio_1.filtros.Filtro;

public class Club {
    private String nombre;
    private ArrayList<Socio> socios;
    private ArrayList<Alquiler> alquileres;

    public Club(String nombre) {
        this.nombre = nombre;
        this.socios = new ArrayList<Socio>();
        this.alquileres = new ArrayList<Alquiler>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Socio> getSocios() {
        return socios;
    }

    public void setSocios(Socio socio) {
        if((socios != null) && (socios.contains(socio))) {
            socios.add(socio);
        }
    }

    public ArrayList<Alquiler> getAlquileres() {
        return alquileres;
    }

    public void setAlquileres(Alquiler alquiler) {
        this.alquileres.add(alquiler);
    }

    public ArrayList<Socio> getSociosQue(Filtro filtro, Comparator<Socio> comparador) {
        ArrayList<Socio> resultado = new ArrayList<>();

        for(Socio socio : socios) {
            if(filtro.cumple(socio)) {
                resultado.add(socio);
            }
        }
        Collections.sort(resultado, comparador);
        return resultado;
    }

    
}
