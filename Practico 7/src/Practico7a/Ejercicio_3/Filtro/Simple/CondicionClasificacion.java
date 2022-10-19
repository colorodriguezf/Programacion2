package Practico7a.Ejercicio_3.Filtro.Simple;

import Practico7a.Ejercicio_3.Planta;
import Practico7a.Ejercicio_3.Filtro.Condicion;

public class CondicionClasificacion  extends Condicion{
    private String clasificacion;

    public CondicionClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
    
    @Override
    public boolean cumple(Planta planta) {
        return (planta.getClasificacionSuperior() == clasificacion);
    }
    
}
