package Final_16_02_24.filtros.noLogicos;

import Final_16_02_24.Capitulo;
import Final_16_02_24.Persona;
import Final_16_02_24.filtros.Filtro;

public class FiltroEscritosPor extends Filtro{
    private Persona autor;    
    
    public FiltroEscritosPor(Persona autor) {
        this.autor = autor;
    }    

    public Persona getAutor() {
        return autor;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }

    @Override
    public boolean cumple(Capitulo c) {
        return c.getAutores().contains(autor);
    }

    
}
