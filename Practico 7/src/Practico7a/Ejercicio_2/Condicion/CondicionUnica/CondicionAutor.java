package Practico7a.Ejercicio_2.Condicion.CondicionUnica;
import Practico7a.Ejercicio_2.Documento;
import Practico7a.Ejercicio_2.Condicion.Condicion;

public class CondicionAutor extends Condicion{
    private String autor;

    public CondicionAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public boolean cumple(Documento documento) {
        return documento.getAutores().contains(autor);
    }
    
}
