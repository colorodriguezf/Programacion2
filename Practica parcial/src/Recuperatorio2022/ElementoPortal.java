package Recuperatorio2022;

import java.util.ArrayList;

import Recuperatorio2022.filtros.Filtro;

public abstract class ElementoPortal {
    protected String categoria;

    public ElementoPortal(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public abstract ArrayList<String> getPalabrasClaves(); //a-1
    public abstract ElementoPortal getCopiaFiltrada(Filtro f); //b

    public int compareTo(ElementoPortal elemento) {
      return this.getCategoria().compareTo(elemento.getCategoria());
    }

    
}
