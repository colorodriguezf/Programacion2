package Final_01_12_23.comparadores;

import java.util.Comparator;

import Final_01_12_23.ElementoAseguradora;

public class ComparadorValorCierre implements Comparator<ElementoAseguradora> {

    @Override
    public int compare(ElementoAseguradora ea1, ElementoAseguradora ea2) {
       return ea1.getUltimoValorOperado() - ea2.getUltimoValorOperado();
    }
    
}
