package Parcial_1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import Parcial_1.Filtros.Filtro;

public abstract class PaqueteViaje {
    private int cantidadPersonas;
    private int id;

    public PaqueteViaje(int cantidadPersonas, int id) {
        this.cantidadPersonas = cantidadPersonas;
        this.id = id;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract String getOrigen();

	public abstract String getDestino();
	
	public abstract double getCosto();
	
	public abstract LocalDate getFechaPago();

    public abstract ArrayList<PaqueteViaje> buscar(Filtro ff);

    public ArrayList<PaqueteViaje> buscar(Filtro ff, Comparator<PaqueteViaje>c1) {
        ArrayList<PaqueteViaje> resultado = this.buscar(ff);
        Collections.sort(resultado, c1);
        return resultado;
    }

    
}
