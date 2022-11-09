package Parcial2022.filtros;

import Parcial2022.Noticia;

public class FiltroContenido extends Filtro{
    private String frase;

    public FiltroContenido(String frase) {
        this.frase = frase;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return noticia.getContenido().contains(frase);
    }
    
}
