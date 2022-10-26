package Ejercicio_3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

import Ejercicio_3.Filtros.Filtro;

public class TareaCompuesta extends ElementoWBS {
	private ArrayList<ElementoWBS> elemento;

    public TareaCompuesta(String nombre, LocalDate fechaInicioEstimada, LocalDate fechaFinEstimada,
            LocalDate fechaInicio, LocalDate fechaFin, String estado) {
        super(nombre, fechaInicioEstimada, fechaFinEstimada, fechaInicio, fechaFin, estado);
    }

    @Override
    public ArrayList<ElementoWBS> getTareasFiltro(Filtro f) {
        ArrayList<ElementoWBS> tareasCompuestaFiltradas = new ArrayList<>();
		if(f.cumple(this)) {
			tareasCompuestaFiltradas.add(this);
		}
		for(ElementoWBS e:elemento) {
			tareasCompuestaFiltradas.addAll(e.getTareasFiltro(f));
			
		}
		return tareasCompuestaFiltradas;
    }

    @Override
    public ArrayList<ElementoWBS> getTareasPorRecurso(Recurso r) {
      	
		ArrayList<ElementoWBS> tareasCompuesta = new ArrayList<>();
		for(ElementoWBS e:elemento) {
			tareasCompuesta.addAll(e.getTareasPorRecurso(r));
		}
		return tareasCompuesta;
    }

    @Override
    public ArrayList<Recurso> getRecursosPorTarea(ElementoWBS e) {
        ArrayList<Recurso> recursosExclusivos = new ArrayList<>();
		
		for(ElementoWBS el : elemento) {
			recursosExclusivos.addAll(el.getRecursosPorTarea(e));
			
		}
		return recursosExclusivos;
    }

    @Override
    public LocalDate getFechaInicio() {
        ArrayList<LocalDate> fechaInicio = new ArrayList<LocalDate>();
		for(ElementoWBS e:elemento) {
			fechaInicio.add(e.getFechaInicio());
		}
		Collections.sort(fechaInicio);
		LocalDate fechainicio = fechaInicio.get(0);
		return fechainicio;
    }

    @Override
    public LocalDate getFechaFin() {
        ArrayList<LocalDate> fechaFin = new ArrayList<LocalDate>();
		for(ElementoWBS e:elemento) {
			fechaFin.add(e.getFechaInicio());
		}
		Collections.reverse(fechaFin);
		LocalDate fechafin = fechaFin.get(0);
		return fechafin;
    }
    
}
