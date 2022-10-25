package Parcial_1;

import java.time.LocalDate;
import java.util.ArrayList;

import Parcial_1.Filtros.Filtro;

public class PaqueteSimple extends PaqueteViaje {
    private String origen;
	private String destino;
	private double costo;
	private String datosAlo;
	private LocalDate fechaPago;

    public PaqueteSimple(int cantidadPersonas, int id, String origen, String destino, double costo, String datosAlo) {
		super(cantidadPersonas, id);
		this.origen = origen;
		this.destino = destino;
		this.costo = costo;
		this.datosAlo = datosAlo;
		this.fechaPago = null;
	}

    
    public void setOrigen(String origen) {
        this.origen = origen;
    }


    public void setDestino(String destino) {
        this.destino = destino;
    }


    public void setCosto(double costo) {
        this.costo = costo;
    }


    public String getDatosAlo() {
        return datosAlo;
    }


    public void setDatosAlo(String datosAlo) {
        this.datosAlo = datosAlo;
    }


    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }


    @Override
    public String getOrigen() {
        return origen;
    }

    @Override
    public String getDestino() {
        return destino;
    }

    @Override
    public double getCosto() {
       return costo;
    }

    @Override
    public LocalDate getFechaPago() {
       return fechaPago;
    }


    @Override
    public ArrayList<PaqueteViaje> buscar(Filtro ff) {
        ArrayList<PaqueteViaje> resultado = new ArrayList<PaqueteViaje>();
        if(ff.cumple(this)) {
            resultado.add(this);
        }
        return resultado;
    }
    
}
