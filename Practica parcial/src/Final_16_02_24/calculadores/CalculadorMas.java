package Final_16_02_24.calculadores;

import Final_16_02_24.Capitulo;

public class CalculadorMas extends Calculador {
    private Calculador c1;
    private Calculador c2;

    public CalculadorMas(Calculador c1, Calculador c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public Calculador getC1() {
        return c1;
    }

    public void setC1(Calculador c1) {
        this.c1 = c1;
    }

    public Calculador getC2() {
        return c2;
    }

    public void setC2(Calculador c2) {
        this.c2 = c2;
    }

    @Override
    public double getValorCapitulo(Capitulo c) {
       return c1.getValorCapitulo(c) + c2.getValorCapitulo(c);
    }

    
}
