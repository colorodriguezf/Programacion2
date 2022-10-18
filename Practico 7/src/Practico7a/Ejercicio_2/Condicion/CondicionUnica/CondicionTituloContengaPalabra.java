package Practico7a.Ejercicio_2.Condicion.CondicionUnica;
import Practico7a.Ejercicio_2.Documento;
import Practico7a.Ejercicio_2.Condicion.Condicion;

public class CondicionTituloContengaPalabra extends Condicion {
    private String palabra;

    public CondicionTituloContengaPalabra(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public boolean cumple(Documento documento) {
       return documento.getTitulo().contains(palabra);
    }
    
}
