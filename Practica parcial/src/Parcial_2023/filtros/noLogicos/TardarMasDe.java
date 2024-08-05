package Parcial_2023.filtros.noLogicos;

import Parcial_2023.Empresa;
import Parcial_2023.filtros.Filtro;

public class TardarMasDe extends Filtro {
    private int segundos;
    
    public TardarMasDe(int segundos) {
        this.segundos = segundos;
    }
    
    public int getSegundos() {
        return segundos;
    }
    
    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    @Override
    public boolean cumple(Empresa p) {
       return p.getTiempo() > segundos;
    }
    
}
