package Ejercicio_1.comparadores;

import java.util.Comparator;
import Ejercicio_1.Socio;

public class ComparadorEdad implements Comparator<Socio>{

    @Override
    public int compare(Socio socio1, Socio socio2) {
        return (socio1.getEdad() - socio2.getEdad());
    }
    
}
