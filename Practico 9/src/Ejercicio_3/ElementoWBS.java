package Ejercicio_3;

import java.time.LocalDate;
import java.util.ArrayList;

import Ejercicio_3.Filtros.Filtro;

public abstract class ElementoWBS {
    protected String nombre;
    protected LocalDate fecha_inicio_estimada;
    protected LocalDate fecha_fin_estimada;
    protected LocalDate fecha_inicio_real;
    protected LocalDate fecha_fin_real;
    protected String estado;
    
    public ElementoWBS(String nombre, LocalDate fechaInicioEstimada, LocalDate fechaFinEstimada, LocalDate fechaInicio,
			LocalDate fechaFin,String estado) {
		this.nombre= nombre;
		this.fecha_inicio_estimada = fechaInicioEstimada;
		this.fecha_fin_estimada = fechaFinEstimada;
		this.fecha_inicio_real = fechaInicio;
		this.fecha_fin_real = fechaFin;
		this.estado = estado;
    }

    public abstract ArrayList<ElementoWBS> getTareasFiltro(Filtro f);
    public abstract ArrayList<ElementoWBS> getTareasPorRecurso(Recurso r);
    public abstract ArrayList<Recurso> getRecursosPorTarea(ElementoWBS e);
	public abstract LocalDate getFechaInicio();
	public abstract LocalDate getFechaFin();
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha_inicio_estimada() {
        return fecha_inicio_estimada;
    }

    public void setFecha_inicio_estimada(LocalDate fecha_inicio_estimada) {
        this.fecha_inicio_estimada = fecha_inicio_estimada;
    }

    public LocalDate getFecha_fin_estimada() {
        return fecha_fin_estimada;
    }

    public void setFecha_fin_estimada(LocalDate fecha_fin_estimada) {
        this.fecha_fin_estimada = fecha_fin_estimada;
    }

    public LocalDate getFecha_inicio_real() {
        return fecha_inicio_real;
    }

    public void setFecha_inicio_real(LocalDate fecha_inicio_real) {
        this.fecha_inicio_real = fecha_inicio_real;
    }

    public LocalDate getFecha_fin_real() {
        return fecha_fin_real;
    }

    public void setFecha_fin_real(LocalDate fecha_fin_real) {
        this.fecha_fin_real = fecha_fin_real;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean isTerminada() {
        return false;
    }

    public boolean estaAtrasada() {
        return false;
    }

}
