package Final_5_3_21.Servicios.Comparadores;

import java.util.Comparator;
import Final_5_3_21.Compuesto;

public class ComparadorPorcentajeMayor implements Comparator<Compuesto> {

    @Override
    public int compare(Compuesto c1, Compuesto c2) {
        return c2.getPorcentaje_baches() - c1.getPorcentaje_baches();
    }
    
}
