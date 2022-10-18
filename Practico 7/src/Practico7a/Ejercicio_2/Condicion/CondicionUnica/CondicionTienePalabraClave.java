package Practico7a.Ejercicio_2.Condicion.CondicionUnica;
import Practico7a.Ejercicio_2.Documento;
import Practico7a.Ejercicio_2.Condicion.Condicion;

public class CondicionTienePalabraClave  extends Condicion{
    private String palabra_clave;

    public CondicionTienePalabraClave(String palabra_clave) {
        this.palabra_clave = palabra_clave;
    }

    @Override
    public boolean cumple(Documento documento) {
       return documento.getPalabrasClave().contains(palabra_clave);
    }
    
}
