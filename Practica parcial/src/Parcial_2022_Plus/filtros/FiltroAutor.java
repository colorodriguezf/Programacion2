package Parcial_2022_Plus.filtros;
import Parcial_2022_Plus.Noticia;

public class FiltroAutor extends Filtro{
    private String autor;

    public FiltroAutor(String autor){
        this.autor = autor;
    }
    
    @Override
    public boolean cumple(Noticia noticia) {
        return noticia.getAutor().equals(autor);
    }
    
}
