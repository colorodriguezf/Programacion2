package Final_5_3_21.Servicios.Comparadores;

import java.util.Comparator;

import Final_5_3_21.Compuesto;

public class ComparadorMenorAntiguedad implements Comparator<Compuesto>{

    @Override
    public int compare(Compuesto c1, Compuesto c2) {
        return c1.getFinal_recorrido().compareTo(c2.getFinal_recorrido());
    }
    
}
