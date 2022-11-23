package Aseguradora_Strategy.calculador;

import Aseguradora_Strategy.SeguroSimple;

public class CalculadorPorcentaje extends Calculador {
    private double porcentaje;

    public CalculadorPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double getCostoPoliza(SeguroSimple seguro) {
        return ((seguro.getMontoAsegurado() * porcentaje) / 100);
    }
    
}
