package Parcial_2;

import java.util.ArrayList;

import Parcial_2.Filtros.Filtro;

public class Peliculas extends IMDB {
    private int puntaje;
	private int cantidadOscarGanados;
	private ArrayList<Actor>actores;

    public Peliculas(String titulo, int puntaje, int cantidadOscarGanados) {
		super(titulo);
		this.puntaje = puntaje;
		this.cantidadOscarGanados = cantidadOscarGanados;
		this.actores = new ArrayList<>();
	}

    public void addActor(Actor a) {
		actores.add(a);
	}
	
	public int getPuntaje() {
		return puntaje;
	}


	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}


	public int getCantidadOscarGanados() {
		return cantidadOscarGanados;
	}


	public void setCantidadOscarGanados(int cantidadOscarGanados) {
		this.cantidadOscarGanados = cantidadOscarGanados;
	}

	
	public ArrayList<Actor> getActores(){
		return new ArrayList<Actor>(actores);
	}

    @Override
    public int cantidadOscarGanados() {
		return this.getCantidadOscarGanados();
    }

    @Override
    public double promedioPuntaje() {
        return this.getPuntaje();
    }

    @Override
    public ArrayList<Peliculas> buscarPelicula(Filtro f1) {
        ArrayList<Peliculas> resultado = new ArrayList<>();
        if(f1.cumple(this)) {
			resultado.add(this);
		}
		return resultado;
    }

    @Override
    public IMDB getCopiaRestringida(Filtro f1) {
        if (f1.cumple(this)) {
            return new Peliculas(getTitulo(), getPuntaje(), getCantidadOscarGanados());
        }
        return null;
    }


}




