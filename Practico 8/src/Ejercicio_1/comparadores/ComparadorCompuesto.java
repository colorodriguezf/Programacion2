package Ejercicio_1.comparadores;

import java.util.Comparator;

import Ejercicio_1.Socio;

public class ComparadorCompuesto implements Comparator<Socio> {
    private Comparator<Socio> comparator1;
    private Comparator<Socio> comparator2;

    public ComparadorCompuesto(Comparator<Socio> comparator1, Comparator<Socio> comparator2) {
        this.comparator1 = comparator1;
        this.comparator2 = comparator2;
    }
    
    @Override
    public int compare(Socio socio1, Socio socio2) {
        int resultado = comparator1.compare(socio1, socio2);
        if(resultado == 0) {
           resultado = comparator2.compare(socio1, socio2);
        }
        return resultado;
    }
    
}
