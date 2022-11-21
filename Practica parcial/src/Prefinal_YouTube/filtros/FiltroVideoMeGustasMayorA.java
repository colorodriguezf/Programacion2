package Prefinal_YouTube.filtros;
import Prefinal_YouTube.Video;

public class FiltroVideoMeGustasMayorA extends Filtro{
    private int mg;

    public FiltroVideoMeGustasMayorA(int mg) {
        this.mg = mg;
    }

    @Override
    public boolean cumple(Video v) {
        return v.getCantMg() > mg;
    }
    
}
