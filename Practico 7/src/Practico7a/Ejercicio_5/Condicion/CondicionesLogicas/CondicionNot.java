package Practico7a.Ejercicio_5.Condicion.CondicionesLogicas;

import Practico7a.Ejercicio_5.Pelicula;
import Practico7a.Ejercicio_5.Condicion.Condicion;

public class CondicionNot extends Condicion{
    private Condicion condicion;

    public CondicionNot(Condicion condicion) {
        this.condicion = condicion;
    }

    @Override
    public boolean cumple(Pelicula pelicula) {
        return !condicion.cumple(pelicula);
    }

}
