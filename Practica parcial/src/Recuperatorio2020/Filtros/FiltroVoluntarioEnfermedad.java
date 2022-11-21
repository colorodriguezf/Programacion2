package Recuperatorio2020.Filtros;
import Recuperatorio2020.Voluntario;

public class FiltroVoluntarioEnfermedad extends Filtro{
    private String enfermedad;

    public FiltroVoluntarioEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    @Override
    public boolean cumple(Voluntario v) {
        return v.getEnfermedades().contains(enfermedad);
    }
    
}
