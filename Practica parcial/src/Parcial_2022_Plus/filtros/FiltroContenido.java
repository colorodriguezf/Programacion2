package Parcial_2022_Plus.filtros;
import Parcial_2022_Plus.Noticia;

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
