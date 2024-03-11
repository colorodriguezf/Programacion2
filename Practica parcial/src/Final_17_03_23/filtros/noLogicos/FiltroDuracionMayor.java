package Final_17_03_23.filtros.noLogicos;

import Final_17_03_23.Entrenamiento;
import Final_17_03_23.filtros.Filtro;

public class FiltroDuracionMayor  extends Filtro{
    private int duracion;

    
    public FiltroDuracionMayor(int duracion) {
        this.duracion = duracion;
    }    
    
    public int getDuracion() {
        return duracion;
    }   
    
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    @Override
    public boolean cumple(Entrenamiento e) {
       return e.getDuracion() > duracion;
    }
}
