package Final_17_03_23.efectos;

import Final_17_03_23.Atleta;
import Final_17_03_23.Entrenamiento;
import Final_17_03_23.filtros.Filtro;

public abstract class Efecto {
    protected Filtro f;
    
    public Efecto(Filtro f) {
        this.f = f;
    }   
    
    public Filtro getF() {
        return f;
    }
    
    public void setF(Filtro f) {
        this.f = f;
    }
    
    public abstract void aplicarEfecto(Atleta a, Entrenamiento e);
}
