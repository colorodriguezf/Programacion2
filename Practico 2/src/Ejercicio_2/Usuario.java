package Ejercicio_2;

public class Usuario {
    private String nombre;
    private String telefono;
    private String email;
    private static final String DEF_NOMBRE = "NN";
    private static final String DEF_TEL = "555-555";
    private static final String DEF_MAIL = "defmail@gmail.com";

    public Usuario(String nombre, String telefono, String email){
        setNombre(nombre);
        setTelefono(telefono);
        setEmail(email);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre != null ? nombre : DEF_NOMBRE;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono != null ? telefono : DEF_TEL;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email != null ? email : DEF_MAIL;
    }
    
}
