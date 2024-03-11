package Final_01_12_23.filtros;

import Final_01_12_23.ElementoAseguradora;
import Final_01_12_23.Accion;

public interface Filtro {
    public abstract boolean cumple(ElementoAseguradora ea);    
}
