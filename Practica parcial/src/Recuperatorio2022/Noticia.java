package Recuperatorio2022;
import java.util.ArrayList;
import Recuperatorio2022.filtros.Filtro;

public class Noticia extends ElementoPortal {
    private String contenido;
    private String titulo;
    private String autor;
    private String categoria;
    private ArrayList<String> palabrasClaves;

    public Noticia(String categoria, String contenido, String titulo, String autor) {
        super(categoria);
        this.contenido = contenido;
        this.titulo = titulo;
        this.autor = autor;
        this.palabrasClaves = new ArrayList<String>();
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

    public String getCategoria() {
        return categoria;
    }

    
    public void setPalabrasClaves(String palabra) {
        if(!palabrasClaves.contains(palabra)) {
            palabrasClaves.add(palabra);
        }
    }
    
    @Override //a-1
    public ArrayList<String> getPalabrasClaves() {
        return new ArrayList<String>(this.palabrasClaves);
    }

    @Override //b
    public ElementoPortal getCopiaFiltrada(Filtro f) {
        if(f.cumple(this)) {
            Noticia copia = new Noticia(this.titulo, this.contenido, this.autor, this.getCategoria());
            for(String s : this.palabrasClaves) {
                copia.setPalabrasClaves(s);
            }
            return copia;
        }
        return null;
    }
    
}
