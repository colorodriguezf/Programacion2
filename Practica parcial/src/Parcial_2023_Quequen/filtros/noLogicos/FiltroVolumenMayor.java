package Parcial_2023_Quequen.filtros.noLogicos;
import Parcial_2023_Quequen.SistemaCollections;
import Parcial_2023_Quequen.filtros.Filtro;

public class FiltroVolumenMayor extends Filtro{
    private double volumen;
    
    public FiltroVolumenMayor(double volumen) {
        this.volumen = volumen;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    @Override
    public boolean cumple(SistemaCollections s) {
        return s.getVolumen() < volumen;
    }

    
}
