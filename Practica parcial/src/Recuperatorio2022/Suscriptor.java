package Recuperatorio2022;
import java.util.ArrayList;
import Recuperatorio2022.filtros.Filtro;

public class Suscriptor {
    private String apellido;
    private String nombre;
    private String email;
    private Filtro intereses;
    private ArrayList<Noticia> noticiasRecibidas;

    public Suscriptor(String apellido, String nombre, String email, Filtro intereses) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.email = email;
        this.intereses = intereses;
        this.noticiasRecibidas = new ArrayList<Noticia>();
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

    public Filtro getIntereses() {
        return intereses;
    }

    public void setIntereses(Filtro intereses) {
        this.intereses = intereses;
    }

    public ArrayList<Noticia> getNoticiasRecibidas() {
        return new ArrayList<Noticia>(this.noticiasRecibidas);
    }

    public void setNoticiasRecibidas(Noticia noticia) {
        noticiasRecibidas.add(noticia);
    }

    //d
    public void recibirNoticia(Noticia noticia) {
        if(intereses.cumple(noticia)) {
            noticiasRecibidas.add(noticia);
        }
    }

    

}
