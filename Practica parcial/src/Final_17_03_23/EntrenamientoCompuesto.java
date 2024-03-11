package Final_17_03_23;

import java.util.ArrayList;

import Final_17_03_23.filtros.Filtro;

public class EntrenamientoCompuesto extends ElementoEntrenamiento {
    private String nombre;
    private int factor;
    private ArrayList<ElementoEntrenamiento> elementos;

    

    public EntrenamientoCompuesto(String nombre, int factor) {
        this.nombre = nombre;
        this.factor = factor;
        this.elementos = new ArrayList<ElementoEntrenamiento>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFactor() {
        return factor;
    }

    public void setFactor(int factor) {
        this.factor = factor;
    }

    public ArrayList<ElementoEntrenamiento> getElementos() {
        return new ArrayList<ElementoEntrenamiento>(elementos);
    }

    public void setElementos(ElementoEntrenamiento elemento) {
        if(!elementos.contains(elemento)) {
            this.elementos.add(elemento);
        }
    }

    @Override //a
    public int getDuracion() {
       int duracion = 0;
       for(ElementoEntrenamiento e : elementos) {
        duracion += e.getDuracion();
       }
       return duracion;
    }

    @Override //b
    public int getCosto_energia() {
        int costo = 0;
        for(ElementoEntrenamiento e : elementos) {
            costo += e.getCosto_energia();
        }
        return costo * factor;
    }

    @Override //c
    public String getActividad() {
       String actividades = "";
       for(ElementoEntrenamiento e : elementos) {
        actividades += e.getActividad() + '-';
       }
       return actividades;
    }

    @Override //d
    public ArrayList<ElementoEntrenamiento> buscar(Filtro f) {
        ArrayList<ElementoEntrenamiento> cumplen = new ArrayList<>();
        for (ElementoEntrenamiento elemento : elementos) {
            ArrayList<ElementoEntrenamiento> aux = new ArrayList<>();
            aux.addAll(elemento.buscar(f));
            for (ElementoEntrenamiento hijosCumplen : aux) {
                cumplen.addAll(hijosCumplen.buscar(f));
            }
        }
        return cumplen;
    }

    @Override
    public String toString() {
        return "EntrenamientoCompuesto [nombre=" + nombre + ", factor=" + factor + ", elementos=" + elementos + "]";
    }

    
    

    
}
