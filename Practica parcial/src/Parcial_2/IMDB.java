package Parcial_2;

import java.util.ArrayList;
import Parcial_2.Filtros.Filtro;

public abstract class IMDB {
    
	private String titulo;
	
	public IMDB(String titulo) {
		this.titulo = titulo;
	}

    public  String getTitulo() {
		return this.titulo;
	}

    public abstract int cantidadOscarGanados();
	public abstract double promedioPuntaje();	
	public abstract ArrayList<Peliculas> buscarPelicula(Filtro f1);
	public abstract IMDB getCopiaRestringida(Filtro f1);

    
}
