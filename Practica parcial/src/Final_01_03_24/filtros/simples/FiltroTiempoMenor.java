package Final_01_03_24.filtros.simples;
import Final_01_03_24.ElementoPasteleria;
import Final_01_03_24.filtros.Filtro;

public class FiltroTiempoMenor extends Filtro {
    private int tiempo;

    public FiltroTiempoMenor(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public boolean cumple(ElementoPasteleria e) {
       return (e.obtenerTiempo() < tiempo);
    }
    
}
