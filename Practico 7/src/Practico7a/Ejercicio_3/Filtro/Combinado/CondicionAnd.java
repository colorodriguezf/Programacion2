package Practico7a.Ejercicio_3.Filtro.Combinado;

import Practico7a.Ejercicio_3.Planta;
import Practico7a.Ejercicio_3.Filtro.Condicion;

public class CondicionAnd extends Condicion{
    private Condicion c1;
    private Condicion c2;

    public CondicionAnd(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(Planta planta) {
       return c1.cumple(planta) && c2.cumple(planta);
    }
    
}
