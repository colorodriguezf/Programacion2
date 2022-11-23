package Aseguradora_Strategy.calculadores;

import Aseguradora_Strategy.SeguroSimple;

public class CalculadorMontoFijo extends Calculador{
    private double montoFijo;

    public CalculadorMontoFijo(double montoFijo) {
        this.montoFijo = montoFijo;
    }

    @Override
    public double getCostoPoliza(SeguroSimple seguro) {
        return montoFijo;
    }
    
}
