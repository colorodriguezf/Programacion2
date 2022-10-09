package Ejercicio_1;

import java.time.LocalDate;

public class MainSistemaAlquiler {
    public static void main(String[] args) {
        Vehiculo item1= new VehiculoNaftero("toyota",5983,true);
        Vehiculo item2= new VehiculoElectrico("Tesla",1234,true);
        Vehiculo item3= new VehiculoDiesel("Fiat",4352,true);
    
        Pelicula item4= new Pelicula("¿Que paso ayer?",16);
    
        Cliente c1= new Cliente("Juan");
        Cliente c2= new Cliente("Pedro");
        Cliente c3= new Cliente("Martin");
        
        
        Alquiler a1 = new Alquiler(item1, LocalDate.of(2022, 8, 8),c1);
        Alquiler a2 = new Alquiler(item1, LocalDate.of(2022, 12, 9),c2);
        
        VideoCLub vc1 = new VideoCLub();
        
        vc1.addCliente(c1);
        vc1.addCliente(c2);
        vc1.addCliente(c3);
    
        item1.alquilado();
        item2.alquilado();
        
        System.out.println("Cantidad de copias de la pelicula "+item4.getNombre_pelicula() +": "+item4.getCantidad_copias_stock());        
        item4.setCantidad_copias_stock(4);
        System.out.println("Cantidad de copias de la pelicula "+item4.getNombre_pelicula() +": "+item4.getCantidad_copias_stock());
        
    
    
        
        System.out.println("Esta disponible para alquilar el auto: "+item1.getMarca()+" (patente: "+item1.getPatente() +"): "+item1.estaDisponible());
        
        System.out.println(vc1.clientesVencido());
    }
}
