package Ejercicio_4;

import java.time.LocalDate;

public class MainContactosCelular {
    public static void main(String[] args) {
		
		Contacto cont1 = new Contacto("Juan", "Perez", 154345672, LocalDate.of(1997,8,1),"juanperez@gmail.com" ,"Tandil");
		Contacto cont2 = new Contacto("Martin", "Martinez", 154447090, LocalDate.of(2002,10,1),"martinmartinez@gmail.com" ,"Tandil");
		Contacto cont3 = new Contacto("Mario", "Casas", 154896325, LocalDate.of(1990,4,1),"mariocasas@gmail.com" ,"Tandil");
		Contacto cont4 = new Contacto("Pedro", "Juarez", 154877895, LocalDate.of(1897,7,1),"pedojuarez@gmail.com" ,"Tandil");
		Contacto cont5 = new Contacto("Tomas", "Agua", 158963654, LocalDate.of(1997,10,1),"tomasagua@gmail.com" ,"Tandil");
        Contacto cont6 = new Contacto("Tomas", "Agua", 158963654, LocalDate.of(1997,10,1),"tomasagua@gmail.com" ,"Tandil");

		
		Celular celular = new Celular("Leo Messi");
		
		celular.setContactos(cont1);
		celular.setContactos(cont2);
		celular.setContactos(cont3);
		celular.setContactos(cont4);
        celular.setContactos(cont5);
        celular.setContactos(cont6);
		
		System.out.println("El celular de "+celular.getDuenio() + " tiene: "+celular.getContactos().size() + " contactos");
		System.out.println("Tiene: "+celular.getContactosRepetidos().size() + " contactos repetidos");
		System.out.println("Y "+ celular.getContactosMismoNroTelefono().size() +" contactos con el mismo numero de telefono");
		
		System.out.println("Promedio de edad: " + celular.getPromedio_edad() + " años");
		
		System.out.println("Contactos: " + celular.getContactos());
    }
}
