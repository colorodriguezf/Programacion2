package Final_01_12_23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import Final_01_12_23.filtros.Filtro;

public abstract class ElementoAseguradora {
    protected String nombre;
    protected int porcentajeVariacion;
    protected ArrayList<Integer> valoresCierre;
    protected int ultimoValorOperado;

    public ElementoAseguradora(String nombre, int ultimoValorOperado) {
        this.nombre = nombre;
        this.ultimoValorOperado = ultimoValorOperado;
        this.valoresCierre = new ArrayList<>();
    }


    public String getNombre() {
        return nombre;
    }

    public int getPorcentajeVariacion() {
        return porcentajeVariacion;
    }

 // El primer elemento, corresponde al ultimo valor de cierre.
    public void cerrar() {
        if (!valoresCierre.isEmpty()) {
            valoresCierre.add(0, ultimoValorOperado);
        } else {
            valoresCierre.add(ultimoValorOperado);
        }
    }
    

    public abstract int getUltimoValorOperado();
    public abstract ArrayList<Integer> getValoresCierre();

    // 1 a- Obtener listados
    public abstract ArrayList<ElementoAseguradora> elementosQueCumplen(Filtro f);
    //1 b- Obtener listados ordenados
    public ArrayList<ElementoAseguradora> elementosQueCumplenOrdenados(Filtro f, Comparator<ElementoAseguradora> c) {
        ArrayList<ElementoAseguradora> elementos = elementosQueCumplen(f);
        Collections.sort(elementos, c);
        return elementos;
    }
}
