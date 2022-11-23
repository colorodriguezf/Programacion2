package Recu2022.filtros;
import Recu2022.Noticia;

public class FiltroAutor extends Filtro{
    private String  autor;

    public FiltroAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public boolean cumple(Noticia n) {
       return n.getAutor().equals(autor);
    }
}
