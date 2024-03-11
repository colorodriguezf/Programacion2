package Final_01_03_24.criterios;

import Final_01_03_24.ElementoPasteleria;

public abstract class Criterio {
    protected double propina;

    public Criterio (double propina) {
        this.propina = propina;
    }

    public double getPropina() {
        return propina;
    }

    public void setPropina(double propina) {
        this.propina = propina;
    }

    public abstract double getAdicional(ElementoPasteleria e);
    public abstract void setAdicional(double adicional);

    
}
