package Parcial_2022_Plus.filtros;
import Parcial_2022_Plus.Noticia;

public class FiltroTitulo extends Filtro  {
    private String titulo;

    public FiltroTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return noticia.getTitulo().contains(titulo);
    }
    
}
