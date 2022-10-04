package Ejercicio_4;

import java.time.LocalDateTime;

public class Main_establecimiento {
    public static void main(String[] args){
        Usuario usuario1 = new Usuario("Julian","Rodriguez");
        Usuario usuario2 = new Usuario("Lionel", "Messi");
        Usuario usuario3 = new Usuario("Martin", "Perez");

        Cancha cancha1f = new Cancha("Futbol",400);
        Cancha cancha2f = new Cancha("Futbol",400);
        Cancha cancha1p = new Cancha("Padel",100);
        Cancha cancha2p = new Cancha("Padel",100);

        Turno turno1 = new Turno("Turno 1",usuario1, cancha1f, LocalDateTime.of(2022, 7, 20, 11, 00));
        Turno turno2 = new Turno("Turno 1",usuario2, cancha1f, LocalDateTime.of(2022, 7, 20, 11, 00));
        Turno turno3 = new Turno("Turno 2",usuario2, cancha2f, LocalDateTime.of(2022, 9, 22, 15, 00));
        Turno turno4 = new Turno("Turno 3",usuario3, cancha1p, LocalDateTime.of(2022, 5, 15, 11,10));
        Turno turno5 = new Turno("Turno 4",usuario1, cancha2p, LocalDateTime.of(2022, 5, 15, 11,10));

        Establecimiento_deportivo ed1 = new Establecimiento_deportivo("Club deportivo");

        ed1.agregarCancha(cancha1f);
        ed1.agregarCancha(cancha2f);
        ed1.agregarCancha(cancha1p);
        ed1.agregarCancha(cancha2p);

        System.out.println(ed1.detectarConflicto(turno1));
		ed1.agregarTurno(turno1);
		System.out.println(ed1.cobrarTurno(turno1));

        System.out.println(ed1.detectarConflicto(turno2));
		ed1.agregarTurno(turno2);
		System.out.println(ed1.cobrarTurno(turno2));

        System.out.println(ed1.detectarConflicto(turno3));
		ed1.agregarTurno(turno3);
		System.out.println(ed1.cobrarTurno(turno3));

        System.out.println(ed1.detectarConflicto(turno4));
		ed1.agregarTurno(turno4);
		System.out.println(ed1.cobrarTurno(turno4));

        System.out.println(ed1.detectarConflicto(turno5));
        ed1.agregarTurno(turno5);
		System.out.println(ed1.cobrarTurno(turno5));







    }
    
}
