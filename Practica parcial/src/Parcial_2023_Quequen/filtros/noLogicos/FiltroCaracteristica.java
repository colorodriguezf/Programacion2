package Parcial_2023_Quequen.filtros.noLogicos;

import Parcial_2023_Quequen.SistemaCollections;
import Parcial_2023_Quequen.filtros.Filtro;

public class FiltroCaracteristica extends Filtro {
    private String caracteristica;

    public FiltroCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }
    
    public String getCaracteristica() {
        return caracteristica;
    }


    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }
    
    @Override
    public boolean cumple(SistemaCollections s) {
        return s.geCaracteristicas().contains(caracteristica);
    }


    
}
