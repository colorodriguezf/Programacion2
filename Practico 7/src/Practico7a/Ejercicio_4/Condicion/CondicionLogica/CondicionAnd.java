package Practico7a.Ejercicio_4.Condicion.CondicionLogica;
import Practico7a.Ejercicio_4.Condicion.Condicion;
import Practico7a.Ejercicio_4.Ficha.Ficha;

public class CondicionAnd  extends Condicion{
    private Condicion condicion1;
    private Condicion condicion2;

    public CondicionAnd(Condicion condicion1, Condicion condicion2) {
        this.condicion1 = condicion1;
        this.condicion2 = condicion2;
    }
    @Override
    public boolean cumple(Ficha ficha) {
      return condicion1.cumple(ficha) && condicion2.cumple(ficha);
    }
    
}
