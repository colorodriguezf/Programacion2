package Practico7a.Ejercicio_1.Filtro;

import Practico7a.Ejercicio_1.Cultivo;
import Practico7a.Ejercicio_1.ProductoQuimico;

public class CondicionCultivo extends Condicion {
    private Cultivo cultivo;

    public CondicionCultivo(Cultivo cultivo) {
        this.cultivo = cultivo;
    }

    @Override
    public boolean esValido(ProductoQuimico producto) {
       return producto.sePuedeAplicar(cultivo);
    }
    
}
