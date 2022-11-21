package Recuperatorio2022.filtros;
import Recuperatorio2022.Noticia;


public class FiltroPalabraClave extends Filtro {
    private String palabra;

    public FiltroPalabraClave(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public boolean cumple(Noticia n) {
        return n.getPalabrasClaves().contains(palabra);
    }


}
