package Practico7a.Ejercicio_2;
import java.util.ArrayList;

public class Documento {
    private String titulo;
    private ArrayList<String> autores;
    private String contenido_textual; 
    private ArrayList<String> palabras_clave;

    public Documento(String titulo, String contenido_textual) {
        this.titulo = titulo;
        this.contenido_textual = contenido_textual;
        this.autores = new ArrayList<String>();
        this.palabras_clave = new ArrayList<String>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<String> getAutores() {
        return new ArrayList<String>(this.autores);
    }

    public void addAutor(String autor) {
        if ((autores != null) && (!autores.contains(autor))) {
            this.autores.add(autor);
        }
    }

    public String getContenidoTextual() {
        return contenido_textual;
    }

    public void addContenidTextual(String contenido) {
      this.contenido_textual = contenido;
    }

    public ArrayList<String> getPalabrasClave() {
        return new ArrayList<String>(this.palabras_clave);
    }

    public void addPalabraClave(String palabras) {
        if ((palabras != null) && (!palabras_clave.contains(palabras))) {
            this.palabras_clave.add(palabras);
        }
    } 

    @Override
    public String toString() {
      return "Titulo: " + this.titulo + ", contenido: " + this.contenido_textual + ", autores: " + this.autores + ", palabras claves: " + this.palabras_clave + "\n";
    }
    
    @Override
    public boolean equals(Object obj) {
      Documento doc = (Documento)obj;
      return (doc.getTitulo() == this.getTitulo() && (this.autores.containsAll(doc.autores)));
    }
    
}
