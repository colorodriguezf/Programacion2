package Practico7a.Ejercicio_2.Condicion.CondicionUnica;
import Practico7a.Ejercicio_2.Documento;
import Practico7a.Ejercicio_2.Condicion.Condicion;


public class CondicionSinPalabrasClave extends Condicion{

    @Override
    public boolean cumple(Documento documento) {
        return (!documento.getPalabrasClave().isEmpty());
    }
    
}
