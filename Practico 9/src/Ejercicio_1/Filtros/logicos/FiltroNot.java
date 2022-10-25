package Ejercicio_1.Filtros.logicos;

import Ejercicio_1.Noticia;
import Ejercicio_1.Filtros.Filtro;

public class FiltroNot extends Filtro{
    private Filtro f1;

    public FiltroNot(Filtro f1) {
        this.f1 = f1;
    }


    @Override
    public boolean cumple(Noticia noticia) {
        return !f1.cumple(noticia);
    }
    
}
