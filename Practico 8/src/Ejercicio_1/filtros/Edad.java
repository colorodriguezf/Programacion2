package Ejercicio_1.filtros;

import Ejercicio_1.Socio;

public class Edad extends Filtro {
    private static final int MAYORIA_EDAD = 18;
    @Override
    public boolean cumple(Socio socio) {
       return socio.getEdad() < MAYORIA_EDAD;
    }
    
}
