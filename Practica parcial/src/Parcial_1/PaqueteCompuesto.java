package Parcial_1;

import java.time.LocalDate;
import java.util.ArrayList;

import Parcial_1.Filtros.Filtro;

public class PaqueteCompuesto extends PaqueteViaje {
    private ArrayList<PaqueteViaje> elementos;

    public PaqueteCompuesto(int cantidadPersonas, int id) {
        super(cantidadPersonas, id);
        this.elementos = new ArrayList<PaqueteViaje>();
    }

    @Override
    public String getOrigen() {
        if (!elementos.isEmpty()){
            return elementos.get(0).getOrigen();
        } else {
            return null;
        }
    }

    @Override
    public String getDestino() {
        int size = elementos.size();
        if (size > 0) {
            return elementos.get(size-1).getDestino();
        } else{
            return null;
        }
    }

    @Override
    public double getCosto() {
       double total = 0;
       for (PaqueteViaje elemento : elementos) {
        total += elemento.getCosto();
       }
       return total;
    }

    @Override
    public LocalDate getFechaPago() {
        LocalDate mayor =  LocalDate.of(1900, 1,1);
        for(PaqueteViaje elemento : elementos) {
            LocalDate fecha = elemento.getFechaPago();
            if (fecha == null) {
                return null;
            }
            else {
                if(fecha.compareTo(mayor) > 0) {
                    mayor = fecha;
                }
            }
        }
        return mayor;
    }


    public void addPaquete(PaqueteViaje paquete) {
        if (paquete.getCantidadPersonas() == this.getCantidadPersonas()) {
            if(elementos.size() == 0) {
                elementos.add(paquete);
            }else {
                if(this.getDestino().equals(paquete.getOrigen())) {
                    elementos.add(paquete);
                }
            }
        }
    }

    @Override
    public ArrayList<PaqueteViaje> buscar(Filtro ff) {
        ArrayList<PaqueteViaje> resultado = new ArrayList<PaqueteViaje>();
        if(ff.cumple(this)) {
            resultado.add(this);
        }
        else {
            for (PaqueteViaje elemento : elementos) {
                if (ff.cumple(elemento)) {
                    resultado.add(elemento);
                }
            }
        }
        return resultado;
    }   
    
}
