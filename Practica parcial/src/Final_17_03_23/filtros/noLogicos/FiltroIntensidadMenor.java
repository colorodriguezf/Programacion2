package Final_17_03_23.filtros.noLogicos;
import Final_17_03_23.Entrenamiento;
import Final_17_03_23.filtros.Filtro;

public class FiltroIntensidadMenor extends Filtro {
    private int intensidad;

    
    public FiltroIntensidadMenor(int intensidad) {
        this.intensidad = intensidad;
    }

    public int getIntensidad() {
        return intensidad;
    }

    public void setIntensidad(int intensidad) {
        this.intensidad = intensidad;
    }    

    @Override
    public boolean cumple(Entrenamiento e) {
      return e.getIntensidad() < intensidad;
    }


    
}
