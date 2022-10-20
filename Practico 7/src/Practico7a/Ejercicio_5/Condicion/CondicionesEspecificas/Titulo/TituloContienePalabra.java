package Practico7a.Ejercicio_5.Condicion.CondicionesEspecificas.Titulo;
import Practico7a.Ejercicio_5.Pelicula;
import Practico7a.Ejercicio_5.Condicion.Condicion;

public class TituloContienePalabra extends Condicion{
  private String contenidoBuscar;

    public TituloContienePalabra(String contenidoBuscar) {
        this.contenidoBuscar = contenidoBuscar;
      }
    
      @Override
      public boolean cumple(Pelicula pelicula){
        return pelicula.getTitulo().contains(contenidoBuscar);
      } 
}
