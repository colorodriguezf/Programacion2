package Recu2022;
import java.util.ArrayList;
import java.util.Comparator;
import Recu2022.filtros.Filtro;

public abstract class ElementoPortal implements Comparable<ElementoPortal>{
    private String categoria;

    public abstract ArrayList<String> getPalabrasClaves();
    public abstract ElementoPortal getCopiaRestringidaFiltrada(Filtro f);


    public ElementoPortal(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }  

    @Override 
    public int compareTo(ElementoPortal e) {
        return e.getCategoria().compareTo(e.getCategoria());
     }
}
