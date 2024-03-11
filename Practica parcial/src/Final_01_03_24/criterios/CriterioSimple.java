package Final_01_03_24.criterios;

import Final_01_03_24.ElementoPasteleria;

public class CriterioSimple extends Criterio {
    private double adicional;
    private ElementoPasteleria elemento;

    public CriterioSimple(double propina, double adicional, ElementoPasteleria e) {
        super(propina);
        this.adicional = adicional;
        this.elemento = e;
    }   

    public ElementoPasteleria getElemento() {
        return elemento;
    }

    public void setElemento(ElementoPasteleria elemento) {
        this.elemento = elemento;
    }

    @Override
    public double getAdicional(ElementoPasteleria e) {
        double precioActual = e.obtenerPrecio();
        double costoAdicional = adicional;
        double costoPorcentaje = precioActual * (propina / 100.0);
        double totalAdicional = precioActual + costoAdicional + costoPorcentaje;
        return totalAdicional;
        // return ((adicional + e.obtenerPrecio()) + e.obtenerPrecio() * propina / 100);
    }

    @Override
    public void setAdicional(double adicional) {
       this.adicional = adicional;
    }
    
}
