package Final_5_3_21;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import Final_5_3_21.Servicios.Baches.Bache;

public abstract class Monitoreo {
    protected Timestamp inicio_recorrido;
    protected Timestamp final_recorrido;

    public Monitoreo(Timestamp inicio_recorrido, Timestamp final_recorrido) {
        this.inicio_recorrido = inicio_recorrido;
        this.final_recorrido = final_recorrido;
    }

    public Timestamp getInicio_recorrido() {
        return inicio_recorrido;
    }

    public void setInicio_recorrido(Timestamp inicio_recorrido) {
        this.inicio_recorrido = inicio_recorrido;
    }

    public Timestamp getFinal_recorrido() {
        return final_recorrido;
    }

    public void setFinal_recorrido(Timestamp final_recorrido) {
        this.final_recorrido = final_recorrido;
    }

    public abstract int getCantBaches(Bache f);
    public abstract int getCantRegistros();

    //2 Listado de elementos con mayor deterioro
    public abstract ArrayList<Monitoreo> getElementoDeteriorado(Bache f);
    
    //3 Listado ordenado
    public  ArrayList<Monitoreo> getElementoDeteriorado(Bache f, Comparator<Monitoreo> c) {
        ArrayList<Monitoreo> cumplen = getElementoDeteriorado(f);
        Collections.sort(cumplen, c);
        return cumplen;
    }
}
