package Parcial_2.Filtros.simples;

import Parcial_2.Actor;
import Parcial_2.Peliculas;
import Parcial_2.Filtros.Filtro;

public class FiltroActor extends Filtro{
    private Actor actor;

    public FiltroActor(Actor actor) {
        this.actor = actor;
    }

    @Override
    public boolean cumple(Peliculas p) {
        return p.getActores().contains(actor);
    }
    
}
