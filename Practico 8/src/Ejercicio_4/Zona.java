package Ejercicio_4;

import java.time.LocalDate;
import java.util.ArrayList;

public class Zona extends ElementoElectoral{
	ArrayList<ElementoElectoral> elementos;
	
	public Zona(){
		this.elementos = new ArrayList<>();
	}
	
	public void addElemento (ElementoElectoral elemento){
		this.elementos.add(elemento);
	}
	@Override
	public int cantidadVotos() {
		int cantidad = 0;
		for (ElementoElectoral elemento : elementos)
			cantidad += elemento.cantidadVotos();
		return cantidad;
	}

	@Override
	public double porcentajeVotosPorCandidato(Candidato candidato) {
		int porcentaje = 0;
		for (ElementoElectoral elemento  : elementos){
			porcentaje += ((elemento.porcentajeVotosPorCandidato(candidato)) * (elemento.cantidadVotos() / this.cantidadVotos()));
        }
		return porcentaje;
	}

	@Override
	public double porcentajeVotosEnBlanco(Candidato candidato) {
		int cantidad = 0;
		for (ElementoElectoral elemento: elementos)
			if (candidato == null) {
				cantidad++;
            }
		return cantidad/cantidadVotos()*100;
	}

	@Override
	public double porcentajeVotosPorHora(LocalDate inicio, LocalDate fin) {
		int cantidad = 0;
		for (ElementoElectoral elemento : elementos){
			cantidad += elemento.porcentajeVotosPorHora(inicio, fin);
        }
		return ((cantidad)/(cantidadVotos()*100));
	}


}
