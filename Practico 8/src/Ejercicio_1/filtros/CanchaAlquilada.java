package Ejercicio_1.filtros;

import Ejercicio_1.Socio;

public class CanchaAlquilada extends Filtro {
    private String cancha;

    public CanchaAlquilada(String cancha) {
        this.cancha = cancha;
    }


    @Override
    public boolean cumple(Socio socio) {
        return socio.alquiloCancha(cancha);
    }
    
}
