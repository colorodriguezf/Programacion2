package Parcial_2022_Olavarria.comparadores;
import java.util.Comparator;
import Parcial_2022_Olavarria.Jugueteria;

public class ComparadorCompuesto implements Comparator<Jugueteria> {
    private Comparator<Jugueteria> c1, c2;

    public ComparadorCompuesto(Comparator<Jugueteria> c1, Comparator<Jugueteria> c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public int compare(Jugueteria e1, Jugueteria e2) {
        int res = c1.compare(e1, e2);
        if (res == 0) {
            res = c2.compare(e1, e2);
        }
        return res;
    }
}
