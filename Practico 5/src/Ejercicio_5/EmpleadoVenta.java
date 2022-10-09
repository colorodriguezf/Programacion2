package Ejercicio_5;

public class EmpleadoVenta extends Empleado {
    private int cant_ventas;
    private int porc_ventas;

    public EmpleadoVenta(String nombre, String apellido, int dni, double sueldo, int cant_ventas, int porc_ventas) {
        super(nombre, apellido, dni, sueldo);
        this.cant_ventas = cant_ventas;
        this.porc_ventas = porc_ventas;
    }

    public int getCant_ventas() {
        return cant_ventas;
    }

    public void setCant_ventas(int cant_ventas) {
        this.cant_ventas = cant_ventas;
    }

    public int getPorc_ventas() {
        return porc_ventas;
    }

    public void setPorc_ventas(int porc_ventas) {
        this.porc_ventas = porc_ventas;
    }

    public double getSueldo() {
        return (super.getSueldo() + (cant_ventas * porc_ventas)/ 100);
    }

    
    
}
