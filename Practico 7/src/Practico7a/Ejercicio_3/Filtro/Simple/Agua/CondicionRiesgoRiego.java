package Practico7a.Ejercicio_3.Filtro.Simple.Agua;

import Practico7a.Ejercicio_3.Planta;
import Practico7a.Ejercicio_3.Filtro.Condicion;

public class CondicionRiesgoRiego extends Condicion{
    private int nriego;

    public CondicionRiesgoRiego(int nriego) {
        this.nriego = nriego;
    }

    @Override
    public boolean cumple(Planta planta) {
        return (planta.getRiesgoAgua() > nriego);
    }
    
}
