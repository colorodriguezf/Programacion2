package Filtros;

import Ejercicio_1.Noticia;

public class FiltroPalabraClave extends Filtro{
    private String palabra;

    public FiltroPalabraClave(String palabra) {
        this.palabra = palabra;
    }


    @Override
    public boolean cumple(Noticia noticia) {
        return noticia.getPalabrasClaves().contains(palabra);
    }
    
}
