package Recuperatorio2022.filtros;
import Recuperatorio2022.Noticia;


public class FiltroTituloContienePalabra extends Filtro {
    private String palabra;

    public FiltroTituloContienePalabra(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public boolean cumple(Noticia n) {
        return n.getTitulo().contains(palabra);
    }
    
}
