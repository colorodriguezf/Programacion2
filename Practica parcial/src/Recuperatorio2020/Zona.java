package Recuperatorio2020;
import java.util.ArrayList;

import Recuperatorio2020.Filtros.Filtro;

public class Zona extends ElementoOms {
    private String nombre;
    private ArrayList<ElementoOms> elementos;

    public Zona(String nombre) {
        this.nombre = nombre;
        this.elementos = new ArrayList<ElementoOms>();
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addElemento(ElementoOms elemento) {
        if(!elementos.contains(elemento)) {
            this.elementos.add(elemento);
        }
    }


    @Override
    public int getCantidadVoluntarios() {
        int cantidad = 0;
        for(ElementoOms elemento : elementos) {
            cantidad += elemento.getCantidadVoluntarios();
        }
        return cantidad;
    }

    @Override
    public int cantidadVoluntariosCondicion(Filtro f) {
        int total = 0;
        for (ElementoOms elemento : elementos) {
            total += elemento.cantidadVoluntariosCondicion(f);
        }
        return total;
    }

    @Override
    public ArrayList<Voluntario> getVoluntariosCondicion(Filtro f) {
        ArrayList<Voluntario> voluntarios = new ArrayList<>();
        for(ElementoOms elemento : elementos) {
            voluntarios.addAll(elemento.getVoluntariosCondicion(f));
        }
        return voluntarios;
    }




}
