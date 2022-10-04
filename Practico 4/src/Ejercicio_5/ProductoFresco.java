package Ejercicio_5;

import java.time.LocalDate;

public class ProductoFresco extends Producto{

    public ProductoFresco(String nombre, LocalDate fecha_vencimiento, int numero_lote, LocalDate fecha_envasado, String granjaOrigen) {
        super(nombre, fecha_vencimiento, numero_lote, fecha_envasado, granjaOrigen);
    }
    
}
