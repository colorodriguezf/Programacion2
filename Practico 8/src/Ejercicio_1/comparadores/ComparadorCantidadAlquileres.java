package Ejercicio_1.comparadores;

import java.util.Comparator;
import Ejercicio_1.Socio;

public class ComparadorCantidadAlquileres implements Comparator<Socio>{
    private String cancha;

    public ComparadorCantidadAlquileres(String cancha){
        this.cancha = cancha;
    }

    @Override
    public int compare(Socio socio1, Socio socio2) {
        if(socio1.cantidadDeVecesSeAlquiloCancha(cancha) > socio2.cantidadDeVecesSeAlquiloCancha(cancha)){
            return 1;
        } 
        else if (socio1.cantidadDeVecesSeAlquiloCancha(cancha) < socio2.cantidadDeVecesSeAlquiloCancha(cancha)){
            return -1;
        }
        else {
            return 0;
        }
    }
    
    
}
