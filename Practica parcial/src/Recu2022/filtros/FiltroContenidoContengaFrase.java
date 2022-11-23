package Recu2022.filtros;

import Recu2022.Noticia;

public class FiltroContenidoContengaFrase extends Filtro{
    private String frase;

    public FiltroContenidoContengaFrase(String frase) {
        this.frase = frase;
    }

    @Override
    public boolean cumple(Noticia n) {
        return n.getTitulo().contains(frase);
    }
}
