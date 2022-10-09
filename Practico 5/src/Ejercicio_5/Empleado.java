package Ejercicio_5;

public class Empleado {
    private String nombre;
    private String apellido;
    private int dni;
    protected double sueldo;

    public Empleado(String nombre, String apellido, int dni, double sueldo) {
        this.nombre = nombre;
        this. apellido = apellido;
        this.dni = dni;
        this. sueldo = sueldo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getDni() {
        return this.dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public boolean equals(Object ob) {
		
		Empleado e = ((Empleado)ob);
		if(e.dni==this.dni) {
			return true;
		}
		return false;
	}

    @Override
    public String toString() {
        return "Empleado [ " + nombre +" "+ apellido + 
        "\n  Sueldo= $" + getSueldo() + "]";
    }
}
