package Final_01_03_24.filtros.simples;
import Final_01_03_24.ElementoPasteleria;
import Final_01_03_24.filtros.Filtro;

public class FiltroTipoPreparacion extends Filtro {
    private String tipo;
    
    public FiltroTipoPreparacion(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean cumple(ElementoPasteleria e) {
       return e.getTipo().equals(tipo);
    }
    
}
