package Final_01_03_24;

import java.util.ArrayList;

import Final_01_03_24.criterios.Criterio;
import Final_01_03_24.filtros.Filtro;

public class ElementoCompuesto extends ElementoPasteleria {
    ArrayList<ElementoCompuesto> elementos;

    public ElementoCompuesto(String nombre, String tipo, String modo_preparacion) {
        super(nombre, tipo, modo_preparacion);
        this.elementos = new ArrayList<ElementoCompuesto>();
    }

    public ArrayList<ElementoCompuesto> getElementos() {
        return new ArrayList<ElementoCompuesto>(elementos);
    }

    public void setElementos(ElementoCompuesto elemento) {
        if(!elementos.contains(elemento)) {
            elementos.add(elemento);
        }
    }
    

    @Override
    public int obtenerTiempo() {
       int tiempoTotal = 0;
       for(ElementoCompuesto elemento : elementos) {
        tiempoTotal+=elemento.obtenerTiempo();
       }
       return tiempoTotal;
    }

    @Override
    public int obtenerCalorias() {
        int caloriasTotal = 0;
        for(ElementoCompuesto elemento : elementos) {
            caloriasTotal+=elemento.obtenerCalorias();
        }
        return caloriasTotal;
    }

    @Override
    public double obtenerPrecio() {
        int precioTotal = 0;
        for(ElementoCompuesto elemento : elementos) {
            precioTotal+=elemento.obtenerPrecio();
        }
        return precioTotal;
    }



    @Override
    public double getCostoTotal(Filtro f, Criterio criterio) {
       double total = 0;
       for(ElementoPasteleria elemento : elementos) {
            total += elemento.getCostoTotal(f, criterio);
       }
       return total;
    }



    @Override
    public ArrayList<ElementoPasteleria> cumple(Filtro f) {
        ArrayList<ElementoPasteleria> elementosQueCumplen = new ArrayList<>();
        for(ElementoPasteleria e : elementos) {
            elementosQueCumplen.addAll(e.cumple(f));
        }
        return elementosQueCumplen;
    }

    
}
