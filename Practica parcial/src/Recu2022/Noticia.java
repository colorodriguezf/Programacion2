package Recu2022;

import java.util.ArrayList;

import Recu2022.filtros.Filtro;

public class Noticia extends ElementoPortal {
    private String contenido;
    private String titulo;
    private String autor;
    private ArrayList<String> palabrasClaves;

    public Noticia(String categoria, String contenido, String titulo, String autor) {
        super(categoria);
        this.contenido = contenido;
        this.titulo = titulo;
        this.autor = autor;
        this.palabrasClaves = new ArrayList<>();
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

    public void setPalabrasClaves(String palabra) {
        if(palabra != null && palabrasClaves.contains(palabra)) {
            palabrasClaves.add(palabra);
        }
    }

    @Override //1
    public ArrayList<String> getPalabrasClaves() {
        return new ArrayList<String>(this.palabrasClaves);
    }

    @Override
    public ElementoPortal getCopiaRestringidaFiltrada(Filtro f) {
        if(f.cumple(this)) {
            Noticia copia = new Noticia(autor, contenido, titulo, autor);
            for (String s : getPalabrasClaves()) {
                copia.setPalabrasClaves(s);
            }
                return copia;              
        }
            return null;
       

    }  
    
}
