package Recuperatorio2020.Filtros;

import Recuperatorio2020.Voluntario;

public class FiltroTieneEnfermedad extends Filtro{
    private String enfermedad;

    public FiltroTieneEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    @Override
    public boolean cumple(Voluntario v) {
       return v.getEnfermedades().contains(enfermedad);
    }

    
}
