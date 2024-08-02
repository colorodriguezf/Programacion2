package Parcial_2022_Olavarria.comparadores;
import java.util.Comparator;
import Parcial_2022_Olavarria.Jugueteria;

public class ComparadorCosto implements Comparator<Jugueteria> {
    
    @Override
    public int compare(Jugueteria e1, Jugueteria e2) {
        return Double.compare(e1.getCosto(), e2.getCosto());
    }
}
