package Practico7b.Ejercicio_1;
import java.time.LocalDate;

public abstract class ElementoFS {
    private String nombre;
    private LocalDate creacion;
    
    public ElementoFS(String nombre) {
        this.nombre = nombre;
        this.creacion =  LocalDate.now();
    }
    
    public String getNombre() {
        return nombre;
    }    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getCreacion() {
        return creacion;
    }


    public abstract double getTamanio();
    public abstract int cantArchivos();
}
