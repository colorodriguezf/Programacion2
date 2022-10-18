package Practico7a.Ejercicio_1.Filtro;

import Practico7a.Ejercicio_1.Enfermedad;
import Practico7a.Ejercicio_1.ProductoQuimico;

public class CondicionEnfermedad extends Condicion {
    private Enfermedad enfermedad;

    public CondicionEnfermedad(Enfermedad enfermedad) {
        this.enfermedad = enfermedad;
    }

    @Override
    public boolean esValido(ProductoQuimico producto) {
        return producto.puedeTratarEnfermedad(enfermedad);
    }
    
}
