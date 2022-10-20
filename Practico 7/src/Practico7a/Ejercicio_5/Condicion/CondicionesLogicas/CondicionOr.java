package Practico7a.Ejercicio_5.Condicion.CondicionesLogicas;
import Practico7a.Ejercicio_5.Pelicula;
import Practico7a.Ejercicio_5.Condicion.Condicion;

public class CondicionOr extends Condicion{
    private Condicion c1;
    private Condicion c2;

    public CondicionOr(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(Pelicula pelicula) {
        return c1.cumple(pelicula) || c2.cumple(pelicula);
    }
    
}
