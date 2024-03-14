package Final_16_02_24;

import java.util.ArrayList;

import Final_16_02_24.filtros.Filtro;

public abstract class Editorial {
    public abstract ArrayList<String> obtenerTemas(); //1a
    public abstract ArrayList<Persona> obtenerAutores(); //1b
    public abstract ArrayList<Persona> obtenerEditores(); //1c
    public abstract int obtenerCantpaginas(); //1d
    public abstract Editorial getCopiaFiltrada(Filtro f); //1e

    public abstract double getCosto();
}
