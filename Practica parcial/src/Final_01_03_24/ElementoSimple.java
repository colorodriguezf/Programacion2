package Final_01_03_24;

import java.util.ArrayList;

import Final_01_03_24.criterios.Criterio;
import Final_01_03_24.filtros.Filtro;

public class ElementoSimple extends ElementoPasteleria {
    private int calorias;
    private double precio;
    private int tiempo;

    public ElementoSimple(String nombre, String tipo, String modo_preparacion, int calorias, double precio, int tiempo) {
        super(nombre, tipo, modo_preparacion);
        this.calorias = calorias;
        this.precio = precio;
        this.tiempo = tiempo;
    }   

    
    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }
    
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    
    
    
    @Override
    public int obtenerCalorias() {
        return calorias;
    }
    @Override
    public double obtenerPrecio() {
        return precio;
    }
    @Override
    public int obtenerTiempo() {
        return tiempo;
    }



    @Override
    public double getCostoTotal(Filtro f, Criterio criterio) {
        if(f.cumple(this)) {
           return  criterio.getAdicional(this);
        }
        return this.obtenerPrecio();
    }



    @Override
    public ArrayList<ElementoPasteleria> cumple(Filtro f) {
        ArrayList<ElementoPasteleria> elementosQueCumplen = new ArrayList<>();
        if(f.cumple(this)) {
            elementosQueCumplen.add(this);
        }
        return elementosQueCumplen;
    }
    
}
