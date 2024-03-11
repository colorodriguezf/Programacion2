package Final_17_03_23;

import java.util.ArrayList;

import Final_17_03_23.filtros.Filtro;

public class Entrenamiento extends ElementoEntrenamiento {
    private String nombre;
    private int duracion;
    private int costo_energia;
    private int intensidad;
    private String actividad;

    public Entrenamiento(String nombre, int duracion, int costo_energia, int intensidad, String actividad) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.costo_energia = costo_energia;
        this.intensidad = intensidad;
        this.actividad = actividad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getDuracion() {
        return duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    public int getCosto_energia() {
        return costo_energia;
    }
    public void setCosto_energia(int costo_energia) {
        this.costo_energia = costo_energia;
    }
    public int getIntensidad() {
        return intensidad;
    }
    public void setIntensidad(int intensidad) {
        this.intensidad = intensidad;
    }
    public String getActividad() {
        return actividad;
    }
    public void setActividad(String actividad) {
        this.actividad = actividad;
    }
    @Override //d
    public ArrayList<ElementoEntrenamiento> buscar(Filtro f) {
       ArrayList<ElementoEntrenamiento> elemento = new ArrayList<>();
       if(f.cumple(this)) {
        elemento.add(this);
       }
       return elemento;
    }


    @Override
    public String toString() {
        return "Entrenamiento [nombre=" + nombre + ", duracion=" + duracion + ", costo_energia=" + costo_energia
                + ", intensidad=" + intensidad + ", actividad=" + actividad + "]";
    }
    

    
}
