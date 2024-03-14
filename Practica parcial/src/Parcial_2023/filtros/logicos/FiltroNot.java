package Parcial_2023.filtros.logicos;
import Parcial_2023.Empresa;
import Parcial_2023.Pieza;
import Parcial_2023.filtros.Filtro;
public class FiltroNot extends Filtro {
    private Filtro f;

    public FiltroNot(Filtro f) {
        this.f = f;
    }

    public Filtro getFiltro() {
        return f;
    }
    public void setFiltro(Filtro f) {
        this.f = f;
    }

    @Override
    public boolean cumple(Empresa p) {
       return (!f.cumple(p));
    }
    
}
