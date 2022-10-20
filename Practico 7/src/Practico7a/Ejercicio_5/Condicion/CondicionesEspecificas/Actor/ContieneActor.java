package Practico7a.Ejercicio_5.Condicion.CondicionesEspecificas.Actor;

import Practico7a.Ejercicio_5.Pelicula;
import Practico7a.Ejercicio_5.Condicion.Condicion;

public class ContieneActor extends Condicion {
    private String actor;

    public ContieneActor(String actor) {
        this.actor = actor;
    }

    @Override
    public boolean cumple(Pelicula pelicula) {
        return pelicula.getActores().contains(actor);
    }
}
