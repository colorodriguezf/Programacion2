package Filtros;

import Ejercicio_1.Noticia;

public class FiltroTextoLargo extends Filtro {
    private int largo_texto;

    public FiltroTextoLargo(int largo_texto) {
        this.largo_texto = largo_texto;
    }


    @Override
    public boolean cumple(Noticia noticia) {
        return noticia.getTexto().length() > largo_texto;
    }
    
}
