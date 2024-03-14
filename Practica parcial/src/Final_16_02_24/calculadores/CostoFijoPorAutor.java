package Final_16_02_24.calculadores;

import Final_16_02_24.Capitulo;

public class CostoFijoPorAutor extends Calculador {
    private double costoFijo;

    public CostoFijoPorAutor(double costoFijo) {
        this.costoFijo = costoFijo;
    }

    public double getCostoFijo() {
        return costoFijo;
    }

    public void setCostoFijo(double costoFijo) {
        this.costoFijo = costoFijo;
    }

    @Override
    public double getValorCapitulo(Capitulo c) {
       return costoFijo * c.getAutores().size();
    }

    
}
