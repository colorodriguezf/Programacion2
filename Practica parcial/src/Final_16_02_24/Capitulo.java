package Final_16_02_24;

import java.util.ArrayList;

import Final_16_02_24.calculadores.Calculador;
import Final_16_02_24.filtros.Filtro;

public class Capitulo extends Editorial {    
    private String nombre;
    private int cantPag;
    private String tema;
    private ArrayList<Persona> autores;
    private Persona revisor;
    private Calculador calculadorPrecio;

    public Capitulo(String nombre, int cantPag, String tema, Persona revisor, Calculador calculadorPrecio) {
        this.nombre = nombre;
        this.cantPag = cantPag;
        this.tema = tema;
        this.revisor = revisor;
        this.autores = new ArrayList<>();
        this.calculadorPrecio = calculadorPrecio;
    }    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantPag() {
        return cantPag;
    }

    public void setCantPag(int cantPag) {
        this.cantPag = cantPag;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public ArrayList<Persona> getAutores() {
        return new ArrayList<Persona>(autores);
    }

    public void setAutores(Persona autor) {
        if(!autor.equals(revisor)) {
            autores.add(autor);
        }
    }
    
    public Persona getRevisor() {
        return revisor;
    }
    
    public void setRevisor(Persona revisor) {
        if(!autores.contains(revisor)) {
            this.revisor = revisor;
        }
    }
    
    
    public Calculador getCalculadorPrecio() {
        return calculadorPrecio;
    }
    
    public void setCalculadorPrecio(Calculador calculadorPrecio) {
        this.calculadorPrecio = calculadorPrecio;
    }
    
    @Override //1a
    public ArrayList<String> obtenerTemas() {
        ArrayList<String> temas = new ArrayList<>();
        temas.add(tema);
        return temas;
    }
    
    @Override //1b
    public ArrayList<Persona> obtenerAutores() {
        return new ArrayList<Persona>(this.autores);
    }
    
    @Override //1c
    public ArrayList<Persona> obtenerEditores() {
        return new ArrayList<Persona>();
    }
    
    @Override //1d
    public int obtenerCantpaginas() {
        return this.cantPag;
    }

    @Override //1e
    public Editorial getCopiaFiltrada(Filtro f) {
        if(f.cumple(this)) {
            Capitulo copia = new Capitulo(nombre, cantPag, tema, revisor, calculadorPrecio);
            for(Persona autor : autores) {
                copia.setAutores(autor);
            }
            return copia;
        }
        return null;
        
    }

    //2
    @Override
    public double getCosto() {
       return calculadorPrecio.getValorCapitulo(this);
    }

    @Override
    public String toString() {
        return "Capitulo [nombre=" + nombre + ", cantPag=" + cantPag + ", tema=" + tema + ", autores=" + autores
                + ", revisor=" + revisor + ", calculadorPrecio=" + calculadorPrecio + "]";
    }

    
    
    
    
    
}
