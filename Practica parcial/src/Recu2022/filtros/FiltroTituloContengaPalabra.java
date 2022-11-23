package Recu2022.filtros;

import Recu2022.Noticia;

public class FiltroTituloContengaPalabra extends Filtro{
    private String palabra;

    public FiltroTituloContengaPalabra(String palabra) {
        this.palabra = palabra;
    }
    @Override
    public boolean cumple(Noticia n) {
        return n.getTitulo().contains(palabra);
    }
    
}
