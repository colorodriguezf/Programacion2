package Practico7a.Ejercicio_2.Condicion.CondicionCombinada;

import Practico7a.Ejercicio_2.Documento;
import Practico7a.Ejercicio_2.Condicion.Condicion;

public class CondicionNot extends Condicion {
    private Condicion condicion;

    public CondicionNot(Condicion condicion){
        this.condicion = condicion;
      }

    @Override
    public boolean cumple(Documento documento) {
         return !condicion.cumple(documento);
    }
    
}
