package Parcial_2023_TresArroyos;

public class PresupuestoEspecial extends TareaCompleja {
    private double costo;

    public PresupuestoEspecial(double costo, String nombre) {
        super(nombre);
        this.costo = costo;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
}
