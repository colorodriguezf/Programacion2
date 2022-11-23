package Recu2022;

import Recu2022.filtros.Filtro;

public class NoticiaPrivada extends Noticia {

    public NoticiaPrivada(String categoria, String contenido, String titulo, String autor) {
        super(categoria, contenido, titulo, autor);
    }

    @Override
    public ElementoPortal getCopiaRestringidaFiltrada(Filtro f) {
        return null;
    }
    
}
