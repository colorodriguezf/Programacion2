package Recuperatorio2020.Filtros.logicos;
import Recuperatorio2020.Voluntario;
import Recuperatorio2020.Filtros.Filtro;

public class FiltroOr extends Filtro {
    private Filtro f1;
    private Filtro f2;

    public FiltroOr(Filtro f1, Filtro f2) {
        this.f1 = f1;
        this.f2 = f2;
    }
    @Override
    public boolean cumple(Voluntario v) {
       return f1.cumple(v) || f2.cumple(v);
    }
    
}
