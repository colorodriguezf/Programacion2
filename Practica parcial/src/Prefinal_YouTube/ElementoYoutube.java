package Prefinal_YouTube;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import Prefinal_YouTube.filtros.Filtro;

public abstract class ElementoYoutube {
    protected String titulo;
    
    public ElementoYoutube(String titulo) {
        this.titulo = titulo;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public abstract ArrayList<Video> buscarVideos(Filtro f);//1
    public ArrayList<Video> buscarVideosOrdenado(Filtro f, Comparator<Video> c) { 
        ArrayList<Video> videos = this.buscarVideos(f);
        Collections.sort(videos, c);
        return videos;
    }

    public abstract ArrayList<String> getPalabrasClaves(); //2
    public abstract int getCantidadVideos(); //3
    public abstract int getDuracionTotal(); //4 es int porque son segundos



}
