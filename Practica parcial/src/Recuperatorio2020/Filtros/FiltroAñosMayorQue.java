package Recuperatorio2020.Filtros;
import Recuperatorio2020.Voluntario;

public class FiltroAñosMayorQue extends Filtro{
    private int años;

    public FiltroAñosMayorQue(int años) {
        this.años = años;
    }

    @Override
    public boolean cumple(Voluntario v) {
        return v.getEdad() > años;
    }
}
