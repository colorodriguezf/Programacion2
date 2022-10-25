package Parcial_2.Filtros.simples;

import Parcial_2.Peliculas;
import Parcial_2.Filtros.Filtro;

public class FiltroCantidad extends Filtro {
	private int cantidadAct;

    public FiltroCantidad(int cantidadAct) {
		this.cantidadAct = cantidadAct;
	}

    @Override
    public boolean cumple(Peliculas p) {
       return p.getActores().size()>cantidadAct;
    }
    
}
