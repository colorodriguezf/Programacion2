package Practico7a.Ejercicio_5.Condicion.CondicionesEspecificas.Director;

import Practico7a.Ejercicio_5.Pelicula;
import Practico7a.Ejercicio_5.Condicion.Condicion;

public class ConDirectorIdentico extends Condicion {
    private String nombre;

    public ConDirectorIdentico(String nombre){
        this.nombre = nombre;
    }

    @Override
    public boolean cumple(Pelicula pelicula) {
       return pelicula.getDirector() ==  nombre;
    }
    
}
