package Final_17_03_23.filtros.noLogicos;

import Final_17_03_23.Entrenamiento;
import Final_17_03_23.filtros.Filtro;

public class FiltroEnergiaMenor extends Filtro {
    private int energia;

    
    public FiltroEnergiaMenor(int energia) {
        this.energia = energia;
    }    
    
    public int getEnergia() {
        return energia;
    }    
    
    public void setEnergia(int energia) {
        this.energia = energia;
    }

    @Override
    public boolean cumple(Entrenamiento e) {
      return e.getCosto_energia() < energia;
    }
    
}
