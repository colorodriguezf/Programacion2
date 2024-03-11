package Final_01_12_23;

import java.util.ArrayList;
import java.util.List;

import Final_01_12_23.filtros.Filtro;

public class FondoInversion extends ElementoAseguradora {
     private ArrayList<ElementoAseguradora> elementos;
     private int gastoAdministracion;

    public FondoInversion(String nombre, int gastoAdministracion, int ultimoValorOperado) {
        super(nombre, ultimoValorOperado);
        this.gastoAdministracion = gastoAdministracion;
        this.elementos = new ArrayList<ElementoAseguradora>();
    }


    public ArrayList<ElementoAseguradora> getElementos() {
        return new ArrayList<ElementoAseguradora>(elementos);
    }


    public void setElementos(ElementoAseguradora elemento) {
        if(!elementos.contains(elemento)) {
            elementos.add(elemento);
        }
    }


    public int getGastoAdministracion() {
        return gastoAdministracion;
    }


    public void setGastoAdministracion(int gastoAdministracion) {
        this.gastoAdministracion = gastoAdministracion;
    }


    @Override
    public ArrayList<Integer> getValoresCierre() {
        ArrayList<Integer> valores = new ArrayList<>();
        for(ElementoAseguradora elemento : elementos) {
            valores.addAll(elemento.getValoresCierre());
        }
        return valores;       
    }


    @Override
    public int getUltimoValorOperado() {
      int total = 0;
      for(ElementoAseguradora elemento : elementos) {
        total += elemento.getUltimoValorOperado();
      }
      double gastoAdministrativo = calcularGastoAdministracion(gastoAdministracion, total);
      return (int) (total - gastoAdministrativo);
    }


    private double calcularGastoAdministracion(int gastoAdministracion2, int total) {
        return (total - (total*100 % porcentajeVariacion));
    }


    // 1
    @Override
    public ArrayList<ElementoAseguradora> elementosQueCumplen(Filtro f) {
       ArrayList<ElementoAseguradora> elementosCumplen = new ArrayList<>();
       if(f.cumple(this)) {
        elementosCumplen.add(this);
       }    
       else {
        for(ElementoAseguradora elemento : elementos) {
            elementosCumplen.addAll(elemento.elementosQueCumplen(f));
        }
       }
       return elementosCumplen;
    }
}
