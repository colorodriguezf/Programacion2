package Prefinal_YouTube.filtros;
import Prefinal_YouTube.Video;

public class FiltroVideoVisualizacionesMayorA extends Filtro {
    private int visualizaciones;

    public FiltroVideoVisualizacionesMayorA(int visualizaciones) {
        this.visualizaciones = visualizaciones;
    }

    @Override
    public boolean cumple(Video v) {
        return v.getCantVisualizaciones() > visualizaciones;
    }
    
}
