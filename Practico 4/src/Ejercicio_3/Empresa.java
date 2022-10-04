package Ejercicio_3;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Empleado>empleados;
    private String nombre;

    public Empresa(String nombre){
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Empleado> getEmpleados() {
        return new ArrayList<Empleado>(this.empleados);
    }

    public void setEmpleados(Empleado empleado) {
        if ((empleado != null) && (!empleados.contains(empleado))) {
            empleados.add(empleado);
        }
    }

    public double getSueldoEmpleado(Empleado empleado) {
		if(this.empleados.contains(empleado)) {
			return empleado.getSueldo();
		}
		else return -1;
	}
    
}
