package Recuperatorio2020.Filtros;

import Recuperatorio2020.Voluntario;

public class FiltroSinEnfermedad extends Filtro{

    @Override
    public boolean cumple(Voluntario v) {
       return v.getEnfermedades().isEmpty();
    }
    
}
