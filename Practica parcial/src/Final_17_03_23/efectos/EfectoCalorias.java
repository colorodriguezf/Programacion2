package Final_17_03_23.efectos;

import Final_17_03_23.Atleta;
import Final_17_03_23.Entrenamiento;
import Final_17_03_23.filtros.Filtro;

public class EfectoCalorias extends Efecto {

    public EfectoCalorias(Filtro f) {
        super(f);
    }


    @Override
    public void aplicarEfecto(Atleta a, Entrenamiento e) {
       if(f.cumple(e)) {
        double nuevasCalorias = a.getCant_calorias_gastadas_dia() + e.getCosto_energia();
        a.setCant_calorias_gastadas_dia(nuevasCalorias);
       }
    }
    
}
