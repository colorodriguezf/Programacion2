package Practico7a.Ejercicio_4;

import java.util.ArrayList;

import Practico7a.Ejercicio_4.Condicion.Condicion;
import Practico7a.Ejercicio_4.Ficha.*;

public class Tablero {
    private double puntaje_minimo;
    private ArrayList<Ficha> fichas;


    public Tablero(double puntaje_minimo) {
        this.puntaje_minimo = puntaje_minimo;
        this.fichas = new ArrayList<>();
    }


    public double getPuntajeMinimo() {
        return puntaje_minimo;
    }


    public void setPuntajeMinimo(double puntaje_minimo) {
        this.puntaje_minimo = puntaje_minimo;
    }


    public ArrayList<Ficha> getFichas() {
        return new ArrayList<Ficha>(this.fichas);
    }


    public void addFicha(Ficha ficha) {
        if ((ficha != null) && (!fichas.contains(ficha))) {
            this.fichas.add(ficha);
        }
    }

    private double getSumatoriaFortalezas() {
        int total = 0;
        for (Ficha ficha : fichas) {
           total += ficha.getFortaleza();
        }
        return total;
    }    
    private double getSumatoriasPoderDestruccion() {
        int total = 0;
        for (Ficha ficha : fichas) {
           total += ficha.getPoderDestruccion();
        }
        return total;
    }

    public double getDificultad() {
        return ((double) getSumatoriaFortalezas() / (double) getSumatoriasPoderDestruccion());
    }

    public ArrayList<Ficha> getFichasQue(Condicion condicion) {
        ArrayList<Ficha> cumplen = new ArrayList<Ficha>();

        for (Ficha ficha : fichas) {
            if(condicion.cumple(ficha)) {
                cumplen.add(ficha);
            }
        }
        return cumplen;
    }    

    
}
