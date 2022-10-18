package Practico7a.Ejercicio_2.Condicion.CondicionUnica;

import Practico7a.Ejercicio_2.Documento;
import Practico7a.Ejercicio_2.Condicion.Condicion;

public class CondicionTituloExacto extends Condicion {
    private String titulo;

    public CondicionTituloExacto(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public boolean cumple(Documento documento) {
       return documento.getTitulo().equals(this.titulo);
    }
        
}
