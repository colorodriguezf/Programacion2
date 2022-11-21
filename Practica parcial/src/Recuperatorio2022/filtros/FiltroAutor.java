package Recuperatorio2022.filtros;
import Recuperatorio2022.Noticia;


public class FiltroAutor extends Filtro {
    private String autor;

    public FiltroAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public boolean cumple(Noticia n) {
       return n.getAutor().equals(autor);
    }
}
