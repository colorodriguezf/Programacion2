package Ejercicio_5;

import java.time.LocalDateTime;

public class Main_peluqueria {
    public static void main(String[] args) {
        Peluquero peluquero1 = new Peluquero("Juan", "Perez");
		Peluquero peluquero2 = new Peluquero("Martin", "Rodriguez");
		Peluquero peluquero3 = new Peluquero("María", "Fernandez");
		Peluquero peluquero4 = new Peluquero("Tomas", "Agua");

        Cliente cliente1 = new Cliente("Jose", "Gomez", peluquero1);
		Cliente cliente2 = new Cliente("Esteban", "Quito", peluquero1);
		Cliente cliente3 = new Cliente("Manuel", "Belgrano", peluquero3);
		Cliente cliente4 = new Cliente("Pipa", "Higuain", peluquero2);
		Cliente cliente5 = new Cliente("Marcelo", "Gallardo", peluquero4);

        Turno turno1 = new Turno("Turno 1", cliente1, 100, LocalDateTime.of(2022, 8, 29, 12, 0));
		Turno turno2 = new Turno("Turno 2", cliente2, 100, LocalDateTime.of(2022, 8, 29, 15, 0));
		Turno turno3 = new Turno("Turno 3", cliente3, 100, LocalDateTime.of(2022, 8, 29, 11, 30));
		Turno turno4 = new Turno("Turno 4", cliente4, 100, LocalDateTime.of(2022, 8, 29, 9, 0));
		Turno turno5 = new Turno("Turno 5", cliente5, 100, LocalDateTime.of(2022, 8, 29, 14, 30));

        Peluqueria p1 = new Peluqueria("Peluqueria DE PELOS");
        
        turno1.agregarPeluquero(peluquero1);
		turno1.agregarPeluquero(peluquero2);
		turno1.agregarPeluquero(peluquero3);
		turno1.agregarPeluquero(peluquero4);
		
		turno2.agregarPeluquero(peluquero1);
		turno2.agregarPeluquero(peluquero2);
		turno2.agregarPeluquero(peluquero3);
		turno2.agregarPeluquero(peluquero4);

        System.out.println(p1.getTurnos());
		
        p1.asignarTurno(turno1);
		p1.asignarTurno(turno2);
		p1.asignarTurno(turno3);
		p1.asignarTurno(turno4);
		p1.asignarTurno(turno5);
        System.out.println(p1.getTurnos());
    }
}
