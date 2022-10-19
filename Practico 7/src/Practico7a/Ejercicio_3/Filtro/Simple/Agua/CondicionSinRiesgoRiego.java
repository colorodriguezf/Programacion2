package Practico7a.Ejercicio_3.Filtro.Simple.Agua;

import Practico7a.Ejercicio_3.Planta;
import Practico7a.Ejercicio_3.Filtro.Condicion;

public class CondicionSinRiesgoRiego extends Condicion{
    private int nriego;

    public CondicionSinRiesgoRiego(int nriego) {
        this.nriego = nriego;
    }

    @Override
    public boolean cumple(Planta planta) {
        return (planta.getRiesgoAgua() < nriego);
    }
    
}
