package Final_01_03_24.filtros.compuestos;
import Final_01_03_24.ElementoPasteleria;
import Final_01_03_24.filtros.Filtro;

public class FiltroNot extends Filtro {
    private Filtro f;

    public FiltroNot(Filtro f) {
        this.f = f;
    }

    @Override
    public boolean cumple(ElementoPasteleria e) {
       return (!f.cumple(e));
    }
    
}
