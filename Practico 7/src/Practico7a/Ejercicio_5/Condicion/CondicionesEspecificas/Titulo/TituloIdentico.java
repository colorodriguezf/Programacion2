package Practico7a.Ejercicio_5.Condicion.CondicionesEspecificas.Titulo;
import Practico7a.Ejercicio_5.Pelicula;
import Practico7a.Ejercicio_5.Condicion.Condicion;

public class TituloIdentico extends Condicion{
    private String contenidoBuscar;

    public TituloIdentico(String contenidoBuscar) {
        this.contenidoBuscar = contenidoBuscar;
      }
    
      @Override
      public boolean cumple(Pelicula pelicula){
        return pelicula.getTitulo() == contenidoBuscar;
      } 
}
