package Ejercicio_1;

public class Empleado extends Persona {
    private double sueldo;

    public Empleado(String nombre, String apellido, int dni, double sueldo) {
		super(nombre, apellido, dni);
		this.sueldo = sueldo;
	}

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }   

    public boolean equals(Object o1) {
		try {
			Empleado e = ((Empleado)o1);
			if(e.getDni() == this.getDni()) {
				return true;
			}
		} catch(Exception e) {
			return false;
		}
		return false;
	}
    


}
