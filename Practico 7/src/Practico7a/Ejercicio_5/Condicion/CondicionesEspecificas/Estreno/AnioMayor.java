package Practico7a.Ejercicio_5.Condicion.CondicionesEspecificas.Estreno;

import Practico7a.Ejercicio_5.Pelicula;
import Practico7a.Ejercicio_5.Condicion.Condicion;

public class AnioMayor extends Condicion{
    private int anio;

    public AnioMayor(int anio) {
        this.anio = anio;
    }

    @Override
    public boolean cumple(Pelicula pelicula) {
        return pelicula.getAnioEstreno() > anio;
    }
    
}
