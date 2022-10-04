package Ejercicio_3;

public class MainJuego {
    public static void main(String[] args) {
		Personaje villano = new Personaje("Villano", "Gru");
		Personaje heroe = new Personaje("Heroe", "Hercules");
		
		Juego juego1 = new Juego("Juego de personajes");

		villano.setCualidades("Vision nocturna", 23);
		villano.setCualidades("Fuerza", 455);
		villano.setCualidades("Peso", 234);
		villano.setCualidades("Altura", 150);
		villano.setCualidades("Edad", 45);
		
		heroe.setCualidades("Vision nocturna", 20);
		heroe.setCualidades("Fuerza", 1500);
		heroe.setCualidades("Peso", 85);
		heroe.setCualidades("Altura", 180);
		heroe.setCualidades("Edad", 30);
		
		juego1.setPersonaje(heroe);
		juego1.setPersonaje(villano);

        System.out.println("El ganador es :" +villano.compararCualidad(heroe, "Fuerza"));
        System.out.println("El ganador es :" +heroe.compararCualidad(villano, "Vision nocturna"));

		
		
		
	}
}
