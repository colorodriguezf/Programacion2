package Practico7a.Ejercicio_1.Filtro;

import Practico7a.Ejercicio_1.ProductoQuimico;

public class CondicionAnd  extends Condicion{
    private Condicion c1;
    private Condicion c2;

    public CondicionAnd(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean esValido(ProductoQuimico producto) {
        return c1.esValido(producto) && c2.esValido(producto);
    }
    
}
