package Final_5_3_21;

import java.sql.Timestamp;
import java.util.ArrayList;

import Final_5_3_21.Servicios.Baches.Bache;

public class Compuesto extends Monitoreo {
    private int inicio_latitud;
    private int inicio_longitud;
    private double coordenada_finalizacion;
    private ArrayList<Monitoreo> elementos;
    private Calculador calculador;
    private int porcentaje_baches;

    public Compuesto(int inicio_latitud, int inicio_longitud, double coordenada_finalizacion,
            Timestamp inicio_recorrido, Timestamp final_recorrido) {
        super(inicio_recorrido, final_recorrido);
        this.inicio_latitud = inicio_latitud;
        this.inicio_longitud = inicio_longitud;
        this.coordenada_finalizacion = coordenada_finalizacion;
        this.elementos = new ArrayList<>();
    }

    public int getInicio_latitud() {
        return inicio_latitud;
    }

    public void setInicio_latitud(int inicio_latitud) {
        this.inicio_latitud = inicio_latitud;
    }

    public int getInicio_longitud() {
        return inicio_longitud;
    }

    public void setInicio_longitud(int inicio_longitud) {
        this.inicio_longitud = inicio_longitud;
    }

    public double getCoordenada_finalizacion() {
        return coordenada_finalizacion;
    }

    public void setCoordenada_finalizacion(double coordenada_finalizacion) {
        this.coordenada_finalizacion = coordenada_finalizacion;
    }

    public ArrayList<Monitoreo> getElementos() {
        return new ArrayList<Monitoreo>(this.elementos);
    }
    
    public void setElementos(Monitoreo elemento) {            
        if (elemento.getInicio_recorrido().getTime() > this.inicio_recorrido.getTime() &&
        elemento.getInicio_recorrido().getTime() < this.final_recorrido.getTime() &&
        elemento.getFinal_recorrido().getTime() < this.final_recorrido.getTime() &&
        elemento.getFinal_recorrido().getTime() > this.inicio_recorrido.getTime()) {
            elementos.add(elemento);
        }
    }
    
    public Calculador getCalculador() {
        return calculador;
    }

    public void setCalculador(Calculador calculador) {
        this.calculador = calculador;
    }

    public int getPorcentaje_baches() {
        return porcentaje_baches;
    }

    public void setPorcentaje_baches(int porcentaje_baches) {
        this.porcentaje_baches = porcentaje_baches;
    }

    @Override //2
    public ArrayList<Monitoreo> getElementoDeteriorado(Bache b) {
        ArrayList<Monitoreo> cumplen = new ArrayList<>();
        int cantidad = 0;
        int cantidadTotalDeBaches = 0;

        for(Monitoreo e : elementos) {
            cantidad = e.getCantRegistros();
            cantidadTotalDeBaches += getCantBaches(b);
            cumplen.addAll(e.getElementoDeteriorado(b));
        }
        porcentaje_baches = ((cantidadTotalDeBaches * 100) / cantidad);
        if(calculador.cumpleCondicion(cantidad, cantidadTotalDeBaches)) {
            return cumplen;
        }else {
            return null;
        }
    }


    @Override 
    public int getCantBaches(Bache b) {
        int cantidad = 0;
        for(Monitoreo e : elementos) {
            cantidad+= e.getCantBaches(b);
        }
        return cantidad;
    }

    @Override 
    public int getCantRegistros() {
        int cantidad = 0;
        for(Monitoreo e : elementos) {
            cantidad+= e.getCantRegistros();
        }
        return cantidad;
    }
    
    

    
} 
