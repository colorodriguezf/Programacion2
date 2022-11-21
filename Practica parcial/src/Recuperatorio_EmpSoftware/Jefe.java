package Recuperatorio_EmpSoftware;

import java.util.ArrayList;

import Recuperatorio_EmpSoftware.sueldo.Sueldo;

public class Jefe extends ElemEmpresa {
    private ArrayList<ElemEmpresa>elementos;
     private int anios_antiguedad;
     private double precio;
     private Sueldo sueldo;
   
     public Jefe(String nombre, String apellido, int edad, double precio, Sueldo sueldo, int anios_antiguedad) {
     super(nombre, apellido, edad, precio);
       this.elementos = new ArrayList<ElemEmpresa>();
       this.precio = precio;
       this.sueldo = sueldo;
       this.anios_antiguedad = anios_antiguedad;
     }
      
     public int getAnios_antiguedad() {
      return anios_antiguedad;
    }

    public void setAnios_antiguedad(int anios_antiguedad) {
      this.anios_antiguedad = anios_antiguedad;
    }

    public Sueldo getSueldo() {
      return sueldo;
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
    
    public void addElemento(ElemEmpresa e) {
      if(!elementos.contains(e)) {
             elementos.add(e);
          }
     }

   @Override //1
  public ArrayList<String> getEspecialidad() {
    ArrayList<String> especialidades = new ArrayList<>();
      for (ElemEmpresa e : elementos) {
           ArrayList<String> especialidadesHijo = e.getEspecialidad();
               for(String eh : especialidadesHijo) {
                        if(!especialidades.contains(eh)) {
                                especialidades.add(eh);
                           }
                       }
            }    
       return especialidades;
  }
   
   @Override //2
    public ArrayList<ElemEmpresa> listarEmpleados(){
        ArrayList<ElemEmpresa> empleados = new ArrayList<>();
          for (ElemEmpresa e : elementos) {
           ArrayList<ElemEmpresa> empleadosH = e.listarEmpleados();
               for(ElemEmpresa eh :empleadosH) {
                        if(!empleados.contains(eh)) {
                                empleados.add(eh);
                           }
                       }
            }    
	        empleados.add(this);
        return empleados;
    }

    @Override //3
    public double gastoEnSueldo() {
      double sueldoTotal = 0;
        for(ElemEmpresa e : elementos) {
             sueldoTotal+=e.gastoEnSueldo();
     } 
        sueldoTotal += this.getSueldo(sueldo);
        return sueldoTotal;
    }

     public double getSueldo(Sueldo sueldo) {
      return sueldo.gastoEnSueldo(this);
    }
    @Override //4
    public int getCantidadEmpleadosACargo() {
       int total = 0;
       for (ElemEmpresa e : elementos) {
            total += e.getCantidadEmpleadosACargo();
     }
     return total;
   }

   public String toString() {
    return "{Jefe "+this.getNombre()+ ", sueldo: "+this.gastoEnSueldo()+", empleados a cargo: "+getCantidadEmpleadosACargo()+"}\n";
  }
}