package Parcial_2;

import java.util.ArrayList;
import Parcial_2.Filtros.Filtro;

public class Saga extends IMDB {
    public ArrayList<IMDB> elementos;

    public Saga(String titulo) {
        super(titulo);
        this.elementos = new ArrayList<>();
    }

    public void addElementos(IMDB e) {
		elementos.add(e);
	}

    @Override
    public int cantidadOscarGanados() {
        int cantidad=0;
		for(IMDB e:elementos) {
			cantidad += e.cantidadOscarGanados();
		}
		
		return cantidad;
    }

    @Override
    public double promedioPuntaje() {
        double promedio=0.0;
		int contador=0;
		
		for(IMDB e:elementos) {
			promedio += e.promedioPuntaje();
			contador++;
		}
		return promedio/contador;
    }

    @Override
    public ArrayList<Peliculas> buscarPelicula(Filtro f1) {
        ArrayList<Peliculas> peliculasFiltradas = new ArrayList<>();
		
		for(IMDB elemento : elementos) {
			peliculasFiltradas.addAll(elemento.buscarPelicula(f1));
		}
		return peliculasFiltradas;
    }

    @Override
    public IMDB getCopiaRestringida(Filtro f1) {
        Saga copiaFiltrada = new Saga(this.getTitulo());
		
		for(IMDB elemento : elementos) {
			IMDB copiaH = elemento.getCopiaRestringida(f1);
			if(copiaH != null) {
				copiaFiltrada.addElementos(elemento.getCopiaRestringida(f1));
			}
		}
		return copiaFiltrada;
    }
    
}
