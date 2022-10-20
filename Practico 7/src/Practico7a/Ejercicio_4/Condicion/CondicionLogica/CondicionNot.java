package Practico7a.Ejercicio_4.Condicion.CondicionLogica;
import Practico7a.Ejercicio_4.Condicion.Condicion;
import Practico7a.Ejercicio_4.Ficha.Ficha;

public class CondicionNot  extends Condicion{
    private Condicion condicion;

    public CondicionNot(Condicion condicion) {
        this.condicion = condicion;
    }

    @Override
    public boolean cumple(Ficha ficha) {
       return !condicion.cumple(ficha);
    }
    
}
