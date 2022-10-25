package Parcial_2;

import java.time.LocalDate;

import Parcial_2.Filtros.Filtro;
import Parcial_2.Filtros.simples.FiltroOscar;

public class Main {
    public static void main(String[] args) {
        Peliculas harryPotter1 = new Peliculas("HP y la piedra filosofal", 4, 2);
		Peliculas harryPotter2 = new Peliculas("HP y la camara secreta", 4,3);
		Peliculas harryPotter3 = new Peliculas("HP y el prisionero de azkaban", 5, 4);
		
		
		Actor a1 = new Actor("Daniel", "Radcliffe", LocalDate.of(1989, 7, 23));
		Actor a2 = new Actor("Emma", "Watson", LocalDate.of(1990, 4, 15));
		Actor a3 = new Actor("Rupert", "Grint", LocalDate.of(1989, 8, 24));
		
		a1.addPelicula(harryPotter1);
		a1.addPelicula(harryPotter2);
		a1.addPelicula(harryPotter3);
		
		
		a2.addPelicula(harryPotter1);
		a2.addPelicula(harryPotter2);
		a2.addPelicula(harryPotter3);
		
		a3.addPelicula(harryPotter1);
		a3.addPelicula(harryPotter2);
		a3.addPelicula(harryPotter3);
		
		
		harryPotter1.addActor(a1);
		harryPotter1.addActor(a2);
		harryPotter1.addActor(a3);
		
		harryPotter2.addActor(a1);
		harryPotter2.addActor(a2);
		harryPotter2.addActor(a3);
		
		harryPotter3.addActor(a1);
		harryPotter3.addActor(a2);
		harryPotter3.addActor(a3);
		
		
		Saga harryPotter = new Saga("SAGA HARRY Potter");
		
		harryPotter.addElementos(harryPotter1);
		harryPotter.addElementos(harryPotter2);
		harryPotter.addElementos(harryPotter3);
		
		Filtro cOscar = new FiltroOscar(2);
		System.out.println("Puntaje Harry Potter: "+harryPotter1.getPuntaje());
		System.out.println("Cantidad oscars ganados: "+harryPotter.cantidadOscarGanados());
		System.out.println("Promedio puntaje: "+harryPotter.promedioPuntaje());
		System.out.println("Copia restringida filtro Oscar: "+harryPotter.getCopiaRestringida(cOscar));
    }
}
