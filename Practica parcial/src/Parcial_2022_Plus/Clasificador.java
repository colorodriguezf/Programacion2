package Parcial_2022_Plus;
import java.util.ArrayList;
import Parcial_2022_Plus.filtros.Filtro;

public class Clasificador {
    private ArrayList<String> palabras;
    private Filtro filtro;

    public Clasificador(Filtro filtro) {
        this.palabras = new ArrayList<String>();
        this.filtro = filtro;
    }
    
    public Filtro getFiltro() {
        return filtro;
    }
    
    public void setFiltro(Filtro filtro) {
        this.filtro = filtro;
    }

    public ArrayList<String> getPalabrass() {
        return new ArrayList<String>(this.palabras);
    }
    public void setPalabras(String pal) {
        if(!palabras.contains(pal)) {
            this.palabras.add(pal);
        }
    }

    public void clasificar(Noticia n) {
        if(filtro.cumple(n)) {
            for(String p : palabras) {
                n.setPalabrasClaves(p);
            }
        }
    }
    
    
}
