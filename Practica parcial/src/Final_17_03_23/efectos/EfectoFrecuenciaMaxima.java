package Final_17_03_23.efectos;

import Final_17_03_23.Atleta;
import Final_17_03_23.Entrenamiento;
import Final_17_03_23.filtros.Filtro;

public class EfectoFrecuenciaMaxima extends Efecto {
    private double multiplicador;

       
    public EfectoFrecuenciaMaxima(Filtro filtro, double multiplicador) {
        super(filtro);
        this.multiplicador = multiplicador;
    }

    public double getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(double multiplicador) {
        this.multiplicador = multiplicador;
    }

    @Override
    public void aplicarEfecto(Atleta a, Entrenamiento e) {
       if(f.cumple(e)) {
        double nuevaFMax = a.getFrecuencia_cardiaca_maxima() * multiplicador;
        a.setFrecuencia_cardiaca_maxima(nuevaFMax);
       }
    }
    
}
