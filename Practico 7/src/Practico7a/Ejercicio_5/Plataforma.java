package Practico7a.Ejercicio_5;

import java.util.ArrayList;

import Practico7a.Ejercicio_5.Condicion.*;
import Practico7a.Ejercicio_5.Condicion.CondicionesEspecificas.Duracion.DuracionMayor;

public class Plataforma {
  private ArrayList<Pelicula> peliculas;
  private Condicion rentabilidad; // Que una pelicula sea "rentable" puede cambiar en plena ejecucion

  public Plataforma(Condicion rentabilidad){
    this.peliculas = new ArrayList<>();
    this.rentabilidad = rentabilidad;
}

  public Plataforma(){
    this.peliculas = new ArrayList<>();
}

  // Setters
  public void setRentabilidad(Condicion rentabilidad){
    // En caso de pasarle null, tiene una condicion por defecto...
    this.rentabilidad = (rentabilidad == null) ? new DuracionMayor(0) : rentabilidad;
  }

  public void agregarPelicula(Pelicula nuevaPelicula){
    if((nuevaPelicula != null) && (!peliculas.contains(nuevaPelicula))){
      peliculas.add(nuevaPelicula);
    }
  }

  //Es rentable si cumple condicion
  public boolean laPeliculaSeraRentable(Pelicula peliculaVerificar){
    return this.rentabilidad.cumple(peliculaVerificar);
  }


  public ArrayList<Pelicula> getPeliculasQue(Condicion condicion){
    ArrayList<Pelicula> resultados = new ArrayList<>();
    for (Pelicula pelicula : peliculas) {
      if(condicion.cumple(pelicula))
        resultados.add(pelicula);
    }

    return resultados;
  }

  public ArrayList<Pelicula> getAllPeliculas(){
    return new ArrayList<>(peliculas);
  }
}