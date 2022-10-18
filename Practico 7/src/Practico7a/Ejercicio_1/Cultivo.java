package Practico7a.Ejercicio_1;

import java.util.ArrayList;

public class Cultivo {
    private String nombre;
    private ArrayList<Enfermedad> enfermedades;

    public Cultivo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Enfermedad> getEnfermedades() {
        return new ArrayList<Enfermedad>(this.enfermedades);
    }

    public void agregarEnfermedad(Enfermedad enfermedad) {
        if ((enfermedad != null) && (enfermedades.contains(enfermedad))){
            this.enfermedades.add(enfermedad);
        }
    }

    /**
   * Dado un "ProductoQuimico", se evalua si el quimico se puede utilizar 
   * en el cultivo, ademas de verificar que el quimico sea eficaz contra 
   * alguna de las enfermedades recurrentes de la planta.
   * @param productoQuimico a evaluar.
   * @return true / false.
   */
    public boolean puedeSerDeUtilidad(ProductoQuimico productoQuimico){
        return (productoQuimico.sePuedeAplicar(this) && productoQuimico.trataAlgunaEnfermedadFrecuente(this.getEnfermedades()));
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre;
    }

    
}
