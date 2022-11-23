package Aseguradora_Strategy.calculador;

import Aseguradora_Strategy.SeguroSimple;

public class CalculadorCompuesto extends Calculador{
    private Calculador c1;
    private Calculador c2;

    public CalculadorCompuesto(Calculador c1, Calculador c2){
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public double getCostoPoliza(SeguroSimple seguro) {
        return c1.getCostoPoliza(seguro) + c2.getCostoPoliza(seguro);
    }
    
}
