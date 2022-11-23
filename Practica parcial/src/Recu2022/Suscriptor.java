package Recu2022;
import java.util.ArrayList;

import Recu2022.filtros.Filtro;

public class Suscriptor {
    private String apellido;
    private String nombre;
    private String email;
    private Filtro interes; //Strategy
    private ArrayList<Noticia> noticiasRecibidas;
    
    public Suscriptor(String apellido, String nombre, String email, Filtro interes) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.email = email;
        this.interes = interes;
        this.noticiasRecibidas = new ArrayList<>();
    }

    
    public String getApellido() {
        return apellido;
    }


    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public Filtro getInteres() {
        return interes;
    }


    public void setInteres(Filtro interes) {
        this.interes = interes;
    }


    public ArrayList<Noticia> getNoticiasRecibidas() {
        return new ArrayList<Noticia>(this.noticiasRecibidas);
    }


    public void addNoticia(Noticia noticia) {
        if(!this.noticiasRecibidas.contains(noticia)) {
            noticiasRecibidas.add(noticia);
        }
    }

    //d
    public void recibirNoticia(Noticia n) {
        if(interes.cumple(n)) {
            this.addNoticia(n);
        }
    }
    
    @Override
    public String toString() {
        return "Usuario: "+getNombre()+", " + getApellido()+" noticias: {" +getNoticiasRecibidas()+"}";
    }
    
}
