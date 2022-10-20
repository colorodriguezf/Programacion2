package Practico7a.Ejercicio_5;

import java.util.ArrayList;

public class Pelicula {
  private String titulo;
  private String sinopsis;
  private String director;
  private ArrayList<String> generos;
  private ArrayList<String> actores;
  private int anioEstreno;
  private int duracionPelicula;
  private int edadMinimaRequerida;

  public Pelicula(String titulo, String sinopsis, String director, int anioEstreno, int duracionPelicula, int edadMinimaRequerida){
    this.titulo = titulo;
    this.sinopsis = sinopsis;
    this.director = director;
    this.anioEstreno = anioEstreno;
    this.duracionPelicula = duracionPelicula;
    this.generos = new ArrayList<>();
    this.actores = new ArrayList<>();
  }

public String getTitulo() {
    return titulo;
}

public void setTitulo(String titulo) {
    this.titulo = titulo;
}

public String getSinopsis() {
    return sinopsis;
}

public void setSinopsis(String sinopsis) {
    this.sinopsis = sinopsis;
}

public String getDirector() {
    return director;
}

public void setDirector(String director) {
    this.director = director;
}

public int getAnioEstreno() {
    return anioEstreno;
}

public void setAnioEstreno(int anioEstreno) {
    this.anioEstreno = anioEstreno;
}

public int getDuracionPelicula() {
    return duracionPelicula;
}

public void setDuracionPelicula(int duracionPelicula) {
    this.duracionPelicula = duracionPelicula;
}

public int getEdadMinimaRequerida() {
    return edadMinimaRequerida;
}

public void setEdadMinimaRequerida(int edadMinimaRequerida) {
    this.edadMinimaRequerida = edadMinimaRequerida;
}

public ArrayList<String> getGeneros() {
    return new ArrayList<String>(this.generos);
}

public void agregarGenero(String nuevoGenero){
    if((nuevoGenero != "") && (!generos.contains(nuevoGenero))){
        generos.add(nuevoGenero);
    }
}

public ArrayList<String> getActores() {
    return new ArrayList<String>(this.actores);
}

public void agregarActor(String nuevoActor){
    if((nuevoActor != "") && (!actores.contains(nuevoActor))){
        actores.add(nuevoActor);
    }
}


//Contiene genero:
 public boolean contieneGenero(String generoConsultar){
    return generos.contains(generoConsultar);
}

  //Contiene actor:
  public boolean contieneActor(String actorConsultar){
    return actores.contains(actorConsultar);
  }

  @Override
  public String toString() {
    return "[Titulo: " + this.titulo + ", Sinopsis: " + this.sinopsis + ", Director: " + this.director +
    ", Año de estreno: " + this.anioEstreno + ", duracion: " + this.duracionPelicula + " minutos.\nGeneros: " +
    this.generos + "\nActores: " + this.actores + "]\n";
  }

  
}
