package Aseguradora_Strategy.filtros;

import Aseguradora_Strategy.SeguroSimple;

public class FiltroMontoMayorA extends Filtro{
    public double monto;

    public FiltroMontoMayorA(double monto){
        this.monto = monto;
    }

    @Override
    public boolean cumple(SeguroSimple s) {
       return s.getMontoAsegurado() > monto;
    }
    
}
