package Recuperatorio_EmpSoftware;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public abstract class ElemEmpresa {
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected double precio;

   public ElemEmpresa(String nombre, String apellido, int edad, double precio) {
     this.nombre = nombre;
     this.apellido = apellido;
     this. edad = edad;
     this.precio = precio;
    }
    
     
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public abstract ArrayList<String> getEspecialidad(); //1
   public abstract ArrayList<ElemEmpresa> listarEmpleados(); //2
    public ArrayList<ElemEmpresa> listarEmpleadosOrdenados(Comparator<ElemEmpresa> c) {
          ArrayList<ElemEmpresa> empleados = this.listarEmpleados();
         Collections.sort(empleados, c);
         return empleados;	
  }

    public abstract double gastoEnSueldo(); //3
    public abstract int getCantidadEmpleadosACargo(); //4


    public abstract double getPrecio();
    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
