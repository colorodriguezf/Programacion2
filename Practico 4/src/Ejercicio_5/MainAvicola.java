package Ejercicio_5;

import java.time.LocalDate;

public class MainAvicola {

    public static void main(String[] args) {
        
        Producto p1 = new ProductoCongelado("Hamburguesa", LocalDate.of(1998, 6, 24), 231, LocalDate.of(1998, 6, 24), "Los pinos", 1432 ,-10);
        ProductoCongelado p2 = new CongeladoXAgua("Hamburguesa", LocalDate.of(1998, 6, 24), 231, LocalDate.of(1998, 6, 24), "Los pinos", 1432 ,-10, 100);

        System.out.println(p1.toString());
        System.out.println("-----------------"); 
        System.out.println(p2.toString());  
    }
}