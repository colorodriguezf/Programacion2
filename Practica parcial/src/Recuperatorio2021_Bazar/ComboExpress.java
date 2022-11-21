package Recuperatorio2021_Bazar;
import java.util.ArrayList;

public class ComboExpress extends Combo {
    private String categoria;
    
    public ComboExpress(double descuento, double descuentoMaximo, String categoria) {
        super(descuento, descuentoMaximo);
        this.categoria = categoria;
    }

    
    public void addElemento(ElementoBazar elemento) {
        if(elemento.getCategorias().contains(categoria)) {
            elementos.add(elemento);
        }
    }
    
}
