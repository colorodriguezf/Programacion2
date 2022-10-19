package Practico7a.Ejercicio_3.Filtro.Simple;

import Practico7a.Ejercicio_3.Planta;
import Practico7a.Ejercicio_3.Filtro.Condicion;

public class CondicionNombreContengaPalabra extends Condicion {
    private String palabra;

    public CondicionNombreContengaPalabra(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public boolean cumple(Planta planta) {
       return planta.getNombreCientifico().contains(this.palabra);
    }
    
}
