package Final_17_febrero;
import java.util.ArrayList;

public class Tren {
    private String nombre;
    private ArrayList<Vagon> vagones;

    public Tren(String nombre) {
        this.nombre = nombre;
        this.vagones = new ArrayList<Vagon>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Vagon> getVagones() {
        return new ArrayList<Vagon>(vagones);
    }

    public void setVagones(Vagon vagon) {
        if(!vagones.contains(vagon)) {
            vagones.add(vagon);
        }
    }

    

    
}
