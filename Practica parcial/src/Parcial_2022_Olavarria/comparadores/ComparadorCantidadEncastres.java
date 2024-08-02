package Parcial_2022_Olavarria.comparadores;
import java.util.Comparator;
import Parcial_2022_Olavarria.Jugueteria;

public class ComparadorCantidadEncastres implements Comparator<Jugueteria> {

    @Override
    public int compare(Jugueteria e1, Jugueteria e2) {
        double res = e1.getCantidadEncastres() - e2.getCantidadEncastres();
        return (int)res;
    }
    
}
