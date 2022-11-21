package Prefinal_YouTube.filtros;
import Prefinal_YouTube.Usuario;
import Prefinal_YouTube.Video;

public class FiltroVideoAutor extends Filtro{
    private Usuario autor;

    public FiltroVideoAutor(Usuario autor) {
        this.autor = autor;
    }

    @Override
    public boolean cumple(Video v) {
       return v.getUsuarioCreador().equals(autor);
    }


}
