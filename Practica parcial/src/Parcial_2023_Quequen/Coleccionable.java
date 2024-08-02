package Parcial_2023_Quequen;

import java.util.ArrayList;

import Parcial_2023_Quequen.filtros.Filtro;

public class Coleccionable extends SistemaCollections{
    public ArrayList<SistemaCollections> elementos;

    public Coleccionable(String nombre) {
        super(nombre);
    }

    public ArrayList<SistemaCollections> getElementos() {
        return new ArrayList<>(elementos);
    }

    public void setElementos(SistemaCollections elemento) {
        if(!elementos.contains(elemento)) {
            elementos.add(elemento);
        }
    }

    @Override //a
    public double getPeso_gr() {
        double total = 0;
        for(SistemaCollections s : elementos) {
            total+=s.getPeso_gr();
        }
        return total;
    }

    @Override //b
    public double getVolumen() {
        double total = 0;
        for(SistemaCollections s : elementos) {
            total+=s.getVolumen() + ((s.getVolumen() * 0.01) % 100); //pongo 0.01 pq no dice que puede cambiar
        }
        return total;
    }

    @Override //c
    public ArrayList<String> geCaracteristicas() {
        ArrayList<String> caracteristicas = new ArrayList<>();
        for(SistemaCollections s : elementos) {
            ArrayList<String> car_hijas = s.geCaracteristicas();
            for(String c : car_hijas) {
                if(!caracteristicas.contains(c)) {
                    caracteristicas.add(c);
                }
            }
        }
        return caracteristicas;
    }

    @Override //2
    public ArrayList<SistemaCollections> getColleccionQue(Filtro f) {
        ArrayList<SistemaCollections> collectionsque = new ArrayList<>();
        for(SistemaCollections s : elementos) {
            if(f.cumple(s)) {
                collectionsque.add(this);
            }
        }
        return collectionsque;
    }
    
    //3
    public ArrayList<SistemaCollections> getProductosNivel(int nivel) {
        ArrayList<SistemaCollections> productos = new ArrayList<>();

        for (SistemaCollections s : elementos) {
            if (s instanceof Coleccionable) {
                productos.addAll(((Coleccionable) s).getProductosNivel(nivel - 1));
            }
        }
        return productos;
    }


    
}
