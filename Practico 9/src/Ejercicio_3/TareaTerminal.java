package Ejercicio_3;

import java.time.LocalDate;
import java.util.ArrayList;

import Ejercicio_3.Filtros.Filtro;

public class TareaTerminal extends ElementoWBS {
    private ArrayList<Recurso> recursos;

    public TareaTerminal(String nombre, LocalDate fechaInicioEstimada, LocalDate fechaFinEstimada,
            LocalDate fechaInicio, LocalDate fechaFin, String estado) {
        super(nombre, fechaInicioEstimada, fechaFinEstimada, fechaInicio, fechaFin, estado);
    }

    public void addRecuro(Recurso r) {
		recursos.add(r);
	}

    @Override
    public ArrayList<ElementoWBS> getTareasFiltro(Filtro f) {
        ArrayList<ElementoWBS> result = new ArrayList<>();
        if(f.cumple(this)) {
            result.add(this);
        }
        return result;
    }

    @Override
    public ArrayList<ElementoWBS> getTareasPorRecurso(Recurso r) {
        ArrayList<ElementoWBS> tareasTerminales = new ArrayList<>();
        for (Recurso recurso : recursos) {
            if(recurso.equals(recurso)) {
                tareasTerminales.add(this);
            }
        }
        return tareasTerminales;
    }

    @Override
    public ArrayList<Recurso> getRecursosPorTarea(ElementoWBS e) {
        ArrayList<Recurso> recursosInvolucrados = new ArrayList<>(this.recursos);
          
        return recursosInvolucrados;
    }

    @Override
    public LocalDate getFechaInicio() {
       return this.fecha_inicio_real;
    }

    @Override
    public LocalDate getFechaFin() {
        return this.fecha_fin_real;
    }
    
}
