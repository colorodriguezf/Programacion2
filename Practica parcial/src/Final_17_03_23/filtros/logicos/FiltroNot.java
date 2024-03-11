package Final_17_03_23.filtros.logicos;
import Final_17_03_23.Entrenamiento;
import Final_17_03_23.filtros.Filtro;

public class FiltroNot extends Filtro {
    private Filtro f;

    
    public FiltroNot(Filtro f) {
        this.f = f;
    }
    
    public Filtro getF() {
        return f;
    }

    public void setF(Filtro f) {
        this.f = f;
    }

    @Override
    public boolean cumple(Entrenamiento e) {
       return !f.cumple(e);
    }


    
}
