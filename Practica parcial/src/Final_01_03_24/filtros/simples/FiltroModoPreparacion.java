package Final_01_03_24.filtros.simples;

import Final_01_03_24.ElementoPasteleria;
import Final_01_03_24.filtros.Filtro;

public class FiltroModoPreparacion extends Filtro {
    private String modo;

    public FiltroModoPreparacion(String modo) {
        this.modo = modo;
    }

    @Override
    public boolean cumple(ElementoPasteleria e) {
        return e.getModo_preparacion().equals(modo);
    }
}
