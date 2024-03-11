package Final_17_03_23.filtros.noLogicos;
import Final_17_03_23.Entrenamiento;
import Final_17_03_23.filtros.Filtro;

public class FiltroInstruccionContiente  extends Filtro{
    private String palabra;
    

    public FiltroInstruccionContiente(String palabra) {
        this.palabra = palabra;
    }
    
    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
    @Override
    public boolean cumple(Entrenamiento e) {
        return e.getActividad().contains(palabra);
    }
}
