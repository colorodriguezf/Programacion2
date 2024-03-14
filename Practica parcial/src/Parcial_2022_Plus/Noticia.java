package Parcial_2022_Plus;
import java.util.ArrayList;

import Parcial_2022_Plus.filtros.Filtro;

public class Noticia extends ElementoPortal {
    private String contenido;
    private String titulo;
    private String autor;
    private String categoria;
    private ArrayList<String> palabras_claves;

    public Noticia(String contenido, String titulo, String autor, String categoria) {
        this.contenido = contenido;
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.palabras_claves = new ArrayList<>();
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    
    public void setPalabrasClaves(String palabra) {
        if(!palabras_claves.contains(palabra)) {
            this.palabras_claves.add(palabra);
        }
    }

    @Override //1
    public String getCategoria() {
        return categoria;
    }

    @Override
    public ArrayList<String> getPalClaves() {
        return new ArrayList<String>(this.palabras_claves);
    }

    @Override
    public ArrayList<Noticia> getNoticiasQue(Filtro f) {
        ArrayList<Noticia> noticia = new ArrayList<Noticia>();
        if (f.cumple(this)) {
            noticia.add(this);
        }
        return noticia;
    }

    @Override //PLUS
    public ElementoPortal getCopiaFiltrada(Filtro f) {    
        if(f.cumple(this)) {
            Noticia noticiaCopia = new Noticia(contenido, titulo, autor, categoria);
            for(String palabra : palabras_claves) {
                noticiaCopia.setPalabrasClaves(palabra);
            }
            return noticiaCopia;
        }
        return null;
    }
}



