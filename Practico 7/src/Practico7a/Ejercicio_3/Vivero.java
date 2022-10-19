package Practico7a.Ejercicio_3;

import java.util.ArrayList;

import Practico7a.Ejercicio_3.Filtro.Condicion;

public class Vivero {
    private String nombre;
    private ArrayList<Planta> plantas;

    public Vivero(String nombre) {
        this.nombre = nombre;
        this.plantas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Planta> getPlantas() {
        return new ArrayList<Planta>(this.plantas);
    }

    public void addPlanta(Planta planta) {
        if ((planta != null)&& (!this.plantas.contains(planta))) {
            this.plantas.add(planta);
        }
    }

    public ArrayList<Planta> getPlantasQueCumplen(Condicion condicion){
        ArrayList<Planta> resultados = new ArrayList<>();
        for (Planta planta : plantas) {
          if(condicion.cumple(planta))
            resultados.add(planta);
        }
    
        return resultados;
      }

    public String toString() {
        return "Nombre vivero: "+nombre+ ", Plantas disponibles: \n{"+plantas+"\n}";
    }
    
}
