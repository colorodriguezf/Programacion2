package Ejemplo;

import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {

		Participante part1 = new Participante("Juan", "Perez", "juanperez123@gmail.com", 249411223);
		Participante part2 = new Participante("María", "Rodriguez", "mariarodriguez123@gmail.com", 249411223);
		Participante part3 = new Participante("Pepe", "Argento", "pepeargento@gmail.com", 249411223);

		Reunion reunion1 = new Reunion("Reunion 1", "Tema 1", "Lugar 1", LocalDateTime.of(2022, 8, 25, 10, 0),
				LocalDateTime.of(2022, 8, 25, 11, 0));
		Reunion reunion2 = new Reunion("Reunion 2", "Tema 2", "Lugar 2", LocalDateTime.of(2022, 8, 25, 11, 30),
				LocalDateTime.of(2022, 8, 25, 12, 0));
		Reunion reunion3 = new Reunion("Reunion 3", "Tema 3", "Lugar 3", LocalDateTime.of(2022, 9, 6, 10, 0),
				LocalDateTime.of(2022, 8, 25, 11, 0));
		
		Agenda agenda1 = new Agenda("Agenda1");
		
		reunion1.agregarParticipanteAreunion(part1);
		reunion1.agregarParticipanteAreunion(part2);
		reunion1.agregarParticipanteAreunion(part3);
		
		reunion2.agregarParticipanteAreunion(part1);
		reunion2.agregarParticipanteAreunion(part2);
		reunion2.agregarParticipanteAreunion(part3);
		
		reunion3.agregarParticipanteAreunion(part1);
		reunion3.agregarParticipanteAreunion(part2);
		reunion3.agregarParticipanteAreunion(part3);
		
		agenda1.agregarReunionAagenda(reunion1);
		agenda1.agregarReunionAagenda(reunion2);
		agenda1.agregarReunionAagenda(reunion3);
		
		System.out.println(agenda1.getReuniones());

	}

}
