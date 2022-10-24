package Ejercicio_4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public abstract class ElementoElectoral{
	
   /*a)*/ public abstract double porcentajeVotosPorCandidato(Candidato c);    
   /*b)*/ public abstract double porcentajeVotosEnBlanco(Candidato c);    
   /*c)*/ public abstract double porcentajeVotosPorHora(LocalDate inicio, LocalDate fin);
   /*d)*/ public abstract int cantidadVotos();
	
   /*e)*/ public ArrayList<Candidato> ListadoOrdenadoCandidatos(Comparator comparable){
		ArrayList<Candidato> resultado = new ArrayList<>();
		Collections.sort(resultado, comparable);
		return resultado;
	}
	
}