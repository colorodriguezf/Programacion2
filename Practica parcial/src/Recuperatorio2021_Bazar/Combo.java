package Recuperatorio2021_Bazar;

import java.util.ArrayList;

import Recuperatorio2021_Bazar.filtros.Filtro;

public class Combo extends ElementoBazar{
    protected ArrayList<ElementoBazar> elementos;
    private double descuento;
    private double descuentoMaximo;

    public Combo(double descuento, double descuentoMaximo) {
        this.descuento = descuento;
        this.descuentoMaximo = descuentoMaximo;
        this.elementos = new ArrayList<ElementoBazar>();
    }

    public void addElemento(ElementoBazar elemento) {
        elementos.add(elemento);
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getDescuentoMaximo() {
        return descuentoMaximo;
    }

    public void setDescuentoMaximo(double descuentoMaximo) {
        this.descuentoMaximo = descuentoMaximo;
    }

    @Override
    public double getPrecio() {
        double totalConDescuento = 0;
        double totalSinDescuento = 0;
        int cantDescuento = 0;

        for(ElementoBazar elemento : elementos) {
                totalConDescuento+= (elemento.getPrecio()*descuento) / 100;
                totalSinDescuento+= elemento.getPrecio();
                cantDescuento+= descuento ;
        }

        if(cantDescuento < descuentoMaximo) {
            return totalConDescuento;
        }
        else {
            return (totalSinDescuento * descuentoMaximo) / 100;
        }
    }

    @Override
    public double getPeso() {
      double peso = 0;

      for(ElementoBazar elemento : elementos) {
        peso+=elemento.getPeso();
      }
      return peso;
    }

    @Override
    public ArrayList<String> getCategorias() {
        ArrayList<String> categorias = new ArrayList<>();

        for(ElementoBazar elemento : elementos) {
            ArrayList<String> categoriasH = elemento.getCategorias();
            for(String palabra : categoriasH) {
                if(!categorias.contains(palabra)) {
                    categorias.add(palabra);
                }
            }
        }
        return categorias;
    }

    @Override
    public int getCantidadProductosCombo() {
        int total = 0;
        for(ElementoBazar elemento : elementos) {
            total+= elemento.getCantidadProductosCombo();
        }
        return total;
    }

    @Override
    public Producto getProductoMasLivianoCombo() {
       return null;
    }

    @Override
    public ElementoBazar getCopiaRestringida(Filtro f) {
        ArrayList<ElementoBazar> elementosQueCumplen = new ArrayList<ElementoBazar>();
        for(ElementoBazar elemento : elementos) {
            ElementoBazar copiaHija = elemento.getCopiaRestringida(f);
            if(copiaHija != null) {
                elementosQueCumplen.add(copiaHija);
            }
        }
        if(elementosQueCumplen.size() > 0) {
            Combo comboCopia = new Combo(getDescuento(), getDescuentoMaximo());
            for(ElementoBazar elemento : elementosQueCumplen) {
                comboCopia.addElemento(elemento);
            }
            return comboCopia;
        }
        else {
            return null;
        }
    }
}
