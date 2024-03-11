package Final_17_03_23.efectos;

import Final_17_03_23.Atleta;
import Final_17_03_23.Entrenamiento;
import Final_17_03_23.filtros.Filtro;

public class EfectoAnd extends Efecto {
    private Efecto e1;
    private Efecto e2;
    
    public EfectoAnd(Filtro f, Efecto e1, Efecto e2) {
        super(f);
        this.e1 = e1;
        this.e2 = e2;
    }

    public Efecto getE1() {
        return e1;
    }

    public void setE1(Efecto e1) {
        this.e1 = e1;
    }

    public Efecto getE2() {
        return e2;
    }

    public void setE2(Efecto e2) {
        this.e2 = e2;
    }

    @Override
    public void aplicarEfecto(Atleta a, Entrenamiento e) {
       if(f.cumple(e)) {
            e1.aplicarEfecto(a, e);
            e2.aplicarEfecto(a, e);
       }
    }
    
}
