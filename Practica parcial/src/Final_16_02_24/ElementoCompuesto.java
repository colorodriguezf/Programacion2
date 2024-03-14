package Final_16_02_24;

import java.util.ArrayList;

import Final_16_02_24.filtros.Filtro;

//Puede ser tanto un Libro como una Enciclopedia
public class ElementoCompuesto extends Editorial {
    private String titulo;
    private int anio_pub;
    private Persona editor;
    private ArrayList<Editorial> elementos;

    public ElementoCompuesto(String titulo, int anio_pub, Persona editor) {
        this.titulo = titulo;
        this.editor = editor;
        this.anio_pub = anio_pub;
        this.elementos = new ArrayList<>();
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Persona getEditor() {
        return editor;
    }

    public void setEditor(Persona editor) {
        this.editor = editor;
    }

    public int getAnio_pub() {
        return anio_pub;
    }

    public void setAnio_pub(int anio_pub) {
        this.anio_pub = anio_pub;
    }


    public ArrayList<Editorial> getElementos() {
        return new ArrayList<Editorial>();
    }

    public void setElementos(Editorial elemento) {
        if(!elementos.contains(elemento)) {
            elementos.add(elemento);
        }
    }

    @Override //1a
    public ArrayList<String> obtenerTemas() {
        ArrayList<String> temas = new ArrayList<>();
        for (Editorial elemento : elementos) {
            ArrayList<String> temasHijo = elemento.obtenerTemas();
            for(String tema : temasHijo) {
                if(!temas.contains(tema)) {
                    temas.add(tema);
                }
            }
        }
        return temas;
    }

    @Override //1b
    public ArrayList<Persona> obtenerAutores() {
        ArrayList<Persona> autores = new ArrayList<>();
        for(Editorial elemento : elementos) {
            ArrayList<Persona> autoresHijo = elemento.obtenerAutores();
            for(Persona autor : autoresHijo) {
                if(!autores.contains(autor)) {
                    autores.add(autor);
                }
            }
        }
        return autores;
    }

    @Override //1c
    public ArrayList<Persona> obtenerEditores() {
        ArrayList<Persona> editores = new ArrayList<>();
       for(Editorial elemento : elementos) {
            ArrayList<Persona> editoresHijo = elemento.obtenerAutores();
            for(Persona editor : editoresHijo) {
                if(!editores.contains(editor)) {
                    editores.add(editor);
                }
            }
       }
       return editores;
    }

    @Override //1d
    public int obtenerCantpaginas() {
        int cantPag = 0;
        for(Editorial elemento : elementos) {
            cantPag += elemento.obtenerCantpaginas();
        }
        return cantPag;
    }

    @Override //1e
    public Editorial getCopiaFiltrada(Filtro f) {
       ArrayList<Editorial> hijosQueCumplen = new ArrayList<>();
       for(Editorial elemento : elementos) {
        Editorial copiaHija = elemento.getCopiaFiltrada(f);
        if(copiaHija != null) {
            hijosQueCumplen.add(copiaHija);
        }
       }
       if(hijosQueCumplen.size() > 0) {
        ElementoCompuesto copia = new ElementoCompuesto(titulo, anio_pub, editor);
        for(Editorial copiaHijo : hijosQueCumplen) {
            copia.setElementos(copiaHijo);
        }
        return copia;
       }
       else {
        return null;
       }
    }

    @Override //2
    public double getCosto() {
        double total = 0;
        for(Editorial elemento : elementos) {
            total += elemento.getCosto();
        }
        return total;
    }

    @Override
    public String toString() {
        return "ElementoCompuesto [titulo=" + titulo + ", anio_pub=" + anio_pub + ", editor=" + editor + ", elementos="
                + elementos + "]";
    }
    

    
 
    
}
