package Final_16_02_24.filtros.noLogicos;

import Final_16_02_24.Capitulo;
import Final_16_02_24.Persona;
import Final_16_02_24.filtros.Filtro;

public class FiltroRevisadosPor extends Filtro {
    private Persona revisor;    
    
    public FiltroRevisadosPor(Persona revisor) {
        this.revisor = revisor;
    }    

    public Persona getRevisor() {
        return revisor;
    }

    public void setRevisor(Persona revisor) {
        this.revisor = revisor;
    }

    @Override
    public boolean cumple(Capitulo c) {
        return c.getRevisor().equals(revisor);
    }

}
