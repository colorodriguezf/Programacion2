package Parcial_2022_Plus;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import Parcial_2022_Plus.filtros.Filtro;

public abstract class ElementoPortal implements Comparable<ElementoPortal> {
    public abstract String getCategoria(); //a-1
    public abstract ArrayList<String> getPalClaves(); //a-2
    public abstract ArrayList<Noticia> getNoticiasQue(Filtro f); //b


    //PLUS: devolver ordenado
    public  ArrayList<Noticia> getNoticiasQueOrdenadas(Filtro f, Comparator<Noticia> c) {
        ArrayList<Noticia> noticiasCUmplen = getNoticiasQue(f);
        Collections.sort(noticiasCUmplen, c);
        return noticiasCUmplen;
    }

    //PLUS: copia filtrada
    public abstract ElementoPortal getCopiaFiltrada(Filtro f);

    //PLUS: insertar ordenado por categoria
    public int compareTo(ElementoPortal otro) {
        return this.getCategoria().compareTo(otro.getCategoria());       
    }
    
}
