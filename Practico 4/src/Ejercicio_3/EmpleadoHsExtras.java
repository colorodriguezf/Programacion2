package Ejercicio_3;

public class EmpleadoHsExtras extends Empleado {
    private int cant_hs_extra_trabajadas;
    private double monto_extra;

    public EmpleadoHsExtras(String nombre, String apellido,double sueldo, int cant_hs_extra_trabajadas, double monto_extra) {
        super(nombre, apellido, sueldo);
        this.cant_hs_extra_trabajadas = cant_hs_extra_trabajadas;
        this.monto_extra = monto_extra;
    }

    public double getMontoExtra(){
        return monto_extra;
    }

    public void setMontoExtra(double monto_extra) {
        this.monto_extra = monto_extra;
    }

    public int getCantHsExtraTrabajadas(){
        return cant_hs_extra_trabajadas;
    }

    public void setCantHsExtraTrabajadas(int cant_hs_extra_trabajadas){
        this.cant_hs_extra_trabajadas = cant_hs_extra_trabajadas;
    }

    public double getSueldo() {
        return super.getSueldo()+(this.cant_hs_extra_trabajadas*this.monto_extra);
    }
}
