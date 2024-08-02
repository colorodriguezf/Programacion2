package Parcial_2022_Olavarria;

import java.util.ArrayList;

import Parcial_2022_Olavarria.filtro.Filtro;

public class Combo extends Jugueteria {
    private int descuento_porcentaje;
    protected ArrayList<Jugueteria> elementos;

    public Combo (int descuento_porcentaje, String marca) {
        super(marca);
        this.descuento_porcentaje = descuento_porcentaje;
        this.elementos = new ArrayList<>();
    }

    public Combo(String marca, int descuento) {
        super(marca);
        this.descuento_porcentaje = descuento;
        this.elementos = new ArrayList<>();
    }

    public int getDescuento() {
        return descuento_porcentaje;
    }

    public void setDescuento(int descuento_porcentaje) {
        this.descuento_porcentaje = descuento_porcentaje;
    }

    public ArrayList<Jugueteria> getElementos() {
        return new ArrayList<Jugueteria>(elementos);
    }

    public void setElementos(Jugueteria elemento) {
        if(!elementos.contains(elemento)) {
            elementos.add(elemento);
        }
    }

    @Override
    public double getPeso() {
       double total = 0;
       for(Jugueteria e : elementos) {
        total+=e.getPeso();
       }
       return total;
    }

    @Override
    public String getColor() {
        Jugueteria elemento = elementos.get(elementos.size()-1); // .size() tamaño, .size()-1 ultima pos
        if(elemento != null) {
            return elemento.getColor();
        }
        return "No se pudo determinar el color";
    }

    @Override
    public double getCantidadEncastres() {
       double total = 0;
       int iteraciones = 0;
       for(Jugueteria elemento : elementos) {
        total+=elemento.getCantidadEncastres();
        iteraciones++;
       }
       return total / iteraciones;
    }

    @Override
    public double getCosto() {
        double costo = 0;
        for(Jugueteria elemento : elementos) {
            costo+=elemento.getCosto();
        }
        double descuento = (costo * descuento_porcentaje) / 100;
        return costo - descuento;
    }

    @Override //1
    public ArrayList<Jugueteria> getElementosQue(Filtro f) {
        ArrayList<Jugueteria> cumplen = new ArrayList<>();
        for(Jugueteria elemento : elementos) {
            cumplen.addAll(elemento.getElementosQue(f));
        }
        return cumplen;
    }

    
}
