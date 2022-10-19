package Practico7a.Ejercicio_3.Filtro.Simple;

import Practico7a.Ejercicio_3.Planta;
import Practico7a.Ejercicio_3.Filtro.Condicion;

public class CondicionNombreVulgar extends Condicion {
    private String nombre_vulgar;

    public CondicionNombreVulgar(String nombre_vulgar) {
        this.nombre_vulgar = nombre_vulgar;
    }

    @Override
    public boolean cumple(Planta planta) {
       return planta.getNombresVulgares().contains(this.nombre_vulgar);
    }
    
}
