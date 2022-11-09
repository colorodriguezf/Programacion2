package Recuperatorio_EmpSoftware;

import java.util.ArrayList;

import Recuperatorio_EmpSoftware.sueldo.Sueldo;

public class Programador extends ElemEmpresa {
    private ArrayList<String> especialidades;
    private double precio;
    private Sueldo sueldo; //sirve para calcular los distintos tipos de cobro de  sueldo de los empleados
  
    public Programador(String nombre, String apellido, int edad,double precio,Sueldo sueldo) {
    super(nombre, apellido, edad, precio);
      this.especialidades = new ArrayList<String>();
      this.precio = precio;
      this.sueldo = sueldo;
    }
   
   public void setSueldo(Sueldo sueldo) {
    this.sueldo = sueldo;
   }
   
    
   public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public void addEspecialidad(String especialidad) {
     if(!especialidades.contains(especialidad)) {
            especialidades.add(especialidad);
         }
    }

  @Override //1
 public ArrayList<String> getEspecialidad() {
   return new ArrayList<String>(this.especialidades);
 }
  
  @Override //2
   public ArrayList<ElemEmpresa> listarEmpleados(){
       ArrayList<ElemEmpresa> empleado = new ArrayList<>();
        empleado.add(this);
         return empleado;
   }

   @Override //3
   public  double gastoEnSueldo() {
       return this.getSueldo(sueldo);
   }

   public double getSueldo(Sueldo sueldo) {
     return sueldo.gastoEnSueldo(this);
   }
   
   @Override //4
   public int getCantidadEmpleadosACargo() {
      return 1;
    }

    @Override
    public String toString() {
      return "{Programador "+this.getNombre()+ ", sueldo: "+this.gastoEnSueldo()+" Especialidades:  "+getEspecialidad() +"}\n";
    }
}
