package Final_16_02_24.calculadores;

import Final_16_02_24.Capitulo;

public class CostoFijoPorPagina extends Calculador {
    private double costoFijo;
    
    public CostoFijoPorPagina(double costoFijo) {
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
      return costoFijo * c.getCantPag();
    }
}
