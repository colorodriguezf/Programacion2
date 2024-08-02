package Parcial_2023_Quequen;

import java.util.ArrayList;

import Parcial_2023_Quequen.filtros.Filtro;

public class Producto extends SistemaCollections{
    private double peso_gr;
    private double volumen;
    private ArrayList<String> caracteristicas;

    public Producto(String nombre, double peso_gr, double volumen, ArrayList<String> caracteristicas) {
        super(nombre);
        this.peso_gr = peso_gr;
        this.volumen = volumen;
        this.caracteristicas = caracteristicas;
    }

    public void setPeso_gr(double peso_gr) {
        this.peso_gr = peso_gr;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public void setCaracteristicas(String caracteristica) {
        if(!caracteristicas.contains(caracteristica)) {
            caracteristicas.add(caracteristica);
        }
    }

    @Override //a
    public double getPeso_gr() {
       return peso_gr;
    }

    @Override //b
    public double getVolumen() {
        return volumen;
    }

    @Override //c
    public ArrayList<String> geCaracteristicas() {
       return new ArrayList<>(caracteristicas);
    }

    @Override //2
    public ArrayList<SistemaCollections> getColleccionQue(Filtro f) {
       ArrayList<SistemaCollections> videos = new ArrayList<>();
       if(f.cumple(this)) {
        videos.add(this);
       }
       return videos;
    }
    
}
