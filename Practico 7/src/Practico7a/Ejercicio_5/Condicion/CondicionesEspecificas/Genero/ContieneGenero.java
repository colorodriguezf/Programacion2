package Practico7a.Ejercicio_5.Condicion.CondicionesEspecificas.Genero;

import Practico7a.Ejercicio_5.Pelicula;
import Practico7a.Ejercicio_5.Condicion.Condicion;

public class ContieneGenero extends Condicion{
    private String genero;

    public ContieneGenero(String genero) {
        this.genero = genero;
    }
    @Override
    public boolean cumple(Pelicula pelicula) {
        return pelicula.getGeneros().contains(genero);
    }
    
}
