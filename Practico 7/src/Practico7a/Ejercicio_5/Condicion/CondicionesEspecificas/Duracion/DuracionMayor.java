package Practico7a.Ejercicio_5.Condicion.CondicionesEspecificas.Duracion;

import Practico7a.Ejercicio_5.Pelicula;
import Practico7a.Ejercicio_5.Condicion.Condicion;

public class DuracionMayor extends Condicion {
    private int duracion;

    public DuracionMayor(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public boolean cumple(Pelicula pelicula) {
        return pelicula.getDuracionPelicula() > duracion;
    }
}
