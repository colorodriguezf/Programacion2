package Prefinal_YouTube;
import java.time.LocalDate;

public class Usuario {
    private String nombre;
    private LocalDate anioRegistro;
    private String mail;

    public Usuario(String nombre, LocalDate anioRegistro, String mail) {
        this.nombre = nombre;
        this.anioRegistro = anioRegistro;
        this.mail = mail;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getAnioRegistro() {
        return anioRegistro;
    }

    public void setAnioRegistro(LocalDate anioRegistro) {
        this.anioRegistro = anioRegistro;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    

    
    
}
