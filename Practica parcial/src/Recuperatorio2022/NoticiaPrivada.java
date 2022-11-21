package Recuperatorio2022;
import Recuperatorio2022.filtros.Filtro;

public class NoticiaPrivada extends Noticia {

    public NoticiaPrivada(String categoria, String contenido, String titulo, String autor) {
        super(categoria, contenido, titulo, autor);
    }

    @Override //b
    public ElementoPortal getCopiaFiltrada(Filtro f) {
        return null;
    }
    
}
