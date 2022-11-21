package Recuperatorio2021_Bazar;

import java.util.ArrayList;

import Recuperatorio2021_Bazar.filtros.Filtro;

public class Producto extends ElementoBazar {
    private ArrayList<String> categorias;
    private double peso;
    private double precio;

    
    public Producto(double peso, double precio) {
        this.peso = peso;
        this.precio = precio;
        this.categorias = new ArrayList<String>();
    }




    
    public void setCategorias(String categoria) {
        if(!categorias.contains(categoria)) {
            categorias.add(categoria);
        }
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public double getPrecio() {
        return precio;
    }
    @Override
    public double getPeso() {
      return peso;
    }
    @Override
    public ArrayList<String> getCategorias() {
       return new ArrayList<String>(this.categorias);
    }

    @Override
    public int getCantidadProductosCombo() {
        return 1;
    }

    @Override
    public Producto getProductoMasLivianoCombo() {
        return this;
    }

    @Override
    public ElementoBazar getCopiaRestringida(Filtro f) {
        if(f.cumple(this)) {
           return new Producto(getPrecio(), getPeso());
        }      
        return null;
    }


}
