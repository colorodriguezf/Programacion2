package Ejercicio_3.Filtros;

import Ejercicio_3.ElementoWBS;

public class FiltroTareasAtrasadas extends Filtro {
	

	@Override
	public boolean cumple(ElementoWBS elemento) {
		return elemento.estaAtrasada();
	}
	

}
