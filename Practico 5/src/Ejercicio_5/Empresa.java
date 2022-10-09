package Ejercicio_5;

import java.util.ArrayList;

public class Empresa {
   private String nombre;
   private ArrayList<Empleado> empleados;

public Empresa(String nombre) {
    this.nombre = nombre;
    this.empleados = new ArrayList<Empleado>();
}

public String getNombre() {
    return this.nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public ArrayList<Empleado> getEmpleados() {
    return new ArrayList<Empleado>();
}

public void setEmpleado(Empleado empleado) {
    if(!this.empleados.contains(empleado)){
        empleados.add(empleado);
    }
}

public double getMontoSueldoTotales() {
    double monto_total = 0;
    for (Empleado empleado : this.empleados) {
        monto_total += empleado.getSueldo();
    }
    return monto_total;
}

    


}
