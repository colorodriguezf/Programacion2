package Ejercicio_1.filtros;

import Ejercicio_1.Socio;

public class CuotaImpaga extends Filtro {

    @Override
    public boolean cumple(Socio socio) {
        return !socio.isUltimaCuotaPpaga();
    }
    
}
