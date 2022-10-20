package Practico7a.Ejercicio_4.Condicion.CondicionEspecifica.EspacioOcupa;

import Practico7a.Ejercicio_4.Condicion.Condicion;
import Practico7a.Ejercicio_4.Ficha.*;

public class EspacioOcupaIgual extends Condicion {
    private int espacio_ocupa;

    public EspacioOcupaIgual(int espacio_ocupa) {
        this.espacio_ocupa = espacio_ocupa;
    }

    @Override
    public boolean cumple(Ficha ficha) {
       return ficha.getEspacioTablero() == espacio_ocupa;
    }
    
}
