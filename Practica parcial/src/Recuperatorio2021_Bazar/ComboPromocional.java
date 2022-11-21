package Recuperatorio2021_Bazar;

public class ComboPromocional extends Combo {

    public ComboPromocional(double descuento, double descuentoMaximo) {
        super(descuento, descuentoMaximo);
        //TODO Auto-generated constructor stub
    }
    
    @Override
    public double getPrecio() {
        double total = 0;
        int cantProductos = 0;

        for(ElementoBazar elemento : elementos) {
            total+= elemento.getPrecio();
             cantProductos++;
        }
        return total / cantProductos;
    }
}
