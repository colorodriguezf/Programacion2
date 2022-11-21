package Recuperatorio2020.Filtros.logicos;
import Recuperatorio2020.Voluntario;
import Recuperatorio2020.Filtros.Filtro;

public class FiltroNot extends Filtro {
    private Filtro f;
    
    public FiltroNot(Filtro f) {
        this.f = f;
    }


    @Override
    public boolean cumple(Voluntario v) {
        return !f.cumple(v);
    }

}
