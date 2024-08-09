package Final_01_03_24;

import java.util.ArrayList;

import Final_01_03_24.criterios.Criterio;
import Final_01_03_24.filtros.Filtro;

public abstract class ElementoPasteleria {
    private String nombre;
    private String tipo;
    private String modo_preparacion;
  
    public ElementoPasteleria(String nombre, String tipo, String modo_preparacion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.modo_preparacion = modo_preparacion;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModo_preparacion() {
        return modo_preparacion;
    }

    public void setModo_preparacion(String modo_preparacion) {
        this.modo_preparacion = modo_preparacion;
    }

    public abstract int obtenerTiempo();
    public abstract int obtenerCalorias();
    public abstract double obtenerPrecio();

    public abstract double getCostoTotal(Filtro f, Criterio criterio);

    public abstract ArrayList<ElementoPasteleria> cumple(Filtro f);
}
