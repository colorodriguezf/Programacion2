package Final_17_03_23.efectos;

import Final_17_03_23.Atleta;
import Final_17_03_23.Entrenamiento;
import Final_17_03_23.filtros.Filtro;

public class EfectoHsRecuperacion extends Efecto {
    private double porcentaje;
    
    public EfectoHsRecuperacion(Filtro f, double porcentaje) {
        super(f);
        this.porcentaje = porcentaje;
    }
    
    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public void aplicarEfecto(Atleta a, Entrenamiento e) {
       if(f.cumple(e)) {
        double nuevasHoras = a.getCant_hs_recuperacion() * porcentaje;
        a.setCant_hs_recuperacion(nuevasHoras);
       }
    }


    
}
