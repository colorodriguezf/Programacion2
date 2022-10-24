package Ejercicio_1.comparadores;

import java.util.Comparator;

import Ejercicio_1.Socio;

public class ComparadorNombre implements Comparator<Socio> {

    @Override
    public int compare(Socio socio1, Socio socio2) {
      return socio1.getNombre().compareTo(socio2.getNombre());  
    }
    
}
