package Practico7a.Ejercicio_3.Filtro.Simple.Sol;

import Practico7a.Ejercicio_3.Planta;
import Practico7a.Ejercicio_3.Filtro.Condicion;

public class CondicionSolMayor extends Condicion{
    private int sol_requerido;

    public CondicionSolMayor(int sol_requerido) {
        this.sol_requerido = sol_requerido;
    }

    @Override
    public boolean cumple(Planta planta) {
        return (planta.getRequerimientoSol() > sol_requerido);
    }
    
}
