package Final_23_febrero;

import java.util.ArrayList;
import java.util.List;

public class Vagon extends ComponenteTren{
    private ArrayList<Asiento> asientos;
    private ArrayList<ComponenteTren> elementos;

    public Vagon(String nombre) {
        super(nombre);
        this.asientos = new ArrayList<>();
        this.elementos = new ArrayList<>();
    }

    public List<Asiento> getAsientos() {
        return new ArrayList<>(asientos);
    }

    public void setAsientos(Asiento asiento) {
        if(!asientos.contains(asiento)) {
            asientos.add(asiento);
        }
    }

    public List<ComponenteTren> getElementos() {
        return new ArrayList<ComponenteTren>(elementos);
    }

    public void setElementos(ComponenteTren elemento) {
        if(!elementos.contains(elemento)) {
            elementos.add(elemento);
        }
    }

    
}
