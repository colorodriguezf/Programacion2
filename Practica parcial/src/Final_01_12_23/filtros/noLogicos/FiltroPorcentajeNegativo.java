package Final_01_12_23.filtros.noLogicos;

import Final_01_12_23.ElementoAseguradora;
import Final_01_12_23.filtros.Filtro;

public class FiltroPorcentajeNegativo implements Filtro {
    public static final int CERO = 0; //no se como poner positivo sino

    @Override
    public boolean cumple(ElementoAseguradora ea) {
       return ea.getPorcentajeVariacion() < CERO;
    }

}
