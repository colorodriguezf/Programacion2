package Ejercicio_5;

public class EmpleadoBono extends EmpleadoVenta {
    private int cant_min_ventas;
    private double bono;

    public EmpleadoBono(String nombre, String apellido, int dni, double sueldo, int cant_min_ventas, int cant_ventas,
                        int porc_ventas, double bono) {
        super(nombre, apellido, dni, sueldo, cant_ventas, porc_ventas);
        this.cant_min_ventas = cant_min_ventas;
        this.bono = bono;    
    }

    public int getCant_min_ventas() {
        return cant_min_ventas;
    }

    public void setCant_min_ventas(int cant_min_ventas) {
        this.cant_min_ventas = cant_min_ventas;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    public double getSueldo() {
        if(vendioElMinimo()) {
            return this.sueldo + bono;
        }
        return this.sueldo;
    }

    public boolean vendioElMinimo() {
        if(this.getCant_ventas() >= this.getCant_min_ventas()) {
            return true;
        }
        return false;
    }
    
    
}
