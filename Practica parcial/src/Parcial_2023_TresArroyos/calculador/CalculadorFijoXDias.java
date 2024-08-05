package Parcial_2023_TresArroyos.calculador;

import Parcial_2023_TresArroyos.Empresa;

public class CalculadorFijoXDias extends Calculador {
    private double costo;

    public CalculadorFijoXDias(double costo) {
        this.costo = costo;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public double getCosto(Empresa e) {
        return e.getDtiempo() * costo;
    }

    
}
