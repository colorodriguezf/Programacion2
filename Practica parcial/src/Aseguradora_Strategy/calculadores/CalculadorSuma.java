package Aseguradora_Strategy.calculadores;

import Aseguradora_Strategy.SeguroSimple;

public class CalculadorSuma extends Calculador{
    private Calculador c1;
    private Calculador c2;

    public CalculadorSuma(Calculador c1, Calculador c2){
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public double getCostoPoliza(SeguroSimple seguro) {
        return c1.getCostoPoliza(seguro) + c2.getCostoPoliza(seguro);
    }
    
}
