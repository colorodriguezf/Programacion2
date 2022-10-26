package Practico7b.Ejercicio_1;
import java.time.LocalDate;

public class Archivo extends ElementoFS {
    private double tamanio;
    private String extension;

    public Archivo(String nombre, double tamanio, String extension) {
        super(nombre);
        this.tamanio = tamanio;
        this.extension = extension;  
    }
    
    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }
    
    public String getExtension() {
        return extension;
    }
    
    public void setExtension(String extension) {
        this.extension = extension;
    }
    
    @Override
    public double getTamanio() {
        return tamanio;
    }

    @Override
    public int cantArchivos() {
        return 1;
    }
}
