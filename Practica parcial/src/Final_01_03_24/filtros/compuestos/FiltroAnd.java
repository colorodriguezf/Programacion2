package Final_01_03_24.filtros.compuestos;
import Final_01_03_24.ElementoPasteleria;
import Final_01_03_24.filtros.Filtro;

public class FiltroAnd extends Filtro {
    private Filtro f1;
    private Filtro f2;

    public FiltroAnd(Filtro f1, Filtro f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    @Override
    public boolean cumple(ElementoPasteleria e) {
        return (f1.cumple(e) && f2.cumple(e));
    }

    
}
