package Parcial_2023_Quequen.filtros.noLogicos;

import Parcial_2023_Quequen.SistemaCollections;
import Parcial_2023_Quequen.filtros.Filtro;

public class FiltroPesoMenor extends Filtro {
    private double peso;

    public FiltroPesoMenor(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;   
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public boolean cumple(SistemaCollections s) {
       return s.getPeso_gr() < (peso);
    }
    
}
