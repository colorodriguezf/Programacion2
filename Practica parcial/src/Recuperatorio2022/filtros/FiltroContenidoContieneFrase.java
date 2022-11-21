package Recuperatorio2022.filtros;
import Recuperatorio2022.Noticia;


public class FiltroContenidoContieneFrase extends Filtro {
    private String frase;

    public FiltroContenidoContieneFrase(String frase) {
        this.frase = frase;
    }

    @Override
    public boolean cumple(Noticia n) {
       return n.getContenido().contains(frase);
    }
    
}
