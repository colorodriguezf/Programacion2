package Final_01_12_23.filtros.noLogicos;

import Final_01_12_23.ElementoAseguradora;
import Final_01_12_23.filtros.Filtro;

public class FiltroNombreContenga implements Filtro{
    private String nombre;
 
    public FiltroNombreContenga(String nombre){
        this.nombre = nombre;
    }

    @Override
    public boolean cumple(ElementoAseguradora ea) {
        return ea.getNombre().contains(nombre);
    }
    
}
