package Parcial_2022_Olavarria.comparadores;
import java.util.Comparator;
import Parcial_2022_Olavarria.Jugueteria;

public class ComparadorColor implements Comparator<Jugueteria> {
    @Override
    public int compare(Jugueteria e1, Jugueteria e2) {
        return e1.getColor().compareTo(e2.getColor());
    }
}
