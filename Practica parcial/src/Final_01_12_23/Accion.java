package Final_01_12_23;

import java.util.ArrayList;
import java.util.List;

import Final_01_12_23.filtros.Filtro;

public class Accion extends ElementoAseguradora {
     private String simbolo;

    public Accion(String nombre, int ultimoValorOperado, String simbolo) {
        super(nombre, ultimoValorOperado);
        this.ultimoValorOperado = ultimoValorOperado;
        this.simbolo = simbolo;
    }
   
    public String getSimbolo() {
        return simbolo;
    }
    
    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    @Override
    public ArrayList<Integer> getValoresCierre() {
       return new ArrayList<Integer>(valoresCierre);
    }
   

    @Override
    public int getUltimoValorOperado() {
        return this.ultimoValorOperado;
    }

    // 1
    @Override
    public ArrayList<ElementoAseguradora> elementosQueCumplen(Filtro f) {
       ArrayList<ElementoAseguradora> elemento = new ArrayList<>();
       if(f.cumple(this)) {
        elemento.add(this);
       }
       return elemento;
    }



    
    @Override
    public String toString() {
        return "Accion: " + getNombre() + ", % variacion: " + getPorcentajeVariacion() +
               ", ultimo valor operado: " + getUltimoValorOperado() + ", valores cierre: " + getValoresCierre();
    }
    

}
