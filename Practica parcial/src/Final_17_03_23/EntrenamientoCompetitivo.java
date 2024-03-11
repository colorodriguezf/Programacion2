package Final_17_03_23;

import java.util.ArrayList;

import Final_17_03_23.filtros.Filtro;

public class EntrenamientoCompetitivo extends ElementoEntrenamiento {
    private String nombre;
    private int repeticiones;
    private int pausa;
    private ArrayList<ElementoEntrenamiento> elementos;
    
    public EntrenamientoCompetitivo(String nombre, int repeticiones, int pausa) {
        this.nombre = nombre;
        this.repeticiones = repeticiones;
        this.pausa = pausa;
        this.elementos = new ArrayList<ElementoEntrenamiento>();
    }    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRepeticiones() {
        return repeticiones;
    }

    public void setRepeticiones(int repeticiones) {
        this.repeticiones = repeticiones;
    }    

    public int getPausa() {
        return pausa;
    }

    public void setPausa(int pausa) {
        this.pausa = pausa;
    }

    public ArrayList<ElementoEntrenamiento> getElementos() {
        return new ArrayList<ElementoEntrenamiento>(elementos);
    }

    public void setElementos(ElementoEntrenamiento elemento) {
        if(!elementos.contains(elemento)) {
            elementos.add(elemento);
        }
    }

    @Override //a
    public int getDuracion() {
       int duracion = 0;
       for(ElementoEntrenamiento e : elementos) {
        duracion += e.getDuracion();
       }
       return (duracion * repeticiones) + pausa;
    }

    @Override //b
    public int getCosto_energia() {
        int costo = 0;
        for(ElementoEntrenamiento e : elementos) {
            costo += e.getCosto_energia();
        }
        return (costo * repeticiones) + pausa;
    }

    @Override //c
    public String getActividad() {
      String actividades = "";
        for(ElementoEntrenamiento e : elementos) {
            actividades += '(' +e.getActividad()+')' + 'X' + repeticiones;
        }
        return actividades;
    }

    @Override
    public ArrayList<ElementoEntrenamiento> buscar(Filtro f) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscar'");
    }
    
}
