package Practico7a.Ejercicio_4.Condicion.CondicionEspecifica.PoderDestruccion;

import Practico7a.Ejercicio_4.Condicion.Condicion;
import Practico7a.Ejercicio_4.Ficha.*;

public class PoderDestruccionIgual extends Condicion {
    private int poder_destruccion;

    public PoderDestruccionIgual(int poder_destruccion) {
        this.poder_destruccion = poder_destruccion;
    }
    
    @Override
    public boolean cumple(Ficha ficha) {
        return ficha.getPoderDestruccion() == poder_destruccion;
    }
    
}
