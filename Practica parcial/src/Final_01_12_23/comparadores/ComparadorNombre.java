package Final_01_12_23.comparadores;

import java.util.Comparator;

import Final_01_12_23.ElementoAseguradora;

public class ComparadorNombre implements Comparator<ElementoAseguradora> {

    @Override
    public int compare(ElementoAseguradora ea1, ElementoAseguradora ea2) {
       return ea1.getNombre().compareTo(ea2.getNombre());
    }
    
}
